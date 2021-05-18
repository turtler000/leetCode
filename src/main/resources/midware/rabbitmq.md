1.为什么使用，消息队列都有什么优点和缺点

2.kafka、activemq、rabbitmq、rocketmq都有什么区别

3.如何保证消息队列的高可用

4.如何保证消息不被重复消费，如何保证消费的时候是幂等

5.如何保证消息的可靠性传输，要是消息丢失了怎么办

6.如何保证消息的顺序性

7.解决消息队列的延时以及过期失效问题？消息队列满了以后该怎么处理？有几百万消息持续积压几小时，说说怎么解决

如上七个问题为面试高频问题，整理回答思路如下：

### 一、为什么使用，优缺点

优点：解耦、异步、削峰

缺点：可用性，复杂性

### 二、各种消息队列区别

ActiveMQ，太老了

Rabbitmq,选择的优点：吞吐量较低，响应速度比其他的三个快，基于erlang开发，所以并发能力很强，性能极其好，延时很低

RocketMq:阿里，java

kafka：大数据类的系统来进行实时数据计算、日志采集

### 三、高可用

集群模式：

1、普通集群

只有单个进程实例有数据，其他队列从这个队列拉

2、镜像集群

每个实例都存消息，set_policy  ha-all

### 四、重复消费，幂等性

1.插入数据库，某个字段使用Message的key做唯一索引，去数据库里查一下，再update

2.写redis,使用set,幂等

3.使用redis加锁，发消息的时候生成唯一id作为key放redis里setnx（SET if Not eXists）。消费者消费的时候去redis查一下

```
 boolean flag =  jedis.setNX(key);
                  if(flag){
                        //消费
                  }else{
                       //忽略，重复消费
                }
```

### 五、可靠性，消息丢失

1、开启事务，同步机制(不推荐)

问题：1、阻塞。2、如果rabbitmq超时，按发送不成功算

```
channel.txSelect
try {
    // 这里发送消息
} catch (Exception e) {
    channel.txRollback

    // 这里再次重发这条消息
}

// 提交事务
channel.txCommit
```

2、开启confirm(推荐)

1.开启channel.confirm

2.ack

所有在该信道上面发布的消息都会被指派一个唯一的ID(以confirm.select为基础从1开始计数)，一旦消息被投递到所有匹配的队列之后，Broker就会发送一个确认给生产者（包含消息的唯一ID）,

3、开启RabbitMQ持久化(交换机、队列、消息)

```
//消息队列持久化
boolean durable=false;
//声明队列
channel.queueDeclare(QUEUE_NAME, durable, false, false, null);
```

第一个是创建queue的时候将其设置为持久化的，这样就可以保证rabbitmq持久化queue的元数据，但是不会持久化queue里的数据；第二个是发送消息的时候将消息的deliveryMode设置为2，就是将消息设置为持久化的，此时rabbitmq就会将消息持久化到磁盘上去。必须要同时设置这两个持久化才行，rabbitmq哪怕是挂了，再次重启，也会从磁盘上重启恢复queue，恢复这个queue里的数据。

4、关闭RabbitMQ自动ack(改成手动)

```
//关闭自动应答
boolean autoAck=false;
//监听队列
channel.basicConsume(QUEUE_NAME, autoAck, defaultConsumer);
```

### 六、顺序

rabbitmq：拆分多个queue，每个queue一个consumer，就是多一些queue而已，确实是麻烦点；或者就一个queue但是对应一个consumer，然后这个consumer内部用内存队列做排队，然后分发给底层不同的worker来处理


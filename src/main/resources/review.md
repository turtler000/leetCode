这里放的是（~~写代码也用不到~~）很容易忘记的知识，看了很多遍还是记不住，要多看多背。

1焦耳=0.24卡

### 一、基础知识

1.事务具有四大特性： **1. 原子性**，**2. 隔离性**，**3. 持久性**，**4. 一致性**。

原子性（Atomicity）：事务是最小的执行单位，不允许分割。事务的原子性确保动作要么全部完成，要么完全不起作用；

隔离性（Isolation）：并发访问数据库时，一个用户的事务不被其他事务所干扰，各并发事务之间数据库是独立的；

持久性（Durability）：一个事务被提交之后。它对数据库中数据的改变是持久的，即使数据库发生故障也不应该对其有任何影响。

一致性（Consistency）：执行事务前后，保证事务只能把数据库从一个有效（正确）的状态“转移”到另一个有效（正确）的状态。多个事务对同一个数据读取的结果是相同的。

2.二叉查找树

​	AVL树:带有平衡条件的二叉查找树

​	红黑树

​	B/B+树：平衡多路查找树。

​					区别：B+树只有叶子节点存储数据（其他太复杂略）

3.乐观锁悲观锁

乐观锁：处理完业务逻辑开始更新的时候，需要再次查看该字段的值是否和第一次的一样。如果一样更新，反之拒绝。 实现：1.CAS 实现 2.版本（innodb)

悲观锁是数据库层面加锁，都会阻塞去等待锁

4、并行并发

并行：同一处理器，时间段内交替执行

并发：不同处理器同时执行

### 二、java基础

#### 1.basic

1.重载overload 重写override

​	重载发生在同一个类中（或者父类和子类之间），方法名必须相同，参数类型不同、个数不同、顺序不同，方法返回值和访问修饰符可以不同。

​	重写发生在运行期，是子类对父类的允许访问的方法的实现过程进行重新编写。

​	构造方法不能被 override（重写）,但是可以 overload（重载）

2.当 try 语句和 finally 语句中都有 return 语句时，在方法返回之前，finally 语句的内容将被执行，并且 finally 语句的返回值将会覆盖原始的返回值。

3.使用 BigDecimal 来定义浮点数的值，再进行浮点数的运算操作

4.`Arrays.asList()`将数组转换为集合后,底层其实还是数组，使用下边这个

```
List list = new ArrayList<>(Arrays.asList("a", "b", "c"))
```

5.动态代理：实现InvocationHandler接口中的invoke()方法

6.获取class对象方式

```
Class alunbarClass = TargetObject.class;

Class alunbarClass1 = Class.forName("cn.javaguide.TargetObject");

TargetObject o = new TargetObject();
Class alunbarClass2 = o.getClass();

class clazz = ClassLoader.LoadClass("cn.javaguide.TargetObject");
```

#### 2.collection

1.ArrayList和vector

`ArrayList` 是 `List` 的主要实现类，适用于频繁的查找工作，线程不安全 ；

`Vector` 是 `List` 的古老实现类，底层使用 `Object[ ]`存储，线程安全的。

2.ArrayList和LinkedList

​	都线程不安全

​	ArrayList数组，方便查询不方便插入；LinkedList 双向链表，方便插入不方便查询。

​	空间：ArrayList结尾需要预留，LinkedList 每个元素都比ArrayList多（要放前后指针）

3.ArrayList 扩容

​	默认为10，扩容使用grow()方法， 每次扩容之后容量都会变为原来的 1.5 倍，如果是奇数的话会丢掉小数

4.ConcurrentHashMap 线程安全的hashmap。分多个Segment ，每个segment负责一个hashmap用于多线程，默认16个。 

ConcurrentHashMap是线程安全的，那是在他们的内部操作，其外部操作还是需要自己来保证其同步的，特别是静态的ConcurrentHashMap,其有更新和查询的过程，要保证其线程安全，需要syn一个不可变的参数才能保证其原子性

5.List ,Set ,Map

List(对付顺序的好帮手)： 存储的元素是有序的、可重复的。

Set(独一无二的): 存储的元素是无序的、不可重复的。

Map(用 Key 来搜索的专家): 使用键值对（key-value）存储，Key 是无序的、不可重复的，value 是无序的、可重复的

6.hashtable 锁整个结构，ConcurrentHashMap锁一部分。线程安全。不要用hashtable

#### 3.jvm

1、线程共享区域：方法区，堆区；不共享：栈，本地方法栈，程序计数器。栈管运行，堆管存储

每个线程有自己的**程序计数器**、**虚拟机栈**和**本地方法栈**

2、类加载顺序：加载，连接（验证，准备，解析），初始化，使用，卸载。

3、构造器初始化顺序，父类静态 -> 子类静态 -> 父类成员 -> 父类构造 -> 子类成员 -> 子类构造

4、常用命令

- **`jps`** (JVM Process Status）: 类似 UNIX 的 `ps` 命令。用户查看所有 Java 进程的启动类、传入参数和 Java 虚拟机参数等信息；

- **`jstat`**（ JVM Statistics Monitoring Tool）:  用于收集 HotSpot 虚拟机各方面的运行数据;

- **`jinfo`** (Configuration Info for Java) : Configuration Info forJava,显示虚拟机配置信息;

- **`jmap`** (Memory Map for Java) :生成堆转储快照;

- **`jhat`** (JVM Heap Dump Browser ) : 用于分析 heapdump 文件，它会建立一个 HTTP/HTML 服务器，让用户可以在浏览器上查看分析结果;

- **`jstack`** (Stack Trace for Java):生成虚拟机当前时刻的线程快照，线程快照就是当前虚拟机内每一条线程正在执行的方法堆栈的集合。

5、垃圾回收

分带收集算法：新生代（存活率低）标记复制算法（分两块内存，每次清除后复制），老年代（存活率高）标记-清除（只清除）或标记-整理（清除后整理）

jdk8使用Parallel Scavenge 收集器，多线程收集器，新生代采用标记-复制算法，老年代采用标记-整理算法

6、无用的类

- 该类所有的实例都已经被回收，也就是 Java 堆中不存在该类的任何实例。
- 加载该类的 `ClassLoader` 已经被回收。
- 该类对应的 `java.lang.Class` 对象没有在任何地方被引用，无法在任何地方通过反射访问该类的方法。

7、卸载类需要满足 3 个要求:

1. 该类的所有的实例对象都已被 GC，也就是说堆不存在该类的实例对象。
2. 该类没有在其他任何地方被引用
3. 该类的类加载器的实例已被 GC

8、类加载器

1. **BootstrapClassLoader(启动类加载器)** ：最顶层的加载类，由C++实现，负责加载 `%JAVA_HOME%/lib`目录下的jar包和类或者或被 `-Xbootclasspath`参数指定的路径中的所有类。

2. **ExtensionClassLoader(扩展类加载器)** ：主要负责加载目录 `%JRE_HOME%/lib/ext` 目录下的jar包和类，或被 `java.ext.dirs` 系统变量所指定的路径下的jar包。

3. **AppClassLoader(应用程序类加载器)** ：面向我们用户的加载器，负责加载当前应用classpath下的所有jar包和类。

9.堆和方法区
堆和方法区是所有线程共享的资源，其中堆是进程中最大的一块内存，主要用于存放新创建的对象 (几乎所有对象都在这里分配内存)，方法区主要用于存放已被加载的类信息、常量、静态变量、即时编译器编译后的代码等数据。

10.

本地方法栈：非java

虚拟机栈，栈帧的结构分为“局部变量表、操作数栈、动态链接、方法出口“

局部变量表是一组变量值存储空间，用于存放方法参数和方法内部定义的局部变量。

和局部变量区一样，操作数栈也是被组织成一个以字长为单位的数组。但是和前者不同的是，它不是通过索引来访问，而是通过标准的栈操作—压栈和出栈—来访问的

#### 3.多线程

1.new,runable,wait,timewait,blocked,terminaled

2.死锁

互斥条件：该资源任意一个时刻只由一个线程占用。

请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放。

不剥夺条件:线程已获得的资源在未使用完之前不能被其他线程强行剥夺，只有自己使用完毕后才释放资源。

循环等待条件:若干进程之间形成一种头尾相接的循环等待资源关系。

3.run和start

 `start()` 会执行线程的相应准备工作，然后自动执行 ` run() ` 方法的内容

调用 `start()` 方法方可启动线程并使线程进入就绪状态，直接执行 `run()` 方法的话不会以多线程的方式执行。

4.`synchronized` 关键字解决的是多个线程之间访问资源的同步性，`synchronized`关键字可以保证被它修饰的方法或者代码块在任意时刻只能有一个线程执行。

5.单例模式

```
public class Instance {
    private volatile static Instance uniqueInstance;

    private Instance() {
    }

    public static Instance getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Instance.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Instance();
                }
            }
        }
        return uniqueInstance;
    }
}
```

6、自旋锁：循环占用cpu CAS,单个变量，ABA，互斥锁：等待 mutex

7、AQS 的全称为（`AbstractQueuedSynchronizer`）

AQS 核心思想是，如果被请求的共享资源空闲，则将当前请求资源的线程设置为有效的工作线程，并且将共享资源设置为锁定状态。如果被请求的共享资源被占用，那么就需要一套线程阻塞等待以及被唤醒时锁分配的机制，这个机制 AQS 是用 CLH 队列锁实现的，即将暂时获取不到锁的线程加入到队列中。

维护队列

### 三、Database

#### 1.mysql

1.索引最左匹配原则：

索引可以简单如一个列`(a)`，也可以复杂如多个列`(a, b, c, d)`，即**联合索引**。

2.InnoDB只有通过**索引条件**检索数据**才使用行级锁**，否则，InnoDB将使用**表锁**

3.表锁：

表读锁（Table Read Lock）

表写锁（Table Write Lock）

- 读读不阻塞：当前用户在读数据，其他的用户也在读数据，不会加锁
- 读写阻塞：当前用户在读数据，其他的用户**不能修改当前用户读的数据**，会加锁！
- 写写阻塞：当前用户在修改数据，其他的用户**不能修改当前用户正在修改的数据**，会加锁！

4.行锁

共享锁（S锁）：允许一个事务去读一行，阻止其他事务获得相同数据集的排他锁。

- 也叫做**读锁**：读锁是**共享**的，多个客户可以**同时读取同一个**资源，但**不允许其他客户修改**。

排他锁（X锁)：允许获得排他锁的事务更新数据，阻止其他事务取得相同数据集的共享读锁和排他写锁。

- 也叫做**写锁**：写锁是排他的，**写锁会阻塞其他的写锁和读锁**。

5.事务问题

​	丢失修改（Lost to modify）

​	脏读（Dirty read）：一个事务读取到另外一个事务未提交的数据.

​	不可重复读（Unrepeatableread）:当前事务先进行了一次数据读取，然后再次读取到的数据是别的事务修改成功的数据

​	幻读（Phantom read）：是指在一个事务内读取到了别的事务插入的数据，导致前后读取不一致。

​	不可重复读和幻读比较：前者针对的是update或delete，后者针对的insert

6.事务的隔离级别

​	Read uncommitted:  脏读，不可重复读，幻读

​	Read committed:  不可重复读，幻读

​	Repeatable read:  幻读

​	Serializable:串行

7.一些性能问题：

​	避免数据类型的隐式转换

​	禁止使用 SELECT * 必须使用 SELECT <字段列表> 查询

​	禁止使用不含字段列表的 INSERT 语句

​	对应同一列进行 or 判断时，使用 in 代替 or

​	不用字符串存储日期

8.性能

16k（bigint8+index6)=1170 1170* 1170* 16=2000W 

9.事务，

手动
BEGIN开始一个事务
ROLLBACK 事务回滚
COMMIT 事务确认

自动
SET AUTOCOMMIT=0 禁止自动提交
SET AUTOCOMMIT=1 开启自动提交

10、MVCC多版本并发控制

11、覆盖索引，普通索引中存的主键，拿到主键再去**聚集索引**查

#### 2.redis

1.Redis 是不支持 roll back 的，因而不满足原子性的（而且不满足持久性），Redis 事务提供了一种将多个命令请求打包的功能。然后，再按顺序执行打包的所有命令，并且不会被中途打断

2.缓存穿透，大量请求的 key 根本不存在于缓存中，导致请求直接到了数据库上，根本没有经过缓存这一层

解决：1.缓存无效 key (黑名单)

​			2.布隆过滤器

3.缓存雪崩，缓存在同一时间大面积的失效，后面的请求都直接落到了数据库上，造成数据库短时间内承受大量请求

解决：失效时间

4.缓存击穿，缓存击穿跟缓存雪崩类似，区别就是缓存雪崩是群体失效，缓存击穿是单体失效。**在系统从后端DB加载数据到缓存这个过程中**，这段时间超大并发的请求会同时打到DB上，很有可能瞬间把DB压垮。

解决：互斥锁，就是在缓存失效的时候，不是直接请求DB，而是先加分布式锁（比如redis的setNx），如果加锁成功，再进行load db的操作并回设缓存；如果加锁失败，说明已经有别的进程在加锁重设缓存，我们只需要等待重试或者直接返回客户端失败让用户手动重试

5.一致性方案

一般方案：先写MySQL数据库，再删除Redis缓存；先删除缓存，再写库。都有可能数据不一致

稳定方案：1.延时双删，在写库前后都进行redis.del(key)操作，db.update后等待500ms。

​					2.异步更新缓存(基于订阅binlog的同步机制),MySQL binlog增量订阅消费+消息队列+增量数据更新到redis

6、数据结构

String   get 、 set 、 del 、 incr、 decr

Hashmap  每个key对应 hashmap  hget 、hset 、 hdel

List 双端链表 

Set  sset 、srem、scard、smembers、sismember

zset 有序集合 zadd 、 zrange、 zscore

### 操作系统

1.常用linux命令

​	top:显示当前正在执行的进程的CPU使用率

### 网络

1.握手

三次握手    1、syn          2、ack/syn      3、ack

四次挥手    1、client:fin       2、server:ack      3.server:fin     4.client:ack

2.网页

1. DNS解析
2. TCP连接
3. 发送HTTP请求
4. 服务器处理请求并返回HTTP报文
5. 浏览器解析渲染页面
6. 连接结束

### 框架

#### spring

1.bean生命周期

- Bean 容器找到配置文件中 Spring Bean 的定义。
- Bean 容器利用 Java Reflection API 创建一个Bean的实例。
- 如果涉及到一些属性值 利用 `set()`方法设置一些属性值。
- 如果 Bean 实现了 `BeanNameAware` 接口，调用 `setBeanName()`方法，传入Bean的名字。
- 如果 Bean 实现了 `BeanClassLoaderAware` 接口，调用 `setBeanClassLoader()`方法，传入 `ClassLoader`对象的实例。
- 与上面的类似，如果实现了其他 `*.Aware`接口，就调用相应的方法。
- 如果有和加载这个 Bean 的 Spring 容器相关的 `BeanPostProcessor` 对象，执行`postProcessBeforeInitialization()` 方法
- 如果Bean实现了`InitializingBean`接口，执行`afterPropertiesSet()`方法。
- 如果 Bean 在配置文件中的定义包含  init-method 属性，执行指定的方法。
- 如果有和加载这个 Bean的 Spring 容器相关的 `BeanPostProcessor` 对象，执行`postProcessAfterInitialization()` 方法
- 当要销毁 Bean 的时候，如果 Bean 实现了 `DisposableBean` 接口，执行 `destroy()` 方法。
- 当要销毁 Bean 的时候，如果 Bean 在配置文件中的定义包含 destroy-method 属性，执行指定的方法。
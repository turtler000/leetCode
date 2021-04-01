package org.turtler000.weekends.week_221;

import java.util.HashMap;
import java.util.Map;

public class Solution_2 {
    public static int eatenApples(int[] apples, int[] days) {
        Map<Integer,Integer> map = new HashMap();
        int d = apples.length;
        for(int i = 0;i<=20000+d;i++){
            int haveEat = 0;
            //把当天的苹果时间算出来加到list里
            if(i<apples.length) {
                if(map.get(days[i])!=null) {
                    map.put(days[i]+i, map.get(days[i]) + apples[i]);
                }else{
                    map.put(days[i]+i,apples[i]);
                }
            }
            //找一个保质期最短的吃掉

            for(int o = i;o<20000+i;o++){
                if(map.get(o+i)!=null){
                    map.put(o+i,map.get(o+i)-1);
                    if(map.get(o+i)==0){
                        map.remove(o+i);
                    }
                    o = 20000+i;
                    haveEat ++;
                }
            }
            if(map.size()==0){
                return i+1;
            }

        }
        return 0;
    }
}

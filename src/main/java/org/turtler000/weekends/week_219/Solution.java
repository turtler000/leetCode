package org.turtler000.weekends.week_219;

public class Solution {
    public static int minPartitions(String n) {
char[] chars = n.toCharArray();
int ret = 0;
for(int i =0;i<chars.length;i++){
    int c = (int)chars[i]-48;
    if(c>ret){
        ret = c;
    }
}
return ret;
    }
}

package org.turtler000.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * create by hanhuanyu ON 2021/1/5
 *
 * list to  Array
 */
public class Util {
   // list to array
    List<Integer> a = new ArrayList<>();
    int[] array = a.stream().mapToInt(Integer::valueOf).toArray();
    //截取数组
    int[] range = Arrays.copyOfRange(array,1,array.length);
}

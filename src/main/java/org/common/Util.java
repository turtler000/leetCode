package org.common;

import java.util.ArrayList;
import java.util.List;

/**
 * create by hanhuanyu ON 2021/1/5
 */
public class Util {
    //how to covert list to int[]
    List<Integer> a = new ArrayList<>();
    int[] ret = a.stream().mapToInt(Integer::valueOf).toArray();
}

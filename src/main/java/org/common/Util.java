package org.common;

import java.util.ArrayList;
import java.util.List;

/**
 * create by hanhuanyu ON 2021/1/5
 *
 * list to  Array
 */
public class Util {
    /*
     * list to  Array
     */
    List<Integer> a = new ArrayList<>();
    int[] ret = a.stream().mapToInt(Integer::valueOf).toArray();
}

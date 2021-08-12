package org.turtler000.leetcode.weekends.week_221;

public class Solution_1 {
    public static boolean halvesAreAlike(String s) {
        char a[] = s.substring(0, s.length() / 2).toCharArray();
        char b[] = s.substring(s.length() / 2, s.length()).toCharArray();
        int al = 0;
        int bl = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                al++;
            }
            if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'A' || b[i] == 'E' || b[i] == 'I' || b[i] == 'O' || b[i] == 'U') {
                bl++;
            }
        }
        if (al == bl) {
            return true;
        }
        return false;
    }
}

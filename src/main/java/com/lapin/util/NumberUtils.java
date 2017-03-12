package com.lapin.util;

/**
 * Created by lapin on 2017. 3. 12..
 */
public class NumberUtils {
    private static final Integer ZERO = 0;

    public static boolean isNatureNumber(Integer integer) {
        if (null == integer) {
            return false;
        }
        if (integer <= ZERO) {
            return false;
        }
        return true;
    }
}

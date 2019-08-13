package com.zyloops.git;

/**
 * @author lzy
 * @version 1.0
 * @description
 * @date 2019/8/13 14:53
 **/
public class ThreadUtil {

    public static void sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

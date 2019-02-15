package com.gongjun.myproxy;

/**
 * @Description:
 * @Author:GongJun
 * @Date:2019/2/15
 */
public class MyProxy {
    public static String rn = "\r\n";
    public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,MyInvocationHandler h){
        //返回代理类--生成代理类到内存中
        //要生成一个Java类
        String proxyJava = "package myproxy"+rn
                +"";
        return null;
    }
}

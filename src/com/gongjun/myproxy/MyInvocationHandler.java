package com.gongjun.myproxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author:GongJun
 * @Date:2019/2/15
 */
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}

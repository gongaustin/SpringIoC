package com.gongjun.myproxy;

import com.gongjun.proxy.IDataService;

import java.lang.reflect.Method;

/**
 * @Description:代理类
 * @Author:GongJun
 * @Date:2019/2/15
 */
public class DataInvocationHandler implements MyInvocationHandler {
    private IDataService service;

    public DataInvocationHandler(IDataService service){
        this.service = service;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        //业务逻辑代码
        method.invoke(service,args);
        after();

        return null;
    }
    private void before(){
        System.out.println("调用业务类之前的方法：before");
    }

    private void after(){
        System.out.println("调用业务类之后的方法：after");
    }
}

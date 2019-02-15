package com.gongjun.proxy.test;

import com.gongjun.proxy.DataInvocationHandler;
import com.gongjun.proxy.DataServiceImpl;
import com.gongjun.proxy.IDataService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * @Description:AOP的动态代理测试方法
 * @Author:GongJun
 * @Date:2019/2/15
 */
public class Test {
    public static void main(String[] args) {
        //1.类加载器
        //2.接口的反射
        //3.InvocationHandler的实例
        IDataService service = (IDataService) Proxy.newProxyInstance(
                Test.class.getClassLoader(), //--类加载器
                new Class[]{IDataService.class}, //--接口的反射
                new DataInvocationHandler(new DataServiceImpl()) //--InvocationHandler的实例
        );
        service.save(null); //$Proxy0 位于内存中的类

        /**
         * 调用顺序：先调用InvocationHandler的invoke方法，而invoke方法调用了业务逻辑的对应方法
         * */

        System.out.println("--------------------------------------------------------------------------");

        IDataService newService = new DataServiceImpl();

        newService.save(null);

        createProxyClass();

    }
    //输出内存中的$Proxy0类
    public static void createProxyClass(){

        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IDataService.class});
        //流输出
        try {
            FileOutputStream fos = new FileOutputStream("$Proxy0.class");
            fos.write(classFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package com.gongjun.test;

import com.gongjun.bean.B;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:IOC依赖注入
 * @Author:GongJun
 * @Date:2019/2/14
 */
public class Test {
    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext  ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获得bean
//        A a = (A) ac.getBean("A");
//        System.out.println(a.getName());
        B b = (B) ac.getBean("B");
        System.out.println(b.getA().getName());
    }

}

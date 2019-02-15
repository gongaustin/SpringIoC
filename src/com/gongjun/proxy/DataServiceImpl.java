package com.gongjun.proxy;

/** 修改关闭，扩展开放
 * @Description:被代理接口的实现类
 * @Author:GongJun
 * @Date:2019/2/15
 */
public class DataServiceImpl implements IDataService {

    //业务逻辑
    @Override
    public void save(String param) {

        System.out.println("this is save");

    }

    @Override
    public void update(String param) {

        System.out.println("this is update");

    }
}

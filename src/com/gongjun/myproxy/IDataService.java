package com.gongjun.myproxy;

/**
 * @Description:被代理接口
 * @Author:GongJun
 * @Date:2019/2/15
 */
public interface IDataService {
    /**
     * @param param
     * @description
     * @author GongJun
     * @time 2019/3/4 21:03
     * @return void
     **/
    void save(String param);
    /**
     * @param param
     * @description
     * @author GongJun
     * @time 2019/3/4 21:03
     * @return void
     **/
    void update(String param);
}

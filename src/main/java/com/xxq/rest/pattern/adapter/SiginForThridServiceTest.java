package com.xxq.rest.pattern.adapter;

import com.xxq.rest.pattern.adapter.password.SiginForThirdService;

/**
 * @author xiaoqiang
 * @Title: SiginForThridServiceTest
 * @ProjectName pattern-demo-adapter
 * @Description: TODO
 * @date 2018-12-10 22:31
 */
public class SiginForThridServiceTest {
    public static void main(String[] args) {
        SiginForThirdService service = new SiginForThirdService();
       // 不改变原来的代码，也能兼容新的需求
        service.loginForQQ("dog");
    }
}

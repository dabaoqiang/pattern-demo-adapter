package com.xxq.rest.pattern.adapter.password;

import com.xxq.rest.pattern.adapter.Member;
import com.xxq.rest.pattern.adapter.ResultMsg;

/**
 * @author xiaoqiang
 * @Title: SiginService
 * @ProjectName pattern-demo-adapter
 * @Description: TODO
 * @date 2018-12-10 22:24
 */
public class SiginService {
    /**
     * 注册方法
     * @param userName
     * @param userPass
     * @return
     */
    public ResultMsg regist(String  userName, String userPass){
        return  new ResultMsg("200", "注册成功", new Member());
    };

    /**
     * 登录
     * @param userName
     * @param userPass
     * @return
     */
    public ResultMsg login(String userName, String userPass){
        return   new ResultMsg("200", "登录成功", new Member());
    }
}

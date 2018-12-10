package com.xxq.rest.pattern.adapter.password;

import com.xxq.rest.pattern.adapter.ResultMsg;

/**
 * @author xiaoqiang
 * @Title: SiginForThirdService
 * @ProjectName pattern-demo-adapter
 * @Description: 稳定的方法不去动，直接继承下来
 * @date 2018-12-10 22:28
 */
public class SiginForThirdService extends SiginService {
    public ResultMsg loginForQQ(String openId) {
        //1，openId是全局唯一的，我们可以把它当做是一个用户名（加长）
        //2，密码默认为QQ_empty
        //3，要注册（在原有系统里面创建一个用户）
//        ResultMsg resultMsg = super.regist(openId, null);
        //4，调用原来的登录方法
//        ResultMsg msg = super.login(openId, null);
        return loginForRegister(openId , null);
    }

    ;

    public ResultMsg loginForWebChat(String openId) {
        return null;
    }

    ;

    public ResultMsg loginForToken(String token) {
        // 通过token拿到用户信息，才重新登录；
        return null;
    }

    ;

    public ResultMsg loginForTelaphone(String telePhone, String coed) {
        return null;
    }

    ;

    public ResultMsg loginForRegister(String userName, String userPass) {
        super.regist(userName, userPass);
        return super.login(userName, userPass);
    }

}

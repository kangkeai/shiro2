package com.imooc.controller;

import com.imooc.service.IUserService;
import com.imooc.vo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {


    @RequestMapping(value = "/subLogin",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String subLogin(User user){

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getUserPassword());
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            return  e.getMessage();
        }
        if(subject.hasRole("admin")){
            return "index";
        }
        return "没有权限哦";
    }

    @RequestMapping("index")
    public String index() {
        return "index";
    }
}

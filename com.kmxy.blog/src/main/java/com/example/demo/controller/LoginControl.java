package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.redis.StringRedisServiceImpl;
import com.example.demo.service.UserService;
import com.example.demo.utils.MD5Util;

/**
 * 
 * Describe: 登录控制
 */
@Controller

public class LoginControl {

    @Autowired
    UserService userService;
    @Autowired
    StringRedisServiceImpl stringRedisService;

    @ResponseBody
    @PostMapping("/changePassword")
    public String changePassword(@RequestParam("phone") String phone,
                                 @RequestParam("authCode") String authCode,
                                 @RequestParam("newPassword") String newPassword){

        String trueMsgCode = (String) stringRedisService.get(phone);

        //判断获得的手机号是否是发送验证码的手机号
		/*
		 * if(trueMsgCode == null){ return "3"; }
		 */
        //判断验证码是否正确
        if(!authCode.equals(trueMsgCode)){
            return "0";
        }
        User user = userService.findUserByPhone(phone);
        if(user == null){
            return "2";
        }
        MD5Util md5Util = new MD5Util();
        String MD5Password = md5Util.encode(newPassword);
        userService.updatePasswordByPhone(phone, MD5Password);

        return "1";
    }

}

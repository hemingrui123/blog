package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Describe: 友链页面
 */
@RestController
public class FriendlyLinkControl {

    @Autowired
    FriendLinkService friendLinkService;

    /**
     * 获得所有友链信息
     */
    @PostMapping("/getFriendLinkInfo")
    public Result getFriendLink(){
        return friendLinkService.getFriendLink();
    }

}

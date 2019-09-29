package com.wei.controller;

import com.wei.entity.User;
import com.wei.service.IUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/UserController")
public class UserController {
    @Resource
    private IUserService userService;
    @RequestMapping(value = "/findCartByUid",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String findCartByUid(){
        User cartByUid = userService.findCartByUid(1);
        System.out.println(cartByUid);
        return "查询成功";
    }
}

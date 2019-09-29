package com.wei.controller;

import com.wei.entity.Cart;
import com.wei.service.ICartService;
import com.wei.service.impl.CartServiceImpl;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/CartController")
public class CartController {
    @Resource
    private ICartService cartService;
    @RequestMapping(value = "findCartByUid",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String findCartByUid(){
        List<Cart> cartByUid = cartService.findCartByUid(1);
        System.out.println(cartByUid);
        return "查询成功";
    }
}

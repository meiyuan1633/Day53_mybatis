package com.wei.service.impl;

import com.wei.entity.Cart;
import com.wei.mapper.ICartMapper;
import com.wei.service.ICartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CartServiceImpl implements ICartService {
    @Resource
    private ICartMapper cartMapper;
    @Override
    public List<Cart> findCartByUid(int uid) {
        List<Cart> cartByUid = cartMapper.findCartByUid(uid);
        return cartByUid;
    }
}

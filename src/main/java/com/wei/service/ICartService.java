package com.wei.service;

import com.wei.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICartService {
    List<Cart> findCartByUid(int uid);
}

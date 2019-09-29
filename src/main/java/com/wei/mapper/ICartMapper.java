package com.wei.mapper;

import com.wei.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICartMapper {
    List<Cart>findCartByUid(@Param("uId")int uid);
}

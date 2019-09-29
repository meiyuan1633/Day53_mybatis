package com.wei.mapper;

import com.wei.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    /*
    * 通过用户id查询到商品表
    * */
    User findCartByUid(@Param("uId")int uid);
}

package com.wei.service;

import com.wei.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserService {

    User findCartByUid(int uid);
}

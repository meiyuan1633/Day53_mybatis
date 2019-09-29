package com.wei.service.impl;

import com.wei.entity.User;
import com.wei.mapper.IUserMapper;
import com.wei.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserMapper userMapper;
    @Override
    public User findCartByUid(int uid) {
        User cartByUid = userMapper.findCartByUid(uid);
        return cartByUid;
    }
}

package com.wei.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class User {
    private Integer uId;
    private String username;
    private String password;
    private Integer isDelete;
    private List<Cart>carts;
}

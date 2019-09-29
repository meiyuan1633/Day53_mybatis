package com.wei.entity;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
@lombok.Data
public class Cart {
    private Integer cId;
    private Date createDate;
    private Integer num;
    private Integer userId;
    private Integer goodsId;
    private Integer isDelete;

}

package com.wei.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@Data
public class Goods {
    private Integer gId;
    private String title;
    private String name;
    private Double price;
    private Double oldPrice;
    private Integer stock;
    private String img;
    private Date createDate;
    private Integer categroyId;
    private Integer isDelete;

}

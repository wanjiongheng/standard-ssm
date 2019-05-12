package com.netopstec.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author
 */
@Setter
@Getter
@ToString
public class Item{
    private Long id;
    private String name;
    private BigDecimal price;
    private String pic;
    private Date createTime;
    private Date updateTime;
    private Date version;
    private Integer flag;
}

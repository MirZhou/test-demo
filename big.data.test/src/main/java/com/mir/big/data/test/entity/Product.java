package com.mir.big.data.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * 商品类
 * <p>Create time: 2019/4/15 9:01 PM</p>
 *
 * @author 周光兵
 */
@Entity
@Table(name = "big_data_test_product")
@Data
public class Product {
    /**
     * 商品编号
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 条形码
     */
    @Column(length = 50)
    private String barCode;
    /**
     * 商品名称
     */
    @Column(length = 100)
    private String name;
    /**
     * 单位
     */
    @Column(length = 50)
    private String unit;
    /**
     * 默认展示图（附件表附件ID）
     */
    @Column(length = 50)
    private String picture;

    /**
     * 分类Id
     */
    @Column
    private Integer categoryId;
    /**
     * 分类名称
     */
    @Column(length = 50)
    private String categoryName;

    /**
     * 售价
     */
    @Column(precision = 6,scale = 2)
    private BigDecimal price;

    /**
     * 库存
     */
    @Column
    private Integer stock;
    /**
     * 最小库存
     */
    @Column
    private Integer minStock;

    /**
     * 标志（1：新品，2：推荐，3：热卖）
     */
    @Column(length = 50)
    private String mark;
    /**
     * 年龄分级
     */
    @Column
    private Integer ageRating;
    /**
     * 商品规格
     */
    @Column(length = 200)
    private String specification;
    /**
     * 商品简介
     */
    @Column(length = 200)
    private String introduction;
}
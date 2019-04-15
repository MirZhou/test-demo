package com.mir.big.data.test.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 商品分类
 * <p>Create time: 2019/4/15 9:01 PM</p>
 *
 * @author 周光兵
 */
@Entity
@Table(name = "big_data_test_product_category")
@Data
public class ProductCategory {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 分类名称
     */
    @Column(length = 50)
    private String name;
}
package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.Product;

import java.util.List;

/**
 * <p>Create time: 2019/4/15 9:03 PM</p>
 *
 * @author 周光兵
 */
public interface ProductService {
    /**
     * 批量保存
     *
     * @param entities 要保存的商品列表
     */
    void saveAll(List<Product> entities);
}

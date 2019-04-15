package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.ProductCategory;

import java.util.List;

/**
 * <p>Create time: 2019/4/15 9:06 PM</p>
 *
 * @author 周光兵
 */
public interface ProductCategoryService {
    /**
     * 批量保存
     *
     * @param entities 要保存的商品分类列表
     */
    void saveAll(List<ProductCategory> entities);
}

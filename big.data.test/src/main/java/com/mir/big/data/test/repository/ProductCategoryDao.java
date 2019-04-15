package com.mir.big.data.test.repository;

import com.mir.big.data.test.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Dao：商品分类
 * <p>Create time: 2019/4/15 9:02 PM</p>
 *
 * @author 周光兵
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
}
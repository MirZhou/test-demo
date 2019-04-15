package com.mir.big.data.test.service.impl;

import com.mir.big.data.test.entity.ProductCategory;
import com.mir.big.data.test.repository.ProductCategoryDao;
import com.mir.big.data.test.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>Create time: 2019/4/15 9:09 PM</p>
 *
 * @author 周光兵
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    private final ProductCategoryDao productCategoryDao;

    @Autowired
    public ProductCategoryServiceImpl(ProductCategoryDao productCategoryDao) {
        this.productCategoryDao = productCategoryDao;
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public void saveAll(List<ProductCategory> entities) {
        this.productCategoryDao.saveAll(entities);
    }
}

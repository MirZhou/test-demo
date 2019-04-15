package com.mir.big.data.test.service.impl;

import com.mir.big.data.test.entity.Product;
import com.mir.big.data.test.repository.ProductDao;
import com.mir.big.data.test.service.ProductService;
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
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public void saveAll(List<Product> entities) {
        this.productDao.saveAll(entities);
    }
}
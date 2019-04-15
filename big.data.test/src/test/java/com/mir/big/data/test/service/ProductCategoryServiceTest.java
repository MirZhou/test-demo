package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceTest {
    @Autowired
    private ProductCategoryService productCategoryService;

    @Test
    public void saveAll() {
        List<ProductCategory> entities = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            ProductCategory entity = new ProductCategory();
            entity.setId(i + 1);
            entity.setName("分类" + entity.getId());

            entities.add(entity);
        }

        this.productCategoryService.saveAll(entities);
    }
}
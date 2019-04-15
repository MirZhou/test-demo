package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(ProductServiceTest.class);

    @Autowired
    private ProductService productService;

    private static String[] unit = {"件", "箱", "包", "瓶"};

    @Test
    public void generatedOneMillionProduct() {
        for (int i = 0; i < 1000; i++) {
            List<Product> entities = new ArrayList<>();

            for (int j = 0; j < 1000; j++) {
                int id = i * 1000 + (j + 1);
                int categoryId = ThreadLocalRandom.current().nextInt(1, 101);

                Product entity = new Product();
                entity.setBarCode(String.valueOf(id));
                entity.setName("商品" + id);
                entity.setUnit(unit[ThreadLocalRandom.current().nextInt(unit.length)]);
                entity.setPicture(String.valueOf(id));
                entity.setCategoryId(categoryId);
                entity.setCategoryName("分类" + categoryId);
                entity.setPrice(BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(0, 1000)));
                entity.setStock(ThreadLocalRandom.current().nextInt(10000));
                entity.setStock(ThreadLocalRandom.current().nextInt(100));
                entity.setAgeRating(ThreadLocalRandom.current().nextInt(1, 2));
                entity.setSpecification(entity.getName() + "的规格");
                entity.setIntroduction(entity.getName() + "的简介");

                entities.add(entity);
            }

            this.productService.saveAll(entities);

            this.logger.info("***************" + (i + 1) + "*****************");
        }
    }
}
package com.mir.lombok.repository;

import com.mir.lombok.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        User entity = new User();
        entity.setUsername("admin");
        entity.setName("周先生");

        this.userDao.save(entity);

        User search = new User();
        search.setUsername("admin");

        Assert.assertTrue(this.userDao.findOne(Example.of(search)).isPresent());
    }
}
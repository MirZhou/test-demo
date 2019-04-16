package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void generated20MillionUsers() {
        for (int i = 0; i < 5000; i++) {
            List<User> entities = new ArrayList<>();

                int id = 1;

            for (int j = 0; j < 4000; j++) {

                User entity = new User();
                entity.setLoginName(String.valueOf(id));
                entity.setPassword(String.valueOf(id));
                entity.setNickname("昵称" + id);
                entity.setActualName("姓名" + id);
                entity.setChineseIDNumber(String.valueOf(id));
                entity.setBirthDate(LocalDate.of(
                        ThreadLocalRandom.current().nextInt(1900, 2020),
                        ThreadLocalRandom.current().nextInt(1, 13),
                        ThreadLocalRandom.current().nextInt(1, 29)
                ));
                entity.setGender(j % 2 == 0 ? "男" : "女");
                entity.setPhone(String.valueOf(id));
                entity.setAvatar(String.valueOf(id));
                entity.setGrade(ThreadLocalRandom.current().nextInt(1, 6));
                entity.setIntegral(ThreadLocalRandom.current().nextInt(1, 10000));
                entity.setRegisterTime(LocalDateTime.now());

                entities.add(entity);

                id++;
            }

            this.userService.saveAll(entities);

            this.logger.info("***************" + (i + 1) + "*****************");
        }
    }
}
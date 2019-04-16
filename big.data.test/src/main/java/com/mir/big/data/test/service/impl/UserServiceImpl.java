package com.mir.big.data.test.service.impl;

import com.mir.big.data.test.entity.User;
import com.mir.big.data.test.repository.UserDao;
import com.mir.big.data.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * <p>Create time: 2019/4/16 9:09 AM</p>
 *
 * @author 周光兵
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(rollbackOn = Exception.class)
    @Override
    public void saveAll(List<User> entities) {
        this.userDao.saveAll(entities);
    }
}
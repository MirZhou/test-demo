package com.mir.big.data.test.service;

import com.mir.big.data.test.entity.User;

import java.util.List;

/**
 * <p>Create time: 2019/4/16 9:08 AM</p>
 *
 * @author 周光兵
 */
public interface UserService {
    /**
     * 批量保存
     *
     * @param entities 要保存的用户列表
     */
    void saveAll(List<User> entities);
}

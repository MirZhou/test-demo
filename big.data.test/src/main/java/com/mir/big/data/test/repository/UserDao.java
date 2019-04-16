package com.mir.big.data.test.repository;

import com.mir.big.data.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>Create time: 2019/4/16 9:07 AM</p>
 *
 * @author 周光兵
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
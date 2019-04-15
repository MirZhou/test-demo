package com.mir.lombok.repository;

import com.mir.lombok.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <p>Create time: 2019/1/5 10:53 PM</p>
 *
 * @author 周光兵
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {
}

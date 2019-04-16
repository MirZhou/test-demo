package com.mir.big.data.test.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>Create time: 2019/4/16 9:04 AM</p>
 *
 * @author 周光兵
 */
@Entity
@Table(name = "big_data_test_user")
@Data
public class User {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 用户名
     */
    @Column(length = 50)
    private String loginName;
    /**
     * 登录密码
     */
    @Column(length = 100)
    private String password;
    /**
     * 昵称
     */
    @Column(length = 50)
    private String nickname;
    /**
     * 真实姓名
     */
    @Column(length = 50)
    private String actualName;
    /**
     * 中国身份证号码
     */
    @Column(length = 50)
    private String chineseIDNumber;
    /**
     * 出生日期
     */
    @Column
    private LocalDate birthDate;
    /**
     * 性别
     */
    @Column(length = 50)
    private String gender;
    /**
     * 手机号
     */
    @Column(length = 50)
    private String phone;
    /**
     * 用户头像
     */
    @Column(length = 50)
    private String avatar;
    /**
     * 会员等级
     */
    @Column
    private Integer grade;
    /**
     * 用户积分
     */
    @Column
    private Integer integral;
    /**
     * 注册时间
     */
    @Column
    private LocalDateTime registerTime;
}
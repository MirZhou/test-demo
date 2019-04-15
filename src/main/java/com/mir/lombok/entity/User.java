package com.mir.lombok.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * <p>Create time: 2019/1/5 9:37 PM</p>
 *
 * @author 周光兵
 */
@Getter
@Setter
@ToString
@Entity
@Table(
        indexes = {
                @Index(name = "uk_username", columnList = "username", unique = true)
        })
public class User {
    @Id
    @GenericGenerator(name = "systemUUID", strategy = "uuid2")
    @GeneratedValue(generator = "systemUUID")
    @Column(columnDefinition = "VARCHAR(36) NOT NULL COMMENT '主键ID'")
    private String id;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT '登录名'")
    private String username;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL COMMENT '姓名'")
    private String name;
}
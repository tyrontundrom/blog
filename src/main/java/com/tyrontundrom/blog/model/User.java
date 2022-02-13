package com.tyrontundrom.blog.model;

import com.tyrontundrom.blog.jpa.BaseEntity;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
class User extends BaseEntity {

    @Column
    private String userName;

    @Column
    private String password;

    @Column
    private String email;
}

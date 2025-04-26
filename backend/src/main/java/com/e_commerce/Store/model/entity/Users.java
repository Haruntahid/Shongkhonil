package com.e_commerce.Store.model.entity;

import com.e_commerce.Store.utils.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class Users extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

}

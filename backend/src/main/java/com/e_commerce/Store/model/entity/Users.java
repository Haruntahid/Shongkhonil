package com.e_commerce.Store.model.entity;

import com.e_commerce.Store.utils.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users extends BaseEntity {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String phone;

    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private List<Role> roles;

}

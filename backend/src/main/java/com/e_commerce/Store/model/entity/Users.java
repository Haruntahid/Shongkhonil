package com.e_commerce.Store.model.entity;

import com.e_commerce.Store.utils.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.List;

@Entity
@Data
@Table(name = "user")
public class Users extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}

package com.e_commerce.Store.model.entity;

import com.e_commerce.Store.utils.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Column(nullable = false,unique = true)
    private String name;

    private String description;
}

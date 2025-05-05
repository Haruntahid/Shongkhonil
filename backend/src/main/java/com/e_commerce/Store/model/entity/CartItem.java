package com.e_commerce.Store.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Products product;

    private int quantity;

    @ManyToOne
    private Users user;
}

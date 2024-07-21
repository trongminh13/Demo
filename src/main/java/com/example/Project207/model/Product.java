package com.example.Project207.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;
    @Column(name = "nameProduct")
    private String nameProduct;
    @Column(name = "price")
    private Double price;
    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "statusproduct")
    private boolean statusProduct;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}

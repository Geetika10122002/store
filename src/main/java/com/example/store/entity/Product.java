package com.example.store.entity;

import jakarta.persistence.*;
import java.util.Date;
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brand;
    private String category;
    private double price;
    @Column(columnDefinition = "Text")
    private String description;
    private Date created_at;
    private String image_field_name;
    public Product() {}

    public Product(String brand, String category, Date created_at, String description, String image_field_name, String name, double price) {
        this.brand = brand;
        this.category = category;
        this.created_at = created_at;
        this.description = description;
        this.image_field_name = image_field_name;
        this.name = name;
        this.price = price;
    }
    public long getId() {
        return id;
    }
    public String getBrand() {
        return brand;
    }
    public String getCategory() {
        return category;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public String getDescription() {
        return description;
    }
    public String getImage_field_name() {
        return image_field_name;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage_field_name(String image_field_name) {
        this.image_field_name = image_field_name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

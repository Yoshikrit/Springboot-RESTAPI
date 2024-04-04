package com.acme.productservice.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "prod_code")
    private int id;
    @Column(name = "prod_prodtype_code")
    private int prodTypeId;
    @Column(name = "prod_name")
    private String name;
    @Column(name = "prod_description")
    private String description;
    @Column(name = "prod_price")
    private BigDecimal price;
    @Column(name = "prod_discount")
    private BigDecimal discount;
    @Column(name = "prod_created_at")
    private Timestamp createdAt;
    @Column(name = "prod_created_user")
    private int createdUser;
    @Column(name = "prod_updated_at")
    private Timestamp updatedAt;
    @Column(name = "prod_updated_user")
    private int updatedUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(int prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(int createdUser) {
        this.createdUser = createdUser;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(int updatedUser) {
        this.updatedUser = updatedUser;
    }
}

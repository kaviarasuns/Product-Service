package com.teamrepublic.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;

@Entity
@Builder
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;

    @ManyToOne
    private Category category;
    private double price;
}

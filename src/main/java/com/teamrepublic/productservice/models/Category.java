package com.teamrepublic.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Category extends  BaseModel{

    @Column
    private String name;


    @OneToMany(mappedBy = "category")
    private List<Product> products;

}

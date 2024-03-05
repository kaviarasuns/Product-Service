package com.teamrepublic.productservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;

    @ManyToOne()
    @JoinColumn(name = "category")
    private Category category;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Price price;

}

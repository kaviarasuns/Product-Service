package com.teamrepublic.productservice.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(generator = "kavi")
    @GenericGenerator(name = "kavi", strategy = "uuid2")
    @Column(name = "id", columnDefinition = "binary(16)", nullable = false, updatable = false)
    private UUID uuid;
}

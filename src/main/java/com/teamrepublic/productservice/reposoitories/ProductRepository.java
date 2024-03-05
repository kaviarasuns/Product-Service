package com.teamrepublic.productservice.reposoitories;

import com.teamrepublic.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository
extends JpaRepository<Product, UUID> {
    Product findByTitleEquals(String title);

    Product findByTitleEqualsAndPrice_Price(String title, double price);
}

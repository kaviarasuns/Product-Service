package com.teamrepublic.productservice.services;


import com.teamrepublic.productservice.dtos.GenericProductDto;
import com.teamrepublic.productservice.models.Product;

public interface ProductService {

    GenericProductDto getProductById(Long id);

}

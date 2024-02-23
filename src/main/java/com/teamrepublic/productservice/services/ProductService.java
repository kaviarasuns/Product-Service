package com.teamrepublic.productservice.services;


import com.teamrepublic.productservice.dtos.GenericProductDto;
import com.teamrepublic.productservice.exception.NotFoundException;
import com.teamrepublic.productservice.models.Product;

import java.util.List;

public interface ProductService {

    GenericProductDto createProduct(GenericProductDto product);

    GenericProductDto getProductById(Long id) throws NotFoundException;

    List<GenericProductDto> getAllProducts();

    GenericProductDto deleteProduct(Long id);

}

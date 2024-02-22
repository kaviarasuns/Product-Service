package com.teamrepublic.productservice.services;

import com.teamrepublic.productservice.dtos.GenericProductDto;
import com.teamrepublic.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{

    @Override
    public GenericProductDto getProductById(Long id){
        return null;
    }
}

package com.teamrepublic.productservice.controllers;

import com.teamrepublic.productservice.dtos.ExceptionDto;
import com.teamrepublic.productservice.dtos.GenericProductDto;
import com.teamrepublic.productservice.exception.NotFoundException;
import com.teamrepublic.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<GenericProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException{
        return productService.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<GenericProductDto> deleteProductById(@PathVariable("id") Long id){
       return new ResponseEntity<>(productService.deleteProduct(id), HttpStatus.OK);
    }



    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto product){
        System.out.println(product.getDescription());
        return productService.createProduct(product);

    }

    @PutMapping("{id}")
    public  void updateProductById(){

    }
}

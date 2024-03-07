package com.teamrepublic.productservice.services;

import com.teamrepublic.productservice.models.Category;
import com.teamrepublic.productservice.models.Product;
import com.teamrepublic.productservice.reposoitories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;


    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Category getCategory(String uuid){
        Optional<Category> categoryOptional = categoryRepository.findById(UUID.fromString(uuid));

        if(categoryOptional.isEmpty()){
            return null;
        }

        Category category = categoryOptional.get();
        List<Product> products = category.getProducts();
        return  category;
    }
}

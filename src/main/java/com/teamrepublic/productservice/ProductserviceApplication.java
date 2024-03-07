package com.teamrepublic.productservice;

import com.teamrepublic.productservice.inheritancedemo.tableperclass.Mentor;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.MentorRepository;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.User;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.UserRepository;
import com.teamrepublic.productservice.models.Category;
import com.teamrepublic.productservice.models.Price;
import com.teamrepublic.productservice.models.Product;
import com.teamrepublic.productservice.reposoitories.CategoryRepository;
import com.teamrepublic.productservice.reposoitories.PriceRepository;
import com.teamrepublic.productservice.reposoitories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication {

//    implements CommandLineRunner

//    private MentorRepository mentorRepository;
//
//
//    private UserRepository userRepository;
//    private final ProductRepository productRepository;
//    private final CategoryRepository categoryRepository;
//    private final PriceRepository priceRepository;
//
//    public ProductserviceApplication(@Qualifier("tbc_mr") MentorRepository mentorRepository,
//                                     @Qualifier("tbc_ur") UserRepository userRepository,
//                                     ProductRepository productRepository,
//                                     CategoryRepository categoryRepository,
//                                     PriceRepository priceRepository){
//        this.mentorRepository = mentorRepository;
//        this.userRepository = userRepository;
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//        this.priceRepository = priceRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ProductserviceApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Kavi");
//        mentor.setEmail("kavi@teamrepublic.com");
//        mentor.setAverageRating(5);
//        mentorRepository.save(mentor);
//
//        User user = new User();
//        user.setName("Sarath");
//        user.setEmail("sarathcool@yopmail.com");
//        userRepository.save(user);



//        List<User> users = userRepository.findAll();
//        for (User user1: users) {
//            System.out.println(user1);
//

//        Category category = new Category();
//        category.setName("Android Devices");
//        categoryRepository.save(category);
//        Category savedCategory = categoryRepository.save(category);
//
//        Product product = new Product();
//        Price price = new Price("Rupee",10);
////        Price savedPrice = priceRepository.save(price);
//
//        product.setTitle("iPhone 15 Pro");
//        product.setDescription("The best iPhone Ever");
//        product.setPrice(price);
//        product.setCategory(savedCategory);
//
//
//        productRepository.save(product);
//
//        List<Product> products1 = productRepository.findAllByTitle("iPhone 15 pro");
//
//        System.out.println("Fetching category 0ff729e1-d706-48dd-9e7d-5365bf3e3717");
//        Thread.sleep(1000);
//        Optional<Category> category1Optional = categoryRepository.findById(UUID.fromString("0ff729e1-d706-48dd-9e7d-5365bf3e3717"));
////        Category category1 = category1Optional.get();
//
//    }
}

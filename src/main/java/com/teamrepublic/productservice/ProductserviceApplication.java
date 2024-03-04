package com.teamrepublic.productservice;

import com.teamrepublic.productservice.inheritancedemo.tableperclass.Mentor;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.MentorRepository;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.User;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.UserRepository;
import com.teamrepublic.productservice.models.Category;
import com.teamrepublic.productservice.models.Product;
import com.teamrepublic.productservice.reposoitories.CategoryRepository;
import com.teamrepublic.productservice.reposoitories.ProductRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {


    private MentorRepository mentorRepository;


    private UserRepository userRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductserviceApplication(@Qualifier("tbc_mr") MentorRepository mentorRepository,
                                     @Qualifier("tbc_ur") UserRepository userRepository,
                                     ProductRepository productRepository,
                                     CategoryRepository categoryRepository){
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
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

        Category category = new Category();
        category.setName("Android Devices");
        categoryRepository.save(category);
        Category savedCategory = categoryRepository.save(category);

        Product product = new Product();
        product.setTitle("iPhone 15 Pro");
        product.setDescription("The best iPhone Ever");
        product.setCategory(savedCategory);


        productRepository.save(product);

        Category category1 = categoryRepository.findById(UUID.fromString("0169cabb-1293-4f9e-81ef-f4af88c728e8")).get();

    }
}

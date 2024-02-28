package com.teamrepublic.productservice;

import com.teamrepublic.productservice.inheritancedemo.tableperclass.Mentor;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.MentorRepository;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.User;
import com.teamrepublic.productservice.inheritancedemo.tableperclass.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {


    private MentorRepository mentorRepository;


    private UserRepository userRepository;

    public ProductserviceApplication(@Qualifier("tbc_mr") MentorRepository mentorRepository,
                                     @Qualifier("tbc_ur") UserRepository userRepository){
        this.mentorRepository = mentorRepository;
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ProductserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Mentor mentor = new Mentor();
        mentor.setName("Kavi");
        mentor.setEmail("kavi@teamrepublic.com");
        mentor.setAverageRating(5);
        mentorRepository.save(mentor);

        User user = new User();
        user.setName("Sarath");
        user.setEmail("sarathcool@yopmail.com");
        userRepository.save(user);

//        List<User> users = userRepository.findAll();
//        for (User user1: users) {
//            System.out.println(user1);
//        }

    }
}

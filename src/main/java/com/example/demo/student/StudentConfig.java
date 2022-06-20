package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tony = new Student(
                    "Tony",
                    "tony.ferg@gmail.com",
                    LocalDate.of(1984, JANUARY, 24),
                    38
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 24),
                    38
            );

            repository.saveAll(
                    List.of(tony, alex)
            );
        };
    }
}




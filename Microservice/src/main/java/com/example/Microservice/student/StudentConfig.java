package com.example.Microservice.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student marleen = new Student(
				"Marleen",
				LocalDate.of(2000, Month.JANUARY, 5),
				"mail@gmail.com"
			);

            Student mariam = new Student(
				"Mariam",
				LocalDate.of(2000, Month.JANUARY, 5),
				"mariam@gmail.com"
			);

            repository.saveAll(
                List.of(marleen, mariam)
            );
        };
    }
    
}

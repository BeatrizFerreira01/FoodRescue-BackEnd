package br.com.food_rescue_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class FoodRescueApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodRescueApiApplication.class, args);
    }
}

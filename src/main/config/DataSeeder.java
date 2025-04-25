package br.com.food_rescue_api.config;

import br.com.food_rescue_api.model.User;
import br.com.food_rescue_api.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void seedDatabase() {
        if (userRepository.count() == 0) {
            userRepository.save(new User(null, "Beatriz", "Desenvolvedora BackEnd"));
            userRepository.save(new User(null, "Barbara", "Desenvolvedora FrontEnd"));
        }
    }
}

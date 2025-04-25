package br.com.food_rescue_api.repository;

import br.com.food_rescue_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

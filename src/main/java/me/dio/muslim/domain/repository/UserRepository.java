package me.dio.muslim.domain.repository;

import me.dio.muslim.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    

}

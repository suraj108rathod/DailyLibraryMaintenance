package xyz;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdemo.controller.UserController;

public interface UserRepository extends JpaRepository<UserController,Integer> {

}

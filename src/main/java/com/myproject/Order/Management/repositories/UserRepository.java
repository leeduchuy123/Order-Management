package com.myproject.Order.Management.repositories;

import com.myproject.Order.Management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);       //Chi tra ve 1 hoac khong co ket qua
}

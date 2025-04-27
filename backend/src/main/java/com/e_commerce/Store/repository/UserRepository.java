package com.e_commerce.Store.repository;

import com.e_commerce.Store.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);

    Optional<Users> findByUsernameOrPhone(String username, String phone );
}

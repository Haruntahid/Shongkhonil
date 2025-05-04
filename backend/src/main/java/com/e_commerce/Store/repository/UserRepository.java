package com.e_commerce.Store.repository;

import com.e_commerce.Store.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByUsername(String username);

    @Query("SELECT COUNT(u) > 0 FROM Users u WHERE u.username = :username OR u.phone = :phone")
    boolean existsByUsernameOrPhone(@Param("username") String username, @Param("phone") String phone);
}

package com.e_commerce.Store.repository;

import com.e_commerce.Store.model.entity.Colors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<Colors, Long> {
    Optional<Colors> findById(Long id);
}

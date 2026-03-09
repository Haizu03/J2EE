package com.example.bai5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bai5.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
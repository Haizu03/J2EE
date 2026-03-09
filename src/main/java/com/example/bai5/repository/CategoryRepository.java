package com.example.bai5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bai5.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
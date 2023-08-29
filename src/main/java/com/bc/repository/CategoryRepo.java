package com.bc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bc.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}

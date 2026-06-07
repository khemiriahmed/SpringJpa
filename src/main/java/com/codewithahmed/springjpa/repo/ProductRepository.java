package com.codewithahmed.springjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithahmed.springjpa.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

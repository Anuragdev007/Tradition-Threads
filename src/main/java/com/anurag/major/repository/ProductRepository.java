package com.anurag.major.repository;

import java.util.List;

import com.anurag.major.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
List<Product> findAllByCategory_Id(int id);
}

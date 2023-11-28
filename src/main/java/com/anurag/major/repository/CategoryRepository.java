package com.anurag.major.repository;



import com.anurag.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer>{
	

}

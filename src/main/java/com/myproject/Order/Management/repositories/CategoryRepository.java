package com.myproject.Order.Management.repositories;

import com.myproject.Order.Management.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Long>{
}

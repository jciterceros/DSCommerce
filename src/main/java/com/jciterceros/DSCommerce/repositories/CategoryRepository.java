package com.jciterceros.DSCommerce.repositories;

import com.jciterceros.DSCommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

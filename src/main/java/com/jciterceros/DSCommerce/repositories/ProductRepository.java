package com.jciterceros.DSCommerce.repositories;

import com.jciterceros.DSCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

package com.jciterceros.DSCommerce.repositories;

import com.jciterceros.DSCommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

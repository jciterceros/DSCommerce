package com.jciterceros.DSCommerce.repositories;

import com.jciterceros.DSCommerce.entities.OrderItem;
import com.jciterceros.DSCommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

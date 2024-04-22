package com.jciterceros.DSCommerce.services;

import com.jciterceros.DSCommerce.dto.OrderDTO;
import com.jciterceros.DSCommerce.entities.Order;
import com.jciterceros.DSCommerce.repositories.OrderRepository;
import com.jciterceros.DSCommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow
                (() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}

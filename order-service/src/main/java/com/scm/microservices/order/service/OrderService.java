package com.scm.microservices.order.service;

import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Service;
import com.scm.microservices.order.OrderRequest;
import com.scm.microservices.model.Order;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class OrderService {
    private final  OrderRepository orderRepository;

    public void placeOrder(OrderRequest OrderRequest) {

        //mapping OrderRequest to Order object
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkucode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());

        
        //save  order to OrderRepository
    
        orderRepository.save(order);

    }


}
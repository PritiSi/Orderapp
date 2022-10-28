package net.codejava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.entity.Order;
import net.codejava.entity.Item;
import net.codejava.repository.OrderRepository;
import net.codejava.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public Order saveOrder(Order order) {
        Item item = order.getItem();
        item.setOrder(order);
        order = orderRepository.save(order);
        return order;
    }
    public Order findByOrderId(int orderId) {
    	Order order = orderRepository.findByOrderId(orderId);
        return order;
    }
}

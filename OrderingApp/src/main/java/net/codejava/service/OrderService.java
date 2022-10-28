package net.codejava.service;

import org.springframework.stereotype.Component;
import net.codejava.entity.Order;
@Component
public interface OrderService {
    public Order saveOrder(Order order);
    public Order findByOrderId(int orderId);
}

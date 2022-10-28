package net.codejava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import net.codejava.entity.Order;
import net.codejava.service.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
    private OrderService orderService;
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    @ResponseBody
    public Order saveOrder(@RequestBody Order order) {
    	Order bookResponse = orderService.saveOrder(order);
        return bookResponse;
    }
    
    @RequestMapping(value = "order/{Order_id}", method = RequestMethod.GET)
    @ResponseBody
    public Order getOrderDetails(@PathVariable int orderId) {
    	Order orderResponse = orderService.findByOrderId(orderId);
        return orderResponse;
    }

}

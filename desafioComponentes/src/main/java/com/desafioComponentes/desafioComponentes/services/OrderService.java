package com.desafioComponentes.desafioComponentes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafioComponentes.desafioComponentes.entities.Order;


@Service
public class OrderService {
	
@Autowired
private ShippingService shippingService;

	public double total(Order order) {
		return order.getBasic() - (order.getBasic()* order.getDiscount() /100) + shippingService.shipping(order);
	}
	
	
}

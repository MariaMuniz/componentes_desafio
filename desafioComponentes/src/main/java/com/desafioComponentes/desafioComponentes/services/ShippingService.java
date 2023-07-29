package com.desafioComponentes.desafioComponentes.services;

import org.springframework.stereotype.Service;

import com.desafioComponentes.desafioComponentes.entities.Order;

@Service
public class ShippingService {
	
	
	public double shipping(Order order) {
		
		double tax;
			if(order.getBasic()<100) {
				tax= 20.0;
			 }
		     else if(order.getBasic()>=100 && order.getBasic()<=200) {
					tax= 12.0;
			}
		    else {
		    tax= 0.0;
		    }
			return tax;
		}

}

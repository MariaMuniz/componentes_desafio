package com.desafioComponentes.desafioComponentes;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafioComponentes.desafioComponentes.entities.Order;
import com.desafioComponentes.desafioComponentes.services.OrderService;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService  orderService;
	
	

	public static void main(String[] args) {
		SpringApplication.run(DesafioComponentesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);

	System.out.print("Code: ");
	Integer code = sc.nextInt();
	System.out.print("Valor produto: ");
	double basic = sc.nextDouble();
	System.out.print("Valor desconto: ");
	double discount = sc.nextDouble();
     Order order = new Order(code, basic, discount);
  
     double total = orderService.total(order);
 	System.out.printf("Pedido codigo: " +code +" _ "+ "Valor total R$ %.2f%n" +" " , total);
	sc. close();
		
	}

}

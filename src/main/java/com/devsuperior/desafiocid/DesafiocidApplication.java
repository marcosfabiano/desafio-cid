package com.devsuperior.desafiocid;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafiocidApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;

	public static void main(String[] args)
	{
		SpringApplication.run(DesafiocidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800.00, 10.00);
		System.out.println("Pedido código " + order.getCode());
		System.out.print("Valor total: R$ " + String.format("%.2f",orderService.total(order)));
	}
}

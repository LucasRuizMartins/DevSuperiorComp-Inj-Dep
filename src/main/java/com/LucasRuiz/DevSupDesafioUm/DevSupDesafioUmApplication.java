package com.LucasRuiz.DevSupDesafioUm;

import com.LucasRuiz.DevSupDesafioUm.entities.Order;
import com.LucasRuiz.DevSupDesafioUm.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan ({"com.LucasRuiz.DevSupDesafioUm"})
public class DevSupDesafioUmApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DevSupDesafioUmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Codigo do pedido");
		Integer code = sc.nextInt();
		System.out.println("Digite o Valor total");
		Double basic = sc.nextDouble();
		System.out.println("Digite o Desconto ");
		Double discont = sc.nextDouble();

		Order order = new Order(code,
				basic,
				discont);

		System.out.println("Pedido Codigo :" + order.getCode());
		System.out.println( String.format("Valor total %.2f" , orderService.total(order)) );



	}
}

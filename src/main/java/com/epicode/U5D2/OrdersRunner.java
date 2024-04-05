package com.epicode.U5D2;

import com.epicode.U5D2.dao.PizzaDAO;
import com.epicode.U5D2.dao.PizzaService;
import com.epicode.U5D2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrdersRunner implements CommandLineRunner {

	@Autowired
	private PizzaService pService;
	@Override
	public void run(String... args) throws Exception {

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2Application.class);
//		try {
//			Menu m = (Menu) ctx.getBean("menu");
//			m.printMenu();
//
//			Table t1 = (Table) ctx.getBean("Tavolo1");
//
//			Order o1 = new Order(4, t1);
//
//			o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//			o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//			o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("lemonade", Drink.class));
//			o1.addItem(ctx.getBean("wine", Drink.class));
//
//			System.out.println("DETTAGLI TAVOLO 1:");
//			o1.print();
//
//			System.out.println("CONTO TAVOLO 1");
//			System.out.println(o1.getTotal());
//		} catch (Exception ex) {
//			System.err.println(ex.getMessage());
//		} finally {
//			ctx.close();
//		}

//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5D2Application.class);
//		pService.saveTopping(ctx.getBean("toppings_tomato", Topping.class));
//		pService.saveTopping(ctx.getBean("toppings_cheese", Topping.class));
//		pService.saveTopping(ctx.getBean("toppings_ham", Topping.class));
//		pService.saveTopping(ctx.getBean("toppings_pineapple", Topping.class));
//		pService.saveTopping(ctx.getBean("toppings_salami", Topping.class));
//
//		pService.savePizza(ctx.getBean("pizza_margherita", Pizza.class));
//		pService.savePizza(ctx.getBean("hawaiian_pizza", Pizza.class));
//		pService.savePizza(ctx.getBean("salami_pizza", Pizza.class));
//		pService.savePizza(ctx.getBean("salami_pizza_xl", Pizza.class));
//
//		pService.saveDrinks(ctx.getBean("lemonade", Drink.class));
//		pService.saveDrinks(ctx.getBean("water", Drink.class));
//		pService.saveDrinks(ctx.getBean("wine", Drink.class));

		pService.filterByPartialName("H").forEach(System.out::println);
//		pService.filterIsXL().forEach(System.out::println);
//		pService.findByName("Pizza Margherita").forEach(System.out::println);
	}
}

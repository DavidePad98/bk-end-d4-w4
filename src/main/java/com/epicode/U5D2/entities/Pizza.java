package com.epicode.U5D2.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "pizzas")
@Getter
@Setter
public class Pizza extends Item {
	@Column(name = "name")
	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private long pizza_id;

	@ManyToMany
	@JoinTable(
			name = "pizza_toppings",
			joinColumns = @JoinColumn(name = "pizza_id"),
			inverseJoinColumns = @JoinColumn(name = "topping_id")
	)
	private List<Topping> toppingList;
	private boolean isXl = false;

	public Pizza(String name, List<Topping> toppingList, boolean isXl) {
		super(700, 4.3);
		this.name = name;
		this.toppingList = toppingList;
		this.isXl = isXl;
	}
	public Pizza(){
        super(700, 4.3);
    }

	@Override
	public int getCalories() {
		return super.getCalories() + this.getToppingList().stream().mapToInt(Topping::getCalories).sum();
	}

	@Override
	public double getPrice() {
		return super.getPrice() + this.getToppingList().stream().mapToDouble(Topping::getPrice).sum();
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
//				", toppingList=" + toppingList + <-- PUO CREARE PROBLEM IN FASE DI RUNNING
				", isXl=" + isXl +
				'}';
	}
}

package com.epicode.U5D2.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "toppings")
@Getter
@Setter
@ToString
public class Topping extends Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private long topping_id;
	private String name;

	public Topping(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Topping{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}

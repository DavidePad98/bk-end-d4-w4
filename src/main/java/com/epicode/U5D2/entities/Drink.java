package com.epicode.U5D2.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "drinks")
@Getter
@Setter
public class Drink extends Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Setter(AccessLevel.NONE)
	private long drink_id;
	private String name;


	public Drink(String name, int calories, double price) {
		super(calories, price);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Drink{" +
				"name='" + name + '\'' +
				", calories=" + calories +
				", price=" + price +
				'}';
	}
}

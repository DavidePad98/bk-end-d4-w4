package com.epicode.U5D2.entities;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@Getter
@ToString
public class Tables {
	private int numTable;
	private int numMaxCoperti;
	private boolean isFree;
	private double costoCoperto;

	public void print() {
		System.out.println("numero tavolo--> " + numTable);
		System.out.println("numero massimo coperti--> " + numMaxCoperti);
		System.out.println("occupato/libero--> " + (this.isFree ? "Libero" : "Occupato"));
	}

}

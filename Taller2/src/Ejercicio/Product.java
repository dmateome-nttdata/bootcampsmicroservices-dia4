package Ejercicio;

import java.math.BigDecimal;

enum Tax {
	SUPERREDUCED(4), REDUCED(10), NORMAL(21);

	public int percent;

	private Tax(int percent) {
		this.percent = percent;
	}

	public int getPercent() {
		return percent;
	}
}

class Product {
	public String name;
	public BigDecimal price;
	public Tax tax;

	Product(String name, BigDecimal price, Tax tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
}
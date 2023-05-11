package Ejercicio;

import java.math.BigDecimal;
import java.util.List;

public class E1 {

	public static void main(String[] args) {
		List<Product> shopping = List.of(new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
				new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
				new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
				new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
				new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
				new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));

		BigDecimal precioTotal = BigDecimal.ZERO;
		precioTotal = shopping.stream()
				.map(x -> x.price
						.multiply(new BigDecimal(x.tax.percent).divide(new BigDecimal(100))).add(x.price))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(precioTotal);
		// shopping.stream().map(x->(x.tax * x.price));
	}
}

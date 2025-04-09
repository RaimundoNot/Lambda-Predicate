package util;

import java.util.function.Function;

import Entities.Product;

public class upperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}

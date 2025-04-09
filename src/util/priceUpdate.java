package util;

import java.util.function.Consumer;

import Entities.Product;

public class priceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()*1.1);
		
	}

}

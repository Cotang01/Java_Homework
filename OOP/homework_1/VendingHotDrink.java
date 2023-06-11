package oop_1;

import java.util.ArrayList;
import java.util.List;

public class VendingHotDrink implements Vending {
	
	private List<HotDrink> hotDrinks = new ArrayList<>();
	
	@Override
	public void addProduct(HotDrink product) {
		hotDrinks.add(product);
	}

	@Override
	public String getProduct(String name) {
		for (HotDrink product : hotDrinks) {
			if (product.getName().equals(name)) {
				return product.toString();
			}
		}
		return null;
	}
	@Override
	public String getProduct(String name, int volume) {
		for (HotDrink product : hotDrinks) {
			if (product.getName().equals(name) && 
					product.getVolume() == volume) {
				return product.toString();
			}
		}
		return null;
	}
	
}

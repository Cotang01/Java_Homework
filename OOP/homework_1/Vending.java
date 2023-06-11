package oop_1;

public interface Vending {
	
	void addProduct(HotDrink product);
	
	String getProduct(String name);
	String getProduct(String name, int volume);
	
}

package oop_1;

public class Main {
	
	public static void main(String[] args) {
		
		 /**
		  * Автор: Мартынов Александр
		  * Группа: 3623
		  * 
		  * 1. Создать наследника реализованного класса ГорячийНапиток с 
		  * дополнительным полем int температура.
		  * 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс 
		  * ТорговыйАвтомат и реализовать перегруженный метод 
		  * getProduct(int name, int volume, int temperature), выдающий 
		  * продукт соответствующий имени, объёму и температуре
		  * 3. В main проинициализировать несколько ГорячихНапитков и 
		  * ГорячихНапитковАвтомат и воспроизвести логику, заложенную в 
		  * программе
		  * 4. Всё вышеуказанное создать согласно принципам ООП, 
		  * пройденным на семинаре
		  */
		
		VendingHotDrink hotDrinks = new VendingHotDrink();
		
		HotDrink cacao = new Cacao("Какао", 300, 80);
		HotDrink tea = new Tea("Чай", 250, 95);
		HotDrink coffe = new Coffe("Кофе", 200, 90);
		
		hotDrinks.addProduct(cacao);
		hotDrinks.addProduct(tea);
		hotDrinks.addProduct(coffe);
		
		System.out.println(hotDrinks.getProduct("Кофе"));
		System.out.println(hotDrinks.getProduct("Чай", 250));
	}
}

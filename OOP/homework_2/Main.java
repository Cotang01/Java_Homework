package oop_2;

public class Main {

	public static void main(String[] args) {
		
		Market market = new Market();
		
		Human chel1 = new Human("Жмышенко Валерий Альбертович", 54);
		Human chel2 = new Human("Зубенко Михаил Петрович", 33);
		
		market.getToMarket(chel1);
		market.getToMarket(chel2);
		
		market.update();
		
		chel1.setMakeOrder();
		chel2.setMakeOrder();
		
		market.update();
		
		chel1.setTakeOrder();
		
		market.update();
		
	}

}

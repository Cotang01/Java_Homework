package oop_1;

public class Cacao extends HotDrink {
	
	private int temp;
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public Cacao(String name, int volume, int temp) {
		super(name, volume);
		this.temp = temp;
	}

	@Override
	public String toString() {
		return String.format("%s, объём " + "%s мл, "
				+ "Температура %s", getName(), getVolume(), getTemp());
	}
	
}

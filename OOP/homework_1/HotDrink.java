package oop_1;

public abstract class HotDrink {
	
	private String name;
	private int volume;
	
	public String getName() {
		return name;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public HotDrink(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}
	
	
}

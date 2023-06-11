package oop_2;

public class Human extends Actor{
	
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Human(String name, int age) {
		super (name);
		this.age = age;
	}
	
    @Override
    public String toString() {
        return String.format("Клиент: %s возраст: %s", name, age);
    }
	
}

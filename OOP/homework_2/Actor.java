package oop_2;

public class Actor implements ActorBehaviour {
	
	protected String name;
	protected boolean isMakeOrder;
	protected boolean isTakeOrder;
	
	public Actor(String name) {
		this.name = name;
	}
	
	@Override
	public void setMakeOrder() {
		System.out.println("Для пользователя " + name + " создан заказ.");
		isMakeOrder = true;
	}
	
	@Override
	public void setTakeOrder() {
		System.out.println("Пользователь " + name + " получил свой заказ.");
		isTakeOrder = true;
	}
	
	@Override
	public boolean isMakeOrder() {
		return isMakeOrder;
	}
	
	@Override
	public boolean isTakeOrder() {
		return isTakeOrder;
	}
	
	public String getName() {
		return name;
	}
}

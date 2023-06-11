package oop_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
	
	private List<Actor> actors;
	private List<Actor> quittingActors;
	
	public Market() {
		actors = new ArrayList<Actor>();
	}
	
	@Override
	public void getToMarket(Actor actor) {
		System.out.println(actor.getName() + " зашёл в маркет");
	}

	@Override
	public void getOutOfMarket(List<Actor> actors) {
		for (Actor actor : actors) {
			System.out.println(actor.getName() + " вышел из магазина.");
			actors.remove(actor);
		}
	}

	@Override
	public void update() {
		takeOrder();
		giveOrder();
		getOutFromQueue();
	}

	@Override
	public void getInQueue(Actor actor) {
		System.out.println(actor.getName() + "в очереди.");
		this.actors.add(actor);
	}

	@Override
	public void takeOrder() {
		for (Actor actor : actors) {
			if (!actor.isMakeOrder) {
				actor.setMakeOrder();
				System.out.println(actor.getName() + " сделал заказ.");
			}
		}
	}

	@Override
	public void giveOrder() {
		for (Actor actor : actors) {
			if (actor.isMakeOrder) {
				actor.setTakeOrder();
				System.out.println(actor.getName() + " забрал заказ.");
			}
		}
	}

	@Override
	public void getOutFromQueue() {
		for (Actor actor : actors) {
			if (actor.isTakeOrder) {
				quittingActors.add(actor);
				System.out.println(actor.getName() + " покинул очередь.");
			}
		}
	}

}

package oop_2;

import java.util.List;

public interface MarketBehaviour {
	
    void getToMarket(Actor actor);
    void getOutOfMarket(List<Actor> actors);
    void update();

}

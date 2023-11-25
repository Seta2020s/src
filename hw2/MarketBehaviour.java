import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);

    void releaseFromQueue(List<Actor> actors);

    void releaseFromMarket(List<Actor> actors);

    void update();

}
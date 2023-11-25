public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Anna");
        Human human2 = new Human("John");
        Market market = new Market();

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);

        market.update();
        market.releaseFromQueue();
    }
}
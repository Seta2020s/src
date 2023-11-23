package task_1;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
package design_pattern.strategy.coffee;

public class main {
    public static void main(String[] args) {
        Road road = new Road();

        Americano americano = new Americano();
        CafeLatte cafeLatte = new CafeLatte();

        //아메리카노
        road.setMachine(americano);
        road.doMachine();

        //카페라떼
        road.setMachine(cafeLatte);
        road.doMachine();
    }
}

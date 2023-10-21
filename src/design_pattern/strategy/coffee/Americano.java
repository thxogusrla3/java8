package design_pattern.strategy.coffee;

public class Americano implements Machine{
    @Override
    public void brew() {
        System.out.println("Americano");
    }
}

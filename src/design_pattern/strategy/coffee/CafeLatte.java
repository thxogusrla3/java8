package design_pattern.strategy.coffee;

public class CafeLatte implements Machine{
    @Override
    public void brew() {
        System.out.println("카페라떼");
    }
}

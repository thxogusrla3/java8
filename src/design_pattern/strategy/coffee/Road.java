package design_pattern.strategy.coffee;

public class Road {
    private Machine machine;

    void setMachine(Machine machine) {
        this.machine = machine;
    }

    void doMachine() {
        machine.brew();
    }

}

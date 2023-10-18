package design_pattern.strategy.robot.move;

import design_pattern.strategy.robot.MoveStrategy;

public class Stand implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("서있다");
    }
}

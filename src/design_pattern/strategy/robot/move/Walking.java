package design_pattern.strategy.robot.move;

import design_pattern.strategy.robot.MoveStrategy;

public class Walking implements MoveStrategy {
    @Override
    public void move() {
        System.out.println("걷다");
    }
}

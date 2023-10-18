package design_pattern.strategy.robot.emotion;

import design_pattern.strategy.robot.EmotionStrategy;

public class Happy implements EmotionStrategy {
    @Override
    public void emotion() {
        System.out.println("행복");
    }
}

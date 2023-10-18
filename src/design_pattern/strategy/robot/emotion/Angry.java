package design_pattern.strategy.robot.emotion;

import design_pattern.strategy.robot.EmotionStrategy;

public class Angry implements EmotionStrategy {
    @Override
    public void emotion() {
        System.out.println("화났다!");
    }
}

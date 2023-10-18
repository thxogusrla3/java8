package design_pattern.strategy.robot.emotion;

import design_pattern.strategy.robot.EmotionStrategy;

public class Sad implements EmotionStrategy {
    @Override
    public void emotion() {
        System.out.println("슬프다");
    }
}

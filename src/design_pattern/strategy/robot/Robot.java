package design_pattern.strategy.robot;

public class Robot {
    private MoveStrategy moveStrategy;
    private EmotionStrategy emotionStrategy;

    public Robot(MoveStrategy moveStrategy, EmotionStrategy emotionStrategy) {
        this.moveStrategy = moveStrategy;
        this.emotionStrategy = emotionStrategy;
    }

    public void setMoveStrategy(MoveStrategy movestrategy) {
        this.moveStrategy = movestrategy;
    }

    public void setEmotionStrategy(EmotionStrategy emotionStrategy) {
        this.emotionStrategy = emotionStrategy;
    }

    public void doRobot() {
        System.out.println("로봇 실행!");
        this.moveStrategy.move();
        this.emotionStrategy.emotion();
    }
}

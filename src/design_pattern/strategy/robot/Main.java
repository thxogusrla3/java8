package design_pattern.strategy.robot;

import design_pattern.strategy.robot.emotion.Angry;
import design_pattern.strategy.robot.emotion.Happy;
import design_pattern.strategy.robot.emotion.Sad;
import design_pattern.strategy.robot.move.Running;
import design_pattern.strategy.robot.move.Stand;
import design_pattern.strategy.robot.move.Walking;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Stand(), new Angry());
        robot.doRobot();

        robot.setMoveStrategy(new Running());
        robot.setEmotionStrategy(new Happy());

        System.out.println();
        robot.doRobot();

        robot.setMoveStrategy(new Walking());
        robot.setEmotionStrategy(new Sad());

        System.out.println();
        robot.doRobot();
    }
}

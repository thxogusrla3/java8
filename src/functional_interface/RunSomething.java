package functional_interface;

@FunctionalInterface
public interface RunSomething {
    void doThing();
    //void doOtherThing(); // @FunctionalInterface 사용으로 막아짐

    //default 사용으로 인터페이스 안에 구현체 메소드 생성이 가능해짐.
    default void newThing() {

    }
}

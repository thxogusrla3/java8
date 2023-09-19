package functional_interface;

@FunctionalInterface
public interface RunSomething {
    void doThing();
    //void doOtherThing(); // @FunctionalInterface 사용으로 막아짐

    //이미 배포된 상태에서 인터페이스에 새로운 함수가 필요할 떄 default 사용
    //
    default void newThing() {

    }
}

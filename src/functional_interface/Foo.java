package functional_interface;

public class Foo {
    public static void main(String[] args) {
        //익명 내부 클래스로 사용이 가능하며
        RunSomething anonymousClassDoThing = new RunSomething() {
            @Override
            public void doThing() {
                System.out.println("anonymous class doThing");
            }
        };

        //Lambda 로 사용이 가능하다.
        RunSomething lambdaDoThing = () -> {
            System.out.println("lambdaDoThing");
        };

        anonymousClassDoThing.doThing();
        lambdaDoThing.doThing();
    }
}

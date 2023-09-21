package functional_interface;

/**
 * 1. 순수함수로써 함수 밖에 있는 데이터를 변경하지 않는다.
 *
 * */
public class PureMain {
    public static void main(String[] args) {
        int notPureVal = 10;

        //익명 클래스
        PureFunction anonymousFunction = new PureFunction() {
            int pureVal = 20;
            @Override
            public int count(int a) {
//                notPureVal++; 값 변경은 사용할 수 없다.
                return 1 + a + notPureVal + pureVal;
            }
        };

        //람다 표현식
        PureFunction lambdaFunction = (int a) -> {
            a++;
            return a + notPureVal;
        };

        System.out.println(anonymousFunction.count(notPureVal));
        System.out.println(anonymousFunction.count(notPureVal));
        System.out.println(anonymousFunction.count(notPureVal));

        System.out.println(lambdaFunction.count(10));
        System.out.println(lambdaFunction.count(10));
        System.out.println(lambdaFunction.count(10));
    }
}

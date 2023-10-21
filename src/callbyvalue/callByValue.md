> 메소드 매개변수 호출 방식으로 Call By Value, Call By Reference 가 있다.
> Java 에서는 Call By Value만 사용하는데, 참조 타입들로 인해 Call By Reference 로 착각할 수 있다.
# Call By Value 란?
- '값만 전달하는 방식' , 값을 변경해도 원본 값은 변경되지 않는다.
```java
public class CallByValue {
    public static void main(String[] args) {
        callByValue_1();
    }
    public static  void callByValue_1() {
        int a = 10;
        int b = 5;
        System.out.println("Before Call Method2: ( a = " + a + ", b = " + b + " )");
        callByValue_2(a, b);
        System.out.println("Before Call Method2: ( a = " + a + ", b = " + b + ")");
    }

    public static void callByValue_2(int a, int b) {
        a = 20;
        b = 10;
        System.out.println("Inside Method2 :     ( a = " + a + ", b = " + b + " )");
    }
    
    //출력
    //Before Call Method2: ( a = 10, b = 5 )
    //Inside Method2 :     ( a = 20, b = 10 )
    //Before Call Method2: ( a = 10, b = 5)
    
}
```

# Call By Reference
- '주소를 전달하는 방식', 전달된 변수의 값을 변경하면, 호출한 쪽에서도 해당 변수의 값이 변경됨


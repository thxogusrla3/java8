package callbyvalue;

class LikeReferenceVal {
    public int val = 10;
    public LikeReferenceVal(int val) {
        this.val = val;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        //Call By Value 부분
        callByValue_1();

        //Call By Value 인데 Reference 처럼 느껴지는 부분
        LikeReferenceVal lrv = new LikeReferenceVal(10);
        System.out.println("참조 타입의 ");
        likeCallReference(lrv);

        System.out.println("Call By Value lrv = " + lrv.val);
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

    public static void likeCallReference(LikeReferenceVal lrv) {
        lrv.val = 1000;

        System.out.println("Like Reference val = " + lrv.val);
    }
}

package day20;


// AA클래스를 보면서 변수와 메서드를 말할수있어야함.
class AA{
    int a; // -->"인스턴스변수"  = "필드 (field)" = 멤버변수
    static int b; //-->"클래스 변수"
    void m(){ //-->"인스턴스 메서드"

    }
    static void m2(){ // -->"클래스 메서드"

    }
}

public class Ex2001 {
    public static void main(String[] args) {
        AA.b = 10;
        System.out.println(AA.b);
        AA.m2();

        AA aa = new AA();
        aa.a = 100;
        aa.m();
        // System.out.println(aa.b); // 권장 x
        // aa.m2(); //권장 x

    }
}

package day20;

class A{ // A : "부모클래스" / "상위클래스" / 기반클래스(base class)
    void m1(){
        System.out.println("m1 실행됨.");
    }
    void m2(){
        System.out.println("m2 실행됨");
    }
}       //B : "자식클래스" / "하위클래스" / 파생클래스(derived class)
class B extends A{ //클래스 B는 "클래스A를 상속하는 클래스다"
    int num;
    B(int num){
        this.num = num;
    }
    void showNum(){
        System.out.println("num : "+num);
    }
}

public class Ex2004{
    public static void main(String[] args) {
        B b = new B(10);
        b.m1();
        b.m2();
        b.showNum();

    }
    
}

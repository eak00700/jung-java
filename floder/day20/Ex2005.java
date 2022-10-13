package day20;

class Parent1 {
    int num = 5; //인스턴스변수를 선언함과 동시에 초기화
    void showNum(){
        System.out.println("num : "+num);
    }
}

class Child1 extends Parent1{
    double num2 = 10.5;
    void showNum2(){
        System.out.println("num2 : "+num2);
    }
}

public class Ex2005 {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.showNum();
        obj.showNum2();
    }
    
}

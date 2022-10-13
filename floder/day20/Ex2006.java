package day20;

class Parent2{
    void m(){
        System.out.println("1. ");
    }
    void m2(){
        System.out.println("2. ");
    }
}
class Child2 extends Parent2{
    
    @Override 
    void m2(){ // 부모클래스의 m2메서드를 '재정의' -> 메서드 오버라이드
        System.out.println("3. ");
    }

}

public class Ex2006 {
    public static void main(String[] args) {
        Child2 ch = new Child2();

        ch.m();
        ch.m2();
    }
    
}

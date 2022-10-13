package day20;
//체크 : 클래스메서드에서 인스턴스멤버(인스턴스메서드 + 인스턴스변수)에 접근이 안됨.
//참고 : main()에서, main()이 소속된 클래스의 객체 생성이 가능함.
public class Ex2003 {
    void m(){
        System.out.println("m 메서드 실행됨");
    }
    public static void main(String[] args) {
        // m(); // ERR 이해. WHY?
        Ex2003 obj = new Ex2003();
        obj.m();
    }
    
}

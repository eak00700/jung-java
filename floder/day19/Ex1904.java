package day19;

class DD {
    int n; //인스턴스변수 선언
    static int n2;

    void m(){ //인스턴스 메서드
        System.out.println("n : "+n);
        System.out.println("n2 : "+n2);
    }
}

public class Ex1904 {
    public static void main(String[] args) {
        DD obj = new DD();
        obj.n = 10;
        obj.m();
    }
    
}

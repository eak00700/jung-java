package day19;

class BB{
    int a;
    int b;
    
    BB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void m(){
        System.out.println(a+", "+b);
    }
}

public class Ex1902 {
    public static void main(String[] args) {
        BB obj = new BB(1,4);
        obj.m();
        System.out.println("이 객체의 a 값 : "+ obj.a);
        System.out.println("이 객체의 b 값 : "+ obj.b);
    }
}

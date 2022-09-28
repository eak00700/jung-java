package day16;


class Dog{
    String name;
    void bark(){
        System.out.println(name+ ": 멍멍!");
    }
}
public class Ex1603 {
    public static void main(String[] args) {
        int num = 5; // 기본타입 변수 이면서 지역변수
        Dog dog1 = new Dog();// dog1객체 생성 // dog1 : 지역변수이면서 동시에 참조변수
        Dog dog2 = new Dog(); // dog2 객체 생성 //dog2 : 지역변수이면서 동시에 참조변수
        //Dog라는 클래스를 이용해서 dog1,2라는 객체 생성.
        // Scanner sc = new Scanner(System.in); // 스캐너 객체 생성.

        dog1.name = "맥스"; // name는 dog1의 name로 들어감.
        dog2.name = "코코";
        dog1.bark(); // dog1.bark ---> bakr는 dog1의 소속임. 그러므로 dog1의 네임을 받아서 bark를 실행함.
        ComputerClass com1 = new ComputerClass();
        com1.brand = "Apple";
        com1.color = "blue";
        com1.name = "컴퓨터";
        com1.num = 10;

        com1.com();


    }
    
}

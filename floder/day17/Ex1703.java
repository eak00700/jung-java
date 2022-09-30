package day17;

import java.util.Scanner;

class circle{
    //실행결과
    //원의 반지름을 입력 : 5 엔터
    //반지름이 5인 원의 넓이는 ____________입니다.
     int r; // 반지름
     double area(int x){ //원의 넓이를 리턴. "원의 넓이 = 3.14 * r * r" OR Math.PI * r * r;
        return ((int)((Math.PI * r * r)*100))/100.d;
     }
}
public class Ex1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c1 = new circle();
        System.out.print("원의 반지름을 입력 : ");
        c1.r = sc.nextInt();
        System.out.println("반지름이 "+ c1.r + " 인 원의 넓이는 "+ c1.area(c1.r)+"입니다.");
    }
}

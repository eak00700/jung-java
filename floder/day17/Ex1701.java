package day17;

import java.util.Scanner;

class point{
    int x;
    int y;
    double dist(int x2, int y2){
        int a = x2 - x;
        int b = y2 - y;
        return Math.sqrt(a*a+b*b);
    }
}
public class Ex1701 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        point p1 = new point(); // point 클래스를 이용한 p1 객체 생성
        System.out.print("점#1의 x 입력 : ");
        p1.x = sc.nextInt();

        System.out.print("점#1의 y 입력 : ");
        p1.y = sc.nextInt();

        point p2 = new point(); // point 클래스를 이용한 p2 객체 생성
        System.out.print("점#2의 x 입력 : ");
        p2.x = sc.nextInt();
        System.out.print("점#2의 y 입력 : ");
        p2.y = sc.nextInt();
        System.out.println("두 점 사이의 거리는 :"+p1.dist(p2.x, p2.y));
        
        System.out.println("점#1("+p1.x+","+p1.y+") ~ 점#2("+p2.x+","+p2.y+")의 거리 = "+p2.dist(p1.x, p1.y));

    }
}

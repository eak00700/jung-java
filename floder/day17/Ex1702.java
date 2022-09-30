package day17;

import java.util.Scanner;



class point2{
    String color;
    int x, y;
    double dist(int x2, int y2){
        int dx = x2 - x;
        int dy = y2 - y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
class pointTwo{
    String color1,color2;
    int x,y;
    double dist(int x2, int y2){
        int dx = x2 - x;
        int dy = y2 - y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
public class Ex1702 {
    public static void main(String[] args) {
        //객체 두개로 하는 법
        point2 p1 = new point2(); //point클래스를 이용해 p1객체를 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("점#1의 색깔 입력 : ");
        p1.color = sc.next();
        System.out.print("점#1의 x 입력 : ");
        p1.x = sc.nextInt();
        System.out.print("점#1의 y입력 : ");
        p1.y = sc.nextInt();

        point2 p2 = new point2();//point클래스를 이용해 p2객체 생성
        System.out.print("점#2의 색깔 입력 : ");
        p2.color = sc.next();
        System.out.print("점#2의 x 입력 : ");
        p2.x = sc.nextInt();
        System.out.print("점#2의 y 입력 : ");
        p2.y = sc.nextInt();
        System.out.println(p1.color+"색상인 점부터 "+p2.color+"색상인 점까지의 거리는 "+p1.dist(p2.x, p2.y)+" 입니다.");

        //객체 한개로 하는법
        pointTwo p3 = new pointTwo(); // pointTwo클래스를 사용해 p3객체 생성
        System.out.print("점#3의 색깔1 입력 : ");
        p3.color1 = sc.next();
        System.out.print("점#3의 색깔2 입력 : ");
        p3.color2 = sc.next();
        System.out.print("점#3의 x 입력 : ");
        p3.x = sc.nextInt();
        System.out.print("점#3의 y 입력 : ");
        p3.y = sc.nextInt();
        System.out.print("점#3의 x2 입력 : ");
        int x2 = sc.nextInt(); // x2 라는 변수에 숫자를 입력받아 x2를 p3.dist 함수에 집어넣음
        System.out.print("점#3의 y2 입력 : ");
        int y2 = sc.nextInt(); // y2라는 변수에 숫자를 입력받아 y2를 p3.dist 함수에 집어 넣음
        System.out.println(p3.color1 + " 색상인 점부터 "+p3.color2+" 색상인 점 까지의 거리는 "+ p3.dist(x2,y2)+"입니다.");
        sc.close();

    }

}

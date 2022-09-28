package day16;


class point{
    int x;
    int y;
    double dist(int x2, int y2){
            //(x, y) ~~ 점(x2, y2) 의 거리를 계산해서 리턴.
            int dx = x- x2; //x축 방향의 거리
            int dy = y - y2; // y축 방향의 거리
            return Math.sqrt(dx*dx + dy*dy);
    }
}
public class Ex1604 {
    public static void main(String[] args) {
        point p1 = new point();
        p1.x = 1;
        p1.y = 1;
        point p2 = new point();
        p2.x = 5;
        p2.y = 4;
        System.out.println("두 점 사이의 거리 : "+ p1.dist(p2.x,p2.y));
        System.out.println("두 점 사이의 거리 : "+ p2.dist(p1.x,p1.y));

     SungJuck s1 = new SungJuck();
     s1.subject = "국어";
     s1.sungjuck(80);
     s1.subject = "수학";
     s1.sungjuck(90);

    }
    
}

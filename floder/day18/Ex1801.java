package day18;

//생성자란, "객체 생성 직후에, 무조건 호출되도록 약속되어 있는 (일종의 메서드)"
class point{
    int x, y;
    
    //생성자 :  1)클래스 이름과 동일
            //  2) 리턴타입 x 
            //  3) 리턴문 x -- 메서드와의 차이점.
            point( int p1, int p2){
                x = p1;
                y = p2;
            }
    double dist(point p){
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}

public class Ex1801 {
    public static void main(String[] args) {
        
    
    // point p1 = new point();
    // p1.x = 1;
    // p1.y = 1;
    point p1 = new point(1,1);
                // 객체생성표현 : 1)new + 설계도(클래스) 의 이름 2) 생성자 호출 표현.
    // point p2 = new point();
    // p2.x = 5;
    // p2.y = 4;
    point p2 = new point(5,4);
    System.out.println(p1.dist(p2));
    }


}

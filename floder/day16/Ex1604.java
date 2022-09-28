package day16;
class point{
    int x;
    int y;
    double dist(int x2, int y2){
            //(x, y) ~~ 점(x2, y2) 의 거리를 계산해서 리턴.
            int dx = x- x2; //x축 방향의 거리
            int dy = y = y2; // y축 방향의 거리
            return Math.sqrt(dx*dx + dy*dy);
    }
}
public class Ex1604 {
    public static void main(String[] args) {
        
    }
    
}

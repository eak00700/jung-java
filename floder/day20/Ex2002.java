package day20;

class Point{
    int x,y; // 인스턴스변수
    static int cnt =0; //클래스변수 : 객체가 몇개 생성 되었는지를 카운트.

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        cnt++;
    }
    static void showCnt(){ //클래스 메서드
        System.out.println("cnt : "+cnt);
    }
    /* static */void showMe(){ //인스턴스메서드 가능, BUT 클래스메서드 불가능
    System.out.println("점 객체 ("+x+","+y+").");
    }
}


public  class Ex2002 {
    public static void main(String[] args) {
        Point.showCnt();
        Point p1 = new Point(1,1);
        Point p2 = new Point(5,4);
        Point.showCnt();
        p1.showMe();
        p2.showMe();

    }
}

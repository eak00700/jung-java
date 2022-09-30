package day18;
//point 객체들을 다루는 배열.
//(참고) 동일안 패키지에서 정의된 클래스를 여기서 그냥 쓸수잇음.
public class EX1803 {
    public static void main(String[] args) {
        // point p1 = new point(1,1); // p1 : 0x12
        // point p2 = new point(5,4); // p2 : 0x23
        // System.out.println(p1.dist(p2)); //  5.0

        //[비교] int[] arr = new int[2];
        point[] arr = new point[2];
        arr[0] = new point(1,1);
        arr[1] = new point(4,5);

        System.out.println(arr[0].dist(arr[1]));
        System.out.println(arr[1].dist(arr[0]));
        //체크 (그림보면서 ) : arr? arr[0]? arr.length?
                        //  : arr[0].x? arr[1].y?

    }
    
}

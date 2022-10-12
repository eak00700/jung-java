package day19;

import java.util.Arrays;

class CC {
    int a;
    double b;
    String c;
    int[] arr;
    CC(int a){
        // this.a = a;
        // arr = new int[] {10, 20 30}; // 배열 객체를 생성함과 동시에 초기화.
        arr = new int[3]; //배열객체를 생성.
        
    }
    void print(){
        System.out.println(a); // 0
        System.out.println(b); // 0.0
        System.out.println(c); // null
        System.out.println(arr); // null
        System.out.println(Arrays.toString(arr));
    }
}

public class Ex1903 {
    public static void main(String[] args) {
        CC obj = new CC(10);
        obj.print();

    }
}

package day15;

public class Q1502 {
    public static int add(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        String s = "HeLlo.";
        System.out.println(s.toLowerCase()); // 대문자를 소문자로 바꿔주는 메서드. s.toLowerCase();
        add(3,4);  // 7 이해.  : 리턴 값이 있는 메서드의 호출을 이런식으로 할 수도 있음.(에러는 아님).
        System.out.println(add(3,5)); // 8
    }
    
}

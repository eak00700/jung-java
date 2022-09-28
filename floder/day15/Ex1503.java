package day15;
//참고용!!


public class Ex1503 {
    public static void main(String[] args) {
        String s = "드디어 점심시간!";
        System.out.println("이 문자열의 길이 : "+s.length());

        char ch = s.charAt(1 );// 인덱스#1에 해당하는 문자를 리턴.
        System.out.println(ch); // 디
        System.out.println(s.charAt(4)); // 점
        System.out.println(s.charAt(8)); // !

        //★ substring(1) : 인덱스 1부터 시작해서 끝까지.
        System.out.println(s.substring(1));
        //★substring(4,9) : 인덱스 4부터 시작해서 인덱스 8까지.
        //★substring(a,b) : 인덱스 a부터 시작해서 인덱스 b-1까지.
        System.out.println(s.substring(4, 9));

    }
    
}

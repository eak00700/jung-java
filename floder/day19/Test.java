package day19;

public class Test {
    public static void main(String[] args) {
        
        // String s1 = "정처산기";
        // String s2 = "웹개발";
        // System.out.println(s1 + s2); // 정처산기웹개발 -> '문자열의 결합(Concatenation)'

        // String s3 = "웹";   //문자열 객체 생성.
        // String s4 = "웹";   //(경제성 고려) - 새롭게 생성하지 않음 : 이해.
        // String s5 = new String("웹");   // new키워드 --> '무조건' 새로운 객체 생성.

        // s3 = "WEB"; // 이해 : "내용의 수정이 불가능하다면서요?"
        //             // ------> '변경'이 아니고, '새로운 문자열 객체'임!
        // System.out.println(s3); //WEB
        // System.out.println(s4); //웹
        
        String s6 = "정처산기";
        String s7 = "정처산기";
        String s8 = new String("정처산기");
        //문자열의 동등비교(내용비교) : "문자열.equals(문자열)"를 쓰세요.
        System.out.println(s6.equals(s7)); //true
        System.out.println(s7.equals(s8));//true
        System.out.println(s6 == s7); // 참조값의 비교 -> true
        System.out.println(s7==s8); // false

        
    }
}

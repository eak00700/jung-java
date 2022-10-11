package day19;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "안녕하세요";
        // .length() : 문자열의 길이(글자 수)를 리턴함.
        System.out.println(s.length());
        System.out.println(s2.length());

        // .equals() : 동등비교(내용비교)
        System.out.println(s.equals("Hello")); // true
        System.out.println(s.equals("hello")); // false

        // 문자열 1.compareTo(문자역2) : '사전편찬순' 으로 비교
        //                              abc순, 문자열1이 문자열2보다 앞서면 (-)부호의 값.
        //                              같으면 0, 문자열 2가 문자열1보다 앞서면 (+)부호의 값.
        String s3 = "aab";
        String s4 = "acb";
        String s5 = new String("acb");
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s5));

        // .valueOf(숫자) : 숫자를 문자열로 바꿔주는 클래스 메서드.
        String s6 = String.valueOf(5*11);
        String s7 = 55+"";
        System.out.println(s6==s7);
        System.out.println(s6+","+s7);

        // .split(); : 문자열을 쪼개어 배열로 만듬
        String str = "자바_C_파이썬_정처산기"; // _를 구분자로 해서 하나로 붙여놓은 문자열
        String[] arr = str.split("_");
                        // {"자바","C","파이썬","정처산기"}
        System.out.println(Arrays.toString(arr));
        // ※ '향상된 for문' (for - each 문)
        //[문법] for(변수의 선언 : 집단(ex.배열))
        for( String s10 : arr ){
            System.out.print(s10 +" ");
        }

        // .substring(시작인덱스) : 시작인덱스부터 끝까지의 부분문자열 리턴.
        System.out.println(str.substring(3));

        // .indexOf(문자열) : 문자열의 위치(인덱스). 단, 없으면 -1을 리턴.
        // .lastIndexOf(문자열) : (오른쪽에서부터)
        
        System.out.println(str.indexOf("_"));
        System.out.println(str.lastIndexOf("_"));
        
        // To find '정처산기'
        System.out.println(str.substring(str.lastIndexOf("_")+1));
        System.out.println(arr[arr.length-1]);

        // .charAt(인덱스) : 인덱스 위치에 있는 한 문자를 리턴하는 메서드.
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));

        System.out.println(str.substring(5, 8));
        
        //contains(문자열) : 해당 문자열을 포함하고잇으면 true(아니면 false)를 리턴하는 메서드.
        System.out.println(str.contains("~")); // false
        System.out.println(str.indexOf("~")); // -1(없음)

        // .replace(old문자열, new문자열)
        //str.replace("_", " "); // 이해(고급) : 문자열은 immutable한 객체이기때문에
                                                // 이런 식의 사용은 불가능 함
        str = str.replace("_", " "); // 이해(고급) : 문자열의 내용을 변경하는 이런 메서드들의 사용은, 이렇게 리턴값을 받는 형태로!
        System.out.println(str);
        System.out.println(str.replace("_", " "));
    }
    
}

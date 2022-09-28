package day15;

import javax.swing.plaf.TreeUI;

// 연습(고급). 재귀호출 : "palindrome" algorithm
//         syso(palindrome("noon")) // true
//         syso(palindrome("madam"))  // true
//         syso(palindrome("door")) //false
//         syso(palindrome("car")) //false
public class Q1506 {
    public static boolean palindrome(String s) {
        //문자열.length() : 문자열의 길이를 리턴하는 메서드
        //문자열.turn true;
        //         }else if(s.length()<=1){
        //          return tcharAt() : 해당 인덱스에 해당하는 문자를 리턴.
        //문자열.subString() : '부분문자열'을 리턴
        //길이 <=1 ---> 펠린드롬 맞음!

        // for(int i=0; i<=s.length()-1; i++){
        //     for(int j=s.length()-1; j>=1; j--){
        //         if(s.charAt(i)==s.charAt(j)){
        //             return true;
        //          }else{
        //             return false;
        //          }
        //     }
        // }
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0) ==s.charAt(s.length()-1)){
            return true;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            return false;
        }
                return palindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println((palindrome("noon"))); // true
        System.out.println((palindrome("madam")));  // true
        System.out.println((palindrome("door"))); //false
        System.out.println((palindrome("car"))); //false
    }
    
}

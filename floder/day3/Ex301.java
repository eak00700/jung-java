package day3;

import java.util.Scanner;

// [정리] 문자의 동등비교 : 문자 == 문자
//		 문자열의 동등비교 : 문자열.equals(문자열)

public class Ex301 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1 == c2);
	
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1==s2); //s1의 내용과 s2의 내용이 같냐는 표현이 아님!(뒤에서)
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(0b0001 & 0b0011);
		

	}//main

}
//num % 2 ==0 && num > 0
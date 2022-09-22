package day4;

import java.util.Scanner;

public class Q406 {
	public static void main(String[] args) {
//		406.	문자를 하나 입력 받아서,	// 아스키코드표.
//		대문자이면 소문자로 바꿔서 출력하고, 
//		대문자가 아니면 그냥 출력.
//		(실행결과의 예) 문자 입력 : a (엔터)
//					----> a
//		(실행결과의 예) 문자 입력 : B (엔터)
//					----> b
//		(실행결과의 예) 문자 입력 : 9 (엔터)
//					----> 9
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ");
		
		String s = sc.next();
		char c =s.charAt(0);
		if(c>='A' && c <='Z') {
			c+=32; // c = (char)(c+('a'-'A'); // [고급] int보다 작은 정수형변수 산술연산 -->int형으로 자동형변환
		}
		System.out.println(c);
		
		
		
				
}

}

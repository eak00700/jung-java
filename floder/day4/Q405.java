package day4;

import java.util.Scanner;

public class Q405 {
	public static void main(String[] args) {
//		405.	알파벳(String)을 하나 입력 받고, 
//		문자열(String)을 한 문자(char)로 변환한 후에,
//		대문자인지 여부를 출력.   // 아스키코드표 참조 가능.
//		(실행결과의 예) 알파벳 입력 : A (엔터)
//					----> 대문자임!
//		(실행결과의 예) 알파벳 입력 : b (엔터)
//					----> 대문자가 아님!
//		※ 문자열을 입력 받아서, 맨 첫글자를 char형으로 변환:
//			String s = sc.next();
//			char c = s.charAt(0);
//		(추가고급연습) 알파벳을 입력하지 않았으면 제대로 입력
//				할 때까지 반복해서 입력 받으세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String s = sc.next();
		char c = s.charAt(0);
		while(true) {
			if(c>='A' && c<='Z') {
				System.out.println("대문자임!");
			}else if(c>='a' && c<='z') {
				System.out.println("대문자가 아님!");
			}else {
				System.out.print("알파벳을 입력해주세요\n 알파벳 입력 : ");
				s = sc.next();
				c = s.charAt(0);
				continue;
			}
			break;
			/*
			 * while(!((c>='A'&& c<='Z')||(c>'a' && c<='z'))){
			 * System.out.print("알파벳을 좀 입력하라고요 좀! \n 알파벳 입력 : ");
			 * s = sc.next();					// "\n" : 줄바꿈문자
			 * c = s.charAt(0);
			 * */
			
			/* for(; !((c>='A'&& c<='Z')||(c>'a' && c<='z'));){
			 * System.out.print("알파벳을 좀 입력하라고요 좀! \n 알파벳 입력 : ");
			 * s = sc.next();
			 * c = s.charAt(0);
			 * */
		}//while
	}

}

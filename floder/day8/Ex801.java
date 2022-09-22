package day8;

import java.util.Scanner;

/*
 * Scanner 클래스
 * 	-객체 생성 : "Scanner sc = new Scanner(System.in);"
 * [정리] 1) 정수 값을 입력받을 때 : "scnextInt()"
 * 		  2) 문자열을 입력받을 때 : "sc.next()"--->한 단어 입력
 * 										또는 "sc.nextLine()" ---> 한 문장 입력
 * [정리] 1) 스캐너(객체)는 '입력버퍼'를 바라보고 있다.
		  2) 스캐너를 사용해서 입력받을 때,
		  	 입력버퍼가 비어있는 상태라면 커서를 보여주고 사용자가 입력을 기다린다.
		  	 입력버퍼가 비어있지 않으면 (사용자의 입력을 받지 않고) 입력버퍼의 내용을 가져온다.
		  3) 따라서, 스캐너 사용하실 때 현재 입력버퍼가 비어있는지를 고려해야 함.	 
 */		  
public class Ex801 {
//문자열 입력.
	//정수 입력
	//     -"sc.nextInt()"
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next(); //--> 한 단어 입력
//		String s = sc.nextLine(); --> 한문장 입력
		System.out.println("입력받은 문자열 : "+s);
		
		String s2 = sc.next();
		System.out.println("문자열2 : "+s2);
		
		
	}
}

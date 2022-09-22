package day4;

import java.util.Scanner;

public class Ex406 {
	public static void main(String[] args) {
//		연습2(고급) switch를 이용한 계산기(1)
//		정수1 : 3
//		연산자 : +
//		정수2 : 5
//		3 + 5.  8
//	연습3(고급). switch를 이용한 계산기
//		숫자1 : 3
//		연산자 : +
//		숫자2 : 5.5
//		3 + 5.5 = 8;
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("정수 1: ");
		int a = sc.nextInt();
		System.out.print("연산자 : ");
		String s = sc.next();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		System.out.print(a+" "+s+" "+b+" = ");
		switch(s) {
		case "+":
			System.out.println(a+b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		}
	}

}

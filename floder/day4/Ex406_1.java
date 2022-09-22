package day4;

import java.util.Scanner;
//
//연습3(고급). switch를 이용한 계산기
//숫자1 : 3
//연산자 : +
//숫자2 : 5.5
//3 + 5.5 = 8;

public class Ex406_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1을 입력하세요 :");
		float num1 = sc.nextFloat();
		
		System.out.print("연산자를 입력하세요 : ");
		String op = sc.next();
		
		System.out.print("숫자2를 입력하세요 : ");
		float num2 = sc.nextFloat();
		
		System.out.print(num1+" "+op+" "+num2+" = " );
		switch(op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num2-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
	}

}

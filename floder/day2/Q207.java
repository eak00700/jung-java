package day2;

import java.util.Scanner;

public class Q207 {
	public static void main(String[] args) {
		//연습 정수 3개를 입력받아서, 중앙값(median)을 출력.
		//(단, 3개의 정수는 서로 다른값이라고 가정 / if문 사용 금지
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int a = sc.nextInt();
		
		System.out.print("정수2: ");
		int b = sc.nextInt();
				
		System.out.print("정수3: ");
		int c = sc.nextInt();
		
		int mid = ((b>a && a>c)||(c>a && a>b) ? a : (a>b && b>c)||(c>b && b>a) ? b : c);
		System.out.println(mid);
				
	}

}

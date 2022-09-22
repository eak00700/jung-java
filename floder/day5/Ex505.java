package day5;

import java.util.Scanner;

public class Ex505 {
	public static void main(String[] args) {
		int n = 4;
		int m = 1; // 누적곱은 1로 초기화!
		for(int i=1; i<=n; i++) {
			m *= i; // m = m * i
		}//for
		System.out.println(m);
		
		//추가연습 : 두 정수 (a, b)를 입력받고(a<b 가정)
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		int m1 =1;
		for(int i =a; i<=b; i++) {
			m1*=i;
		}
		System.out.println(m1);
	}//main

}

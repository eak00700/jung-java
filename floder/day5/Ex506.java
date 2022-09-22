package day5;

import java.util.Scanner;

public class Ex506 {
	public static void main(String[] args) {
		//실행결과의 예 n 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

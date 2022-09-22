package day6;

import java.util.Scanner;

public class Q603_공백출력문제A {
	public static void main(String[] args) {
		//실행결과의 예 5 엔터
		//			 A
		//			BB
		//		   CCC
		//		  DDDD
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		char sum = 65;
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(sum);
				
			}
			sum+=1;
			System.out.println();
			
		}
	}

}

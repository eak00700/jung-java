package day6;

import java.util.Scanner;

public class Q605_피라미드형숫자출력문제B {
	public static void main(String[] args) {
		//	  1
		// 	 2 2
		//  3 3 3
		// 4 4 4 4
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=i; j<=(num-1); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}

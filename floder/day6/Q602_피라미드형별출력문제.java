package day6;

import java.util.Scanner;

public class Q602_피라미드형별출력문제 {
	public static void main(String[] args) {
		//실행결과의 예 : n : 4 엔터
		//			i	공백			별
		//    *		1	3 =(4-i)개	1 =(2*i-1)개
		//   ***	2	2 			3
		//  *****	3	1			5
		// *******	4	0			7
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();
		for (int i=1; i<=(n); i++) {
			for(int j=1; j<(n-i); j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		
			// 공백문자 출력 : (n-i)개
			for(int j=1; j<=(n-i); j++) {   // n-i번 반복!
				System.out.print(" ");
			}
			// 별문자 출력 : (2*i-1)개
			for(int j=1; j<=(2*i-1); j++) {  // 2*i-1번 반복!
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈문자 출력
		}
	}

}



package day5;

import java.util.Scanner;

public class Ex508 {
	public static void main(String[] args) {
		//실행결과의 예 n 입력 : 4 엔터
		//		i	공백		별
		//****	1	0	i-1	4	n+1-i
		// ***	2	1		3
		//  **	3	2		2
		//   *	4	3		1
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력 : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			//공백문자 출력 : (i-1)개
			for(int j=1; j<=(i-1); j++) {
				System.out.print(" ");
				}
			//별문자 출력 : (n+1-i)개
			for(int j=1; j<=(n+1-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

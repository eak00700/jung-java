package day5;

import java.util.Scanner;
//n 입력 : 4 엔터
//	 	i	공백문자		별문자
//   *	1	3	n-i		1 i
//  **	2	2	n-i		2 i
// ***	3	1	n-i		3 i
//****	4	0	n-i		4 i
public class Ex509 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			//공백문자
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
				
			}
			//별문자
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}

package day6;

import java.util.Scanner;

public class Q604_공백출력문제B {
	public static void main(String[] args) {
		//1 2  3  4  5
		//  6  7  8  9
		//    10 11 12
		//       13 14
		//          15
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int sum = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print("\t");
			}
			for(int j=1; j<=(n-i+1); j++) {
				System.out.print(sum);
				System.out.print("\t");
				sum+=1;
			}
			System.out.println();
		}
	}

}

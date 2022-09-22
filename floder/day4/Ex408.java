package day4;

import java.util.Scanner;

public class Ex408 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇번을 반복할까요?"); //i,j,k
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println( i+ "번 반복");
		}
		System.out.println("반복 끝");
		
	}

}

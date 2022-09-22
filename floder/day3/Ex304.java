package day3;

import java.util.Scanner;

public class Ex304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		int x = a>0 ? a: -a;
		System.out.println(x);
	}

}

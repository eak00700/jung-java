package day6;

import java.util.Scanner;

public class Ex604소수C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int i;
		for( i=2; i<=num-1; i++) {
			if(num%i==0) {
				System.out.println(num+"은(는) 소수가 아님!");
				break;
				}
			}
		if(i==num) {
		System.out.println(num+"은(는) 소수임!");
		}
	}
				
}



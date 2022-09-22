package day5;

import java.util.Scanner;

public class Ex504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100중에서 몇의 배수를 출력할까요? : " );
		int a = sc.nextInt();
		for(int i=1; i<=100; i++) {
			if(i%a==0) {
				System.out.print(i+" ");
			}
		}
//		for(int i=1; i<=100/a; i++) {
//			System.out.print(a*i+" ");
//		}
		
				
	}//main

}

package day7;

import java.util.Scanner;

//연습
public class Ex703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 항까지 출력할까요? ");
		int num = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<num-1; i++) {
			c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}

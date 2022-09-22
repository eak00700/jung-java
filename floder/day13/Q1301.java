package day13;

import java.util.Scanner;

public class Q1301 {
	static void showAdd(int a, int b) {
		System.out.println("a"+"+"+"b"+"="+(a+b));
	}
	static void showSub(int a, int b) {
		System.out.println("a"+"-"+"b"+"="+(a-b));
	}
	static void showMul(int a, int b) {
		System.out.println("a"+"*"+"b"+"="+(a*b));
	}
	static void showDiv(int a, float b) {
		System.out.println("a"+"/"+"b"+"="+(a/b));
	}
	static void showAllSum(int a,int b, int c) {
		
		System.out.println("세 정수의 합 : "+(a+b+c));
	}
	public static void main(String[] args) {
		showAdd(5, 3);
		showSub(5, 2);
		showMul(3, 4);
		showDiv(5, 4);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int n3 = sc.nextInt();
		
		showAllSum(n1,n2,n3);
	}

}

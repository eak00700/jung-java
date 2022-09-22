package day5;

import java.util.Scanner;

public class Ex507 {
	public static void main(String[] args) {
		//실행결과의 예 4 엔터
		//****
		//***
		//**
		//*
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

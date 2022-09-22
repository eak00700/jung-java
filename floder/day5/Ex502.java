package day5;

import java.util.Scanner;

public class Ex502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}
		//[고급]연습. 실행결과의 예 입력:4 (엔터) 아래와 같이 4줄을 출력.
		//			1
		//			23
		//			456
		//			78910
		
		System.out.print("입력 : ");
		int a = sc.nextInt();
		int sum = 1;
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++){
				System.out.print(sum);
				sum+=1;
			}
			System.out.println();
			
		}

	}//main

}

package day5;

import java.util.Scanner;

//누적합
public class Ex501 {
	public static void main(String[] args) {
		//1+2+3+4
		int sum = 0;
		for(int i=1; i<=4; i++) {
			sum +=i;
		}
		System.out.println(sum);
		//추가연습1. : 1~100까지의 합을 출력.
		 sum = 0;
		for(int i=1; i<=100; i++){
			sum +=i;
		}
		System.out.println(sum);
		
		//추가연습2 : 정수 n을 입력받고, 1부터 n까지의 합을 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		sum = 0;
		for(int i=1; i<=n; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		//추가연습3: (위 추가 연습2의 실행결과) (n이 7이라면) "1+2+3+4+5+6+7=____"
		sum=0;
		for(int i=1; i <=n; i++) {
			/*
			 * System.out.print(i+ (i<n ? "+" : "")); //삼항연산자 사용 방식
			 * */
			sum+=i;
			System.out.print(i);
			if(i<n) {
				System.out.print("+");
			}
		}
		System.out.println("="+sum);
		
		
		//추가연습 4: 정수 두개를 입력받고 (a<b라고 가정), a부터 b까지의 합을 출력.
		System.out.print("정수입력1: ");
		int a = sc.nextInt();
		
		System.out.print("정수입력2: ");
		int b = sc.nextInt();
//		if(a>b) { --->a와 b를 바꾸는 방법
//			int temp = a;
//			a = b;
//			b = temp;
//		} 
		 sum = 0;
		 if(a<b) {
		 for(int i=a; i<=b; i++) {
			sum+=i;
			
			}
		 }else if (b<a) {
			 for(int i=b; i<=a; i++) {
				 sum+=i;
			 }
		 }
		System.out.println(sum);
		
		//추가연습5.(위의 추가연습4에서) a<b라고 가정했는데, 그 가정 없이도 실행되도록 내용을 추가.
		
	}//main

}

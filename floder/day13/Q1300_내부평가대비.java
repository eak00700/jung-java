package day13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q1300_내부평가대비 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		내부평가01 대비 : 난수발생 두 가지 방식 중 [Random클래스 방식] 공부해오세요.
//		내부평가01 대비 연습(고득점)
//
//		- 피보나치 수열을 n개 담은 배열 생성 후 출력.
//		ex) n : 6 ----> [1, 1, 2, 3, 5, 8]
		System.out.println("n개 입력: ");
		int n = sc.nextInt(); 
		int[] arr = new int[n];
		int a = 1;
		int b = 1;
		arr[0] = a;
		arr[1] = b;
		for(int i=2; i<=n-1; i++) {
			int c = a+b;
			a = b;
			b = c;
			arr[i] = c;
		}
		System.out.println(Arrays.toString(arr));

//		- 1 이상 100 이하의 정수 중 짝수만 n개를 담은 배열 생성 후 출력.
//		ex) n : 5 ----> [34, 72, 14, 40, 38]
		System.out.println("n개 입력: ");
		Random rd = new Random();
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<=arr1.length-1; i++) {
//			int r = (int)((Math.random()*100)+1);
			int r = rd.nextInt(100)+1;
			if(r%2==0) {
				arr1[i]=r;
			}else {
				i--;
				continue;
			}
			
		}
		System.out.println(Arrays.toString(arr1));
		
//		- 구구단 n단의 결과 값을 담은 배열 생성 후 출력.
//		ex) n : 3 ----> [3, 6, 9, 12, 15, 18, 21, 24, 27]
		System.out.print("구구단 입력 : ");
		int dan = sc.nextInt();
		int[] arr2 = new int[9];
		for(int i =1; i<=arr2.length; i++) {
				arr2[i-1] = dan*i;
			
		}
		System.out.println(Arrays.toString(arr2));
		
		
//		- (1부터 시작해서) 소수 n개를 담은 배열 생성 후 출력.
//		ex) n : 7 ----> [2, 3, 5, 7, 11, 13, 17]
		System.out.print("정수 입력: ");
		int n2 = sc.nextInt(); // 소수 n 개의 갯수
		int[] arr3 = new int[n2]; // 소수 n 개가 들어가는배열
		int cnt1 = 0;
				
			for( int i=1; ; i++) {//소수구하기
				int cnt = 0;
				for(int j=1; j<=i; j++) {
					if(i%j==0) {
						cnt++;
					}
				}	
			
				if(cnt==2) {//배열에 넣기
					arr3[cnt1++] = i;
				}
				if(cnt1==n2) {
					break;
				}
		}
			System.out.println(Arrays.toString(arr3));
	
	
		
				
		
//		- 1 이상 100 이하의 정수 중 소수를 모두 담은 배열 생성 후 출력.
//		ex) [2, 3, 5, 7, 11, 13, ................... , 97]
		int cnt2 = 0;
		for(int i=1; i<=100; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				cnt2++;		
			}
			
		}//배열의 길이를 구하는 for문
		int[] arr4 = new int[cnt2];
		int cnt0 = 0;
		for(int i=1; i<=100; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				arr4[cnt0++] = i;
			}
		}//배열에 소수를 담는 for문
		System.out.println(Arrays.toString(arr4));
	}//main

}

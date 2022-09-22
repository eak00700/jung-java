package day8;

import java.util.Arrays;

public class Ex804 {
	public static void main(String[] args) {
		int[] arr; //int형 배열을 가리킬 변수 arr을 선언함.
		arr = new int[3]; //크기가 3인 int형 배열을 생성 후 변수와 연결.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		(참고) 1. 배열 출력 : Arrays.toString(배열이름)
		System.out.println("arr : "+Arrays.toString(arr));
		
//		2. 배열 출력 : 반복문 사용.
		System.out.print("arr : ");
		for(int i=0; i<=2; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		3. 배열 출력 : '향상된for문'("for-each문")
		//[문법] for(변수 선언 : 집단) {...}
		System.out.print("arr : ");
		for(int n : arr) {
			System.out.print(n+" ");
		}
		//간단한 연습
		//임태훈 실생결과)
		//[곽호승, 이종환, 임태훈]
		System.out.println();
		String[] arr2;
		arr2 = new String[3];
		arr2[0]="곽호승";
		arr2[1]="이종환";
		arr2[2]="임태훈";
		for(int i=0; i<=2; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}

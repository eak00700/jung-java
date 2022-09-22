package day9;

import java.util.Random;
import java.util.Scanner;

//Q903.	난수 발생(-5 ~ +5) 값을 크기가 6인 배열에 채운 후,
//1) 배열의 내용을 출력.  // 단, Arrays.toString() 사용X.
//2) 정수 하나를 입력받고(n), 그 값이 이 배열에 존재하는 여부를 출력.
//	(실행결과의 예)	배열 : [-2, 3, 4, 4, -5, -1]
//			정수(n) 입력 : 3 (엔터)
public class Q903 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
		System.out.print("[");
		for(int i=0; i<=arr.length-1; i++) {
//			int num = rd.nextInt(11)-5;
			int num = (int)((Math.random()*11))-5;
			arr[i]=num;
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(n) 입력 : ");
		int n = sc.nextInt();
		int cnt =0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==n) {
				cnt++;
				break;
			}
		}
		if(cnt==1) {
		System.out.print(n+" 있음!");
		}else {
		System.out.println(n+" 없음!");
		}
	}//main

}

package day12;

import java.util.Arrays;

public class Ex1201 {
	public static void main(String[] args) {
		//int[] arr = {10, 20, 30}; // 1차원(인덱스가 하나) 배열의 간편법
		//2차원 배열의 (간편법)
		int[][] arr = {
				{10,20,30},
				{40,50,60},
		};
		//arr[0]과 arr[1]을 '배열'이라고 보고 Arrays.toString(arr[0])
		System.out.println(Arrays.toString(arr[0])); // arr[0] , arr[1]이 1차원 배열을 의미
		System.out.println(Arrays.toString(arr[1])); //이해 - '클래스' 끝난 후에
		
		
	}

}

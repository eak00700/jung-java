package day12;
//고급연습5.	난수발생(1~9)해서, 배열(3x3)을 채운 후,
//1) 출력
//2) (위 배열을) 시계방향으로 90도 회전해서 출력
//3) (위 1)의 배열을) 반시계방향으로 90도 회전해서 출력

import java.util.Arrays;

public class Q1205 {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		for(int i=0; i<=arr1.length-1; i++) {
			for(int j=0; j<=arr1.length-1; j++) {
				arr1[i][j] = (int)(Math.random()*9)+1;
			}
		}
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
	}//main

}

package day12;

import java.util.Arrays;

public class Ex1202 {
	public static void main(String[] args) {
		int[][] arr2= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
//		for(int i=0; i<=2; i++) {
//			System.out.println(Arrays.toString(arr2[i]));
//		}
		for(int i=0; i<=2; i++) { //i : 행 (아래쪽으로 몇번째냐)
			for(int j=0; j<=2; j++) { // j : 열(오른쪽으로 몇번째냐)
				System.out.print(arr2[i][j]+" ");
			}//한줄 출력
			System.out.println();//줄바꿈
		}
		
		int[][] arr3= {
				{1,2},
				{3,4,5,6},
				{7,8,9}
		};
//		for(int i=0; i<=arr3.length-1; i++) { //또는 i<=2;
//			System.out.println(Arrays.toString(arr3[i]));
//		}
		//나중에 -- "arr3.length"
		//나중에 -- "arr3[i].length"
		for(int i=0; i<=arr3.length-1; i++) { //i : 행 (아래쪽으로 몇번째냐)
			for(int j=0; j<=arr3[i].length-1; j++) { // j : 열(오른쪽으로 몇번째냐)
				System.out.print(arr3[i][j]+" ");
			}//한줄 출력
			System.out.println();//줄바꿈
		}
	}//main

}

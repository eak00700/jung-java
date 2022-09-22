package day12;

import java.util.Arrays;

public class Q1201 {
	public static void main(String[] args) {
		//마방진
//		고급연습1.
//		마방진(3x3).
//		(실행결과)
//			[8, 1, 6]
//			[3, 5, 7]
//			[4, 9, 2]
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int[][] arr1 = new int[3][3];
		arr1[0][1]=arr[0];
		for(int i=0; i<=arr1.length-1; i++) {
			for(int j=0; j<=arr1[i].length-1; j++) {
				
					if(arr[i]%3==0) {
						arr1[i+1][j]=arr[i];
					}else {
					arr1[i+2][j+1] = arr[i];
					}
				}
			}
			

		


//
//

//

		
	}

}

package day12;

import java.util.Arrays;

//고급연습2. 아래의 빈칸에 코드를 작성하여 제시된 실행결과를 만들어보세요.
//	int[] arr1 = { 1,3,5,7 };
//
//	/* 여기에 작성 */
//
//	sysout(Arrays.toString(arr1));
//	sysout(Arrays.toString(arr2));
//
//	int[] arr3;
//	/* 여기에 작성 */
//
//	sysout(Arrays.toString(arr3));
//
//	(실행결과)
//	arr1 : [1, 3, 5, 7]
//	arr2 : [6, 4, 2]
//	arr3 : [1, 3, 5, 7, 6, 4, 2]
	
public class Q1202 {
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {6,4,2};
		int[] arr3 = new int[7];
		
		for(int i=0; i<=arr1.length-1; i++) {
			arr3[i] = arr1[i];
			
			System.out.println(Arrays.toString(arr3));
			
		}
		for(int i=4; i<=arr3.length-1; i++) {
			for(int j=0; j<=arr2.length-1; j++) {
			
					arr3[i]= arr2[i-4];
					
				}
			}
		System.out.println(Arrays.toString(arr3));
		}
	}



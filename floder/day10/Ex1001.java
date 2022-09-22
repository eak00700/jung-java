package day10;

import java.util.Arrays;

public class Ex1001 {
	public static void main(String[] args) {
		//정렬 알고리즘
		
		//arr : [3,4,1,5,6]
			//-->arr : [1,3,4,5,6] // 오름차순 정렬
		//[정리] 기본적인 정렬 알고리즘 3종
		//1) 버블정렬(Bubble Sort)
		//2) 선택정렬(Selection Sort)
		//3) 삽입정렬(Insertion Sort)
		int[] arr = {15,1,2,7};
		int tmp=0;
		for(int i=3; i>=0; i--) {
			for(int j=0; j<=i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}

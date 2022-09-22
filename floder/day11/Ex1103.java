package day11;

import java.util.Arrays;

public class Ex1103 {
	public static void main(String[] args) {
		//삽입정렬(Insertion Sort) : [15, 2, 1, 7]
		//i : 1,2,3
		//i - 이번 회차에 Fully Sorted 영역으로 이동할 숫자의 위치
		int[] arr = {15, 2 , 1, 7 , 3};
		
		for(int i=0; i<=4; i++) {
			for(int j= i-1; j>=0; j--){
				//[j] vs [j+1]
				if(arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]  = t;
				}else if(arr[j]<arr[j+1]) {
					break;
				}
				
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}

package day11;

import java.util.Arrays;

//선택정렬(Selection Sort) : [15, 2, 1, 7]

public class Ex1101 {
	public static void main(String[] args) {
		//[15, 2, 1, 7]
		int [] arr = {15, 2, 1 ,7};
		for(int i=0; i<=2; i++) {//2 또는 arr.length-2
			int idx = i;
			for(int j = i; j<=3; j++) { //3또는 arr.lenght-1
				//최소 값의 인덱스를 구함
				if(arr[idx] > arr[j]) {
					idx = j;
				}
				
			}
			//Swap : [최소 값의 인덱스] and [i]
			int t = arr[idx];
			arr[idx] = arr[i];
			arr[i] = t;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}

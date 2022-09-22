package day11;

import java.util.Arrays;

public class Ex1105 {
	public static void main(String[] args) {
		int[] arr = {15, 2, 1, 7}; // {-15,2,-1,-7}
		//만약에 이 배열의 요소가 홀수이면 ---> (-)부호를 붙이고 싶어
		for(int n : arr) {
			if(n%2!=0) {
				n = -n;
			}
			System.out.print(n +" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
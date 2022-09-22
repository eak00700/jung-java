package day13;

import java.util.Arrays;

public class Ex1308 {
	static void showAllSum(int[] array) { //목표 : 이 메서드의 파라미터를 작성할 수 있다.!
		
		System.out.println(Arrays.toString(array));
		int sum =0;
		for(int n : array) {
			sum+=n;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		showAllSum(arr);
	}

}

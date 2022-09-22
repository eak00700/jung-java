package day8;

import java.util.Arrays;

public class Ex805 {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] =10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		System.out.println(Arrays.toString(arr));
										//[10,20,30,40]
		int[] arr2;
		arr2 = new int[] {10,20,30,40};
		System.out.println(Arrays.toString(arr2));
										//[10,20,30,40]
		int[] arr3 = {10,20,30,40}; //(간편볍) -- 두 문장으로 나눌 수 없음
		System.out.println(Arrays.toString(arr3));
										//[10,20,30,40]
	}

}

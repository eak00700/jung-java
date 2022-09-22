package day9;

import java.util.Arrays;

//Q902.	난수 발생(1~10) 값을 크기가 6인 배열에 채운 후,
//1) 배열의 내용을 출력.  // Arrays.toString() 사용.
//2) 평균 값을 출력.
//3) 평균 값보다 큰 요소(값)을 출력.
public class Q902 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length-1; i++) {
			int rd = (int)((Math.random()*10)+1);
			arr[i]=rd;
			sum += rd;
		}
		avg = sum / arr.length; 
		System.out.println(Arrays.toString(arr));
		System.out.println(avg);
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]>=avg) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}

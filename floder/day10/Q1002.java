package day10;

import java.util.Arrays;

public class Q1002 {
	public static void main(String[] args) {
		/* 크기가 5인 정수형 배열을 만들어서,
		 * 난수 발생(1~9)해서 배열을 채운 후,
		 * 1) 배열의 내용을 출력
		 * 2) 이 배열에서 최대 값 / 최소 값 출력
		 * */
		int[] arr = new int[5];
		for(int i =0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		
		}
		System.out.println(Arrays.toString(arr));

		int max = arr[0];
		int maxIndex= 0;
		int min = arr[0];
		int minIndex =0;
		for(int i=0; i<=arr.length-1; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			if(min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}
		System.out.println("최대 갑 : "+max+", 최대 값의 인덱스 번호 : "+maxIndex);
		//최대 값의 인덱스 번호 : arr[maxIndex]
		System.out.println("최소 값 : "+min+", 최소 값의 인덱스 번호 : "+minIndex);
		//최소 값의 인덱스 번호 : arr[minIndex]
		//추가 고급연습 : 위에서 최대 값, 최소 값을 구할 때, '최대 값의 인덱스'
		
		//추가 고급연습 : 이 배열에서 두번째로 큰 값을출력.
		int max2 = min;
		for(int i =0; i<=arr.length-1; i++) {
			if(arr[i] < max && max2<arr[i]) {
				max2 = arr[i];
			}
		}
		System.out.println("두번째로 큰 값 : " +max2);
		
	}	

}

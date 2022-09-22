package day8;

import java.util.Arrays;

public class Q801 {
	public static void main(String[] args) {
//		Q801연습1.   
//		   크기가 10인 정수형 배열을 만들고,
//		   여기에 10,20,30,40,50,60,70,80,90,100을 넣고.
//		   1) 반복문을 사용해서 이 배열의 내용을 출력.
//		      (실행결과) 10 20 30 40 50 60 70 80 90 100
//		      (고급화) [10,20,30,40,50,60,70,80,90,100]
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		for(int i =0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
			//System.out.println();
//			System.out.print(Arrays.toString(arr));
		}
		System.out.println();
		System.out.print("[");
		for(int i=0; i<=arr.length-2; i++) {
				System.out.print(arr[i]+",");
			if(i==arr.length-2) {
				System.out.print(arr[i+1]);
			}
		}
		System.out.print("]");
		System.out.println();
		//2)
//		   2) 이 배열의 모든 요소의 총합을 촐력.
//		      (실행결과) 550
//		  
		int sum=0;
		for(int i=0; i<=arr.length-1; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		/*
		 * int sum = 0;
		 * for( n : arr){
		 *  sum+= n;
		 * }
		 * System.out.println(sum);
		 * */
		//3)
//		   3) (고급) 요소들 중 십의자리가 짝수인
//		          수를 모두 출력.
//		      (실행결과) 20 40 60 80 100 
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]/10%2==0) {
				System.out.print(arr[i]+" ");
			}
		} 
		System.out.println();
		/*
		 * for(int n : arr){
		 * 	if(n/10%10%2 == 0){
		 * 		System.out.print(n+" ");
		 * 	}
		 * }
		 * */
		
//		 4) (고급) 요소들 중 십의자리가 홀수인 요소들의
//        부호를 (-)로 만든 후
//        Arrays.toString()을 이용해서 출력.
//      (실행결과) [-10, 20, -30, 40, ..., -90, 100]
		for(int i=0; i<=arr.length-1;i++) {
			if(arr[i]/10%2!=0) {
				arr[i]=-arr[i];
			}
		}
		System.out.print(Arrays.toString(arr)+" ");
	}//main

}

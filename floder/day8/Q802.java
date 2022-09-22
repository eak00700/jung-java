package day8;

import java.util.Arrays;

public class Q802 {
   
	



//	Q802.연습2.
//	   5개의 정수를 담을 수 있는 배열을 만들고,
//	   난수발생(1 이상 10 이하)해서 5개의 정수를
//	   랜덤하게 배열에 채우고.//	
	public static void main(String[] args) {
		int[] arr= new int[5];
		for(int i=0; i<=arr.length-1; i++) {
			int num = ((int)(Math.random()*10)+1);
			arr[i] = num;
		}

//		   1) 반복문을 사용해서 아래의 형식으로 
//		      모든 요소를 출력.
//		      (실행결과의 예) (3 9 8 4 5)
		System.out.print("(");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+(i<arr.length-1 ? " " : ""));
		}
		System.out.println(")");
		System.out.println();
		//2) 이 배열에서 홀수의 개수와 짝수의 개수를 출력.
//	      (실행결과의 예) 홀수 3개
//	            짝수 2개
		int cnt1 = 0; // 홀수를 카운트 홀수 : odd
		int cnt2 = 0; // 짝수를 카운트 짝수 : even 
		for(int i=0; i<=arr.length-1; i++) {
			
			if(arr[i]%2==0) {
				cnt1++;
			}else if(arr[i]%2!=0) {
				cnt2++;
			}
		}
		System.out.println("홀수 : "+cnt2+"개");
		System.out.println("짝수 : "+cnt1+"개");
		System.out.println();
//		   3:고급) 이 배열에 중복된 숫자가 있는지 여부를 판단
//	      해서 출력.
//	      (실행결과의 예) (3 9 8 4 5) 
//	      -> "중복된 숫자 없음!"이라고 출력.
//	      (실행결과의 예) (3 7 3 1 2)
//	      -> "중복된 숫자 있음!"이라고 출력.
		int cnt = 0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr.length-1; j++)
			if(arr[i]==arr[j]) {
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println(Arrays.toString(arr));
			System.out.println("중복된 숫자 있음!");
		}else{
			System.out.println(Arrays.toString(arr));
			System.out.println("중복된 숫자 없음!");
		}
		System.out.println();
//		   4:고급) 이 배열이 오름차순 또는 내림차순으로
//	      정렬된 상태인지 여부를 판단해서 출력.
//	      (실행결과의 예) (3 9 8 4 5) 
//	      -> "정렬X"라고 출력.
//	      (실행결과의 예) (3 4 5 8 9)
//	      -> "정렬O(오름차순)"라고 출력.
		int k1 = 0;
		int k2 = 0;
		for(int i=0; i<arr.length-2; i++) {
			if(arr[i]>arr[i+1]) {
			k1++;
			}else if(arr[i]<arr[i+1]){
				k2++;
			}
		}
		if(k1==4) {
			System.out.println("정렬 O(오름차순)");
		}else if(k2==4){
			System.out.println("정렬 O(내림차순)");
		}else {
		System.out.println("정렬X");
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
//		   5:고급) 이 배열로부터 홀수와 짝수를 구분해서
//	      별도의 배열A와 배열B를 만들어 홀수와 짝수를
//	      각각 배열A와 배열B에 넣고 아래와 같이 출력.
//	      (실행결과의 예) 배열 : [3, 9, 8, 4, 5]
//	               배열A : [3, 9, 5]
//	            배열B : [8, 4]
//	   ※ Arrays.toString() 이용해서 출력하세요.
		
		int sizeA=0;
		int sizeB=0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) {
				sizeA++;
			}else {
				sizeB++;
			}
		}
		int[] Aarr = new int[sizeA];
		int[] Barr = new int[sizeB];
	
		int cntA=0;
		int cntB=0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) {
				 Aarr[cntA] = arr[i];
				 cntA++;
			}else {
				Barr[cntB] = arr[i];
				cntB++;
			}
		}
		System.out.println(Arrays.toString(Aarr));
		System.out.println(Arrays.toString(Barr));
		
	
		
		
		
	}//main
}

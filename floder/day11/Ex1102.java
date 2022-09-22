package day11;

import java.util.Arrays;

//중복값 없이 배열 채우기(고급)
public class Ex1102 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		for(int i=0; i<=arr.length-1; i++) {
			//i : 이번 반복 회차에, 어디를 채워 넣을꺼냐(인덱스).
			int r = (int)(Math.random()*9)+1; // 1이상 9이하의 정수 난수 발생.
			boolean found = false; // true이면 같은 값을 찾은 것.
			for(int j=0; j<=i-1; j++) {
				//r vs arr[j] 같은게 하나라도 있으면 ---> 아래를 실행하면 안됨.
				if(arr[j] == r) {
					found = true;
				}
			}
			if(!found) {//found는 false일때
			arr[i] = r;
			}else {//found가 true라면 --> 해당 i에 대한 '작업'을 한번 더 함
				i--;
			}
			System.out.println(Arrays.toString(arr));
		}//for
		
		int[] Iarr = new int[6];
		for(int i =0; i<=arr.length-1; i++) {
			int r = (int)(Math.random()*9)+1;
			int cnt = 0;
			for(int j=i; j<=i-1; j++) {
				if(Iarr[j] == r) {
					cnt++;
				}
			}
			if(cnt==1) {
				i--;
			}else {
				Iarr[i] = r;
			}
			System.out.println(Arrays.toString(Iarr));
		}
		
	}//main

}

package day11;

import java.util.Arrays;

public class Ex1104 {
	public static void main(String[] args) {
		//로또발생
		int[] iarr = new int[6];
		for(int i=0; i<=iarr.length-1; i++) {
			int r = (int)(Math.random()*45)+1;
			boolean cnt = false;
			for(int j=0; j<=i-1; j++) {
				if(iarr[j]==r) {
					cnt = true;
				}
			}
			if(!cnt) {
				iarr[i]=r;
			}else {
				i--;
			}
		}
		System.out.println(Arrays.toString(iarr));
		
		int tmp = 0;
		for(int i=6; i>=0;i--) {
			for(int j=0; j<i-1; j++) {
				if(iarr[j]>iarr[j+1]) {
					tmp = iarr[j];
					iarr[j] = iarr[j+1];
					iarr[j+1] = tmp;
				}
			}
			
		}
		System.out.println("오름차순 정렬 : "+Arrays.toString(iarr));
		
//		byte[] arr = new byte[45];
//		
//		//난수 발생 0~44
//		for(int i=1; i<=6; i++) {
//			int r = (int)(Math.random()*45); //0이상 44이하
//			int cnt =0;
//			//중복 여부를 판단해서
//				if(arr[r]==1) { //중복된 r을 뽑은 상황 --> r을 다시 뽑아야 함.
//					i--;
//					continue;
//				
//			}
//			arr[r]=1;
//			
//		}
//		
//			System.out.println(Arrays.toString(arr));
//		System.out.print("발생된 로또 번호 : ");
//		for(int i=0; i<=44; i++) {
//			if(arr[i]==1) {
//				System.out.print((i+1)+" ");
//			}
//		}
	}//main

}

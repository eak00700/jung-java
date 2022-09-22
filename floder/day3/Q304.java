package day3;

import java.util.Scanner;

public class Q304 {
	public static void main(String[] args) {
//		[고급]. (실행결과)            // 반복문을 아시는 분들만.
//		 *          정수 입력 : 15328 (엔터)  --> '다섯자리'여야만 하는 건 아님!
//		 *          거꾸로 : 82351
//		 *          모든 자릿수의 합 : 19 // 8+2+3+5+1=19
//		Q401(어제 드렸던 고급문제).
//		(실행결과) 정수입력: 15328 (엔터)
//			   거꾸로: 82351
//			   모든 자릿수의 합: 19
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int sum = 0;
		int back = 0;
////		(3) 뒤에서 이해
//		//15328 --> [1,5,3,2,8] --->[8,2,3,5,1] ---> 82351/19
//		int n = sc.nextInt();
////		int cnt =(int)(Math.log10(n))+1;
//		int cnt = 0;
//		int t = n;
//		while(t>0) {
//			cnt++;
//			t/=10;
//		}
//		int [] arr = new int[cnt];
//		int idx =0;
//		while(n>0) {
//			arr[idx++] = n%10;
//			n/=10;
//		}
////		System.out.println(Arrays.toString(arr));
//		for(int num : arr) {
//			back = back*10 + num;
//			sum += num;
//		}
		
		
		
//		(2) 뒤에서 이해.
//		String s = sc.next();
//		for(int i =s.length()-1; i>=0; i--) {
//			//System.out.print(s.charAt(i));
//			char ch = s.charAt(i);
//			back = back*10 + (ch-48);
//			sum +=(ch-48);
//			
//		}
		
		 //(1)
		  int n = sc.nextInt(); 
		  while(n!=0) { 
		  back = back*10 + n%10; 
		  sum += n%10; 
		  n /= 10;
		  
		  }//while
		 		
		System.out.println("합 : " + sum );
		System.out.println("반대 : " + back);
		
	}//main

}

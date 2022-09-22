package day7;

import java.util.Scanner;

//사용자로부터 소수인 정수만 입력받아서 이들의 합계를 출력, 소수가 아닌 수가 입력되면 그때까지 입력한 소수들으 ㅣ합을 출력
public class Q703 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int cnt = 0;
		while(true) {
			cnt = 0;
			System.out.print("소수 입력 : ");
			int num = sc.nextInt();
			
			for(int i =1; i<=num; i++) {
				
				if(num%i==0) {
					cnt++;
				}
				
			}//for
			
			if(cnt!=2) {
				System.out.print("지금까지 입력한 값의 합은"+ sum+"입니다.");
				break;
			}
			sum +=num;
		}//while
		
	}//main

}

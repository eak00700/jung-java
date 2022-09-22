package day6;

import java.util.Scanner;

//연습6. [고급] (실행결과의 예)
//소수만 입력하세요(1번째 시도) : 5 (엔터)
//소수만 입력하세요(2번째 시도) : 7 (엔터)
//소수만 입력하세요(3번째 시도) : 11 (엔터)
//소수만 입력하세요(4번째 시도) : 13 (엔터)
//소수만 입력하세요(5번째 시도) : 15 (엔터)
//4번 성공!
public class Q601소수입력횟수 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int cnt = 1;
		int sum = 0;
		while(true) {
			sum =0;
			System.out.print("소수만 입력하세요("+cnt+"번째 시도): " );
			int num = sc.nextInt();
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					sum++;
				}//if
				}//for
			if(sum!=2) {
				System.out.println((cnt-1)+"번 성공!");
				break;
			}//if(2)
			
			cnt++;
			}//while
		
		
		
		
		
		
		
		
		}//main
	

}

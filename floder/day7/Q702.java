package day7;

import java.util.Scanner;

//Q 연습. "사용자가 입력한 모든 정수의 합계를 출력"
//-사용자가 0을 입력하면 그때까지의 합계를 출력하고 끝.
//(실행결과의 예)
//입력 : 5
//입력 : 3
//입력 : 12
//입력 : -10
//입력 : 0
//0---> 지금까지 입력한 값들의 합은 10입니다.
public class Q702{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			sum+=num;
			if(num ==0) {
				break;
			}
		}
		System.out.print("지금까지 입력한 값들의 합은 "+sum+" 입니다.");
	}

}

package day6;

import java.util.Scanner;

public class Ex604소수 {
	public static void main(String[] args) {
		//소수(prime number) : 1과 자기자신 외에는 나누어 떨어지지 않는 수.
		//추가연습 7을 2~6으로 나눠보는 방식 (int cnt가 필요업슨ㄴ 방식) // break; 사용을 권장
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
		System.out.print(num+"은(는) 소수입니다.");
		}else {
			System.out.println(num+"은(는) 소수가 아닙니다.");
		}
		
	}
}

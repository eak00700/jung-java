package day6;

import java.util.Random;
import java.util.Scanner;

//[고급]	※ 난수발생 : Random rd = new Random();
//int n = rd.nextInt(10);   // 0~9 난수 (0 이상 9 이하)
//sysout(n);    // 0~9 사이의 정수
//(실행결과의 예)
//Guess(1~100) : 50 (엔터)
//	더 작은 수를 입력하세요.
//Guess(1~100) : 25 (엔터)
//	더 큰 수를 입력하세요.
//Guess(1~100) : 37 (엔터)
//	3번의 시도 끝에 맞췄습니다!
public class Q601난수발생 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int n = rd.nextInt(100);
		int cnt = 0;
//		System.out.println(n);
		while(true) {
			System.out.print("Guess(1~100) : ");
			int a = sc.nextInt();
			if(a>n) {
				System.out.println("더 작은 수를 입력하세요.");
				cnt++;
			}
			if(a<n) {
				System.out.println("더 큰 수를 입력하세요.");
				cnt++;
			}
			if(a==n) {
				System.out.println(cnt+"번의 시도 끝에 맞췄습니다!");
				break;
			}
		}
	}

}

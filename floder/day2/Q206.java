package day2;

import java.util.Scanner;

public class Q206 {
	public static void main(String[] args) {
		//연습. 정수 3개를 입력받아서, 그 중에서 가장 큰 값을 출력. 단 3개의 정수는 서로 다른 값이라고 가정)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int a = sc.nextInt();
		
		System.out.print("정수2: ");
		int b = sc.nextInt();
		
		System.out.print("정수3: ");
		int c = sc.nextInt();
		
		int max =  ((a>b && a>c) ? a : (b>a && b>c ? b : c)); //이해. 삼항연산자의 중첩사용.
		System.out.println("가장 큰 값은 " + max +" 입니다.");
	}

}

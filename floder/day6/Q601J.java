package day6;
//연습10. 세 정수를 입력받고(a,b,c), 세 정수의 합계가 짝수인지 아닌지를 출력.

import java.util.Scanner;

public class Q601J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		
		System.out.print("b: ");
		int b = sc.nextInt();
		
		System.out.print("c: ");
		int c = sc.nextInt();
		
		if((a+b+c)%2==0) {
			System.out.print("짝수입니다.");
		}else {
			System.out.print("짝수가 아닙니다.");
		}
		
	}

}

package day6;

import java.util.Scanner;

//연습9. 두 정수(a,b)를 입력받고(a<b 가정), a부터 b까지의 정수들 중 홀수만 출력.
public class Q601I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		int a = sc.nextInt();
		
		System.out.println("b: ");
		int b = sc.nextInt();
		for(int i=a; i<=b; i++) {
			if(i%2==0) {
				continue;
			}if(i%2==1) {
				System.out.print(i+" ");
			}
		}
				
	}

}

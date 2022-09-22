package day6;

import java.util.Scanner;

//연습3. 4개의 정수를 입력 받아서(a,b,c,d),  // a < c < d < b 가정
//a부터 b까지 출력하되, "c부터 d까지는 제외하고" 출력.
//				// break 또는 continue를 반드시 사용.
//(실행결과의 예)
//	a : 1 (엔터)
//	b : 10 (엔터)
//	c : 5 (엔터)
//	d : 8 (엔터)
//	-> 1 2 3 4 9 10
public class Q601_4개의정수입력받아서a_b까지출력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a :");
		int a = sc.nextInt();
		
		System.out.print("b: ");
		int b = sc.nextInt();
				
		System.out.print("c: ");
		int c = sc.nextInt();
		
		System.out.print("d: " );
		int d = sc.nextInt();
		
		for(int i=a; i<=b; i++) {
			if(i>=c && i<=d) {
				continue;
			}else {
				System.out.print(i+" ");
			}
		}
	}

}

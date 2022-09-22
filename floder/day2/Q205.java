package day2;

import java.util.Scanner;

public class Q205 {
	public static void main(String[] args) {
		//정수 2개를 키보드 입력 받아서, 둘 중 더 작은수를 출력
		//추가연습. 더 작은수를 말할때 (00만큼 더 작음)
		//추가연습. 더 작은수는 0 일때 정수2가 정수1보다 22만큼 더 작
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int a = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int b = sc.nextInt();
		int min = (a>b) ? b : ((b>a) ? a : b);
		int max = (a>b) ? a : ((b>a) ? b : a);
		System.out.println("더 작은수는 " + min+ " 일때 "+ ((a>b) ? b : (b>a ? a : b))+"이(가) "+ 
		((a>b) ? a :(b>a ? b : a))+"보다 "+(max-min)+" 만큼 더 작다.");
		
		/*int smaller = n1 < n2 ? n1 : n2;
		 *int d = n1 < n2 ? n2 - n1 : n1 - n2;
		 *System.out.println("
		 * */
	}

}

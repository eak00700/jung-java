package day13;

import java.util.Scanner;

//이해 : 메서드를 호출하면, 그 내용의 실행이 완료되기 전까지, (메서드를 호출한 쪽은) 실행이 멈춰 있음
public class Ex1303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int n =sc.nextInt();
		System.out.println("입력한 값은 : "+n);
	}

}

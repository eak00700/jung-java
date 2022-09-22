package day8;

import java.util.Scanner;
//nextInt -> nextLine 사용할때 일어나는 문제.

public class Ex802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력된 나이는 : "+ age);
		sc.nextLine(); // 입력버퍼에 있는 줄바꿈 문자를 제거 
		System.out.print("이름을 입력하세요 :");
		String name = sc.nextLine();
		System.out.println("입력된 이름은 : "+ name);
		
	}

}

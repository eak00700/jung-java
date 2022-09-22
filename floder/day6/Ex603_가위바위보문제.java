package day6;

import java.util.Scanner;

public class Ex603_가위바위보문제 {
	public static void main(String[] args) {
		//가위 바위 보 입력.
		// 가위 바위 보 입력 : 거위 엔터
		// 가위 바위 보 중에 하나를 입력하세요!
		//가위 바위 보 입력 : 가이
		// 가위 바위 보 중에 하나를 입력하세요!
		//가위 엔터
		//가위를 내셧습니다.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("가위/바위/보 입력: ");
			String s = sc.next();
			if(s.equals("가위")||s.equals("바위")||s.equals("보")) {
				System.out.print(s+"를 내셨습니다.");
				break;
			}else {
				System.out.println("가위,바위,보 중에 하나를 입력하세요!");
			}
		}
	}

}

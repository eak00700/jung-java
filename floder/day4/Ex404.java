package day4;

import java.util.Scanner;

public class Ex404 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력해주세요 : ");
		int score = sc.nextInt();
		score /=10;
		switch(score) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}
		
		
		
		
	}

}

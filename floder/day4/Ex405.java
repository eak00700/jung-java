package day4;

import java.util.Scanner;

public class Ex405 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요일 입력: ");
		String input = sc.next();
	//	String eng ="";
		
		switch(input) {
		case "월":
			System.out.println(input+"요일은 : MON");
			break;
		case "화":
			System.out.println(input+"요일은 : TUE");
			break;
		case "수":
			System.out.println(input+"요일은 : WED");
			break;
		case "목":
			System.out.println(input+"요일은 : THU");
			break;
		case "금":
			System.out.println(input+"요일은 : FRI");
			break;
		case "토":
			System.out.println(input+"요일은 : SAT");
			break;
		case "일":
			System.out.println(input+"요일은 : SUN");
			break;
			
		}
	}

}

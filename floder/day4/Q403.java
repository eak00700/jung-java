package day4;

import java.util.Scanner;

public class Q403 {
	public static void main(String[] args) {
//		연도를 하나 입력 받아서, 윤년인지 여부를 판단하는 코드.
//		"윤년인지 판단":
//		① 400으로 나누어 떨어지면 윤년임. 끝!
//		그게 아니라면,
//		② 4로 나누어 떨어지면서 
//		   100으로는 나누어 떨어지지 않으면 윤년임.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		
		int y = sc.nextInt();
		
			if((y%400==0) || (y%4==0 && y%100!=0) ) {
				System.out.println(y+"년도는 윤년임!");
			}else {
				System.out.println(y+"년도는 윤년이 아님!");
			}
		
			
		
	}//main

}

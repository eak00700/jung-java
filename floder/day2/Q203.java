package day2;

import java.util.Scanner;

public class Q203 {
	public static void main(String[] args) {
		// c= 5/9 * (f-32) // f : 화씨온도  c: 섭씨온도
		Scanner sc = new Scanner(System.in); //스캐너 객체 생성 문장.
		
		
		System.out.print("화씨:" );
		
		int f = sc.nextInt(); //정수값을 입력받아 f에 대입.
		
		float c =(float)5/9 *(f-32);
		//float c =5.0f/9 *(f-32);
		
		
		c = (int)(c*10)/10.0f;
		System.out.println("섭씨 :" + c + "도");
		
	}

}

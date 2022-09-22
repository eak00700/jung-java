package day4;

import java.util.Scanner;

public class Q404 {
	public static void main(String[] args) {
		//물은 0도에서 얼고 100도에서 끓는다. 변수 temp에 정수 값을 하나 입력받아서, 물이 액체상채인지 여부를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("온도를 입력하세요: ");
		int temp = sc.nextInt();
		
		
			if(temp>0 && temp<100) {
				System.out.println("물이 액체 상태임!");
			}else {
				System.out.println("물이 액체상태가 아님!");
			}
	}
		
}



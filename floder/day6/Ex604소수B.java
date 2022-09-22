package day6;

import java.util.Scanner;

public class Ex604소수B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		boolean result = true; //소수가 맞으면 : result 가 true. 
								//true로 초기화 했음!(소수가 맞다고 가정하고 시작)
								//false로 바꿔야 하는 상황!
		for(int i=2; i<=num-1; i++) {
			if(num%i==0) {
				result = false;
				break; //안써도 되지만, 쓰는게 더 좋다.
			}
		}
		if(result) {
			System.out.println(num+"은(는) 소수임!");
		}else {
			System.out.println(num+"은(는) 소수가 아님!");
		}
				
	}

}

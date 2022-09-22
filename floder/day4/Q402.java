package day4;

import java.util.Scanner;
//Q402. 	정수 값을 하나 입력 받아서,
//"10보다 크고 30보다 작은지"를 판단해서 출력.
//(실행결과의 예) 정수 입력 : 17 (엔터)
//	-> 17은 10보다 크고 30보다 작은 수임!
//(실행결과의 예) 정수 입력 : 38 (엔터)
//	-> 38은 10보다 크고 30보다 작은 수가 아님!
public class Q402 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
			if(num1>10 && num1 <30) {
				System.out.println(num1+"은 10보다 크고 30보다 작은수임.");
			}else {
				System.out.println(num1+"은 10보다 크고 30보다 작은수가아님!");
			}
		}//main
	}



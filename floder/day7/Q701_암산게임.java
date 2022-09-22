package day7;
//[고급] 암산 게임
//--숫자 2개 (a,b) 그리고 연산자(+,-,/,*)를 난수 발생.
//숫자는 한 자릿수의 정수(0이상 9이하)
//단,나눗셈 연산자 이면서 b가 0이되면 안됨 난수 발생하실때 '0으로 나누는 상황' 은 피해주세요
//문제1번 5+3 = 8
//문제 2번 7-2 = 5
//...
//문제 4번 4/2 = 2
//문제 5번 1* 8 = 8
//5문제중 5문제 정답!
import java.util.Random;
import java.util.Scanner;

public class Q701_암산게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String []arr = {"+","-","*","/"};
		System.out.print("문제 수 입력 : ");
		int a =sc.nextInt();
		int cnt = 0;
		for(int i=1; i<=a; i++) {
			int num = rd.nextInt(10); // 0~9
			int num1 = rd.nextInt(10); // 0~9
			int idx = rd.nextInt(4);
			String op = arr[idx];
			int sum = 0;
			if(op.equals("/")) {
				num1=rd.nextInt(9)+1; // 1 ~ 9 
				}
				
			if(op.equals("+")) {
				sum=num+num1;
			}else if(op.equals("-")) {
				sum=num-num1;
			}else if(op.equals("*")) {
				sum = num * num1;
			}else {
				sum = num / num1;
			}
			
				System.out.print(num+" "+ op +" "+num1+" "+" = ");
				int res = sc.nextInt();
				if(res==sum) {
					cnt++;
				}
			}
			System.out.print(a+"문제중 "+cnt+"문제 정답!");
		
	}//main

}

package day8;

import java.util.Random;

//난수 발생.
public class Ex803 {
	public static void main(String[] args) {
		//1	부터 6 까지의 정수중 하나를 뽑아서 출력 -- > 10번 반복
		//(1) Math.random() 방식 -->"0~0.9999999..."
		//
		for(int i =1; i<=10; i++) {
			int num = (int)(Math.random()*4)+3;
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("------------------------");
		//(2)Random 클래스 방식
		Random rd = new Random();
		//rd.setSeed(System.currentTimeMillis());
//		rd.setSeed(1000);
		for(int i=1; i<=10; i++) {
			//(0~5) +1
			int num = rd.nextInt(6)+1;
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println(rd.nextInt()); // int 표현범위 내의 값.
		System.out.println(rd.nextDouble()); // (=) Math.Random();
		System.out.println("------------------");
		//간단한 연습.로또번호 생성기
		for(int i=1; i<=6; i++) {
			int num = (int)(Math.random()*46)+1;
			System.out.print(num+" ");
		}
		
	}//main

}

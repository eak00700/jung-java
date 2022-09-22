package day13;
//"파라미터(일종의 변수--->변수의 선언)","인수"

public class Ex1305 {
	static void method2(int num) {
		System.out.println("num : "+ num);
	}
	static void sayHello(String s) {
		System.out.println(s+"님, 안녕하세요");
	}
	static void showOneToNum(int num) {
		for(int i=1; i<=num; i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		method2(55);	
		
		byte b = 5;
		method2(b); //자동형변환
		//method2(5.15); // int -> float로 자동형변환이 안댐
		//method2("ABC"); // int -> String 으로 자동형변환이 안댐
		
		//연습1. 아래 메서드를 호출한 결과 "YG님, 안녕하세요" 가 출력되도록 메서드 작성
		sayHello("JS");
		//연습2. 아래 메서드 호출결과 "1 2 3 4 5"가 출력되도록 메서드 작성
		showOneToNum(5);
	}

}

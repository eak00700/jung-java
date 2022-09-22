package day2;

//정수리터럴, 0b____, 0____, 0x_____
//참고, 대,소문자 무관.0B___, 0O___, 0X_____ 도 됨.
public class Ex202 {
	public static void main(String[] args) {
		//int num = 5;  // num : 변수 5 : 리터럴(정수)
		//final int num2 = 0x55; //num2 : 상수, 55 : 리터럴(정수)
		
		byte b1 = 127;
		//byte b1 = 0177; 8진수
		//byte b1 = 0b01111111; 2진수
		//byte b1 = 0x7f; 16진수
		
		/*
		 * System.out.println(0177); // 64*1 + 8*7 + 1*7 = 127
		 * System.out.println(0b01111111); // 127 
		 * System.out.println(0x7f); //127 //0111= 7 1111 = f
		 */	}

}

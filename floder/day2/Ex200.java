package day2;

public class Ex200 {
	public static void main(String[] args) {
		byte b = 127; // 01111111 //byte의 표현범위 : -128 ~ 127
		b++;
		System.out.println(b); // 10000000 : -128
		b++;
		System.out.println(b); // 10000001 : -127
		b--;
		System.out.println(b); // 10000000 : -128
		b--;
		System.out.println(b); // 01111111 : 127
	}

}

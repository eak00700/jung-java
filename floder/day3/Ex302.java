package day3;

public class Ex302 {
	public static void main(String[] args) {
		
		int num = 12;
		System.out.println(num%2==0 && num>0); //true
		
		System.out.println(0b0001&0b0011); // 1
		System.out.println(1 & 3); // 1
		
		int a = 2;
		System.out.println((a-1)& (a+1));
		//고급 ~연산자(틸드. not연산자. 뒤집어!)
		byte b = 0b00000111;
		System.out.println(~b); //-8 (단, b의 값은 여전히 7 임)
		System.out.println(b); // 7 (변수의 값을 바꾸려면 대입연산자, 증감연산자를 써야함)
		
		//고급의 고급.
		byte b2 = (byte)0b11110111; // 11111111 11111111 11111111 11110111 // 자동형변환이 되지 않음
		System.out.println(~b2); // 8
		
		
		//조건식 연습1
		//"num이 홀수이거나 5 이상이면 true"
		//(num%!=0 || num >=5)
		//조건식 연습2
		//"num이 0보다 작거나 짝수이면 true"
		//(num < 0 || num%2==0)
		//조건식 연습.
		//"num이 10보다 작으면서, 2또는 3또는 7이 아니라면 true"
		//(num <10 && (num !=2 && num != 3 && num != 7))
		//num<10 && !(num ==2 || num == 3 || num == 7)
		//int num = 5;
		//syso(num++); 5
		//syso(num); 6
		//int num2 = num--;
		//syso(num); // 5
		//syso(num2);// 6
		
	}

}

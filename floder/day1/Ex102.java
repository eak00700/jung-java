package day1;

public class Ex102 {
	public static void main(String[] args) {
		byte b = 3; //byte타입의 변수 b를 선언하고 3으로 초기화함.
		short s = b; //byte ->short 이 일어나고잇음! (byte b = short s; -> short s =3;)
		int i = s; //short -> int이 일어나고있음! (short s = int i; -> int i = 3;)
		long lo = i;//int -> long이 일어나고있음! (int i = long lo -> long lo = 3;)
		float f = lo;//long->float이 일어나고있음!(long lo = float f -> float f = 3.0; )
		double d = f;//float -> double이 일어나고잇음!(float f = double =d; -> double d = 3.0;)
		System.out.println(d);
		
		//한 문자를 저장 ----> char형 변수에 저장.
		char c ='A';
		//char c = 65;
		int i2 = c; // 자동 형 변환 (char -> int)
		System.out.println(i2+1); //66
		System.out.println((char)(c+1)); //B "강제 형 변환"
		// System.out.println((char)c+1); == System.out.println(c+1); // 66
		//[고급] int보다 작은 정수형 데이터타입(byte, char, short)에 대해서
		//		산술연산(ex. +)을 수행하면,
		//		int로 형변환 해서 연산을 수행함.
		
		//d : 3.0
		//double -> int 자동 형 변환 되나요 ? x
		//double -> int 강제 형 변환 될까요 ? o
		int i3 = (int)d; //자동 형 변환 x --> 강제 형 변환은 가능함.
						//강제 형 변환 할때에, '정보의 소실'은 있을 수도 있음.
						//개발자가 시켰으니까. (이해)
		//"강제 형 변환" : 강제로 형(type) 변환을 시킴.
		//				"(변환할 데이터 타입) 값"
		//				ex. (int) 3.7 ---> 3
		//				(참고) '반올림' / '버림' 아님!
		//				"실수를 정수로 형 변환 하면, 소수점 이하를 잃어버림"(기억)
		System.out.println((int) 3.7);	//3
		System.out.println((int) -4.78);//-4? -5? //('버림' 아님)
		
		//(참고) sysout으로 변수를 출력할때.
		int num = 5;
		int num2 = 10;
		System.out.println("num + num2 : " + num + num2);//num + num2 : 510
		
		
	}

}

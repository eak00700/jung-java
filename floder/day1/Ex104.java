package day1;

//[고급] byte, short, int, char 변수들 간에 +,-,*,/ 연산의 결과는 int
//[고급] 	int보다 작은 정수형 변수에 값을 대입할 때, int값이 해당 형으로 자동 형 변환됨.
//	(ex) byte b = 5; //'편의성 제공'
public class Ex104 {
	public static void main(String[] args) {
		byte b1 = 5; //자동 형 변환 (이해)-고급.
		byte b2 = 3;
		// byte b3 = b1+b2; //ERR. (이해)-고급.
		byte b3 = (byte)(b1+2); //byte로 강제형 변환
			// 생각 : byte b3 = (byte) b1 + b2; ---> 불가능!
		
		//아스키코드 65 = A , 97 = a
		char c = 65;	//int값(65)이 char로 자동 형 변환되어 대입(고급)
		// char c2 = c + 32; //값을연산해서 하는거기 때문에 불가능 ERR (이해)-고급
		char c2 = 'A' + 32; // 'A'가 변수가아니므로 자동으로 형 변환이 진행되지않고 char타입으로 계산 됨.
		
		
		
	}

}

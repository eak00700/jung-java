package day2;

// 자바에서 변수의 값을 변경하려면 : 1)대입연산자(=) 2)증감연산자(++,--)
// 단항연산자 : 부호연산자(-) , 증감연산자(++,--)
// 삼항연산자 
public class Ex203 {
	public static void main(String[] args) {
		int num = 5;
		System.out.println(num*-1); //5
		System.out.println("num: "+num); // 5
		System.out.println(-num); // -5 (-) : 부호연산자
		//이해 : 부호연산자는 값 앞에 놓여서, 그 값의 부호를 바꾼 새로운 값을 만들 뿐임. 변수의 값을 바꾸는게 아
		System.out.println("num: "+num); //5
		
		int num2 = 10 + 5; // + : "이항연산자"(피연산자가 2개)
		
		//삼항연산자 : "조건식 ? 참일때 : 거짓일때"
		char ch = num2%2==0?'짝' : '홀';
		// -> 참일때 ---> char ch = '짝'; // 이해.
		// -> 거짓일때 --> char ch ='홀'; // 이해.
		System.out.println(ch);
		
		//증감연산자(++,--)
		int n = 5;
		int n2 = n++;
		System.out.println(n); // 6
		System.out.println(++n2); // 6
	}
	

}

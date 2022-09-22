package day7;
//피보나치 수열

public class Ex702 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c;
		System.out.print(a+" "+ b + " ");//첫번째 항과 두 번째 항을 출력.
		for(int i =1; i<=8; i++) { // 세 번째 항부터 열 번째 항까지 출력.
		//반복할 내용 : 1) c를 계산 2) c를 출력 3)a,b를 이동.
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
			
			
		}
		
	}

}

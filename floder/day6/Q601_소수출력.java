package day6;
//연습4. 1부터 100까지의 정수 중 소수(prime number)를 모두 출력.
public class Q601_소수출력 {
	public static void main(String[] args) {
		for( int i=2; i<=100; i++) {
			int cnt =0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.print(i+" ");
			}
		}
	}

	

}

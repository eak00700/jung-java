package day6;
//연습5. 1부터 100까지의 정수 중 그 수가 짝수이거나 소수이면 출력.
public class Q601_소수or짝수출력 {
	public static void main(String[] args) {
		
		for(int i=2; i<=100; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0) {
					cnt+=1;
				}
				
			}
			if(cnt==2 || i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}

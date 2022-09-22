package day6;
//o	연습15. (실행결과) 1 -4 9 -16 25 -36 49 -64 81 -100
//Hint. 코드의 일부:
//	for(int i=1; i<=10; i++) {
//		...
//	}
public class Q601제곱수구하기 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.print(i*i*(i%2==0? -1 : 1)+" ");
			
//			if(i%2==1) {
//				System.out.print(i*i+" ");
//			}
//			if(i%2==0) {
//				System.out.print(-i*i+" ");
//			}
			
		}
	}

}

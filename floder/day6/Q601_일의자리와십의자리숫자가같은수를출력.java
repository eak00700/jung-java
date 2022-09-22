package day6;
//연습8. 1부터 100까지의 정수 중 일의 자리와 십의 자리가 같은 수를 출력.
// 11 22 33 44 55 66 77 88 99 100
public class Q601_일의자리와십의자리숫자가같은수를출력 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i/10%10==i%10) { 
				System.out.print(i+" ");
			}
		}
	}

}

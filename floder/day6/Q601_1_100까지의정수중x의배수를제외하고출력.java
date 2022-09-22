package day6;
//연습11. 1부터 100까지의 정수 중 "3의 배수를 제외하고" 출력.
//// break 또는 continue 사용!
public class Q601_1_100까지의정수중x의배수를제외하고출력 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i%3!=0) {
				System.out.print(i+" ");
			}
			if(i%3==0) {
				continue;
			}
		}
	}

}

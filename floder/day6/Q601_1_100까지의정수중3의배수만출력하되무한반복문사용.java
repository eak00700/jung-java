package day6;
//	연습2. 1부터 100까지의 정수 중 3의 배수만 출력하되, 무한반복문을 사용.
public class Q601_1_100까지의정수중3의배수만출력하되무한반복문사용 {
	public static void main(String[] args) {
		int num = 1;
		while(true) {
			if(num%3==0) {
				System.out.print(num+" ");
			}
			if(num>100) {
				break;
			}
			num++;
		}
	}

}

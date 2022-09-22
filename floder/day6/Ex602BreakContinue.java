package day6;
//이해가 중요함!
//break, continue
//[정리] break : (나를) 감싸고있는 반복문 하나를 탈출.
public class Ex602BreakContinue {
	public static void main(String[] args) {
		int n = 5;
		for(int i=1; i<=7; i++) {
			System.out.print(i+" ");
			if(i==5) {
				break;
			}
		}
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.print((j+(i-1)*3)+" ");
//				if(j+(i-1)*3 ==5){
//					break;
//				}
//			}
//		}
		System.out.println();
		
		//1~7까지 출력하되, "n만빼고" 출력!
		
		for(int i=1; i<=7; i++) {
			if(i==n) {
				continue; //="다음꺼부터 계속!"
							// 다음회차부터 계속!
				
			}
			System.out.print(i+" ");
		}
		
	}

}

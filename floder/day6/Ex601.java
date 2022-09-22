package day6;

public class Ex601 {
	public static void main(String[] args) {
		// Control Statment//조건문, 반복문 : "실행흐름"을 제어(control)
		for(int i=1;   ;System.out.println(i),i++) { // 무한반복문1.
			//for문의 조건식이 비어잇으면 자동으로 true로 채워짐
			System.out.println("*");
		}
		//[주의] 조건식을 써야하는 모든 곳이 이렇게 되는게 아님!
//		if( ) { //ERR. 조건식을 생략할 수 없음.
//			
//		}
		
//		while() { //ERR. 조건식을 생략할 수 없음.
//			
//		}
		
//		while(true) { //무한반복문2.
//			System.out.println("*");
//		}
	}

}

package day13;
//이해 : (메서드 작성할때) 파라미터를 2개이상 사용할 수도 있음.
//이해 : 파라미터 구성이 다르면, "동일한 메서드 이름"을 사용할 수 있음.
//								-------->"메서드 오버로딩(Overloading)"
//이해 : 자바가 (호출되어서) 실행해줄 메서드를 찾을 때에는
//			이름만 가지고 실행할 메서드를 찾는게 아니라
//			"이름"+"파라미터"로 실행할 메서드를 찾는다.
public class Ex1306 {
	static void show1(int n) {
		//1~n까지 출력
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
	}
	static void show1(int a, int b) {
		//a~b까지 출력
		for(int i=a; i<=b; i++) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		show1(10);
		System.out.println();
		show1(10,20);
	}

}

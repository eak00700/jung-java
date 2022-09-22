package day13;

//이해 : 어떤 메서드 안에서 다른 메서드를 호출할 수 있다.

public class Ex1304 {
	static void methodA() {
		System.out.println("methodA 메서드가 실행됨.");
	}
	static void methodB() {
		System.out.println("methodB 메서드에서");
		methodA();
		System.out.println("methodB 메서드의 실행이 종료됨");
	}
	public static void main(String[] args) {
		methodA();
		methodB();
	}

}

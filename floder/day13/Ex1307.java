package day13;

public class Ex1307 {
	static void printStars(int n, char ch) {
		for(int i=1; i<=n; i++) {
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		printStars(4,'*');
		System.out.println();
		printStars(6,'*');
	}

}

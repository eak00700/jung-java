package day2;


public class Q204 {
	public static void main(String[] args) {
		int a = 15;
		int b = 17;
		int max = a>b ? a :(b>a ? b:a) ;
		System.out.println("max : "+ max); //max : 17;
		
	}
}

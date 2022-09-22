package day5;

public class Ex503 {
	public static void main(String[] args) {
//		//[고급] 구구단 Q503
		//234		
		//567
		//89
		
		for(int i=2;i<=8; i+=3) {
			for(int j=1;j<=9; j++) {
				
				System.out.print(i+" x "+j+" = "+i*j);
				System.out.print("\t");
				System.out.print((i+1)+" x "+j+" = "+(i+1)*j);
				System.out.print("\t");
				if(i+2<10) {
				System.out.print((i+2)+" x "+j+" = "+(i+2)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}//main

}

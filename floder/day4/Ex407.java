package day4;

public class Ex407 {
	public static void main(String[] args) {
		int i;
		//1 2 3 4
		for( i=1; i<=4; i++) {
			System.out.print(i + " ");
		}
		System.out.println(""); //줄바꿈
		
		i=1;
		while(i<=4) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println(""); //줄바꿈
		
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i<=4);
		System.out.println(""); //줄바꿈
		
		
		//11~20까지
		i=11;
		while(i<=20) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println(); //줄바꿈
		
		i=11;
		do{
			System.out.print(i+" ");
			i++;
		} while(i<=20);
		System.out.println(); //줄
		
		for( i=11; i<=20; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" "); //줄바꿈
		//3)1 3 5 7 9
		i=1;
		while(i<10) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		
		i=1;
		do {
			System.out.print(i+" ");
			i+=2;
		}while(i<10);
		System.out.println();
		
		for( i=1; i<10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		System.out.println("-----------------------------");
		//4) 0 1 2 3 4 5
		for( i=0; i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		i=0;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		i=0;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=5);
		System.out.println();
		
		
		//5) 6 5 4 3 2
		for( i=6; i>=2; i--) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		
		i=6;
		while(i>=2) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println(" "); //줄바꿈
		
		i=6;
		do {
			System.out.print(i+" ");
			i--;
		}while(i>=2);
		System.out.println(" "); //줄바꿈
		
		
		//6) 0 2 4 6 8
		for( i=0; i<10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		i=0;
		while(i<10) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("");
		
		i=0;
		do {
			System.out.print(i+" ");
			i+=2;
		}while(i<10);
		System.out.println("");
		
		//7) 1 4 7 10
		for( i=1; i<=10; i+=3) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		
		i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i+=3;
		}
		System.out.println();
		
		i=1;
		do {
			System.out.print(i+" ");
			i+=3;
		}while(i<=10);
		System.out.println();
		
		//8) 100 90 80 70 
		for( i=100; i>=70; i-=10) {
			System.out.print(i+" ");
		}
		System.out.println(" "); //줄바꿈
		
		i=100;
		while(i>=70) {
			System.out.print(i+" ");
			i-=10;
		}
		System.out.println();
		
		i=100;
		do {
			System.out.print(i+" ");
			i-=10;
		}while(i>=70);
		System.out.println();
		
		//9) 11 22 33 44 55 66 77 88 99
		for( i=1; i<=9; i++) {
			System.out.print(i*11+" ");
		}
		System.out.println();
		
		i=1;
		while(i<=9) {
			System.out.print(i*11+" ");
			i++;
		}
		System.out.println();
		
		i=1;
		do {
			System.out.print(i*11+" ");
			i++;
		}while(i<=9);
		System.out.println();
		
		//10) 0 1 4 9 16 25 36 49 64 81
//		int num = 0;
//		System.out.print(num+" ");
//		for ( i=1; i<=17; i+=2) {
//			num+=i;
//			System.out.print(num+" ");
//		}
//		System.out.println();
		for( i=0; i<=9; i++) {
			System.out.print(i*i+" ");
		}
		System.out.println();
		
		i=0;
		while(i<=9) {
			System.out.print(i*i+" ");
			i++;
		}
		System.out.println();
		
		i=0;
		do {
			System.out.print(i*i+" ");
			i++;
		}while(i<=9);
		System.out.println();
		
	}//main

}

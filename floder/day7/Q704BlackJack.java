package day7;

import java.util.Random;
import java.util.Scanner;

public class Q704BlackJack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		String[] Sarr = {"스페이드","하트","클로버","다이아"};
		int[] iarr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int a = rd.nextInt(14);
		int b = rd.nextInt(5);
		String p1;
		String c1;
		int p;
		int c;
		for(int i=1; ; i++) {
			 a = rd.nextInt(14);
			 int a1 = rd.nextInt(14);
			 b = rd.nextInt(5);
			 int b1 = rd.nextInt(5);
			 p1 =Sarr[b]+iarr[a];
			 c1 = Sarr[b1]+iarr[a1];
			System.out.println("p: "+p1);
			System.out.println("c: "+c1);
			
			System.out.print("더 하시겠습니까? (yes or no)");
			String s =sc.next();
			
			if(s.equals("yes")) {
				continue;
			}else if(s.equals("no")) {
				break;
			}
			

			
//			if(p>=22&&c>=22) {
//				System.out.print("무승부입니다.");
//				break;
//			}else if(p>=22){
//				System.out.println(p+"\n"+"플레이어 승리!");
//				break;
//			}else {
//				System.out.println(c+"\n"+"com승리!");
//				break;
			}
		System.out.println("끗!");
		}
		
	}//main



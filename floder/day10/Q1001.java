package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Q1001 {
	public static void main(String[] args) {

		
//		--------------------
//		1 2 3 4 5 6 7 8 9 10 <--좌석번호
//		. . . . . . . . . .  <--예약상태(x:예약됨 / .: 안됨)
//		--------------------
//		예약하시겠습니까? y(엔터)
//		예약할 좌석 번호 입력 : 7 (엔터)
//		예약되었습니다.
		int[] iarr = {1,2,3,4,5,6,7,8,9,10};
		String[] Sarr = {".",".",".",".",".",".",".",".",".","."};
		
		int cntX = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			
				
				System.out.print("예약하시겠습니까?(Y Or N)");
				String y = sc.next();
			
				System.out.println();
				System.out.println("*************예약 현황*************");
				System.out.println("* "+Arrays.toString(iarr)+" *");
				System.out.println("* "+Arrays.toString(Sarr)+"  *");
				System.out.println("***********************************");
				
					if(y.equals("Y")) {
						System.out.print("예약할 좌석 번호 입력 : ");
						int num = sc.nextInt();
						if(Sarr[num-1].equals(".")) {
							Sarr[num-1] = "x";
		//					System.out.println(Arrays.toString(Sarr));
							System.out.println("예약되었습니다.");
							cntX++;
							}else if(Sarr[num-1].equals("x")) {
								System.out.println("이미 예약된 좌석입니다. 다른 좌석을 골라주세요");
							}//inner if
			
					}else if(y.equals("N")) {
						System.out.println("예약 프로그램 종료");
						break;
					}else {
						System.out.println("Y 혹은 N을 입력해주세요");
					}
		if(cntX==10) {
			System.out.println("예약가능한 좌석이 없습니다.");
			break;
		}
				
		
		}//while	
	}//main
}

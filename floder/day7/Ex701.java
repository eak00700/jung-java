package day7;

import java.util.Random;
import java.util.Scanner;
//고급화//
//1)가위/바위/보 외의 문자열 ---> 제대로 낼 때까지 반복.
//2) 몇판을 할지 입력( 홀수 ) --> ex.5판 -->3판을 먼저 이기는 쪽이 최종 승!

public class Ex701 {
	public static void main(String[] args) {
		Random rd = new Random(); //Random 객체 생성,
		Scanner sc = new Scanner(System.in); // Scanner 객체생성
		String[] arr = {"가위","바위","보"};
		//1)변수 idx <-----0, 1, 또는 2 (난수발생)
		int idx = rd.nextInt(3); // "0이상 3미만"의 정수 하나를 골라줌.(난수발생)
		
		
		System.out.print("판수 입력: ");
		int round = sc.nextInt();
		int score=0;;
		int score1=0;
		//2)String com <---- arr[idx]
		while(true) {
			System.out.print("가위, 바위, 보 입력: ");
			String player = sc.next(); // 또는 sc.nextLine();
			idx = rd.nextInt(3);
			String com = arr[idx];
	//		System.out.println("player : "+ player);
	//		System.out.println("com : "+com);
				if(!(player.equals("가위")|| player.equals("바위")||player.equals("보"))) {
					System.out.println("가위/바위/보 중에 입력해주세요");
					continue;
				}
			
				if( (player.equals("가위")&&com.equals("보"))
					|| (player.equals("바위")&&com.equals("가위"))
					|| (player.equals("보")&&com.equals("바위"))) {
					System.out.println("player : "+player+", com : "+com+"---> player승리!");
					score++;
				}else if((player.equals("가위")&&com.equals("가위"))
						||(player.equals("바위")&&com.equals("바위"))
						||(player.equals("보")&&com.equals("보"))) {
					System.out.println("비겻습니다.");
				}else if((player.equals("가위")&&com.equals("바위"))
						||(player.equals("바위")&&com.equals("보"))
						||(player.equals("보")&&com.equals("가위"))){
					System.out.println("player : "+player+", com : "+com+"---> player패배!");
					score1++;
				}
				if(score==round-2) {
					System.out.println("player 최종 승리!");
					break;
				}else if(score1==round-2) {
					System.out.println("com 최종 승리!");
					break;
				}
			}//while
			
		}//main

}

package day4;

import java.util.Scanner;

//점수(0~100)를 입력받은 후, 해당 학점(A,B,C,D,F)를 출력 
public class Ex403 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
			while(true) {
				if(score >=90 && score <=100) {
					System.out.println("A학점");
				}else if(score >=80 && score <90) {
					System.out.println("B학점");
				}else if(score >=70 && score <80) {
					System.out.println("C학점");
				}else if(score >=60 && score <70) {
					System.out.println("D학점");
				}else if(score <60 && score >0) {
					System.out.println("F학점");
				}else{
					System.out.print("성적을 다시 입력해주세요: ");
					score = sc.nextInt();
					continue;
				}
				break;
			}//while
		}//main
	}



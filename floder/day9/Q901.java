package day9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 실행결과의 예
 * 		몇 과목인가요? 4 (엔터)
 * 		4 과목의 점수를 하나 씩 입력하세요 : 80 엔터
 * 		90 엔터
 * 		100 엔터
 * 		70 엔터
 * 		-> 입력한 점수 : [80,90,100,70]
 * 		-> 총점 : 340점
 * 		-> 평점 85점.
 * */
public class Q901 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇과목인가요? ");
		int a = sc.nextInt();
		int[] arr= new int[a];
		int sum = 0;
		int avg = 0;
		System.out.print(a+"과목의 점수를 입력해주세요");
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = sc.nextInt(); //입력받아서 각 방안에다가 하나씩 채워 넣음
			sum += arr[i];
		}
		avg = sum/a;
		System.out.println("입력한점수 : "+Arrays.toString(arr));
		System.out.println("총점 : "+sum);
		System.out.println("평균 :"+avg);
		
	}

}

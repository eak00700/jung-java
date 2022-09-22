package day12;

import java.util.Arrays;
import java.util.Scanner;

//고급연습4. 배열을 하나 만든 후,
//arr1 : [1, 3, 2, 4, 5]
//사용자로부터 입력받은 값을 네 번째 요소에 추가.
//아래와 같은 실행결과가 되도록 코드를 작성하세요.
//int[] arr1 = /* 여기에 작성 */ ;
//
///* 여기에 작성 */
//
//sysout("arr2 : " + Arrays.toString(arr2));
//
///* 여기에 작성 */
//
//sysout("arr1 : " + Arrays.toString(arr1));
//
//(실행결과)
//네 번째 요소에 추가할 숫자 입력 : 7 (엔터)
//arr2 : [1, 3, 2, 7, 4, 5]
//arr1 : [1, 3, 2, 7, 4, 5]
//
public class Q1204 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,2,4,5};

		/*
		 * 
		 */
		
		System.out.println(Arrays.toString(arr1));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번째요소에 추가하시겠습니까?");
		
		int num = sc.nextInt();
		
		System.out.print(num+" 번째 요소에 추가할 숫자 입력: ");
		int num1 = sc.nextInt(); 
		int[] arr2 = new int[6];
		for(int i=0; i<=arr2.length-1; i++) {
			if(i==num-1) {
				arr2[i] = num1;
			}else if(i>=num) {
				arr2[i] = arr1[i-1];
			}else {
				arr2[i] = arr1[i];
 			}
		}
		System.out.println(Arrays.toString(arr2));
		
	}

}

package day12;

import java.util.Arrays;

//고급연습3. 배열을 하나 만든 후,
//arr1 : [1, 3, 2, 4, 5]
//아래와 같은 실행결과가 되도록 코드를 작성하세요.
//
//int[] arr1 = /* 여기에 작성 */ ;
//int delIndex = 2;    // 세 번째 요소를 삭제하려 함.
//
///* 여기에 작성 */
//
//sysout("arr2 : " + Arrays.toString(arr2));
//
//(실행결과)
//arr2 : [1, 3, 4, 5]
public class Q1203 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,2,4,5};
		int delIndex = 2;
		int[] arr2 = new int[4];
		for(int i=0; i<=arr2.length-1; i++) {
			
			if(i>=delIndex) {
				arr2[i]=arr1[i+1];
				}else {
				arr2[i] = arr1[i];
				}
			}
		
		System.out.println("arr2 : "+Arrays.toString(arr2));
	}

}

package day12;

public class Ex1203 {
	 public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		//1)
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		//2)
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print("[");
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j]);
				if(j != arr[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			System.out.println();
		}
		//3)
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print("[");
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j]=arr[i][j]*10;
				System.out.print(arr[i][j]);
				if(j != arr[i].length-1) {
					System.out.print(", ");
				}
				
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println();
		//4)
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println("모든요소의 합 : "+sum);
		//5)
		int avg = 0;
		int cnt = 0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				cnt++;
			}
		}
		avg = sum/cnt;
		System.out.println("모든 요소의 평균 : "+avg);
		//6)
		int max = arr[0][0];
		int min = arr[0][0];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
				if(min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("최대 값 : "+ max);
		System.out.println("최소 값 : "+ min);
	}//main

}

package day11;

public class test3 {
	public static void main(String[] args) {
		int[] arr = {15 , 2 , 1 , 7};
		for(int i=0; i<=arr.length-2; i++) {
			//1) 최소 값의 인덱스를 구함(idx)
			int idx = 0; // 첫번째 요소가 최소 값이라고 가정하고 시작
				for(int j=i; j<= arr.length-1; j++) {
					if(arr[idx] > arr[j]) {
						idx = j;
					}
			}
			//2) arr[i]랑 arr[idx]를 서로 교환
			int t = arr[i];
			arr[i] = arr[idx];
			arr[idx] = t;
		}
	}

}

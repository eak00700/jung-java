package day15;

import java.util.Arrays;

public class Q1505 {
    public static int max4(int[] arr) {
        int max = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i=0; i<=arr.length-1; i++){
            arr[i] = (int)(Math.random()*9)+1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max4(arr));
    }
    
}

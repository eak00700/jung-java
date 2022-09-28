package day14;

import java.util.Scanner;

public class Q1401 {
    static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int a = sc.nextInt();
        isEven(a);
        if(isEven(a)){
            System.out.println("짝수임!");
        }else{
            System.out.println("홀수임!");
        }


    }
    
}

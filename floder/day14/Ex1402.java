package day14;

public class Ex1402 {
    static int plus(int a, int b){
        return a+b;
    }
    static void printSum(int a){
        System.out.println("합계 : "+a);
    }
    static void something(){
        System.out.println("~~~");
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        printSum(plus(a,b));
        // printSum(something());
    }
    
}

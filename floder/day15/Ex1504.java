package day15;

public class Ex1504 {
    // F1 = F2 = 1
    // ---------> fibo(1) = fibo(2) = 1;
    // Fn = Fn-1 +Fn-2
    // ---------> fibo(n) = fibo(n-1)+fibo(n-2);
    static int fibo(int n){ // n : 항번호.(ex.1 = 첫번째 항)
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++){
            System.out.print(fibo(i) + " ");
        }
    }
    
}

package day15;

public class Ex1502 {
    public static int fact(int a) {
        if(a==1){
            return 1;
        }
       return a * fact(a-1);
    }

    public static void main(String[] args) {
        System.out.println("4! : "+ fact(4));
        System.out.println("5! : "+ fact(5));
    }
    
}

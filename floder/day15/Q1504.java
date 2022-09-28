package day15;

public class Q1504 {
    public static int max3(int a, int b, int c){
        if( a >= b && b>= c  ) return a;
        else if(b>= a && b >= c) return b;
        else return c; 
    }
    public static void main(String[] args) {
        int n1 = (int)(Math.random()*9)+1;
        int n2 = (int)(Math.random()*9)+1;
        int n3 = (int)(Math.random()*9)+1;
        

        System.out.println(max3(n1,n2,n3));
    }
    
}

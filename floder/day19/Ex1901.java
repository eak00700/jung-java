package day19;

class AA{
    void m(){}
    public String toString(){
       return "(AA객체)"; 
    }
}

public class Ex1901 {
    public static void main(String[] args) {
        
        AA obj = new AA();
        obj.toString(); // 우리가 정의하지 않아도 toString()이 객체 안에 있음을 확인!
        System.out.println(obj);
        System.out.println(obj.toString());
        
        int[] arr = {10, 20 , 30};
        System.out.println(arr);
        System.out.println(arr.toString());
    }
    
    
}

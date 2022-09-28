package day16;

public class SungJuck {
    String subject;
    void sungjuck(int n){
        if(n > 90){
            System.out.println(subject+"는 : A");
        }else if(n>80){
            System.out.println(subject+"는 : B");
        }else if(n>70){
            System.out.println(subject+"는 : C");
        }else{
            System.out.println(subject+"는 : F");
        }
    }
    
}

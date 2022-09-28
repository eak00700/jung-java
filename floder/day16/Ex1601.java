package day16;
//지역변수 : 그'지역(local)'에서만 사용가능한 변수
//          ---->"지역변수의 유효범위(scope)"
//예를들어
//1. 메서드의 파리미터 ---> 해당 메서드의 중괄호{} 안에서만 살아있음.
//2. for문의 괄호()안에서 선언 ---> 해당for문안에서만 살아있음.
//3. if문의 중괄호{} 안에서 선언되면 ---> 해당 if문의 중괄호{} 안에서만 살아있음.
public class Ex1601 {
    static void m(int num){ // num -> 파라미터
        System.out.println(num);
        
    }
    public static void main(String[] args) {
        m(5);
        for(int i=1; i<=5; i++){
            System.out.println(i + " ");
        }
        // System.out.println("i : "+ i); // ERR. i는 for문 안에서의 변수이기때문에 for문을 나와서는 선언된적이 없기때문에 에러
        if(1==1){
            int num = 55;
            
        }
        // System.out.println("num : "+ num); // ERR. if문을 나왔기때문에 num변수가 선언되지 않음
    }
    
}

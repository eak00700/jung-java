package day14;

import javax.sql.rowset.spi.SyncResolver;

public class Ex1401 {
    //메서드정의 : "static 리턴타입 메서드이림(파타미터값)" 
    //메서드에서 값(리턴값)을 리턴 : "return 값;"
    static int m(int a){ //int --->"리턴타입" : "리턴값" 의 데이터 타입.
       if(a>10){
        //1을 되돌려주고(return).
        return 1; //1) 메서드의 실행을 종료 2)메서드 호출표현을 1로 바꿈.
       }else{
        //-1을 되돌려주고(return). --->'메서드 호출 표현'을 '리턴값'으로 바꿔줌.
        return -1; //1) 메서드의 실행을 종료 2)메서드 호출표현을 -1로 바꿈.
       }
    } 
    public static void main(String[] args) {
       System.out.println(m(55));//리턴값 1을 받는다.
                //"m(55)" --->(메서드 호출 표현) 이라고 부를게요
        System.out.println(m(5)); // 리턴값 -1을 받는다
                //"m(5)" --->(메서드 호출 표현)이라고 부를게요.
                int n = m(5) * 2;
                System.out.println(n);
            }//main
    
}

package day18;

import java.util.ArrayList;
import java.util.Scanner;


class Member{
    String id, name, phone, password;
    int idx;
    
    
    Member(String id, String name, String phone, String password, int idx) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.idx = idx;


    }
    
}

public class Q1801 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Member> user = new ArrayList<Member>();
    static int idx=0;
    static void showAllUser(){
       
    }
    static void registerUser(){
        user.add(new Member(sc.next(), sc.next(), sc.next(), sc.next(), ++idx));
    }
    static void searchUserById(){

    }
    static void deleteUserByIdx(){

    }
   
    public static void main(String[] args) {
         // ---------------------
    // 1. 전체회원조회
    // 2.회원등록
    // 3.회원검색
    // 4.회원삭제
    // 0.종료
    // --------------------
    // 실행할 메뉴 입력 >>> 
    
   
    Member member;
        while(true){
        
    }
    
    }
}

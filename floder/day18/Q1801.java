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
    static void showMenu(){
        System.out.println("----------------------------");
        System.out.println("1.전체회원조회");
        System.out.println("2.회원등록");
        System.out.println("3.회원검색");
        System.out.println("4.회원삭제");
        System.out.println("0.종료");
        System.out.println("----------------------------");
        
    }
    static void showAllUser(){
        for(int i=0; i<user.size();i++){
            System.out.println("인덱스 번호 : "+user.get(i).idx);
            System.out.println("아이디 : "+user.get(i).id);
            System.out.println("이름 : "+user.get(i).name);
            System.out.println("전화번호 : "+user.get(i).phone);
            System.out.println("비밀번호 : "+user.get(i).password);

        }
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
            showMenu();
            System.out.print("실행할 메뉴 입력 >>");

        
    }
    
    }
}

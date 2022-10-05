package day18;

import java.util.ArrayList;
import java.util.Scanner;


class Member{
    String id, name, phone;
    int password;
    int idx;
    
    
    Member(String id, String name, String phone, int password, int idx) {
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
        System.out.print("아이디를 입력해주세요 >> ");
        String id = sc.next();
        System.out.print("이름을 입력해주세요 >> ");
        String name = sc.next();
        System.out.print("전화번호를 입력해주세요 >> ");
        String phone = sc.next();
        System.out.print("비밀번호를 입력해주세요 >> ");
        int password = sc.nextInt();
        user.add(new Member(id,name,phone,password, ++idx));
    }
    static void searchUserById(){
        System.out.print("검색할 아이디를 입력해 주세요 >>");
        String s = sc.next();
        for(int i=0; i<user.size(); i++){
            if(s.equals(user.get(i).id)){
                System.out.println(user.get(i).id);
                System.out.println(user.get(i).name);
                System.out.println(user.get(i).password);
                System.out.println(user.get(i).phone);
            }
        }

    }
    static void deleteUserByIdx(){
        System.out.print("삭제할 유저의 Idx번호를 입력해주세요 >>");
        int s = sc.nextInt();
        if(s<user.size()){
            user.remove(user.get(s));
        }

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
    user.add(new Member("asdf","yaho", "010-1111-1111", 1234, idx));
    Member member;
        while(true){
            showMenu();
            System.out.print("실행할 메뉴 입력 >>");
            int menu = sc.nextInt();
            switch(menu){
                case 1: showAllUser(); break;
                case 2: registerUser(); break;
                case 3: searchUserById(); break;
                case 4: deleteUserByIdx(); break;

            }
            if(menu == 0){
                System.out.println("종료하겠습니다.");
                break;
            }

        
    }
    
    }
}

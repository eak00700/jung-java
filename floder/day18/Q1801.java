package day18;

import java.util.ArrayList;
import java.util.Scanner;


class Member{
    String id, name, phone, password;
    int idx;
}
public class Q1801 {
    static void showAllUser(){

    }
    static void registerUser(){

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
    Scanner sc = new Scanner(System.in); 
    ArrayList<Member> user = new ArrayList<Member>();
    int idx=0;
    Member member;
        while(true){
            System.out.println("-----------------------");
            System.out.println("1.전체회원조회");
            System.out.println("2.회원등록");
            System.out.println("3.회원검색");
            System.out.println("4.회원 삭제");
            System.out.println("0.종료");
            System.out.println("--------------------------");
            
            System.out.print("실행할 메뉴 입력 >>>");
            int menu = sc.nextInt();
            if(menu == 1){
                for(int i=0; i<user.size(); i++){
                    System.out.print(user.get(i).idx);
                    System.out.print("\t");
                    System.out.print(user.get(i).id);
                    System.out.print("\t");
                    System.out.print(user.get(1).name);
                }
            }else if(menu ==2 ){
             
                  member=new Member();
                  member.idx = ++idx;
                  member.id=sc.next();
                  member.name=sc.next();
                  member.password = sc.next();
                  member.phone = sc.next();
                  user.add(member);
            }else if(menu == 3){
                
                
            }
                
        
    }
    
    }
}

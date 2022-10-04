package day18;

import java.util.ArrayList;
import java.util.Scanner;

/*2. 성적관리 프로그램
	Score클래스 + ArrayList<Score>
	class Score {
		이름, 학번, 자바점수, C점수, 파이썬점수, ...
	}
*/
class Sungjuck{
    String name;
    int Jscore,Cscore,Pscore, num;
    public Sungjuck(String name, int num, int jscore, int cscore, int pscore) {
        this.name = name;
        this.num = num;
        Jscore = jscore;
        Cscore = cscore;
        Pscore = pscore;
    }
    void print(){
        System.out.print("이름 : "+name+"\t");
        System.out.print("학번 : "+num+"\t");
        System.out.print("자바점수 : "+Jscore+"\t");
        System.out.print("파이썬 점수 : "+Pscore+"\t");
        System.out.print("C언어 점수 : "+Cscore);
        System.out.println();
    }

    
}
public class Q1802 {
    static ArrayList<Sungjuck> list = new ArrayList<Sungjuck>();
    static Scanner sc = new Scanner(System.in);

    static void showMenu(){
        System.out.println("----------------------------");
        System.out.println("1.전체학생성적조회");
        System.out.println("2.성적등록");
        System.out.println("3.성적검색");
        System.out.println("4.성적삭제");
        System.out.println("0.종료");
        System.out.println("----------------------------");
    }
    static void showAllSungjuck(){
        for(int i=0; i<list.size(); i++){
            list.get(i).print();
            // System.out.print("이름 : "+list.get(i).name+"\t");
            // System.out.print("학번 : "+list.get(i).num+"\t");
            // System.out.print("자바점수 : "+ list.get(i).Jscore1+"\t");
            // System.out.print("파이썬 점수 : "+list.get(i).Pscore+"\t");
            // System.out.print("C언어 점수 : "+list.get(i).Cscore);
        }

    }
    static void registerSungjuck(){
        System.out.print("이름을 입력해 주세요 >> ");
        String name = sc.next();
        System.out.print("번호를 입력해주세요 >> ");
        int num = sc.nextInt();
        System.out.print("자바 점수를 입력해주세요 >> ");
        int Jscore = sc.nextInt();
        System.out.print("파이썬 점수를 입력해주세요 >> ");
        int Pscore = sc.nextInt();
        System.out.print("C언어 점수를 입력해주세요 >> ");
        int Cscore = sc.nextInt();
        list.add(new Sungjuck(name, num, Jscore, Cscore, Pscore));


    }
    static void serachSungjuckByName(){
        System.out.print("검색할 이름을 입력해 주세요 >>");
        String name = sc.next();
        for(int i=0; i<list.size(); i++){
            if(name.equals(list.get(i).name)){
              list.get(i).print();
              break;
            }else{
                System.out.println("존재하지 않는 이름입니다.!");
            }

        }

    }
    static void deleteSungjuckByName(){
        System.out.print("삭제할 이름을 입력해 주세요 >> ");
        String name = sc.next();
        for(int i=0; i<list.size(); i++){
        if(name.equals(list.get(i).name)){
            list.remove(list.get(i));
        }
    }
    }
public static void main(String[] args) {
    list.add(new Sungjuck("민준성", 1, 100, 100, 100));
    list.add(new Sungjuck("이태현", 2, 99, 99, 99));
    list.add(new Sungjuck("김진렬", 3, 98,98, 98));
    while(true){
        showMenu();
        System.out.print("실행할 메뉴를 입력해주세요 >>");
        int menu = sc.nextInt();
        if(menu == 0){
            System.out.println("종료합니다.");
            break;
        }
        switch(menu){
            case 1: showAllSungjuck(); break;
            case 2: registerSungjuck(); break;
            case 3: serachSungjuckByName(); break;
            case 4: deleteSungjuckByName(); break;
        }
    }
}
    
}

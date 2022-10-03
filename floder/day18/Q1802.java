package day18;

import java.util.ArrayList;

/*2. 성적관리 프로그램
	Score클래스 + ArrayList<Score>
	class Score {
		이름, 학번, 자바점수, C점수, 파이썬점수, ...
	}
*/
class Sungjuck{
    String name, num;
    int Jscore,Cscore,Pscore;
    public Sungjuck(String name, String num, int jscore, int cscore, int pscore) {
        this.name = name;
        this.num = num;
        Jscore = jscore;
        Cscore = cscore;
        Pscore = pscore;
    }

    
}
public class Q1802 {
    static ArrayList<Sungjuck> list = new ArrayList<Sungjuck>();

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

        }

    }
    static void registerSungjuck(){

    }
    static void serachSungjuckByName(){

    }
    static void deleteSungjuckByName(){

    }

    
}

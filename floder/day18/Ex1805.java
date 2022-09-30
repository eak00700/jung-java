package day18;

import java.util.ArrayList;
import java.util.Scanner;

class Coffee{
    String name;
    int price;

    Coffee(String n, int p){
        name = n;
        price = p;
    }
    void print(){
        System.out.println(name + "("+price+"원)");
    }
}

public class Ex1805 {
    //static : 일단은,      //main()을 포함하고 있는 클래스를 작성할 때의 이야기
    //          main()에서 직접 호출할(사용할) 메서드는 static을 붙여야 함.
    //          main()에서 직접 사용할 변수는 static을 붙여야함
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Coffee> list = new ArrayList<Coffee>();
    static void showAllCoffees(){
        for(int i=0; i<list.size(); i++){
            //이해 list.get(i)가 "Coffee객체의 참조값"을 의미함.
            System.out.print(i+" ");
            list.get(i).print();
        }

    }
    static void registerCoffee(){
        System.out.print("커피 이름을 입력해주세요 >>");
        String s = sc.next();
        System.out.println("커피 가격을 입력해주세요 >>");
        int n = sc.nextInt();
        list.add()
        Coffee coffee = new Coffee(s, n);

    }
    static void searchCoffeeByName() {
        System.out.print("커피 이름을 입력해 주세요 >> ");
        String s = sc.next();
        for(int i=0; i<list.size(); i++){
        if(s.equals(list.get(i).name)){
            list.get(i).print();
            break;
        }
        }
    }
    static void deleteCoffeeByIndex(){
        System.out.print("인덱스 번호를 입력해주세요");
        int i = sc.nextInt();
        list.remove(list.get(i));
        

    }
    static void showMenu(){
        System.out.println("-------------------------");
        System.out.println("1.전체커피메뉴조회");
        System.out.println("2.커피등록");
        System.out.println("3.커피검색");
        System.out.println("4.커피삭제");
        System.out.println("0. 종료");
        System.out.println("--------------------------");

    }

    public static void main(String[] args) {
        //testing
        //이햐 : list.add(Coffee객체의 참조값); <-- 왜 이렇게 할까?
        list.add(new Coffee("아메리카노", 2000));
        list.add(new Coffee("콜드브루", 2500));

        while(true){
            showMenu();
            System.out.print("메뉴 선택 >>");
            int menu = sc.nextInt();
            if(menu ==0){
                System.out.println("종료합니다.");
                break;
            }
            switch(menu) {
            case 1: showAllCoffees(); break;
            case 2: registerCoffee(); break;
            case 3: searchCoffeeByName(); break;
            case 4: deleteCoffeeByIndex(); break;
            }//switch
        }//while

    }//main
    
}

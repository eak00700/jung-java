package day17;

class AA{
    int num;
}
public class Ex1704 {
    public static void main(String[] args) {
        AA obj = new AA(); // obj --> "참조변수"
                            // 참조변수는 "참조값"을 저장할 수 있는 변수.
                            //"AA obj" ----> AA객체의 "참조값"을 저장할 수 있는
                            //obj라는 이름의 변수를 선언함.
        //[8행]의 실행결과 ---> 참조변수 obj에는 AA객체의 참조값이 대입됨(이해)
        obj.num = 5;
        int num = 5;
    }
    
}

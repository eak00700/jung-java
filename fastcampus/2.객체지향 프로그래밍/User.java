public class User {
    int idx, PhoneNumber;
    String Name, Address, Id, Password;
    
    void info(){
        System.out.println("회원번호 : "+idx);
        System.out.println("전화번호 : "+PhoneNumber);
        System.out.println("이름 : " +Name);
        System.out.println("주소 : " +Address);
        System.out.println("아이디 : "+ Id);
        System.err.println("비밀번호 : " +Password);
    }
}

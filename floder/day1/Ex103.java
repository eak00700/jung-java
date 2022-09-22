package day1;

//0.1을 100번 더하면?
//0.0 이라고 표현하면 ----> double 타입의 값.
//0.0f 라고 표현하면 -----> float타입의 값.
//0이라고 표현하면 -----> (보통은) int 타입의 값.
public class Ex103 {
	public static void main(String[] args) {
		 float num = 0.0f;
		//float num = 0; // 자동 형 변환 진행중(float -> int)
		//float num = 0.0; //ERR(이해) 0.0은 double타입으로작성됨
		//double num = 0.0f; //자동 형 변환 진행중(float -> double)
		for(int i=1; i<=100; i++) {
			
			num += 0.1; //+= '편의성'을 제공해서 자동으로 0.1을 float로 생성함.
			
			//num = num + 0.1; //ERR(이해) (num = float, 0.1 = double)
			
		}
		System.out.println(num);
	}

}

package datatype01;

public class constantVariable {
		///final double PI;//[x]
			///클래스 안에서 상수를 선언할 때는 반드시 선언과 동시에 초기화 해야한다.
			///final int PI : 상수 선언 대문자로 표현
		static final double PI=3.14; //[o]
		//프로그램의 가독성을 높이기 위한 상수 선언
		static final int SCISSORS=1;
		static final int ROCK    =2;
		static final int PAPER   =3;
		
		public static void main(String[] args) {
			System.out.println(PI);
			///PI=3.141592653589793;[x]
			///모든 상수는 프로그램 중간에 값 변경 불가
			final String NICKNAME;
			///System.out.println(NICKNAME);초기화 하지 않음
			/// 메소드(지역) 안에서 상수를 선언할때는 초기화를 사용전에만 해주면 된다.
			/// 주로 클래스 안에서 상수 선언함 - 메소드(지역) 안에서는 상수선언을 안함
			NICKNAME = "한소인";
			System.out.println(NICKNAME);
			///NICKNAME = "자바" 상수기 때문에 변경 불가
			int computer=1, user=2;
			System.out.println("컴퓨터 LOSE:가독성이 낮다");
			computer = SCISSORS;
			user = ROCK;
			System.out.println("컴퓨터 LOSE:가독성이 높다");
		}
}
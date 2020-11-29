import java.util.Scanner;

public class JoenStar {
	//멤버변수]
	static String name = "별";
	static String drinking = "제로콜라";	
	
	public JoenStar() {
		
	}
	
	//메소드 1방식] 매개변수 없고 반환값도 없음
	public static void sleep() {
		System.out.println("별이는 쉬는시간에 바쁘다");
	}
	//메소드 2방식] 매개변수는 있지만 반환값은 없음
	public static void like(String name,String drinking) {
		System.out.println(String.format("%s이는 %s를 좋아한다",name,drinking));		
	}
	//메소드 3방식] 매개변수는 없지만 반환값은 있음
	public static String gamescore() {
		Scanner sc = new Scanner(System.in);
		String[] games = {"포켓몬스터", "한컴타자","카드뒤집기"};
		int[] score = new int[3];
		int total = 0;
		for(int i=0; i<score.length; i++) {
			System.out.println(games[i]+"점수입력?");
			score[i] = sc.nextInt();
			total += score[i];
		}
		String value;
		switch(total/30) {
			case 10:
			case 9: 
				value = "A등급"; break;
			case 8:
				value = "B등급"; break;
			case 7:
				value = "C등급"; break;
			case 6:
				value = "D등급"; break;
			default : value = "F등급";
		}
		return value;
	}
	//메소드 4방식] 매개변수도 있고 반환값도 있음
//	public {
//		
//	}
	
	public static void main(String[] args) {
		//메소드 1방식 호출]
		sleep();
		//메소드 2방식 호출]
		like(name,drinking);
		//메소드 3방식 호출]
		String value = gamescore();
		System.out.println("과연 별이의 등급은!?");
		System.out.println(value);
	}

}

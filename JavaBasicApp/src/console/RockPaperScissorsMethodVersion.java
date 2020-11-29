package console;

import java.util.Scanner;

import common.utility.CommonUtilities;

/*
 Math클래스의 random()메소드:
 0.0사이에서 1.0 사이의 double형 
 
 특정 범위의 숫자를 랜덤하게 발생시키려면
 */
public class RockPaperScissorsMethodVersion {
	//상수 정의]
	public static final int SCISSORS = 1;
	public static final int ROCK = 2;
	public static final int PAPER = 3;
	
	//메뉴 출력용 메소드]
	static void printMenu() {
		System.out.println("=============메뉴 번호=============");
		System.out.println("1.가위 2.바위 3.보 4.메뉴 다시보기 9.종료 ");
		System.out.println("=================================");
	}
	//숫자를 랜덤하게 발생시키는 메소드
	static int getComputerNumber(int start, int end) {
		return (int)(Math.random()*(end-start+1))+start;
	}
	//사용자 숫자 입력받아서 반환하는 메소드]
	static int getUserNumber() {
		Scanner sc = new Scanner(System.in);
		String menuNumber;
		while(true) {
		System.out.println("메뉴 번호 입력하세요");
		//return sc.nextInt();
		menuNumber = sc.nextLine();
		if(!CommonUtilities.isNumber(menuNumber))
				System.out.println("메뉴번호는 숫자만..");
		else//숫자 형식인 경우
			break;
		}
		return Integer.parseInt(menuNumber);
	}
	//게임 승리 여부 판단 후 결과 출력하는 메소드
	static void printGame(int user, int computer) {
		System.out.printf(("[컴퓨터: %s, 사용자: %s]"),getStringValue(computer),getStringValue(user));
			
		if(user == SCISSORS && computer == ROCK || 
		   user == ROCK && computer == PAPER ||
		   user == PAPER && computer == SCISSORS)
			System.out.println("당신이 졌어요");
		else if(user == computer) System.out.println("비겼어요");
		else System.out.println("당신이 이겼어요");
	}
	//상수값에 따라 문자열을 반환하는 메소드
	static String getStringValue(int menuNumber) {
		switch(menuNumber) {
			case SCISSORS : return "가위";
			case ROCK : return "바위";
			default : return "보";
		}
	}
	
	
	public static void main(String[] args) {

		//4~8사이의 숫자랜덤하게 발생
		//시작 :4, 끝:8, 차이값:4
		//System.out.println((int)(Math.random()*5)+4);
		//1]메뉴출력
		printMenu();
		while(true) {
		
		//2]컴퓨터 숫자 랜덤하게 발생
		int computer = getComputerNumber(1,3);
		System.out.println("컴퓨터:"+ computer);
		//3]사용자 숫자 입력받기
		int user = getUserNumber();
		//3-1]게임종료 여부
		if(user == 9) {
			System.out.println("다음에 또봐요!!");
			break;
		}
		else if(user==4) {
			printMenu();
			continue;
		}
		else if(!(user >=1 && user <=4 || user == 9)) {
			System.out.println("메뉴에 없는 번호 입니다");
			continue;
		}
		//4]게임 승리 여부판단 후 결과 출력
		printGame(user,computer);
		}
		System.out.println("즐거웠죠?");
	}

}

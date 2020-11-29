package console;

import java.util.Scanner;

/*
Math클래스의 random()메소드:
0.0사이에서 1.0 사이의 double형 

특정 범위의 숫자를 랜덤하게 발생시키려면
*/

public class RPSMethodVersionP01 {
	//상수 정의]
	public static final int ROCK = 1;
	public static final int SCISSORS =2;
	public static final int PAPER =3;
	//메뉴 출력용 메소드]
	static void printMenu() {
		System.out.println("=================메뉴선택=================");
		System.out.println("1.바위 2.가위 3.보 4.메뉴 다시보기 9.종료");
		System.out.println("========================================");
	}////printMenu
	
	//숫자를 랜덤하게 발생시키는 메소드
	static int getRandomComNumber(int start, int end) {
		return (int) (Math.random()*(end-start+1))+start;
		
	}///getRandomComNumber
	//사용자 숫자 입력받아서 반환하는 메소드]
	static int getRandomUserNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴번호를 입력하세요");
		return sc.nextInt();
		
	}/////getRandomUserNumber
	//게임 승리 여부 판단 후 결과 출력하는 메소드
	static void printGame(int user, int computer) {
		System.out.printf("[컴퓨터 : %s, 사용자 : %s]", getStringValue(computer), getStringValue(user));
		if(user == ROCK && computer == PAPER ||
		   user == SCISSORS && computer == ROCK ||
		   user == PAPER && computer == SCISSORS)
			System.out.println("졌습니다");
		else if(user == computer) System.out.println("비겼습니다");
		else System.out.println("이겼습니다");
	}///printGame
	
	//상수값에 따라 문자열을 반환하는 메소드
	static String getStringValue(int menuNumber) {
		switch(menuNumber) {
			case ROCK : return "바위";
			case SCISSORS : return "가위";
			default : return "보";
		}///switch
	}////getStringValue
	
	
	
	
	public static void main(String[] args) {
	//4~8사이의 숫자랜덤하게 발생
		//시작 :4, 끝:8, 차이값:4
		//System.out.println((int)(Math.random()*5)+4);
		//1]메뉴출력
		printMenu();
		
		while(true) {
			//2]컴퓨터 숫자 랜덤하게 발생
			int computer = getRandomComNumber(1, 3);
			System.out.println("컴퓨터 : " + computer);
			//3]사용자 숫자 입력받기
			int user = getRandomUserNumber();
			System.out.println("사용자 : " + user);
			//3-1]게임종료 여부
			if(user == 9) {
				System.out.println("종료");
				break;
			}////if
			else if(user == 4) {
				printMenu();
				continue;
			}////else if
			else if(!(user>=1 && user<=4 || user ==9)) {
				System.out.println("메뉴에 없는 번호");
				continue;
			}////else if
			printGame(user, computer);
		}/////while
			//4]게임 승리 여부판단 후 결과 출력
			System.out.println("즐거웠나요");
			


	}///////main

}/////////class

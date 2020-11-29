package console;

import java.util.Scanner;

/*
 Math클래스의 random()메소드:
 0.0사이에서 1.0 사이의 double형 
 
 특정 범위의 숫자를 랜덤하게 발생시키려면
 */
public class RockPaperScissors {
	//상수 정의]
	public static final int SCISSORS = 1;
	public static final int ROCK = 2;
	public static final int PAPER = 3;
	
	public static void main(String[] args) {

		//4~8사이의 숫자랜덤하게 발생
		//시작 :4, 끝:8, 차이값:4
		//System.out.println((int)(Math.random()*5)+4);
		Scanner sc = new Scanner(System.in);
		while(true) {
		//1]메뉴 출력
		System.out.println("=============메뉴 번호=============");
		System.out.println("1.가위 2.바위 3.보 9.종료 ");
		System.out.println("=================================");
		//2]컴퓨터 숫자 랜덤하게 발생
		int computer =(int)(Math.random()*3)+1;
		System.out.println("컴퓨터:"+ computer);
		//3]사용자 숫자 입력받기
		System.out.println("메뉴 번호 입력");
		int user = sc.nextInt();
		
		if(user == 9) break;
		//4]승리 여부 판단
		String userString = user == SCISSORS?"가위": user == ROCK?"바위" :  "보";
		String computerString = computer == SCISSORS?"가위": computer == ROCK?"바위" : "보";
		System.out.printf("[컴퓨터:%s,사용자:%s]", computerString, userString);
		if(user == SCISSORS && computer == ROCK || 
		   user == ROCK && computer == PAPER ||
		   user == PAPER && computer == SCISSORS)
			System.out.println("당신이 졌어요");
		else if(user == computer) System.out.println("비겼어요");
		else System.out.println("당신이 이겼어요");
		}
		System.out.println("즐거웠죠?");
	}

}

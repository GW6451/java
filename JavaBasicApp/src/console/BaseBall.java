package console;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class BaseBall {
	
	public static void setRandomNumber(int[] random, int start, int end) {
		for(int i=0; i<random.length; i++) {
			while(true) {
				//랜덤하게 숫자 발생
				int randomNumber = (int)(Math.random()*(end-start+1))+start;
				//랜덤하게 발생시킨 숫자의 중복여부 체크를 위한 변수 선언
				boolean isDuplicated = false;
				//랜덤하게 발생시킨 숫자와 배열(randomNumber)에 저장된 값의 중복여부 체크
				for(int k=0;k<=i-1;k++) {
					if(randomNumber==random[k]) {//중복된 경우
						isDuplicated = true;
						break;
					}
				}//////중복체크용 for문
				if(!isDuplicated) {
					random[i] = randomNumber;
					break;//while문 빠져나가기
				}
				
			}///while
			
			
		}//////for
		
	}///setRandomNumber
	//2.사용자 입력용 메소드]
	private static void setUserNumber(int[] user) {
		Scanner sc = new Scanner(System.in);
		//문] 먼저 입력한 문자열이 숫자 형식인지 아닌지 판단하고 숫자 형식이 아니라면 다시 입력받도록 하여라
		//또한 숫자 형식인 경우에는 3자리만 입력받도록 하고 3자리가 아니면 "숫자는 3자리만 입력하세요"출력하여라
		String userString;
		while(true) {
			System.out.println("세자리를 입력하세요");
			//int userNumber = sc.nextInt();
			userString = sc.nextLine();
			if(!CommonUtilities.isNumber(userString)) {
				System.out.println("메뉴번호는 숫자만..");
				continue;
			}
			else if(userString.length() !=3) {
					System.out.println("세 자리만 입력하세요");
					continue;
			}
				int userNumber = Integer.parseInt(userString);
				user[0] = userNumber/100;
				user[1] = userNumber % 100 /10;
				user[2] = userNumber % 10;
				//for(int i=0; i<=3; i++) {
					//if(user[i]>4) 
						//System.out.println("세자리만 입력하세요");
					//break;
				//}
			//중복여부 판단
			/*if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2]) {
			System.out.println("중복된 숫자가 있어요");
			continue;
			}*/
			
			boolean isDuplicated = false;
			for(int i1=0; i1<user.length-1; i1++) {
				for(int k=i1+1; k<user.length;k++) {
					if(user[i1]==user[k]) {
						isDuplicated=true;
						break;
					}
				}
				if(isDuplicated) break;
			}
			if(isDuplicated ) {
				System.out.println("중복된 숫자가 있어요");
				continue;
			}
			break;
		}
		
	}///setUserNumber
	private static void setStrikeNBall(int[] computer, int[] user, int[] strikeOrBall) {
		
		for(int i=0; i<computer.length;i++) {
			for(int k=0; k<user.length;k++) {
				if(i==k && computer[i] == user[k])
					strikeOrBall[0]++;
				else if(i!=k && computer[i] == user[k])
					strikeOrBall[1]++;
			}
		}
		
	}///setStrikeNBall
	private static void isContinue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하려면 'X'나 'x'\r\n계속하려면 아무키나..");
		String exitCode = sc.nextLine();
		if(exitCode.equalsIgnoreCase("X")) {
			System.out.println("즐거우셨나요? 다음에");
			System.exit(0);//프로그램 종료
		}
	}/////isContinue

	public static void main(String[] args) {
		while(true) {
			//1]랜덤하게 세자리 숫자를 발생시키자(컴퓨터)
			//랜덤하게 발생시킨 숫자를 저장할 1차원 배열 선언
			int[] computer = new int[3];
			setRandomNumber(computer, 1, 9);
			//컴퓨터 숫자 확인하기 위한 출력]
			for(int i=0; i< computer.length; i++)
				System.out.printf("%-3d",computer[i]);
			System.out.println();
			int count = 1;
			while(true) {
			//2]사용자로부터 3자리 숫자를 입력받자
			//사용자 입력숫자를 저장할 1차원 배열선언
			int[] user = new int[3];
			setUserNumber(user);
		
			//3]판단하기 즉 자리(인덱스)가 같고 값이 같으면 스트라이크,
			//자리는 다르고 값만 같으면 볼
			//스트라이크 및 볼값을 저장할 배열 선언
			//0번째 방에는 스트라이크, 1번째 방에는 볼 저장
			int[] strikeOrBall = new int[2];
			setStrikeNBall(computer,user,strikeOrBall);
			//스트라이크/볼 출력
			System.out.printf("%dStrike, %dBall%n",strikeOrBall[0],strikeOrBall[1]);
			if(strikeOrBall[0]==3) {
			System.out.printf("빙고 짝짝짝! %d번만에 맞혔어요. 축하합니다%n",count);
			break;
			}
			count++;
			//4]게임 계속 여부 판단용 메소드 호출
			}/////안쪽 while
			isContinue();
		}///바깥 while
		
	}////////main
	
	


}/////class

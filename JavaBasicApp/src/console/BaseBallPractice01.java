package console;

import java.util.Scanner;

public class BaseBallPractice01 {
	static void setRandomNumber(int[] random, int start, int end) {
		for(int i=0; i<=random.length; i++) {
			while(true) {
				//랜덤하게 숫자 발생
				int randomNum = (int)(Math.random()*(end-start+1))+start;
				//랜덤하게 발생시킨 숫자의 중복여부 체크를 위한 변수 선언
				boolean isDuplicated = false;
				//랜덤하게 발생시킨 숫자와 배열(randomNumber)에 저장된 값의 중복여부 체크
				for(int k=0; k<=i-1;k++) {
					if(randomNum == random[k]) {
						isDuplicated = true;
						break;
					}///if
				}//for
				if(!isDuplicated) {
					random[i] = randomNum;
					break;
				}
			}///while
			
		}///for
		
	}//setRandomnumber
	
	//2.사용자 입력용 메소드]
	public static void setUserNumber(int[] user) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("세자리 입력");
			int userNumber = sc.nextInt();
			user[0] = userNumber / 100;
			user[1] = userNumber & 100 /10;
			user[2] = userNumber / 10;
			//중복여부 판단
			boolean isDuplicated = false;
			for(int i=0;i<= user.length-1; i++) {
				for(int k=i+1; k<=user.length; k++) {
					if(user[i]==user[k]) {
						isDuplicated = true;
						break;
					}
					
				}
				if(isDuplicated) break;
			}
			if(isDuplicated) {
				System.out.println("중복된 숫자");
				continue;
			}
			break;
		}
	}/////setUserNumber
	public static void setStrikeNBall (int[] computer, int[] user, int[] strikeOrBall) {
		for(int i=0; i<computer.length; i++) {
			for(int k=0; k<user.length; k++) {
				if(i==k && computer[i] == user[k])
				strikeOrBall[0]++;
				else if(i!=k && computer[i] == user[k])
					strikeOrBall[1]++;
			
			}
		}
	}
	public static void isContinue () {
		Scanner sc = new Scanner(System.in);
		System.out.println("종료를 원하면 'X'나 'x'를 누르고 계속하려면 아무키나");
		String exitCode = sc.nextLine();
		if(exitCode.equalsIgnoreCase("X")) {
			System.out.println("즐거우셨나요? 다음에");
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {
		while(true) {
			int[] computer = new int[3];
			setRandomNumber(computer, 1,9);
			for(int i=0; i<computer.length;i++) 
				System.out.printf("%-3d", computer[i]);
			System.out.println();
			int count = 1;
			while(true) {
				int[] user = new int[3];
				setUserNumber(user);
				int[] strikeOrBall = new int[2];
				setStrikeNBall(computer, user, strikeOrBall);
				System.out.printf("%dStrike %dBall%n", strikeOrBall[0], strikeOrBall[1]);
				if(strikeOrBall[0]==3) {
					System.out.printf("%d번 만에 맞혔어요. 축하합니다", count);
					break;
				}
				count++;
				isContinue();
			}///안쪽 while
			
		}///바깥쪽 while

	}/////main

}////class

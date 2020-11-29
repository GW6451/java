package console;

import java.util.Scanner;

//지문 1] 6개의 숫자를 저장할 배열 선언 및 메모리 할당
//지문 2] 랜덤 하게 숫자를 발생시켜 배열에  저장하는 메소드 호출
//지문 3] 로또 번호를 출력하는 메소드 호출
//지문 4] 로또 발생 계속 여부를 판단하는 메소드 호출(x나 X입력	시 종료 그외는 계속 로또 번호 출력)
	
	
public class KimYouKyung0819 {
	

	//지문 3] 로또 번호를 출력하는 메소드 호출
		static void printLottoNumber(int[] random) {
		for(int i=0;i<random.length;i++) {
			System.out.printf("%-3d", random[i]);
		}
	}		
	//지문 4] 로또 발생 계속 여부를 판단하는 메소드 호출(x나 X입력	시 종료 그외는 계속 로또 번호 출력)
	static void isContinue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하려면 'X'나 'x'를 누르고 계속하려면 아무키나 누르세요");
		String exitCode = sc.nextLine();
		if(exitCode.equalsIgnoreCase("X")) {
			System.out.println("종료");
			System.exit(0);
		}
	}

	
	public static void main(String[] args) {
		while(true) {
			//지문 1] 6개의 숫자를 저장할 배열 선언 및 메모리 할당
			int[] random = new int[6];
			//지문 2] 랜덤 하게 숫자를 발생시켜 배열에  저장하는 메소드 호출
			BaseBall.setRandomNumber(random, 1, 45);
			System.out.print("로또번호 : ");
			printLottoNumber(random);
			/*for(int i=0;i<random.length;i++) 
				System.out.printf("%-3d", random[i]);*/
			System.out.println();		
			isContinue();
		}///while			
	}//////main
}////////class

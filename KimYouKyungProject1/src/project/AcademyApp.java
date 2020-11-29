package project;

public class AcademyApp {

	public static void main(String[] args) {
		//배열사용]
		AddressProjectLogic logic = new AddressProjectLogic();
		while(true) {			
			//1.메인메뉴 출력
			logic.printMenu();
			//2.메인메뉴 번호 입력
			int mainMenu = logic.getMenuNum();			
			//3.메인메뉴에 따른 분기
			logic.seperateMenu(mainMenu);			
		}

	}//////main

}///////////class

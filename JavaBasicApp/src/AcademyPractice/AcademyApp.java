package AcademyPractice;

public class AcademyApp {

	public static void main(String[] args) {
		//배열사용]
		AcademyLogic logic = new AcademyLogic(); 
		while(true) {
			//1.메인메뉴 출력
			logic.printmainMenu();
			
			//2.메인메뉴 번호 입력
			int MainMenu = logic.getMenuNumber();
			//3.메인메뉴에 따른 분기
			logic.seperatemenuNuber(MainMenu);
	}

	}//////main

}///////////class

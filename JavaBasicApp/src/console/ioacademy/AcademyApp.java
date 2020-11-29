package console.ioacademy;

public class AcademyApp {

	public static void main(String[] args) {
		//컬렉션사용 -파일저장 추가(ObjectInputStream/ObjectOutputStream)사용
		AcademyCollectionObjectLogic logic = new AcademyCollectionObjectLogic();
		while(true) {
			//1.메인메뉴 출력
			logic.printMainMenu();
			//2.메인메뉴 번호 입력
			int mainMenu = logic.getMenuNumber();
			//3.메인메뉴에 따른 분기
			logic.seperateMainMenu(mainMenu);
		}

	}//////main

}///////////class

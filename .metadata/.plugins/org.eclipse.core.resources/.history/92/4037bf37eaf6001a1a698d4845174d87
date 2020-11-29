package AcademyPractice;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class AcademyLogic {
	//멤버 상수]
	public static final int MAX_PERSON = 3;
	//멤버 변수(배열)]
	Person[] person;
	//생성자(배열)]
	public AcademyLogic() {
		person = new Person[MAX_PERSON];
	}
	//멤버 메소드]
	/*
	 * 1]메뉴 출력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : void
	 */
	public void printmainMenu() {
		System.out.println("===================메인 메뉴====================");
		System.out.println("  1.입력  2.출력  3.수정  4.삭제  5.검색  6.파일저장  9.종료");
		System.out.println("=============================================");
		System.out.println("-----------------메인메뉴번호 입력-----------------");
	}///printmainMenu
	/*
	 * 2]메뉴 번호 입력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : int
	 */
	/*문]메뉴번호를 숫자형식이 아닌 문자열을 입력시 "메뉴 번호는 숫자만"라는 메시지를 뿌려주고 
	 * 정상적인 숫자형식의 문자열을 입력받을때까지 다시 메뉴번호를 입력받도록하여라
	 * 힌트 : CommonUtilities클래스의 isNumber(String)메소드 사용 
	 */
	public int getMenuNumber() {
		Scanner sc = new Scanner(System.in);
		String menuNumber;
		while(true) {
			menuNumber = sc.nextLine();
			if(!CommonUtilities.isNumber(menuNumber)) {
				System.out.println("숫자만 입력");
				continue;
			}
			break;			
		}
		return Integer.parseInt(menuNumber);
	}///getMenuNumber
	/*
	 * 3]메뉴 번호에 따른 분기용 메소드
	 * 매개변수 : int
	 * 반환타입 : void
	 */
	public void  seperatemenuNuber(int MainMenu) {
		switch(MainMenu) {
			case 1 : ///입력
				while(true) {
					//서브메뉴 출력
					printsubMenu();
					//서브메뉴 입력받기
					Scanner sc = new Scanner(System.in);
					int subMenu = getMenuNumber();
					if(subMenu == 3) break; 
					//1이나 2인 경우 입력처리
						switch(subMenu) {
							case 1 : 
							case 2 : setPerson(subMenu); break;
							default : System.out.println("메뉴에 없는 번호");
						}
				}				
				break;
			case 2 :///출력
				printPerson();
				break;
			case 3 :////수정
				break;
			case 4 :///삭제
				break;
			case 5 :///검색
				break;
			case 6 :////파일저장
				break;
			case 9 :///종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default :///메뉴에 없는 번호 
				
		}
		
	}////seperatemenuNuber


	
	/*
	 * 4]서브 메뉴 출력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : void
	 */
	private void printsubMenu() {
		System.out.println("===================메인 메뉴====================");
		System.out.println("  1.입력  2.출력  3.수정  4.삭제  5.검색  6.파일저장  9.종료");
		System.out.println("=============================================");
		System.out.println("-----------------서브메뉴번호 입력-----------------");
	}///printsubMenu()

	/*
	 * 5]서브 메뉴에 따른 학생 및 교사 데이터 입력용 메소드
	 * 매개변수 : int(서브 메뉴) 
	 * 반환타입 : void
	 */
	private void setPerson(int subMenu) {
		//정원이 찼는지 여부 판단
		int index = -1;
		for(int i=0; i<MAX_PERSON;i++) {
			if(person[i]==null) {
				index = i;
				break;
			}
		}
		if(index==-1) {//이미 정원이 찬 경우
			System.out.println("정원초과 더이상 입력할 수 없음");
			return;
		}
		//정원이 안 찬 경우 즉 index가 -1이 아닌경우
		//학생과 교사를 구분해서 입력받기
		Scanner sc = new Scanner(System.in);
		//이름과 나이는 공통
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("나이 입력");
		int age = Integer.parseInt(sc.nextLine());
		switch(subMenu) {
			case 1: 
				System.out.println("학번 입력");
				String stNumber = sc.nextLine();
				person[index] = new Student(name, age, stNumber);
				break;
			case 2:
				System.out.println("과목 입력");
				String subject = sc.nextLine();
				person[index] = new Teacher(name, age, subject);
				break;
			default :
		}
				
	}///setPerson
	/*
	 * 6]출력용 메소드
	 * 매개변수 : no
	 * 반환타입 : no
	 */
	private void printPerson() {
		System.out.println("[학생/교사 구분없이 출력]");
		for(int i=0;i<person.length;i++) {
			if(person[i] != null ) person[i].print();
			System.out.println();
		}
		//문] 학생과 교사를 구분해서 출력
		/*
		  [학생 목록]
		  이름 : ㅁㅁㅁ, 나이 : 00, 학번 : 0000
		  이름 : ㅇㅇㅇ, 나이 : 00, 학번 : 0000
		  [교사 목록]
		  이름 : ㄱㄱㄱ, 나이 : 00, 과목 : ㅇㅇ
		 */
		StringBuffer student = new StringBuffer("[학생 목록]\r\n");
		StringBuffer teacher = new StringBuffer("[교사 목록]\r\n");
		for(int i=0;i<MAX_PERSON;i++)
			if(person[i] != null) 
				if(person[i] instanceof Student)
					student.append(person[i].get()+"\r\n");
				else teacher.append(person[i].get()+"\r\n");	
		System.out.println(student.toString()+teacher);
	}
			
	/*
	 * 7]이름 검색용 메소드
	 * 매개변수 : String(수정/삭제/검색용 타이틀)
	 * 반환타입 : Person타입
	 */
	private Person findPersonByname(String title) {
		System.out.println(title+"할 이름 입력");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for(int i=0; i<MAX_PERSON; i++) {
			if(person[i] != null) {
				if(name.equals(person[i].name)){
				return person[i];
				}
			}
		}
		///검색된 이름이 없는 경우
		System.out.println(name+"으로(로) 검색된 정보 없음");
		//검색한 이름이 없는 경우 null 반환
		return null;
	}	
	/*8] 검색	 */
	
	//9] 수정
	
	
}//////AcademyLogic

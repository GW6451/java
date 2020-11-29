package console.collection;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import common.utility.CommonUtilities;

public class AcademyCollLogic {
	//멤버 상수]
	public static final int MAX_PERSON =3;//최대인원수
	//멤버 변수]
	List<Person>person;
	//생성자]
	public AcademyCollLogic() {
		person = new Vector<Person>();
	}
	//멤버 메소드]
	/*
	 * 1]메뉴 출력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : void
	 */
	public void printMainMenu() {
		System.out.println("===================메인 메뉴====================");
		System.out.println("  1.입력  2.출력  3.수정  4.삭제  5.검색  6.파일저장  9.종료");
		System.out.println("=============================================");
		System.out.println("-----------------메인메뉴번호 입력-----------------");
	}////printMainMenu()
	/*
	 * 2]메뉴 번호 입력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : int
	 */
	public int getMenuNumber() {
		/*문]메뉴번호를 숫자형식이 아닌 문자열을 입력시 "메뉴 번호는 숫자만"라는 메시지를 뿌려주고 
		 * 정상적인 숫자형식의 문자열을 입력받을때까지 다시 메뉴번호를 입력받도록하여라
		 * 힌트 : CommonUtilities클래스의 isNumber(String)메소드 사용 
		 */
		Scanner sc = new Scanner(System.in);
		String menuNumber;
			while(true) {
				menuNumber = sc.nextLine();
				if(!CommonUtilities.isNumber(menuNumber)){
				System.out.println("숫자만 입력");
				continue;
				}
				break;				
		}
		return Integer.parseInt(menuNumber);
	}////getMenuNumber()
	/*
	 * 3]메뉴 번호에 따른 분기용 메소드
	 * 매개변수 : int
	 * 반환타입 : void
	 */
	public void seperateMainMenu(int mainMenu) {
		switch(mainMenu) {
			case 1 : //입력
				while(true) {
					//서브메뉴 출력
					printSubMenu();
					//서브메뉴 입력받기
					int subMenu = getMenuNumber();
					if(subMenu == 3) break;
					//1이나 2인 경우 입력처리
					switch(subMenu) {
						case 1 : 
						case 2 : setPerson(subMenu); break;
						default : System.out.println("서브메뉴에 없는 번호");
					}////switch(subMenu)
				}///while				
				break;
			case 2 : //출력
				printPerson();
				break;
			case 3 : //수정
				updatePerson();
				break;
			case 4 : //삭제
				deletePerson();
				break;
			case 5 : //검색
				searchPerson();
				break;
			case 6 : //파일저장
				break;
			case 9 : //종료
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default :
				System.out.println("메뉴에 없는 번호");
		}///switch(mainMenu)
	}////seperateMainMenu(int mainMenu)


	/*
	 * 4]서브 메뉴 출력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : void
	 */
	private void printSubMenu() {
		System.out.println("===================서브 메뉴====================");
		System.out.println("  1.학생  2.교사  3.메인메뉴로 이동 ");
		System.out.println("=============================================");
		System.out.println("-----------------서브메뉴번호 입력-----------------");
	}
	/*
	 * 5]서브 메뉴에 따른 학생 및 교사 데이터 입력용 메소드
	 * 매개변수 : int(서브 메뉴) 
	 * 반환타입 : void
	 */
	private void setPerson(int subMenu) {
		//정원이 찼는지 여부 판단
		/*int index = -1;//채워지지 않은 Person형 배열의 인덱스를 저장할 변수
		for(int i=0; i< MAX_PERSON; i++) {
			if(person[i] == null) {
				index = i;
				break;
			}
		}*/
		
		if(person.size() == MAX_PERSON) {//이미 정원이 찬 경우
			System.out.println("정원초과 더이상 입력 불가");
			return;
		}
		//정원이 안 찬 경우 즉 index가 -1이 아닌경우
		//이름과 나이는 공통
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.nextLine();
		System.out.println("나이 입력");
		int age = Integer.parseInt(sc.nextLine());
		//학생과 교사를 구분해서 입력받기
		switch(subMenu) {
			case 1 :///학생
				System.out.println("학번 입력");
				String stNumber = sc.nextLine();
				person.add(new Student(name, age, stNumber));
				break;
			default :///교사
				System.out.println("과목 입력");
				String subject = sc.nextLine();
				person.add(new Teacher(name, age, subject));
		}
	}//////setPerson(int subMenu)
	/*
	 * 6]출력용 메소드
	 * 매개변수 : no
	 * 반환타입 : no
	 */
	private void printPerson() {
		System.out.println("[학생/교사 구분없이 출력]");
		for(Person p:person) {
			p.print();
			System.out.println();
		}////for
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
		for(Person p:person)
				if(p instanceof Student)
					student.append(p.get()+"\r\n");
				else teacher.append(p.get()+"\r\n");
		System.out.println(student.toString()+teacher);
		/*System.out.println("[학생 목록]");		
		for(int i=0; i<person.length; i++) {
			if(person[i] != null) {
				for(person[i] instanceof Student)
			}
		}
		System.out.println("[교사 목록]");
		for(int i=0; i<person.length; i++) {
			if(person[i] != null) {
				for(person[i] instanceof Teacher)
			}
		}*/					
	}//////printPerson()
	/*
	 * 7]이름 검색용 메소드
	 * 매개변수 : String(수정/삭제/검색용 타이틀)
	 * 반환타입 : Person타입
	 */
	private Person findPersonByName(String title) {
		System.out.println(title+"할 이름 입력");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		for(Person p:person) {
				if(name.equals(p.name)) {
					return p;
				}
		}
		///검색된 이름이 없는 경우
		System.out.println(name+"으로(로) 검색된 정보 없음");
		//검색한 이름이 없는 경우 null 반환
		return null;
	}////
	/*8] 검색	 */
	private void searchPerson() {
		Person findPerson = findPersonByName("검색");
		if(findPerson != null) {
			System.out.println("<"+ findPerson.name + "검색 결과>");
			findPerson.print();
		}
		
	}///findPersonByName(String title)
	//9] 수정
	private void updatePerson() {
		Person findPerson = findPersonByName("수정");
		/*Scanner sc = new Scanner(System.in);
		if(findPerson != null) {
			if(findPerson instanceof Student) {
				System.out.println("수정할 나이 입력");
				findPerson.age = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 학번 입력");
				((Student) findPerson).stNumber = sc.nextLine();
			}
			else {
				System.out.println("수정할 나이 입력");
				findPerson.age = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 과목 입력");
				((Teacher)findPerson).subject = sc.nextLine();
			}
		}*/
		if(findPerson != null) {
			Scanner sc = new Scanner(System.in);
			System.out.println("수정할 나이 입력");
			///나이수정
			findPerson.age = Integer.parseInt(sc.nextLine());
			//학생인지 교사인지 판단
			if(findPerson instanceof Student) {
				//학번수정
				System.out.println("수정할 학번");
				((Student)findPerson).stNumber = sc.nextLine();
			}
			else {
				//과목수정
				System.out.println("수정할 과목 입력");
				((Teacher)findPerson).subject = sc.nextLine();
			}
			System.out.printf("[%s 수정 완료]%n",findPerson.name);
		}
	}////updatePerson()
	//10]삭제용
	private void deletePerson() {
		Person findPerson = findPersonByName("삭제");
		if(findPerson != null) {//찾은 경우
			for(Person p:person) {
				if(findPerson.equals(p))
				person.remove(p);
				System.out.printf("[%s 삭제 완료]%n",findPerson.name);
				break;
			}
		}
		
	}//deletePerson
	
}//////AcademyLogic

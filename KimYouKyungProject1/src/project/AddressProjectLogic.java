package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import common.utility.CommonUtilities;


//[공유 메소드를 호출 하는 스레드]


public class AddressProjectLogic {
	Map<Character,List<Person>> addressBook = 
			new HashMap<Character, List<Person>>();
	
	List<Person> person;
	public AddressProjectLogic() {
	person = new Vector<Person>();
	fileToObject();
	}

//컬렉션사용 -파일저장 추가(ObjectInputStream/ObjectOutputStream)사용
	private void fileToObject() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream
					(new FileInputStream("src/project/KimYouKyungProject1.dat"));
			addressBook = (Map<Character,List<Person>>)ois.readObject();
			ois.close();
		}
		catch(Exception e) {
			
		}
	}

	/*
	 * 1]메뉴 출력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : void
	 */
	public void printMenu() {
		System.out.println("================메 인 메 뉴=================");
		System.out.println("   1.입력  2.출력  3.수정  4.삭제  5.검색  9.종료");
		System.out.println("=========================================");
		System.out.println("----------------메뉴번호입력----------------");
	}////printMenu
	
	/*
	 * 2]메뉴 번호 입력용 메소드
	 * 매개변수 : no 
	 * 반환타입 : int
	 */
	public int getMenuNum() {
		Scanner sc = new Scanner(System.in);
		int menuNumber = -1;
		while(true) {
			String strMenu = sc.nextLine();
			try {
				menuNumber = Integer.parseInt(strMenu);
				break;
			}
			catch(NumberFormatException e) {
				System.out.println("메뉴 번호는 숫자만 입력 가능");
			}
		}///while
		return menuNumber;
	}////getMenuNum
	
	/*
	 * 3]메뉴 번호에 따른 분기용 메소드
	 * 매개변수 : int
	 * 반환타입 : void
	 */
	public void seperateMenu(int menuNum) {
		
		switch(menuNum) {		
			case 1://입력
				printmenu();				
				break;				
			case 2://출력				
				getmenu();				
				break;
			case 3://수정
				updatePerson();
				break;
			case 4://삭제
				deletePerson();
				break;
			case 5://검색
				Searchperson();
				break;
			case 9://프로그램종료
				printSubMenu();
				while(true) {
					int subMenu = getMenuNum();
					if(subMenu == 3) break;
					//1이나 2인 경우 입력처리
					switch(subMenu) {
						case 1 : saveInfo(subMenu);
								
						case 2 :  break; 
							
						default : System.out.println("서브메뉴에 없는 번호입니다.");
					}////switch(subMenu)
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);break;
				}				
				break;
			default :
				System.out.println("메뉴에 없는 번호입니다.");
		}///switch
	}////seperateMenu

	//1] 입력
	private void printmenu() {
		List<Person> valueList = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름 :");
			String name = sc.nextLine();
			if("EXIT".equalsIgnoreCase(name)) break;
			char key = CommonUtilities.getFirstCharacter(name);
			if(key == '0') {
				System.out.println("한글 이름이 아닙니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("나이 :");
			int age = Integer.parseInt(sc.nextLine());
			System.out.println("주소 :");
			String addr = sc.nextLine();
			System.out.println("연락처 :");
			String contacts = sc.nextLine();
			//3]맵컬렉션(addressBook)에 key값이 존재하는지 판단
			if(!addressBook.containsKey(key)) {///키값이 없을때
				valueList = new Vector<Person>();
			}
			else {
				valueList = addressBook.get(key);
			}
			//입력한 객체 생성
			valueList.add(new Person(name,age,addr,contacts));

			//4]맵 컬렉션 키값으로 저장
			addressBook.put(key,valueList);
		}//while		
	}///Printmenu
	
	//2] 출력
	private void getmenu() {		
		TreeMap<Character,List<Person>> addressBook2 = 
				new TreeMap<Character, List<Person>>();
		
		Set<Character> keys = addressBook.keySet();
		for(Character key : keys) {	
			List<Person> values = addressBook.get(key);
			addressBook2.put(key, values);
		}///for
		keys = addressBook2.keySet();
		for(Character key : keys) {					
			System.out.println("["+key+"로(으로) 시작되는 이름]");
			List<Person> values = addressBook2.get(key);
		
			for(Person value : values)
				System.out.println(value);
				
		}///for
	}///Getmenu
	
	//검색용 메소드
	private Person findPersonByName(String title) {
		while(true) {
			System.out.println(title+"할 이름을 입력하세요");			
			Scanner sc = new Scanner(System.in);			
			String name = sc.nextLine();			
			char searchKey = CommonUtilities.getFirstCharacter(name);			
			if(addressBook.containsKey(searchKey)) {
				List<Person> values = addressBook.get(searchKey);
				for(Person value : values) {
					if(name.equals(value.name)) {					
						return value;
					}					
				}					
			}	
			else {
				System.out.println(name+"으로(로) 검색된 정보가 없습니다. 다시 입력하세요.");
			}
					
		}
	}/////findPerosnByName
	
	//5] 검색
	private void Searchperson() {		
		Person findPerson = findPersonByName("검색");//p		
		if(findPerson != null) {
			System.out.println("검색이 완료되었습니다.");
			System.out.printf("[%s에 대한 정보]%n%s%n",findPerson.name,findPerson);		
			}
	}////Searchperson
	//3]수정(
	private void updatePerson() {
		Person findPerson = findPersonByName("수정");//p			
		if(findPerson != null) {
			Scanner sc = new Scanner(System.in);			
			System.out.println("수정할 나이를 입력하세요.");
			int age1 = Integer.parseInt(sc.nextLine());
			findPerson.age = age1;
			
			System.out.println("수정할 주소를 입력하세요.");
			String addr1 = sc.nextLine();
			findPerson.addr = addr1;
			
			System.out.println("수정할 연락처를 입력하세요.");
			String contacts1 = sc.nextLine();			
			findPerson.contacts = contacts1;
			
			System.out.printf("[%s 수정이 완료되었습니다.]%n",findPerson.name);
		}
		
	}////updatePerson
	   //4]삭제
	   private void deletePerson() {
	      Person findPerson = findPersonByName("삭제");
//	      Map<Character,List<Person>> addressBook = 
//	            new HashMap<Character, List<Person>>();   
	      char delete = CommonUtilities.getFirstCharacter(findPerson.name);	      
	      if(addressBook.containsKey(delete)) {
	         List<Person> values = addressBook.get(delete);
	         boolean isExist = false;
	         for(Person value : values) {
	            if(value.name.equals(findPerson.name)) {
	               values.remove(value);
	               System.out.printf("[%s 삭제가 완료되었습니다.]%n",findPerson.name); 
	               isExist = true;
	               break;
	            }
	            else
	            	System.out.println("해당하는 사람이 없습니다.");
	         }	         
	      }

	   }///deletePerson
	   
	   //9]종료
		private void printSubMenu() {
			System.out.println("파일을 저장하시겠습니까?");
			System.out.println("1. 예       2.아니오");
			
		}////printSubMenu
		//서브메뉴 1번
		private void saveInfo(int subMenu) {
			if(addressBook.isEmpty()) {
				System.out.println("파일로 저장할 사람 없음");
				return;
			}
			//컬렉션에 저장된 객체가 있는경우
			ObjectOutputStream out = null;
			try {
				out = new ObjectOutputStream(new FileOutputStream("src/project/KimYouKyungProject1.dat"));
					out.writeObject(addressBook);			
				System.out.println("파일 저장 완료");
			}
			catch(IOException e) {
				System.out.println("파일 저장시 오류" + e.getMessage());
			}
			finally {
				try {
					if(out != null) out.close();
				}
				catch(IOException e) {}
			}
	      
		}///saveInfo

}///class AddressProjectLogic

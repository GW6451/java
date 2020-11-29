package collection20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import common.utility.CommonUtilities;

/* 1차 개인 프로젝트시 참고 코드 */
public class AddressProject {
	
	public static void main(String[] args) {
		Map<Character,List<Address>> addressBook =
				new HashMap<Character, List<Address>>();
		//1]밸류 타입을 null로 초기화
		List<Address> valueList = null;
		//사용자 입력용 스캐너]
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력하세요?");
			String name = sc.nextLine();
			//EXIT입력시 while문 빠져 나가기(종료)
			if("EXIT".equalsIgnoreCase(name)) break;
			//2]초성 (ㄱ,ㄴ,ㄷ,.....ㅎ)얻기
			char key=CommonUtilities.getFirstCharacter(name);
			//System.out.println("초성 : "+key);
			if(key == '0') {
				System.out.println("한글 이름이 아닙니다");
				continue;
			}
			System.out.println("주소를 입력하세요?");
			String addr=sc.nextLine();
			System.out.println("연락처를 입력하세요?");
			String contacts = sc.nextLine();
			System.out.println("나이를 입력하세요?");
			int age = Integer.parseInt(sc.nextLine());
			//3]맵 컬렉션(addressBook)에 key값이 존재하는지 판단
			if(!addressBook.containsKey(key)) {//키값이 없는 경우.즉 맵 컬렉션에 해당 키값이 저장이 안되어 있는 경우
				//value타입인 List<Address>객체 생성
				valueList = new Vector<Address>();
			}
			else {//키값이 존재한다면
				 //해당 키값으로 기존에 저장된 객체를 얻어온다
				valueList=addressBook.get(key);
			}
			//입력한 객체를 추가
			valueList.add(new Address(name, age, addr, contacts));
			//4]맵 컬렉션에 키값으로 저장
			addressBook.put(key, valueList);
		}//////while(true)
		//출력]
		Set<Character> keys=addressBook.keySet();
		for(Character key:keys) {
			System.out.println("["+key+"로 시작하는 명단]");
			List<Address> values=addressBook.get(key);
			
			for(Address value:values) 
				System.out.println(value);
		}
		/*
    	문]찾고자 하는 사람의 이름을 입력받아
                       위 맵 컬렉션(addressBook)에 저장된 사람의 정보를 출력하자.
                       만약 해당하는 사람이 없으면 "해당하는 사람이 없어요"
                       라고 출력하여라.
       	       찾을때까지 계속 입력받도록 하여라.
       */
		while(true) {
			System.out.println("찾는 사람은 누구입니까?");
			String searchName = sc.nextLine();
			char searchKey=CommonUtilities.getFirstCharacter(searchName);
			if(addressBook.containsKey(searchKey)) {//키값이 있는 경우
				List<Address> values=addressBook.get(searchKey);
				boolean isExist=false;
				for(Address value:values) {
					if(value.name.equals(searchName)) {//찾는 경우
						System.out.println(value);
						isExist=true;
						break;
					}
				}
				if(isExist) break;
				System.out.println("해당하는 사람이 없어요(키값 존재)");
			}
			else {//키값이 없는 경우
				System.out.println("해당하는 사람이 없어요(키값 미 존재)");
			}
		}/////////////while
		
	}////////main
}////////////class

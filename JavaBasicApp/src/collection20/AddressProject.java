package collection20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import common.utility.CommonUtilities;

//1차 개인 프로젝트 참고 코드
public class AddressProject {

	public static void main(String[] args) {
		Map<Character,List<Address>> addressBook = 
				new HashMap<Character, List<Address>>();
		//1]밸류 타입을 null로 초기화
		List<Address> valueList = null;
		//사용자 입력용 스캐너]
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("-----이     름-----");
			String name = sc.nextLine();
			//EXIT입력시 while 문 빠져나감
			if("EXIT".equalsIgnoreCase(name)) break;
			//2] 초성(ㄱ,ㄴ,ㄷ,...ㅎ)얻기
			char key = CommonUtilities.getFirstCharacter(name);
			//System.out.println("초성 : "+key);
			if(key =='0') {
				System.out.println("한글이름이 아님");
				continue;
			}
			System.out.println("-----주     소-----");
			String addr = sc.nextLine();
			System.out.println("-----연 락 처-----");
			String contacts = sc.nextLine();
			System.out.println("-----나     이-----");
			int age = Integer.parseInt(sc.nextLine());
			//3]맵컬렉션(addressBook)에 key값이 존재하는지 판단
			if(!addressBook.containsKey(key)) {//키값이 없는 경우.즉 맵컬렉션에 
				valueList = new Vector<Address>();
			}
			else {//키값이 존재
				//해당 키값으로 기존에 저장된 객체를 얻어온다
				valueList = addressBook.get(key);
			}
			//입력한 객체 생성
			valueList.add(new Address(name, age, addr, contacts));
			//4]맵 컬렉션 키값으로 저장
			addressBook.put(key, valueList);			
		}///while(true)
		//출력]
		Set<Character> keys = addressBook.keySet();
		for(Character key:keys) {
			System.out.println("["+key+"로(으로) 시작되는 명단]");
			List<Address> values = addressBook.get(key);
			for(Address value : values) 
				System.out.println(value);
		}
		/*문제1] -- 개인 프로젝트 내에서 검색에서 쓰임
		 * 찾고자 하는 사람의 이름을 입력받아 위 맵 컬렉션(addressBook)에 저장된 사람의 정보를 출력하자
		 * 만약 해당하는 사람이 없으면 "해당하는 사람이 없음"라고 출력하자
		 * 찾을때까지 계속 입력 받아라
		 */
		while(true) {
			System.out.println("찾는 사람의 이름 입력");
			String searchName = sc.nextLine();
			char searchKey = CommonUtilities.getFirstCharacter(searchName);
			if(addressBook.containsKey(searchKey)) {
				List<Address> values = addressBook.get(searchKey);
				boolean isExist = false;
				for(Address value : values) {
					if(value.name.equals(searchName)) {
						System.out.println(value);
						isExist = true;
						break;
					}
				}
				if(isExist) break;
				System.out.println("해당하는 사람 없음");
			}
			else {
				System.out.println("해당하는 사람 없음");
			}
		}


	}///////main

}///////class

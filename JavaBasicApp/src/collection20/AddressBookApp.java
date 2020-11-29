package collection20;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;



//이름/전번/주소/나이를 저장하는 클래스]
class Address implements Comparable<Address>{
	//멤버변수]
	String name;
	int age;
	String addr;
	String contacts;
	//인자생성자]
	public Address(String name, int age, String addr, String contacts) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return String.format("[name : %s, age : %s, address : %s, contact : %s]", name, age, addr, contacts);
	}
	@Override
	public int compareTo(Address target) {
		//이름으로 정렬
		//오름 차순		
		//return this.name.compareTo(target.name);
		//내림 차순		
		//return target.name.compareTo(this.name);
		//나이로 정렬
		//오름 차선
		//return this.age-target.age;
		//내림 차선
		return target.age-this.age;
	}
	
	
}





public class AddressBookApp {

	public static void main(String[] args) {
		/*
		 1]초성을 key값 - String 혹은 Character
		 	List계열 컬렉션을 Value 값 - 
		 */
		Map<Character, List<String>> nameAddr = 
					new HashMap<Character, List<String>>();
		//1-1]이름 저장용 List계열 컬렉션 객체 생성 및 이름 저장
		List kieyeok = Arrays.asList("고길동","곽길동","가길동","기길동");
		List nieun = Arrays.asList("노길동","남길동","나길동");
		//1-2]Map컬렉션
		nameAddr.put('ㄱ',kieyeok);
		nameAddr.put('ㄴ',nieun);
		//1-2-1]키값을 알때
		System.out.println("[키값을 알때]================");
		List<String> values = nameAddr.get('ㄱ');
		for(String value : values)System.out.println(value);
		//1-2-2]키값을 모를때
		System.out.println();
		System.out.println("[키값을 모를때]===============");
		//1]keySet()으로 Set컬렉션 얻기
		Set<Character> keys = nameAddr.keySet();
		//2]Set컬렉션에 확장 for문 적용
		for(Character key:keys) {
			System.out.println(String.format("[%c로 시작하는 명단]------------", key));
			values = nameAddr.get(key);
			for(String value : values)System.out.println(value);
		}
		Map<Character, List<Map<String, Object>>> address = 
				new HashMap<Character, List<Map<String,Object>>>();
		//2-1]이름/전번/주소/나이가 저장된 맵 컬렉션을 저장할 리스트계열 컬렉션 객체 생성
		List<Map<String, Object>> kie = new Vector<Map<String,Object>>();
		List<Map<String, Object>> nie = new Vector<Map<String,Object>>();
		//2-2]이름/전번/주소/나이를 저장할 맵 컬렉션 객체 생성
		Map<String,Object> k = new HashMap<String,Object>();
		k.put("name", "고길동");
		k.put("age", 20);
		k.put("addr", "가산동");
		k.put("contacts", "010-1234-5678");
		//리스트 계열 컬렉션에 저장
		kie.add(k);
		k = new HashMap<String,Object>();
		k.put("name", "곽길동");
		k.put("age", 30);
		k.put("addr", "서초동");
		k.put("contacts", "011-1234-5678");
		kie.add(k);
				
		Map<String,Object> n = new HashMap<String,Object>();
		n.put("name", "나길동");
		n.put("age", 45);
		n.put("addr", "나산동");
		n.put("contacts", "017-1234-5678");
		//리스트 계열 컬렉션에 저장
		nie.add(n);
		n = new HashMap<String,Object>();
		n.put("name", "노길동");
		n.put("age", 35);
		n.put("addr", "노산동");
		n.put("contacts", "019-1234-5678");
		nie.add(n);
		//주소록 저장하는 맵컬렉션에 리스트 저장]
		address.put('ㄱ', kie);
		address.put('ㄴ', nie);
		/*
		 * 객체 꺼내올때]
		 * Set/List계열 무조건 확장for문 사용
		 * Map 계열은 keyset()으로 키값들이 저장된 Set계열 반환 받은 후 확장 for문 사용
		 */
		//출력]
		System.out.println("[키 값을 알때]");
		List<Map<String, Object>> list = address.get('ㄱ');
		System.out.println("[ㄱ으로 시작하는 명단]");
		for(Map<String, Object> map:list) {
			Set<String> set = map.keySet();
			for(String key : set) {
				Object value = map.get(key);
				System.out.print(String.format("%s:%-6s", key,value));
			}
			System.out.println();
			
			
		}
		System.out.println("[키 값을 모를때]");
		keys = address.keySet();
		for(Character key:keys) {
			list = address.get(key);
			System.out.println("["+key+"으로 시작하는 명단]");
			for(Map<String, Object> map:list) {
				Set<String> set = map.keySet();
				for(String ky : set) {
					Object value = map.get(ky);
					System.out.print(String.format("%s:%-6s", ky,value));
				}
				System.out.println();
			}
		}
		
		//3]Address클래스를 사용해서 2]번처럼 구현
		Map<Character,List<Address>> addressBook = 
				new HashMap<Character,List<Address>>();
		//3-1]주소를 저장할 리스트 계열 컬렉션 생성
		List<Address> kiec = new Vector<Address>();
		List<Address> niec = new Vector<Address>();
		//3-2]주소 저장
		kiec.add(new Address("곽길동", 40, "가산동", "010"));
		kiec.add(new Address("고길동", 20, "독산동", "017"));
		kiec.add(new Address("가길동", 30, "천호동", "011"));
		
		niec.add(new Address("노길동", 30, "방배동", "011"));
		niec.add(new Address("나길동", 50, "서초동", "017"));
		niec.add(new Address("너길동", 40, "잠실동", "019"));
		
		//3-3]키값으로 리스트 컬렉션 객체를 맵(addressBook)에 저장
		addressBook.put('ㄱ',kiec);
		addressBook.put('ㄴ',niec);
		System.out.println("[클래스를 사용해서 구현]");
		//출력-객체 꺼내오기]
		keys = addressBook.keySet();
		for(Character key : keys) {
			System.out.println(String.format("[%c로 시작하는 명단]",  key));
			addressBook.get(key);
			List<Address> vals = addressBook.get(key);
			//정렬후 출력]
			/*
			 * 아래가 선행되어야 한다
			 * 1. Address클래스에서 Comparable인터페이스 구현
			 * 2. compareTo()메소드를 오버라이딩
			 */
			Collections.sort(vals);
			
			for(Address val : vals) {
				System.out.println(val);
			}
		}
		
	}///////main

}////////class

package collection20;

import java.sql.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import console.academy.Student;

/*
HashSet : Set(인터페이스)계열의 컬렉션  클래스
- 순서 없이 저장
- 객체의 중복 저장 허용 안함
 */
public class HashSetApp {

	public static void main(String[] args) {
		//1]<?>제너릭 표현에 타입을 지정 안 한경우
		//			-어느 타입이든 저장 가능
		//1-1]컬렉션 생성
		HashSet set = new HashSet();
		//1-2]컬렉션에 저장할 객체 생성
		String stringObj1 = "JAVA";
		String stringObj2 = new String("WORLD");
		Date dateObj = new Date(new java.util.Date().getTime());
		Integer intObj = new Integer(100);
		Student studentObj = new Student("가길동",20,"2020학번");
		//1-3]컬렉션에 객체 저장 - boolean add(Object)
		System.out.println(set.add(stringObj1)?"저장 성공" : "저장 실패");
		set.add(stringObj2);
		set.add(dateObj);
		set.add(intObj);
		set.add(studentObj);
		//1-4]컬렉션에 저장된 객체수 얻기:int size()
		System.out.println("중복저장 전 저장된 객체 수 : " + set.size());
		//1-5]중복저장[x]-에러는 안나지만 저장이 안됨(즉 add()메소드가 false반환)
		System.out.println(set.add(stringObj1)?"저장 성공" : "저장 실패");
		System.out.println("중복 저장 후 저장된 객체 수 : " + set.size());
		//1-6]저장된 객체 꺼내오기 - 순서없이 저장됨(반복기를 통해서 꺼내오기)
		/*
		 Iterator의 주요 추상 메소드]
		 @데이터가 순서있게 저장된 자료구조(List계열)나 순서 없이 저장된  자료구조(Set계열)에서 데이터를 
		 꺼내욜때 사용하는 타입(인터페이스) 단, 확장 for문 써도 무방
		 
		 hashNext() : 꺼내올 객체가 있으면 true반환 없으면 false반환
		 hasNext()메소드로 판단 후 next()메소드로 꺼내온다
		 */
		//1-6-1]iterator() 메소드로 Iterator타입의 인스턴스 얻기
		Iterator it = set.iterator();
		System.out.println("[반복기 사용]");
		while(it.hasNext()) {//1-6-2]hashNext()로 꺼내올 객체의 유무여부 판단
			Object obj = it.next();
			if(obj instanceof String) System.out.println("String타입 : "+obj);
			else if(obj instanceof Date) System.out.println("Date 타입 : " +obj);
			else if(obj instanceof Integer) System.out.println("Integer 타입 : "+obj);
			else System.out.println("Student타입 : "+((Student)obj).get());
		}
		/* 모든 객체 꺼내온 후 next()호출 시 실행 오류 발생
		 * next()메소드 호출 시마다 하나씩 꺼내온다
		 * 만약 컬렉션에 꺼내올 객체가 없는데 next()를 호출한다면 예외 발생
		 */
		//it.next();[x]실행 오류 발생
		/*
		 확장 for문 : 배열이나 컬랙션에 저장된 값(객체)을 꺼내올 때 사용하는 for문의 확장형
		 
		 형식]
		 for(자료형 객체를 담을 변수 : 배열명이나 혹은 컬렉션명)
		 */
		System.out.println("[확장 for문]");
		for(Object obj: set) {
			if(obj instanceof String) System.out.println("String타입 : "+obj);
			else if(obj instanceof Date) System.out.println("Date 타입 : " +obj);
			else if(obj instanceof Integer) System.out.println("Integer 타입 : "+obj);
			else System.out.println("Student타입 : "+((Student)obj).get());
		}
		String[] mountains = {"비술산","덕유산","태백산","속리산"};
		System.out.println("[일반 for문]");
		for(int i=0; i<mountains.length; i++)
			System.out.println(mountains[i]);
		System.out.println("[확장 for문]");
		for(String mountain : mountains)
			System.out.println(mountain);
		//1-7]검색 : boolean contains(Object e);
		System.out.println(set.contains(stringObj1)?"stringObj1 있다":"stringObj1 없다");
		System.out.println(set.contains(100)?"100 있다":"100 없다");//오토박싱-100이 저장된 메모리를 찾기때문에 에러 안남
		System.out.println(set.contains(new Integer(100))?"100 있다":"100 없다");//메모리가 생성되지만 주소가 저장된 100을 찾는다
		System.out.println(set.contains("WORLD")?"WORLD 있다":"WORLD 없다");
		//1-8]삭제 : boolean remove(Object e)
		System.out.println(set.remove(stringObj1)?"삭제 성공" : "삭제 실패");
		System.out.println(set.remove(stringObj2)?"삭제 성공" : "삭제 실패");
		System.out.println("삭제 후 저장된 객체 수 : "+set.size());
		//1-9]전체 삭제: boolean removeAll(Collection c)
		//			  void clear();
		set.clear();
		//set.removeAll(set);
		System.out.println("전체 삭제 후 저장된 객체 수 : "+set.size());
		//전체 삭제 후 저장한 객체는 그대로 있다(set(컬렉션)에서만 제거됨)
		System.out.println("Student객체:"+studentObj.get());
		//2]<?>표현 사용 - 해당 타입(?)만 저장 가능
		HashSet<Student> set2 = new HashSet<Student>();
		//2-1]컬렉션에 저장할 객체 생성
		Student stu1 = new Student("가길동",20,"2020학번");
		Student stu2 = new Student("나길동",30,"2019학번");
		Student stu3 = new Student("다길동",40,"2018학번");
		//2-2]객체 저장
		set2.add(stu1); set2.add(stu2); set2.add(stu3);
		//set2.add(stringObj1);//[x]제너릭에 지정한 타입만 저장 가능
		//2-3]객체 꺼내오기
		System.out.println("[반복기 사용]");
		Iterator<Student> it2 = set2.iterator();
		while(it2.hasNext()) {
			//System.out.println(String.format("이름 :%s  나이 :%s  학번 :%s", it2.next().st.name,st.age,st.stNumber));
			Student st = it2.next();
			System.out.println(String.format("이름 :%s  나이 :%s  학번 :%s", st.name,st.age,st.stNumber));
			//it2.next().print();
		}
		System.out.println("[확장 for문 사용]");
		for(Student st : set2) st.print();
		//2-4]검색
		System.out.println(set2.contains(stu1));
		System.out.println(set2.contains(new Student("가길동",20,"2020학번")));///new 메모리 생성
		//2-5]삭제
		//set2.remove(stu1);
		System.out.println("삭제후 저장된 객체 수 : " + set2.size());
		set.clear();
		/*
		 * 문]컬렉션 set2에 저장된 객체를 이름으로 검색하자 있는 이름으로 검색해 보고 없는 이름으로 검색해보자
		 * 있으면 해당 학생의 정보를 출력하고 없으면 "해당하는 학생이 없습니다"라고 출력하자
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 이름 입력");
		String searchName = sc.nextLine();
		boolean isExit = false;
		for(Student s : set2) {
			if(searchName.equals(s.name)) {
				s.print();
				isExit = true;
				break;
			}
		}
		if(!isExit) System.out.println("해당 학생 없음");
		
		

	}/////main

}/////class

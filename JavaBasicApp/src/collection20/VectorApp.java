package collection20;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import console.academy.Student;

//Vector:List 계열 컬렉션
public class VectorApp {

	public static void main(String[] args) {
		//컬렉션 객체 생성]
		List<Student> vec = new Vector<Student>();
		//컬렉션에 저장할 객체 생성
		Student stu1 = new Student("가길동",20,"2020학번");
		Student stu2 = new Student("나길동",30,"2019학번");
		Student stu3 = new Student("다길동",40,"2018학번");
		Student stu4 = new Student("라길동",50,"2017학번");	
		//객체 저장
		vec.add(stu1);vec.add(stu2);vec.add(stu3);vec.add(stu4);
		
		//출력
		System.out.println("[일반 for문]");
		for(int i=0; i<vec.size();i++) vec.get(i).print();
		System.out.println("[확장 for문]");
		for(Student s:vec) s.print();
		System.out.println("[반복기]");
		Iterator<Student> it = vec.iterator();
		while(it.hasNext()) it.next().print();
		/*
		 * 열거형으로 꺼내오기 : elements()메소드로 Enumeration 타입 얻기
		 * Enumeration타입의 주요메소드
		 * hasMorElements():저장된 객체가 있으면 true, 없으면 false반환
		 * nextElements();저장된 객체 사용할때
		 */
		System.out.println("[열거형]");
		Enumeration<Student> em = ((Vector)vec).elements();
		while(em.hasMoreElements()) em.nextElement().print();
		//삭제]
		//인덱스로 삭제]
		//System.out.println("삭제된 객체의 이름 : "+vec.remove(1).name);
		//주소로 삭제]
		//System.out.println(vec.remove(stu2));
		//문]vec컬렉션에 저장된 Student객체들을 나이가 높은 순으로 재배치후 출력하라
		//  단, List계열의 get(인덱스) 및 set(인덱스,객체) 메소드 사용
		System.out.println("--------------------------------");
		for(int i=0;i<vec.size()-1;i++) {
			for(int k=i+1;k<vec.size(); k++) {
				if(vec.get(i).age<vec.get(k).age) {
					Student temp = vec.get(i);
					vec.set(i, vec.get(k));
					vec.set(k, temp);
				}
			}
		}
		for(Student s:vec) s.print();

	}

}

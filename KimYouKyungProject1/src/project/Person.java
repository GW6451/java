package project;

import java.io.Serializable;

//이름/전번/주소/나이를 저장하는 클래스]
class Person implements Comparable<Person> ,Serializable{
	String name;
	int age;
	String addr;
	String contacts;
	
	public Person(String name, int age, String addr, String contacts) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return String.format("이름 : %s  나이 : %s  주소 : %s  연락처 : %s",name,age,addr,contacts);
	}

	@Override
	public int compareTo(Person target) {
		return this.name.compareTo(target.name);
	}
	
	public void print() {
		System.out.println(toString());
	}

}

package io24.filter;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 자바 클래스의 객체는 직렬화가 되어야 파일로 저장하거나 네트웍을 통해 전송할 수 있다
 
 어떤 클래스를 직렬화하려면 Serializable혹은 Externalizable인터페이스를 구현(상속)해야 한다
 */
public class PersonExternalizable implements Externalizable{
	//멤버 변수]
	String name;
	int age;
	String addr;
	//생성자]
	public PersonExternalizable() {}
	public PersonExternalizable(String name, int age, String addr) {
		this.name =name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "PersonExternalizable [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(addr);

	}/////writeExternal

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		age = (Integer)in.readObject();
		addr = (String)in.readObject();
	}////readExternal

}

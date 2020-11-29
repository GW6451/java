package io24.filter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class SerializableFileToObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//1]필터를 끼운 입력 스트림 생성
		ObjectInputStream ois=
				new ObjectInputStream(
						new FileInputStream("src/io24/filter/Object.txt"));
		//2]ois로 읽어서 PersonSerializable타입에 저장
		Object obj=ois.readObject();
		if(obj instanceof PersonSerializable) {
			PersonSerializable person1=(PersonSerializable)obj;
			System.out.println(person1);
		}
		
		PersonSerializable person2=(PersonSerializable)ois.readObject();
		System.out.println(person2);
		
		PersonSerializable person3=(PersonSerializable)ois.readObject();
		System.out.println(person3);
		
		ois.close();
		
	}/////////////main

}////////////////class

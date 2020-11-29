package io24.filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableObjectToFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1]데이타 소스(메모리) 준비-입력 스트림 불필요
		PersonSerializable pe1 = new PersonSerializable("가길동", 10, "천호동");
		PersonSerializable pe2 = new PersonSerializable("나길동", 11, "잠실동");
		PersonSerializable pe3 = new PersonSerializable("다길동", 12, "석촌동");
		//2]필터를 끼운 출력 스트림 생성]
		ObjectOutputStream oos =
				new ObjectOutputStream(
						new FileOutputStream("src/io24/filter/Object.txt"));
		//3]인스턴화된 객체를 oos로 출력
		oos.writeObject(pe1);
		oos.writeObject(pe2);
		oos.writeObject(pe3);
		//4]스트림 닫기
		oos.close();
	}

}

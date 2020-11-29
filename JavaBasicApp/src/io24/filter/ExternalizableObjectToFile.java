package io24.filter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
직렬화된 PersonExternalizable클래스를 인스턴스화(객체화)하여 파일로 저장

데이터 소스 : PersonExternalizable객체(메모리)
데이터 목적지 : 파일
			노드스트림 : FileOutputStream
객체를 저장하기 위한 필터 스트림 : ObjectOutputStream
 */
public class ExternalizableObjectToFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//1]데이터소스(메모리) 준비 - 입력 스트림 불필요
		PersonExternalizable pe1 = new PersonExternalizable();
		pe1.name = "가길동";
		pe1.age =20;
		pe1.addr = "가산동";
		PersonExternalizable pe2 = new PersonExternalizable("나길동",30,"나산동");
		PersonExternalizable pe3 = new PersonExternalizable("다길동",40,"다산동");
		
		//2]필터를 끼운 출력 스트림 생성]
		ObjectOutputStream oos = 
						new ObjectOutputStream(
								new FileOutputStream("src/io24/filter/Object.java"));
		
		//3]인스턴스화된 객체를 oos로 출력
		oos.writeObject(pe1);
		oos.writeObject(pe2);
		oos.writeObject(pe3);
		
		//4]스트림 닫기
		oos.close();

	}

}

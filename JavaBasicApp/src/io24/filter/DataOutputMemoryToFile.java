package io24.filter;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputMemoryToFile {

	public static void main(String[] args) throws IOException {
		//1]데이터 소스 준비 - 입력 스트림 불필요
		byte b = 100;
		byte[] bArray = {97,98,99,100};
		char ch = '가';
		int num = 256;
		boolean bool = false;
		String str = "안녕 자바! Hello Java! 1234566";
		//2]출력 스트림 생성
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/io24/filter/javaFile.java"));
		//3]메모리에서 데이터읽고 dos로 출력
		//	자바의 각 자료형에 해당하는 출력용 메소드 사용
		dos.writeByte(b);
		dos.write(bArray);
		dos.writeChar(ch);
		dos.writeInt(num);
		dos.writeUTF(str);
		//4]스트림 닫기
		dos.close();
		//읽어올 데이터가 없는경우
		//java.io.EOFException
		
	}

}

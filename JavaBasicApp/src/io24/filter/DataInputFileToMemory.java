package io24.filter;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

public class DataInputFileToMemory {

	public static void main(String[] args) throws IOException {
		//1]입력 노드 스트림 생성
		FileInputStream fis = new FileInputStream("src/io24/filter/javaFile.java");
		/*
		 * [DataInputStream 필터 미사용] - 데이터 제대로 못 읽어 옴
		int data;
		while((data = fis.read()) != -1) {
			System.out.write(data);
			System.out.flush();
		}
		*/
		//2]DataInputStream 필터 사용
		DataInputStream dis = new DataInputStream(fis);
		//3]dis로 읽어서 자바의 각 자료형에 저장
		// 단, 반드시 DataOutputStream으로 출력할때의 순서를 꼭 지켜야함
		byte b = dis.readByte();
		System.out.println(b);
		byte[] barr = new byte[4];
		System.out.println("읽은 바이트 수 : " + dis.read(barr));
		for(byte value : barr) System.out.println(value);
		char ch = dis.readChar();
		System.out.println(ch);
		int n = dis.readInt();
		System.out.println(n);
		boolean bool = dis.readBoolean();
		System.out.println(bool);
		String str = dis.readUTF();
		System.out.println(str);
		
		
		fis.close();

	}

}

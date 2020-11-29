package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutKeyboardToFile {

	public static void main(String[] args) throws IOException {
		//1]바이트 기반 필터를 끼운 입력용 스트림 생성
		BufferedInputStream bis = new BufferedInputStream(System.in);
		//2]바이트 기반 필터를 끼운 출력용 스트림 생성
		BufferedOutputStream bos = new BufferedOutputStream(
									new  FileOutputStream("src/io24/node/KeyboardToFileWriter.txt"));
		//3]bis로 읽고 bos로 출력
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
			bos.flush();
		}
		//4] 스트림 닫기
		bos.close();

	}

}

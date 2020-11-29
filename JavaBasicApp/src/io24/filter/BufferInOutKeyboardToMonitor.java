package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferInOutKeyboardToMonitor {

	public static void main(String[] args) throws IOException {
		/*
		 노드 스트림과 필터 스트림 연결 방법]
		 필터스트림 생성자의 인자로 노드스트림을 전달한다
		 */
		//1]필터를 끼운 입력 스트림 생성
		BufferedInputStream bis = new BufferedInputStream(System.in);
		
		//2]필터를 끼운 출력 스트림 생성
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		//3]bis로 읽고 bos로 출력
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
			bos.flush();
		}
	}

}

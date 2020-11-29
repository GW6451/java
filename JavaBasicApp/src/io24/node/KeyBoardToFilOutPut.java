package io24.node;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class KeyBoardToFilOutPut {

	public static void main(String[] args) throws IOException {
		//1]데이터 입력을 바이트기반의 노드 스트림 생성
		InputStream is = System.in;
		//2-1]파일 출력용
		//Window식 디렉토기 표기법
		//FileputStream fos = new FileputStream("D:\\KYK\\Workspace\\JavaBasicApp\\src\\io24\\node\\KeyBoard.txt");
		//유니스/리눅스식 디렉토기 표기법
		//FileputStream fos = new FileputStream("D:/KYK/Workspace/JavaBasicApp/src/io24/node/KeyBoard.txt");
		//파일경로 : src부터 시작
		FileOutputStream fos = new FileOutputStream("src/io24/node/KeyBoard.txt");
		
		//2-2]모니터 출력용
		PrintStream ps = System.out;
		int ascii;
		while((ascii=is.read())!=-1) {
			//파일로 출력
			fos.write(ascii);
			fos.flush();
			//모니터로 출력
			ps.write(ascii);
			ps.flush();
		}

	}

}

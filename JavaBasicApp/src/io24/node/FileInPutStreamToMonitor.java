package io24.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileInPutStreamToMonitor {

	public static void main(String[] args) throws IOException {
		//1]입력 스트림 생성
		FileInputStream fis = new FileInputStream("src/io24/node/KeyboardCopy.txt");
		//2]출력 스트림 생성
		//모니터용
		PrintStream out = System.out;
		//파일용
		FileOutputStream fos = new FileOutputStream("src/io24/node/KeyboardCopy.txt");
		//fis로 읽고 fos와 out으로 출력
		int data;
		while((data = fis.read())!= -1) {//파일 끝에 도달하면 -1반환
			//파일출력
			fos.write(data);
			fos.flush();
			//모니터출력
			out.write(data);
			out.flush();			
		}
		//스트림닫기
		fis.close();
		fos.close();

	}

}
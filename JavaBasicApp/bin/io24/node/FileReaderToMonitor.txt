package io24.node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

/*
 파일로부터 한 문자씩 읽어서 모니터에 출력
 데이터 소스 파일 :
 			노트 스트림 : FileReader(문자 기반)
 데이터 목적지 : 모니터
 			노트 스트림 : 
 
 */
public class FileReaderToMonitor {

	public static void main(String[] args) throws IOException {
		//1]문자기반  입력 스트림 생성
		FileReader fr = new FileReader("src/io24/node/KeyboardToFileWriter.java");
		//2]브릿지 스트림을 이용해서 바이트 기반 입력을 문자 기반으로 변환
		PrintStream out = System.out;
		int data;
		
		/*
		while((data = fr.read()) != -1) {
			out.write(data);
			out.flush();
		}
		*/
		//3]브릿지 스트림으로 1바이트씩 출력 스트림으로 내보내는 데이터를 문자단위로 변환
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		//4]fr로 읽고 osw로 출력
		char[] cbuf = new char[40];
		int repeatCount = 0, totalChar = 10;
		while((data = fr.read(cbuf)) != -1) {
			repeatCount++;
			totalChar += data;
			osw.write(cbuf,0,data);
			osw.flush();
		}
		System.out.println("읽은 문자수 : "+totalChar+", 반복횟수 : " +repeatCount);
		//
		fr.close();

	}////////main

}/////////close

package io24.node;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 키보드로 읽어서 문자단위로 파일에 출력
 
 브릿지 스트림을 이용해서 1byte씩 읽은 데이터를 문자단위로 변환한다
 
 데이터 소스 : 키보드 - System.iin(1바이트씩)
 브릿지 스트림 : InputStreamReader(문자단위로)
 데이터 목적지 : 파일 - FileWriter(한문자씩 출력)
 
 [자바 IO에서 출력하는 방법]
 
 */
public class KeyboardToFileWriter {

	public static void main(String[] args) throws IOException {
		//1]바이트 기반 입력 스트림 생성
		InputStream is = System.in;
		//2]브릿지 스트림을 이용해서 바이트 기반 입력을 문자 기반으로 변환
		InputStreamReader isr = new InputStreamReader(is);		
		//3]문자 기반의 출력 스트림 생성
		FileWriter fw = new FileWriter("src/io24/node/STDNodeInOutWriter.java");
		int data;
		/*
		//is로 읽고 fw로 출력- 한글 깨짐]
		while((data = is.read()) != -1) {//ctrl+z를 누르면 프로그램 종료
			fw.write(data);
			fw.flush();
		}*/
		//4]isr로 읽어서 fw로 출력
		int totalChar = 0;
		//필터효과 적용전]
		//read()는 바이트 단위가 아니라 문자 단위로 읽는다
		//고로 총 바이트 수를 카운트로 알아내기 힘들다		
		/*
		while((data = isr.read())!=-1) {
			totalChar++;
			fw.write(data);
			fw.flush();
		}
		*/
		//필터 효과 적용]
		char[] cbuf = new char[10];
		//read(cbuf)는 읽은 문자 수 반환
		//실제 데이터는 cbuf에 저장된
		while((data = isr.read(cbuf))!=-1) {
			totalChar += data;
			//write(char[],0,읽은 문자수)
			fw.write(cbuf,0,data);
			fw.flush();
		}
		System.out.println("총 입력 문자수 : "+totalChar);
		//스트림 닫기
		fw.close();

	}//////////main

}///////////close

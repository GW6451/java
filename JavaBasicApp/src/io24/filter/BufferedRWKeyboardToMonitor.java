package io24.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BufferedRWKeyboardToMonitor {

	public static void main(String[] args) throws IOException {
		//1]필터를 끼운 입력 스트림 생성
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		//2]필터를 끼운 출력 스트림 생성
		//BufferedWriter bw = new BufferedWriter(
		//						new OutputStreamWriter(System.out));
		//3]br로 읽고 bw로 출력
		String data;
		/*
		while((data = br.readLine()) != null) {
			//엔터값 추가
			
			bw.write(data+"\r\n");
			bw.flush();
						
			bw.write(data);
			bw.newLine();
			bw.flush();
			
		}*/
		
		//PrintWriter pw = new PrintWriter(System.out);
		PrintWriter pw = new PrintWriter(System.out, true);
		while((data = br.readLine()) != null) {
			pw.println(data);
		}
	
		

	}

}

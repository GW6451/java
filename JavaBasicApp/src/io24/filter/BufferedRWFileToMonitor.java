package io24.filter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedRWFileToMonitor {

	public static void main(String[] args) throws IOException {
		//1]
		BufferedReader br = new BufferedReader(
								new FileReader("src/io24/filter/BufferedRWKeyboardFile.java"));
		
		PrintWriter pw = new PrintWriter(System.out,true);
		
		String data;
		int line = 1;
		while((data = br.readLine()) != null) {
			//문제2] 라인번호를 앞에 붙이고 "java"를 한글 "자바"로 바꿔서 출력해라
			
			pw.println(String.format("%-5s%s", line++, data.replace("java", "자바")));
		}
		br.close();		

	}

}

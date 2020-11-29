package io24.node;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileReaderToFileWriter {

	public static void main(String[] args) throws IOException {
		//문제1]FileInputStreamToMonitor.java를 문자단위로 읽어서
		// FileInputStreamToMonitor.txt 파일로 문자단위로 출력하라
		
		FileReader fr = new FileReader("src/io24/node/FileInPutStreamToMonitor.java");
		FileWriter fw = new FileWriter("src/io24/node/FileInPutStreamToMonitor.txt");
		int data;
		while((data = fr.read()) != -1) {
			fw.write(data);
			fw.flush();
		}
		fr.close();

	}

}

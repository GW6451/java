package io24.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BufferedRWFileToFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
										new FileInputStream("src/io24/filter/BufferedInOutFileToFile.java")));
		PrintWriter pw = new PrintWriter(
								new FileOutputStream("src/io24/filter/BufferedInOutFileToFile.txt",true));
		
		String data;
		while((data = br.readLine()) != null) {
			pw.println(data);
		}
		br.close();
		pw.close();

	}

}

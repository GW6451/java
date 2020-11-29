package io24.filter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutFileToMonitor {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream
						(new FileInputStream("src/io24/node/Keyboard.txt"));
		BufferedOutputStream bos = new BufferedOutputStream
						(new FileOutputStream("src/io24/node/KeyboardCopy.txt"));
		
		int data;
		while((data = bis.read()) != -1) {
			bos.write(data);
			bos.flush();
		}
		bos.close();

	}

}

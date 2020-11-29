package io24.node;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutExample {

	public static void main(String[] args) throws IOException {
		//문제1]STDNodeInOut.java 파일의 내용을 읽어서 모니터와 파일로 출력하라(파일로 출력시 파일명은 STDNodeInOut.txt)
		//방법1]
		/*FileInputStream fis = null;
		FileOutputStream fos = null;		
		try {
			fis = new FileInputStream("src/io24/node/STDNodeInOut.java");
			fos = new FileOutputStream("src/io24/node/STDNodeInOutCopy.txt");
			int data;
			long startTime = System.currentTimeMillis();
			byte[] b = new byte[1024];
			while((data = fis.read(b))!=-1) {
				fos.write(b, 0, data);
			}
			long endTime = System.currentTimeMillis();
			System.out.println("텍스트 복사 소요시간 : "+(endTime-startTime)/1000.0+"초");
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않음"+e.getMessage());
		}
		catch (IOException e) {
			System.out.println("파일 읽기 시 오류"+e.getMessage());
		}
		finally {
			try {
			if(fis != null)fis.close();
			if(fos != null)fos.close();
			}
			catch(IOException e) {
				System.out.println("스트림 닫기시 오류");
			}
		}
		*/
		FileInputStream fis = new FileInputStream("src/io24/node/STDNodeInOut.java");
		FileOutputStream fos = new FileOutputStream("src/io24/node/STDNodeInOutCopy.java");
		int data;
		while((data=fis.read())!=-1) {
			fos.write(data);
			fos.flush();
			System.out.write(data);
		}
		fis.close();
		fos.close();
	}///main

}////class

package io24.filter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.InputMismatchException;

import common.utility.CommonUtilities;

public class BufferedRWKeyboardFile {
	
	/*Scanner클래스의 nextLin()이나 nextInt()같은 메소드 만들기*/
	private static int nextInt() throws InputMismatchException{
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		String inputString = null;
		try {
			inputString = br.readLine();
		} 
		catch (IOException e) {e.printStackTrace();}
		if(!CommonUtilities.isNumber(inputString))
			throw new InputMismatchException();
		return Integer.parseInt(inputString);
	}
	private static String nextLine() {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		String inputString = null;
		try {
			inputString = br.readLine();
		} 
		catch (IOException e) {e.printStackTrace();}
		if(!CommonUtilities.isNumber(inputString))
			throw new InputMismatchException();
		return inputString;
	}

	public static void main(String[] args) throws IOException {
		
		/*BufferedReader br = new BufferedReader(
							new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new FileWriter("src/io24/filter/KeyboardChar.txt"),true);
		
		String data;
		while((data = br.readLine()) != null) {
			pw.println(data);
		}
		pw.close();*/
		
		System.out.println("나이 입력");
		int age = nextInt();
		System.out.println("당신의 10년 후 나이 : "+(age+10));
		System.out.println();

	}

}

package io24.file;

import java.io.File;
import java.text.SimpleDateFormat;

public class WindowExplore {
	private static String getName(String path) {
		
		int beginIndex = path.indexOf(".") != -1? path.lastIndexOf(".")+1 : path.lastIndexOf(".")+1 ;
		return path.substring(beginIndex).toUpperCase();
	}
	public static void main(String[] args) {
		File f = new File("src/io24/node");
		System.out.println("=====================================================================================");
		System.out.println(String.format("%-100s%-50s%-20s%s", "  이름","수정한 날짜","유형","크기"));
		System.out.println("=====================================================================================");
		//문제2]
		File[] files = f.listFiles();
		for(File file:files) {
			String name = file.getName();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E a h:mm");
			String lastmodified = dateFormat.format(file.lastModified());			
			if(file.isDirectory()) {
				System.out.printf("%-44s",name);
				System.out.printf("%-32s",lastmodified);
				System.out.printf("%-6s%-14s",getName(name),"파일 폴더");
			}
			else {
				System.out.printf("%-44s",name);
				System.out.printf("%-32s",lastmodified);
				System.out.printf("%-6s%-14s",getName(name),"파일");
				System.out.printf("%s%-10s",(int)(Math.ceil(file.length()/1024.0)),"KB");
			}
			
			
			System.out.println();
		}
		

	}

}

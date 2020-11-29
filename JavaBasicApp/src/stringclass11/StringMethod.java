package stringclass11;

import java.util.Scanner;

import common.utility.CommonUtilities;

public class StringMethod {

	public static void main(String[] args) {
		//String클래스의 주요 메소드//
		String str1 = "Welcome To Java!";//16
		String str2 = "안녕 자바!";//6
		//1]int length(): 문자열의 길이 반환
		System.out.println("[length()메소드]");
		System.out.println("str1의 문자열 길이:"+str1.length());
		System.out.println("str2의 문자열 길이:"+str2.length());
		//2]char CharAt(int index)
		//:문자열에서 index에 해당하는 하나의 문자를 반환한다
		// index는 0부터 시작한다
		System.out.println("[charAt() 메소드]");
		System.out.println("str1의 5번째 문자 : " +str1.charAt(4));
		System.out.println("str2의 5번째 문자 : " +str2.charAt(4));
		//각 인덱스 위치에 해당하는 문자들 출력]
		for(int i=0; i<str1.length();i++)
			System.out.printf("%d인덱스에 해당하는 문자 : %c%n",i,str1.charAt(i));
		
		String jumin = "012345-1234567";
		System.out.println(jumin.charAt(7)== '1'? "남자":"여자");
		int lastJumin = 1234567;
		//int를 Integer타입으로 바꾼 후 toString()메소드로 문자열로 변경
		//오토박싱하거나 혹은 Integer클래스의 메소드 직접 사용
		Integer inst = lastJumin;///Integer.valueOf(lastJumin);
		System.out.println(inst.toString().charAt(0) == '1'? "남자":"여자");
		System.out.println(Integer.toBinaryString(lastJumin).charAt(0)==  '1'? "남자":"여자");
		//3]int codePointAt(int index) :
		// 문자열에서  index에 해당하는 아스키(유니코드) 코드값 반환
		System.out.println("[codePointAt() 메소드]");
		System.out.println("str1의 4번쨰 문자의 아스키(유니) 코드 값:" + str1.codePointAt(3));
		System.out.println("str2의 4번쨰 문자의 아스키(유니) 코드 값:" + Integer.toHexString(str2.codePointAt(3)));
		System.out.println(CommonUtilities.isNumber("1004"));
		System.out.println(CommonUtilities.isNumber("10a4"));
		//4]int compareTo(String anotherString)
		/*	: 두 문자열을 비교하는 데 첫번째 문자부터 순차적으로 비교해 나간다
		 * 	첫번째 문자열의 아스키 코드값이 크면 양수 작으면 음수
		 * 	첫번째와 두번째 문자열이 모두 같으면 0을 반환한다
		 * #두 문자열의 비교시에는 주로 equals()메소드 사용
		 * 	compareTo()메소드는 정렬할때 사용
		 * 	(오버라이딩한 메소드 안에서)
		 */
		System.out.println("[compareTo()메소드]");
		String str3 = "ABc";
		String str4 = "ABC";
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		System.out.println("ABCD".compareTo("ABCD")==0?"문자열이 같다":"문자열이 다르다");
		System.out.println("ABCD".compareTo("A"));//3(남은 문자수)
		System.out.println("A".compareTo("ABCD"));//-3(부족한 문자수)
		//5]String concat(String str) : 두 문자열을 연결할떄 +와 같은 기능
		
		System.out.println("[concat()메소드]");
		System.out.println("JAVA ".concat("HI"));
		System.out.println("JAVA "+"WORLD "+"HI");
		//6]boolean contains(CharSequence s):
		//문자열에 특정 문자열이 포함되었는지는 판단하는 메소드.특정 문자열이 포함되었으면 true아니면 false반환
		System.out.println("[contains()메소드]");
		System.out.println(str1.contains("To"));
		System.out.println(str1.contains("to"));
		String email = "kim@nate.com";
		System.out.println(email.contains("@")?"이메일 형식이다": "이메일 형식이 아니다");
		//7]static String copyValueOf(char[] data)
		//  static String copyValueOf(char[] data, int offset, int count)
		//  static String ValueOf(char[] data)
		//  static String ValueOf(char[] data, int offset, int count)
		// : char형 배열에 저장된 문자들을 String형으로 반환함
		System.out.println("[ValueOf계열()메소드]");
		char[] chArr = {'A','C','A','D','E','M','Y','!'};
		//위 메소드 사용안하고 char형 배열에 저장된 문자들을 문자열로 반환]
		String stringPlus = "";
		for(int i=0;i<chArr.length;i++)
			stringPlus += chArr[i];
		System.out.println(stringPlus);
		System.out.println(String.copyValueOf(chArr));
		System.out.println(String.copyValueOf(chArr,3,4));
		System.out.println(String.valueOf(chArr));
		System.out.println(String.valueOf(chArr,3,4));
		//8]char[] toCharArray() : 문자열을 char형 배열로 반환
		System.out.println("[toCharArray()메소드]");
		chArr ="가나다라".toCharArray();
		//charr[0]:'가', charr[1]: '나',....
		for(int i=0; i<chArr.length; i++)
			System.out.printf("chArr[%d]:%-4c",i,chArr[i]);
		System.out.println();
		//9]boolean endwsWith(String suffix)
		//	:문자열이 특정 문자열로 끝나면 true, 아니면 false
		System.out.println("[endwsWith()메소드]");
		System.out.println("www.nate.com".endsWith("com"));
		System.out.println("www.nate.com".endsWith("co.kr"));
		//10]boolean startsWith(String prefix)
		// 	: 문자열이 특정 문자열로 시작하면 true, 아니면 false
		System.out.println("[startsWith()메소드]");
		System.out.println("www.nate.com".startsWith("www"));
		System.out.println("www.nate.com".startsWith("http"));
		System.out.println("www.nate.com".startsWith("com"));
		System.out.println("www.nate.com".startsWith("nate",4));
		//11]static String format(String format, Object...args)
		//	:출력 형식을 지정하여 문자열로 반환할때
		System.out.println("[format()메소드]");
		System.out.printf("국어:%d, 영어:%d, 수학:%d, 평균:%.2f%n",90,90,90,270/3.0);
		System.out.format("국어:%d, 영어:%d, 수학:%d, 평균:%.2f%n",90,90,90,270/3.0);
		System.out.println(String.format("국어:%d, 영어:%d, 수학:%d, 평균:%.2f", 90,90,90,270/3.0));
		//12] byte[] getBytes() : 문자열을 byte형 배열로 반환 해줌
		//						    배열로 반환될때 아스키 코드값으로 변환됨
		//						   #한글은 getBytes()로 적용하지 말자
		byte[] by = "ABCD".getBytes();
		for(int i=0; i<by.length;i++)
			//아스키코드로 출력
			//System.out.println(String.format("by[%d] : %d", i, by[i]));
			//해당 문자로 출력
			System.out.println(String.format("by[%d] : %c", i, by[i]));
		//13]int indexOf(String str) : 문자열에서 특정 문자열의 시작 인덱스를 반환, 특정문자열이 없는 경우 -1 반환
		System.out.println("[indexOf()메소드]");
		System.out.println("JAVA".indexOf("AVA"));
		System.out.println("JAVA".indexOf("A"));
		System.out.println("JAVA".indexOf("VA"));
		System.out.println("JAVA".indexOf("aVA"));
		jumin = "123456-1234567";
		int index = jumin.indexOf("-")+1;
		System.out.println(jumin.charAt(index)=='1'? "Man" : "Woman");
		//14]int lastIndexOf(String str) : 문자열에서 특정 문자열의 마지막 인덱스를 반환, 특정문자열이 없는 경우 -1반환
		System.out.println("[lastIndexOf()메소드]");
		System.out.println("JAVA IS JAVA".lastIndexOf("AVA"));
		System.out.println("JAVA".lastIndexOf("A"));
		System.out.println("JAVA".lastIndexOf("VA"));
		System.out.println("JAVA".lastIndexOf("aVA"));
		System.out.println("my.file.txt".lastIndexOf("."));
		//15]
		//String replace(char oldChar, char newChar)
		//String replace(CharSequence target, CharSequence replace)
		System.out.println("[replace()메소드]");
		//#스트링형에 저장된 데이터는 절대 불변
		System.out.println(str1.replace('T', 'G'));
		System.out.println(str1);
		System.out.println(str1.replace("Java", "Korea"));
		System.out.println(str1.replace("Hello", "안녕"));
		System.out.println(str1.replace("o", "a"));
		//replaceAll은 replace와 다르게 일반 문자열은 물론 정규표현식 형태의 문자열도 가능
		System.out.println(str1.replaceAll("o", "a"));
		String password ="1234567";
		System.out.println("PW : "+password.replaceAll("[^1-4]", "*"));
				//[] : 문자의 집합이나 범위를 나타내며 두 문자 사이는 - 기호로 범위를 나타냄 [] 내에서 ^ 가 선행하여 존재하면 not을 나타냄
		//16]String[] split(String regex) : 문자열을 특정구분자(혹은 정규표현식에 맞는 패턴)로 분리해서 String형 배열로
		//									해당 구분자가 없는 경우 배열크기가 1인 String형 배열이 생성되면서 모든 문자열이 0번방에 저장
		System.out.println("[split()메소드]");
		String tel = "010-1234-5678";
		String[] strArr = tel.split("-");
		for(int i=0; i< strArr.length; i++)
			System.out.println(String.format("strArr[%d] : %s", i, strArr[i]));
		
		strArr = tel.split("@");
		for(int i=0; i< strArr.length; i++)
			System.out.println(String.format("strArr[%d] : %s", i, strArr[i]));
		String today = "2020.08.21";
		strArr = today.split("\\.");//.은 정규표현식이 아니다라는 것을  알려주기 위해 \\를 붙인다
		System.out.println(strArr.length);
		for(int i=0; i< strArr.length; i++)
			System.out.println(String.format("strArr[%d] : %s", i, strArr[i]));
		//17]String substring(int beginIndex) : 문자열에서 시작 인덱스부터 문자열 끝까지 추출하는 메소드
		System.out.println("[substring()메소드]");
		System.out.println("Welcome".substring(3));
		String filename = "my.file.homework.ppt";
		int beginIndex = filename.lastIndexOf(".")+1;
		System.out.println("확장자 : "+filename.substring(beginIndex));
		//18]String substring(int beginIndex, int endIndex)
		//시작인덱스부터 끝 인덱스-1 까지 문자열 추출
		//끝 인덱스는 포함 안됨
		//문]
		System.out.println("kim@nate.com".substring(4,8));
		String[] emails = {"a@b.c","kim@cyworld.com","choi@daum.net","lee@naver.com"};
		for(int i=0; i<emails.length; i++) {
			beginIndex=emails[i].lastIndexOf("@")+1;
			int endIndex=emails[i].lastIndexOf(".");
			System.out.println(emails[i].substring(beginIndex, endIndex));
		}
		//19]String toLowerCase() : 대문자를 소문자로
		//20]String toUpperCase() : 소문자를 대문자로
		System.out.println("[toLowerCase()/toUpperCase() 메소드]");
		System.out.println("대문자로 변경:"+str1.toUpperCase());
		System.out.println("소문자로 변경:"+str1.toLowerCase());
		//대소문자 구분없이 아이디 체크하기]
		//회원의 아이디가 소문자 "park"라고 가정하자
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력?");
		String nick = sc.nextLine();
		//1]equalsIgnoreCase(anotherString) 사용
		System.out.println("park".equalsIgnoreCase(nick.trim())? "회원" : "비회원 혹은 아이디 오류");
		//2]toLowerCase()나 toUpperCase()사용
		System.out.println("PARK".equals(nick.toUpperCase().trim())? "회원" : "비회원 혹은 아이디 오류");
		System.out.println("park".equals(nick.toLowerCase().trim())? "회원" : "비회원 혹은 아이디 오류");
		//21]String trim() : 양쪽 끝에 있는 공백 제거
		//문자열은 값을 비교하기 전에 trim()해라 
		//#항상 문자열 비교시에는 트림 후 비교하여라
		System.out.println("트림전 : X"+"     J  A   V   A    "+"X");
		System.out.println("트림후 : X"+"    J A     V      A".trim());
		
		
		
	}//////main

}///////////class

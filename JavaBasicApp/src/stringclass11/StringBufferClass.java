package stringclass11;

public class StringBufferClass {
	/*StringBuffer 클래스:
	 String클래스(immutable)는 String클래스의 메소드를 이용해서 
	 새로운 문자열을 생성하면 원래 문자열은 변하지 않고 새롭게 생성된 문자열을 저장하기 위해서 메모리가 새롭게 생성된다
	 이런메모리 낭비를 막기 위해서 StringBuffer클래스가 사용된다
	 즉 StringBuffer클래스는 원래 값이 변한다(mutable)
	  (메모리가 계속 생기지 않고
	 */
	public static void main(String[] args) {
		// [StringBuffer클래스의 주요 메소드]
		//StringBuffer buf = "HELLO";//직접 대입 불가
		//[StringBuffer클래스를 생성(인스턴스화,객체화)하면서 문자열 초기화하지 않기]
		
		StringBuffer buf = new StringBuffer();
		System.out.println("buf="+buf);
		System.out.println("buf.toString()="+buf.toString());
		System.out.println("buf.length()="+buf.length());
		System.out.println("기본 버퍼 크기 : "+buf.capacity());
		
		String str = new String("");//혹은 Stirng str="";
		System.out.println("str="+str);
		System.out.println("str.toString()="+str.toString());
		System.out.println("str.length()="+str.length());
		
		//1]문자열 저장(계속 연결):StringBuffer append("문자열");
		System.out.println("[append()메소드]");
		buf.append("JAVA");
		System.out.println("[JAVA문자열 저장 후]");
		System.out.println("buf="+buf);
		System.out.println("buf.toString()="+buf.toString());
		System.out.println("buf.length()="+buf.length());
		System.out.println("버퍼 크기 : "+buf.capacity());
		
		buf.append("0123456789").append("ABCD");
		System.out.println("[추가 문자열 저장 후]");
		System.out.println("buf="+buf);
		System.out.println("buf.toString()="+buf.toString());
		System.out.println("buf.length()="+buf.length());
		System.out.println("버퍼 크기 : "+buf.capacity());
		
		//2]trimToSize():저장된 문자열만큼 버퍼크기를 줄인다
		buf.trimToSize();
		System.out.println("trimToSize()호출 후 버퍼 크기 : " + buf.capacity());
		//3]StringBuffer delete(int start, int end)
		//start부터 end-1까지의 문자열 삭제
		System.out.println("[delete()메소드]");
		buf.delete (4, 14);//숫자 부분만 삭제
		System.out.println("삭제 후 : buf="+buf);
		System.out.println("[deleteCharAt()메소드]");
		//4]StringBuffer deleteCharAt(int index): index위치의 한 문자만 삭제
		buf.deleteCharAt(4);
		System.out.println("한 문자 삭제 후  : buf="+buf);
		//5]StringBuffer insert(int index, String str) : index위치에 특정 문자열 삽입
		System.out.println("[insert()메소드]");
		System.out.println("문자열 삽입후 : " + buf.insert(4, "12345"));
		System.out.println("0인덱스에 문자열 삽입후 : " + buf.insert(0, "가나다라"));
		//가나다라JAVA12345BCD
		//JAVA문자열만 알고 있다고 가정
		//JAVA이후의 문자열부터 끝까지 삭제
		int start = buf.indexOf("JAVA")+"JAVA".length();
		int end = buf.length();
		System.out.println("JAVA문자열 이후부터 끝까지 삭제 :"+buf.delete(start, end));
		//6]StringBuffer replace(int start, int end, String str)
		// start 인덱스 부터 end-1인덱스까지의 문자열을 str로 바꾼다
		System.out.println("[replace()메소드]");
		start = buf.indexOf("JAVA");
		end = start + "JAVA".length();
		System.out.println("JAVA를 자바로 REPLACE : "+buf.replace(start, end, "자바"));
		//[특정 문자열로 초기화 하면서 StringBuffer클래스 객체 생성]
		buf = new StringBuffer("123456789");
		System.out.println("buf="+buf);
		System.out.println("buf.toString()="+buf.toString());
		System.out.println("buf.length()="+buf.length());
		System.out.println("버퍼 크기 : "+buf.capacity());
		//7]StringBuffer reverse() 문자열을 반대로 배치
		System.out.println("[reverse() 메소드]");
		System.out.println("문자열을 거꾸로 : "+ buf.reverse());
		String string = "HELLO WORLD!";
		//buf = (StringBuffer)string;//[x] 형변환 및 대입연산 불가
		//생성자를 사용해서 String타입을 StringBuffer타입으로 변경하기
		buf = new StringBuffer(string);
		
		//문]String클래스의 메소드를 이용해서 StringBuffer클래스의 reverse()메소드와 같은 기능을 하는  메소드를 정의
		
		System.out.println("[거꾸로 출력]");
		System.out.println(reverse(string));
		
		
	}////////main
	
	private static String reverse (String value) {
		char[] src = value.toCharArray();
		//char[] src = string.toCharArray();
		char[] restr = new char[src.length];
		//String restring = "";
		for(int i = src.length-1; i>=0; i--)
			restr[src.length-1-i] = src[i];
		return String.valueOf(restr);
		
		/*char[] src = value.toCharArray();
		for(int i=0; i<src.length/2;i++) {
			char temp = src[i];
			src[i] = src[src.length-1-i];
			src[src.length-1-i] = temp;
		}
		return String.copyValueOf(src);*/
		
		
		 /*char[] src = string.toCharArray();
		 String reverseString ="";
		 for(int i =src.length-1;i>=0;i--)
		 	reverseString += src[i];
		 return reverseString;*/
		 	
		
		 
	}/////reverse

}////////class

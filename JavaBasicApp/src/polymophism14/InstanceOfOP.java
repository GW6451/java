package polymophism14;
/*
[InstanceOf 연산자]
- 두 클래스간의 형변환ㅇ ㅣ가능한지 판단하는 연산자
- 해당 인스턴스변숙 ㅏ어떤 타입의 변수인지 판단하는 연산자
- 두 클래스간의 상속관계가 있어야한다

형식]
	인스턴스 변수 instanceof 클래스 타입
 */
class Super{}
class Normal extends Super{}
public class InstanceOfOP {

	public static void main(String[] args) {
		//1]두 클래스간에 상속관계가 존재하지 않을때
		String string = new String("JAVA");
		StringBuffer buffer = new StringBuffer("JAVA");
		//두 클래스간의 상속관계가 존재하지 않아서 대입연산도 불가
		//string = buffer;//[x]
		//buffer = string;
		System.out.println(string instanceof String? "string은 String타입이다":"string은 String타입 아니다");
		System.out.println(string instanceof Object? "string은 Object타입이다":"string은 Object타입 아니다");
		System.out.println(buffer instanceof StringBuffer? "buffer는 StringBuffer타입이다":"buffer는 StringBuffer타입 아니다");
		System.out.println(buffer instanceof Object? "buffer는 Object타입이다":"buffer는 Object타입 아니다");
		//StringBuffer와 String은 서로 상속관계 없어서 컴파일 오류 발생
		//System.out.println(string instanceof StringBuffer);//[x] 
		//System.out.println(buffer instanceof String);//[x]
		
		//2]두 클래스간에 상속관계가 존재할때
		Object object = new Object();
		//String stringObj = (String)object;//[x]실행시 에러
		System.out.println(object instanceof String);//false
		if(object instanceof String) {
			String stringObj =(String)object;
			System.out.println("형변환 일어남");
		}
		
		object = new String();
		String stringObj = (String)object;//[o]
		System.out.println("object instanceof String : "+(object instanceof String));
		
		Super s = new Super();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		
		s = new Normal();
		System.out.println(s instanceof Super);
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Normal);
		Normal n = (Normal)s;
		
	}//////main

}/////////class

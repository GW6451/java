package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		System.out.println("[데이타 소스 : 배열]");
		String[] mountains = {"한라산","지리산","덕유산","치악산","비슬산"};
		Stream<String> stream1 = Arrays.stream(mountains);
		stream1.forEach(a -> System.out.println(a));//최종 연산후 스트림은 닫힌다
//		System.out.println("[Arrays.sort()로 배열 정렬 : 원본 배열이 변경된다]");
//		Arrays.parallelSort(mountains);
//		//stream1.forEach(a -> System.out.println(a));[x]
//		System.out.println(mountains[0]);//원본 배열이 변경됨
//		for(String mountain:mountains) System.out.println(mountain);
		System.out.println("[스트림의 sorted()로 배열 정렬 : 원본 배열이 유지된다]");
		stream1 = Arrays.stream(mountains);
		stream1.sorted().forEach(a -> System.out.println(a));//오름차순
		System.out.println("원본 배열의 0번방 : " + mountains[0]);//원본 배열 유지됨
		//stream1.sorted();[x]스트림이 닫혀서 오류
		//스트림 객체 다시 생성
		stream1 = Arrays.stream(mountains);
		stream1.sorted((s1, s2) -> s2.compareTo(s1)).forEach(a -> System.out.println(a));//내림차순
		System.out.println("[데이터 소스 : 컬렉션]");
//		List<String> list = new Vector<String>();
//		list.add("치악산");
//		list.add("지리산");
//		list.add("덕유산");
//		list.add("비슬산");
//		list.add("한라산");
		List<String> list = Arrays.asList("치악산","지리산","덕유산","비슬산","한라산");
		System.out.println("[Iterator사용해서 출력]");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("[Stream객체의 메소드 사용해서 출력]");
		Stream<String> stream2 = list.stream();
		stream2.forEach(a->System.out.println(a));
		//stream has already been operated upon or closed
		
		//stream2 = list.stream(); // 이 구문 생략시 아래 에러 발생
		//stream2.forEach(a->System.out.println(a));//[x]
		
//		System.out.println("[정렬 : Collections.sort()사용 - 원본 컬렉션이 변경됨]");
//		Collections.sort(list);
//		System.out.println("컬렉션의 0번방 : "+list.get(0));
		
		System.out.println("[정렬 : Collections.sort()사용 - 원본 컬렉션이 유지됨]");
		stream2 = list.stream();//다시 스트림 얻는다
		//stream2.sorted().forEach(a -> System.out.println(a));//default : 오름 차순
		stream2.sorted((s1,s2)->s2.compareTo(s1)).forEach(a -> System.out.println(a));//내림 차순(compareTo)
		System.out.println("컬렉션의 0번방 : "+list.get(0));
	}

}

package collection20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap : Map계열 컬렉션
 * 			키값이 정렬된 상태로 저장되어 있음(디폴트는 오름차순 정렬)
 * 			HashMap보다는 성능이
 */
public class TreeMapApp {

	public static void main(String[] args) {
		
		String[] stringArray = {"홍길동","가길동","도길동","나길동","마길동"};
		//배열 정렬]
		Arrays.sort(stringArray);//원본 배열이 재배치 된다 (in-place방식)
		System.out.println("[배열 정렬 후 출력]");
		for(String ele : stringArray) System.out.println(ele);
		//Arrays.toString() : 배열을 문자열로 변경
		System.out.println(Arrays.toString(stringArray));
		
		int searchIndex = Arrays.binarySearch(stringArray, "도길동");
		System.out.println("searchIndex:" +searchIndex);
		searchIndex = Arrays.binarySearch(stringArray, "너길동");
		System.out.println("searchIndex:" +searchIndex);
		
		List<Integer> list = Arrays.asList(200,1500,35,1004);
		//출력
		for(Integer e:list)System.out.println(e);
		Collections.sort(list);
		System.out.println("[컬렉션 요서 정렬 후 출력]");
		for(Integer e:list)System.out.println(e);
		
		Object[]objectArray =list.toArray();
		System.out.println("리스트를 배열로 변환 후 출력");
		System.out.println(Arrays.toString(objectArray));
		
		TreeMap map = new TreeMap();
		//객체 저장
		map.put('ㄷ',"도길동");
		map.put('ㅎ',"하길동");
		map.put('ㅁ',"마길동");
		map.put('ㄴ',"노길동");
		map.put('ㄱ',"가길동");
		//출력
		System.out.println("[오름차순으로 출력-디폴트]");
		Set keys = map.keySet();
		for(Object key:keys) {
			Object value = map.get(key);
			System.out.println(String.format("%s : %s", key,value));
		}
		System.out.println("[내림차순으로 출력]");
		keys = map.descendingKeySet();
		for(Object key:keys) {
			Object value = map.get(key);
			System.out.println(String.format("%s : %s", key,value));
		}
	}
	

}

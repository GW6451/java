package etcclass12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
	
	private static String dayOfTheWeek(int day) {
		switch(day) {
		case 0 : return "일요일";
		case 1 : return "월요일";
		case 2 : return "화요일";
		case 3 : return "수요일";
		case 4 : return "목요일";
		case 5 : return "금요일";
		default : return "토요일";				
		}
	}/////////dayOfTheWeek
	
	private static String getDate(Date date) {
		
		return String.format("%d년 %d월 %d일 %d시 %d분 %d초",
						date.getYear() + 1900,
						date.getMonth()+1,
						date.getDate(),
						date.getHours(),
						date.getMinutes(),
						date.getSeconds());
		
	}/////getDate

	public static void main(String[] args) throws ParseException {
		/*
		 Date클래스 : 날짜 정보를 다루는 클래스로 대부분 Deprecated되었음
		 Date() 기본생성자나 Date(long date)인자 생성자를 제외한  모든
		 생성자와 대부분의 메소드 Deprecated됨
		 
		 java.util패키지에 있음
		 
		 Date클래스의 toString() 메소드도 메모리의 주소를 문자열로 반환하는 것이 아니라
		 저장된 날짜 데이터를 문자열로 반환되도록 오버라이딩 되었음
		 */
		Date today = new Date();
		System.out.println("today: " + today);
		System.out.println("today.toString() : " +today.toString());
		System.out.println("년도 : " + (today.getYear()+1900));
		System.out.println("오늘은 무슨 요일이죠?");
		//int getDay(): 숫자 반환(0:일요일,1:월요일,2:화요일 ...)
		System.out.println(dayOfTheWeek(today.getDay()));
		
		Date pasteDate = new Date(1970-1900,0,1,0,0,1);
		System.out.println(getDate(pasteDate));
		long diff = pasteDate.getTime();
		System.out.println(diff+(9*60*60*1000));
		/*
		 * Calendar클래스 :
		 * 생성자로 Calendar객체를 인스턴스화할 수 없다
		 * 왜냐하면 접근지정자가 protected이기 때문에
		 * Calendar클래스는 Single tone Design으로 정의됨
		 * 그래서 getInstance()메소드로 인스턴스화함
		 * 
		 * java.util패키지에 존재
		 */
		//Caledar cal = new Calendar();//[x]
		Calendar cal = Calendar.getInstance();
		System.out.println("cal:" +cal);
		System.out.println("cal/toString():" +cal.toString());
		System.out.println("년도:"+cal.get(Calendar.YEAR));
		//1:월요일 2:화요일 3:수요일 ...
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
			case 1 : System.out.println("일요일"); break;
			case 2 : System.out.println("월요일"); break;
			case 3 : System.out.println("화요일"); break;
			case 4 : System.out.println("수요일"); break;
			case 5 : System.out.println("목요일"); break;
			case 6 : System.out.println("금요일"); break;
			default : System.out.println("토요일"); 
		}
		//오전 오후 구분]
		//cal.get(Calendar.AM_PM)의 반환값
		System.out.println(String.format("%d년 %d월 %d일 %s %d시 %d분 %d초",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DATE),
				cal.get(Calendar.AM_PM)==0?"오전":"오후",
				cal.get(Calendar.HOUR),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND)
				));
		
		//Calendar타입으로 날짜 설정-set()메소드
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2020,7,24);
		cal2.set(2021,0,28);
		String date1String = String.format("%d:%d:%d", 
						cal1.get(Calendar.YEAR),
						cal1.get(Calendar.MONTH)+1,
						cal1.get(Calendar.DATE));
		String date2String = String.format("%d:%d:%d",
						cal2.get(Calendar.YEAR),
						cal2.get(Calendar.MONTH)+1,
						cal2.get(Calendar.DATE));
		//System.out.println(cal2-cal1);[x]
		System.out.println(date1String);
		System.out.println(date2String);
		/*
		 * SimpleDateFormat 클래스 : java.text패키지에 있는
		 * 클래스로 날짜 관련 정보를 얻는 데 유용한 클래스 
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("dateFormat:" + dateFormat);
		System.out.println("dateFormat.toString():" + dateFormat.toString());
		//1]Date타입을 String형으로 반환해주는 메소드
		//	날짜 패턴에 맞게 반환해줌
		//	Date -> String
		System.out.println("today:"+dateFormat.format(today));
		System.out.println("today:"+dateFormat.format(pasteDate));
		System.out.println("오늘 날짜 : "+ dateFormat.format(new Date()));
		//2]중간에 날짜 패턴 변경 - applypattern(String 날짜 패턴)
		//	a는 오전/오후를 나타내는 패턴
		//	예로 날짜 패턴에 at을 출력하고 싶다면 a는 패턴을 의미하는 문자이기 때문에
		//	"yyyy년 MM월 dd일 at HH시"라고 하면 에러 그래서 'at'으로 표현하면
		//
		dateFormat.applyPattern("yyyy년 M월 d일 a H시 m분 s초입니다");
		System.out.println("today:"+dateFormat.format(today));
		System.out.println("today:"+dateFormat.format(pasteDate));
		System.out.println("오늘 날짜 : "+ dateFormat.format(new Date()));
		/*
		 * 3] 날짜형식의 문자열을 Date타입으로 반환해주는 메소드
		 * 		Date parse("날짜형식의 문자열");
		 * 		String -> Date
		 *  ##단, 날짜 형식의 문자열이 날짜패턴과 일치해야 한다
		 */
		dateFormat.applyPattern("yyyy/MM/dd");
		String stringDate = "2020/8/1";
		Date parseDate = dateFormat.parse(stringDate);
		System.out.println("parseDate" + parseDate);
		//4]패턴을 반환하는 메소드 : toPattern()
		System.out.println("날짜 패턴 : " +dateFormat.toPattern());
		
		String stFDate = "2020.1.21";
		String stSDate = "2020.1.22";
		SimpleDateFormat simple = new SimpleDateFormat("yyyy.MM.dd");
		//1]String -> Date : parse()
		Date fDate = simple.parse(stFDate);
		Date sDate = simple.parse(stSDate);
		long fTime = fDate.getTime();
		long sTime = sDate.getTime();
		diff = sTime - fTime;
		System.out.println("diff:"+diff);
		System.out.println("초단위 : "+diff/1000);
		System.out.println("분단위 : "+ diff/(1000*60));
		System.out.println("시간단위 : "+diff/(1000*60*60));
		System.out.println("일단위 : "+diff/(1000*60*60*24));
		
		System.out.println("수료일까지 남은 일수:" + common.utility.CommonUtilities.getDifferenceDates("2020-8-24", "2020-1-28", "yyyy-MM-dd", 'D'));
		//Date클래스의 날짜 차이관련 메소드]
		//1]두 날짜 사이의 선후관꼐 판단하는 메소드
		//boolean after()/before()
		System.out.println(fDate.after(sDate)? "fDate가 최근 날짜":"sDate가 최근날짜");
		System.out.println(fDate.before(sDate)? "sDate가 최근 날짜":"fDate가 최근날짜");
		//2]두 날짜가 같은지 비교
		//	같으면 true, 다르면 false
		//	Date클래스의 equals()메소드는 
		//	메모리 주소 비교가 아닌 날짜 비교하도록 오버라이딩 됨
		System.out.println(fDate.equals(sDate)? "두 날짜가 같다":"두 날짜가 다르다");
		//3]int compareTo(Date anotherDate)
		//	두 날짜가 같다면 0반환
		//	다르다면   반환
		System.out.println(fDate.compareTo(sDate));
		System.out.println(sDate.compareTo(fDate));
	}///////////main

	

}///////////////class

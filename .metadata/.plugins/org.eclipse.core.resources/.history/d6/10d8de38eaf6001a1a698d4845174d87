package globalnlocal08;
/*
  멤버 변수(클래스 안에서 선언된 변수):
  	멤버 변수는 해당 클래스안의 모든 메소드에서 사용가능하고 전역변수와 같다
  	멤버변수는 초기화를 하지 않고 사용해도 해당 자료형의 기본값으로 초기화 된다
  	
  지역변수:
  	특정 지역안에서 선언되어 그 지역에서만 사용되는 변수
  	그 지역을 벗어나면 그 변수는 메모리에서 사라진다
  	
  	메소드 안에서 선언된 변수 
  	혹은 block(in,while,for,try문 등){}안에서 선언된 변수를 지역변수라 한다
  	또한 매개변수도 지역변수이다
  	지역변수는 선언된 곳을 벗어나면 메모리가 해제된다
  	지역변수는 사용시 반드시 초기화를 하고 사용해야 한다
  	즉 지역변수는 자동으로 초기화가 안 된다
  	
  	**지역변수 앞에는 modifier중{final/abstract/static}
  		final만 붙일 수 있다
  		abstract는 클래스와 메소드 앞에만 붙일수 있다
  		static은 못 붙임
  		또한 지역변수 앞에는 접근지정자를 붙일 수 없다
  	
 */
public class GlobalNLocalVar {
	//[멤버변수]
	private int mNoInit;//자동 초기화 0으로
	int mInit = 100;//선언과 동시에 초기화 100으로
	int[] mArray = new int[3];//선언과 동시에 메모리 할당 및 주소로 초기화
	//[멤버 메소드]
	int getTotal(int start, int end) {
		int sum;
		//System.out.println(sum);//[x]
		sum = 0;
		System.out.println(sum);//[o]
		for(int i=start; i<=end; i++)
			sum+=i;
		//지역변수 i는 for문 안에서만 사용가능
		//System.out.println("for문이 끝난 후 i: "+i);[x]
		//지역변수 sum, start, end는 getTotal메소드 안에서는 어디든 사용 가능
		System.out.printf("%d부터 %d까지 누적합: %d%n",start,end,sum);
		if(sum % 2 ==0) {
			String strResult;
			//System.out.println(strResult);//[x]초기화 안해서
			strResult="총합은 짝수";//초기화
			System.out.println(strResult);//[o]
		}
		else {
			//strResult는 if블락 안에서만 사용 가능
			//strResult = "총합은 홀수";//[x]
		}
		System.out.println("멤버변수 : mNoInit = " + mNoInit);
		return sum;
	}//getTotal
	public static void main(String[] args) {
		//GlobalNLocalVar클래스 인스턴스화/객체화/메모리생성
		GlobalNLocalVar gnv = new GlobalNLocalVar();
		System.out.println("멤버변수 : mNoInit = " + gnv.mNoInit);
		System.out.println("멤버변수 : mInit = " + gnv.mInit);
		System.out.println("멤버변수 : mArray = " + gnv.mArray);
		int total = gnv.getTotal(1, 10);
		//public int start;//[x]지역변수앞에는 접근지정자 붙일 수 없다
		int start,end;
		//total = gnv.getTotal(start, end);//[x]초기화 하지 않아서
		//초기화
		start=1; end=10;
		total = gnv.getTotal(start, end);
		/*
		 * 배열은 지역에서 선언된 배열이든
		 * 클래스의 멤버로 선언된 배열이든
		 * 해당 자료형으로 초기화된다
		 */
		System.out.println("[클래스의 멤버인 배열:초기화 안함]");
		for(int i=0; i<gnv.mArray.length;i++)
			System.out.printf("%d번방 : %d%n",i,gnv.mArray[i]);
		
		int[] lArray = new int[3];
		System.out.println("[지역에서 선언한 배열:초기화 안함]");
		for(int i=0; i<lArray.length;i++)
			System.out.printf("%d번방 : %d%n",i,lArray[i]);
		
		
	}//////////main

}/////////////class

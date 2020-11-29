package datatype01;

public class variableDeclaration {

	public static void main(String[] args) {
		System.out.println("[변수 선언방법 첫번째]");
		int num;
		//System.out.println(num);[X] ///
		///**지역변수는 초기화하지 않고 사용시 컴파일 오류
		///변수 초기화 : 생성된 메모리에 최초로 값을 할당.
        num = 100; ///메모리에 대임(할당) 해주세요.
        System.out.println(num);//[O]
        System.out.println("[변수 선언방법 두번째-선언과 동시에 초기화]");
        int initNum = 200;
        System.out.println(initNum);
        System.out.println("[변수 선언방법 세번째-동시에 같은 타임의 변수 여러개 선언하기]");
        int fnum, snum = 1000, tnum;
        ///System.out.println(fnum);[x] 초기화가 안되서
        fnum = snum;//fnum 초기화
        System.out.println("fnum="+fnum);
        ///fnum = snum + tnum; [x] tnum 초기화가 안되서
        tnum = 500;
        fnum = snum + tnum;
        System.out.println("fnum="+fnum);
        ///100 = fnum; 항상 대입(할당)연산자의 왼쪽에는 값을 변경할 수 있는 변수가 와야한다. 오른쪽에는 값이나 값이 저장된 변수가 온다.
        ///int fnum;[x]
        ///변수 선언시 에러나는 경우 
        ///[1] 같은 지역(블락)안에서 동일한 이름의 변수 선언시
        ///fnum 과 fNum은 다름. 자바는 엄격하게 대소문자 구분.
        ///[2] 명명 규칙에 어긋나는 경우
        ///[2-1]숫자로 시작하는 경우 int 4you;[x] int you4[o]
        ///[2-2]_sk $를 제외한 특수문자 포함시
        int _undervar, under_var, undervar_; //[o]
        int $dollar, doll$ar, dollar$; //[o]
        ///[2-3]예약어를 변수로 사용하는 경우  int public;[x]  
        int fNum;
	}

}

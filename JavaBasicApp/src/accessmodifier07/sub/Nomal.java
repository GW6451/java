package accessmodifier07.sub;

import accessmodifier07.Super;

public class Nomal extends Super{
	/*
	 * 두 클래스는 상속관계로 다른 패키지 안에 있기 때문에 생략형은 접근이 불가능하므로 상속을 받더라도 보이지 않음 
	 *  */
	void access() {
		//this.packageMehthod();
		this.protectedMethod();
		this.publicMethod();
	}
}

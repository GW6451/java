package accessmodifier07;

public class General {
	/*
	 * private 멤버만 접근 불가
	 * 같은 패키지에 있으므로 생략형 및 protected 및 publicㅇ
	 */
	void access() {
		Super sup = new Super();
		sup.packageMehthod();
		sup.protectedMethod();
		sup.publicMethod();
	}
}

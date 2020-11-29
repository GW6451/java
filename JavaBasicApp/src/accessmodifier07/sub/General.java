package accessmodifier07.sub;

import accessmodifier07.Super;

public class General {
	/*
	 * 다른 패키지에 있고 
	 */
	void access() {
		Super sup = new Super();
		//sup.packageMehthod();
		//sup.protectedMethod();
		//sup.publicMethod();
	}
}

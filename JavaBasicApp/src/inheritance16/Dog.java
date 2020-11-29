package inheritance16;
/*
 * Animal을 상속받은 Dog클래스 생성하자(Animal의 기본생성자 정의안하고 인자 생성자만 정의한 경우)마자 Dog클래스 명에 
 * 레드라인 해결법
 * 1. 부모클래스에 기본 생성자 정의
 * 2. 자식 클래스에서 부모클래스의 인자 생성자 호출
 */
//Dog is a Animal
public class Dog extends Animal {
	//멤버변수]
	//확장멤버]
	String dogKind;
	int year;
	//기본생성자]
	public Dog() {
		super(null,0,null);
		//this(null,9,null);//super와 this는 한 생성자 안에서 동시에 호출할 수 없다(동시 호출 불가)
	}
	//인자생성자]
	public Dog(String species, int year, String gender,String dogKind) {
		/*
		this.species = species;
		this.gender = gender;
		//this.year = year; Dog의 year초기화
		super.year = year;*/
		super(species, year, gender);
		this.dogKind = dogKind;		
	}
	//멤버 메소드]
	void bark() {
		System.out.println(super.year+"살인 "+dogKind+"가(이) 짖다");
		
	}
	void printDog() {
		printAnimal();
		System.out.println(", 개종류 : "+dogKind);
	}
	static void staticMethod() {
		//super - 정적메소드안에서 사용 불가능 (인스턴스형 메소드 안에서만 사용가능) 
	}
	int getSuperYear() {
		//Animal의 year반환
		return super.year;
	}

}

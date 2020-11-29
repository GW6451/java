package homework;

import java.util.Scanner;

/*
1. 이름 및 나이 그리고 주소를 저장할수 있는  멤버변수와
  이름 및 나이 그리고 주소 정보를 출력하는 멤버 메소드를 가진 
  클래스를 설계하여라.  
  클래스명은 Person으로 하여라
​
2.main메소드가 있는 클래스를 정의하여라
  클래스명은 PersonApp로 하여라
​
2-1. main메소드에서 Person[]배열을 선언하여라
2-2. 사용자로부터 인원수를 입력받아 인원수만큼 Person형 배열의 크기를 설정해서 메모리를 할당하여라
2-3. 인원수만큼 반복을 통해 이름 및 나이 주소를 입력받아 위에서 할당한 Person형 배열에 저장하여라
​
2-4. 저장한 결과를 출력하여라
​
모든 입력은 Scannner클래스의 nextLine()을 이용하여라.
즉 인원수 및 나이도 nextLine()으로 입력받아라
*/
public class PersonApp {

	public static void main(String[] args) {
		//2-1. main메소드에서 Person[]배열을 선언하여라
		Person[] person;
		//2-2. 사용자로부터 인원수를 입력받아 인원수만큼 Person형 배열의 크기를 설정해서 메모리를 할당하여라
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수");
		String numberOfPerson = sc.nextLine();
		person = new Person[Integer.parseInt(numberOfPerson)];
		for(int i=0; i<Integer.parseInt(numberOfPerson);i++) {
			person[i] = new Person();
		}
		//2-3. 인원수만큼 반복을 통해 이름 및 나이 주소를 입력받아 위에서 할당한 Person형 배열에 저장하여라
		for(int i=0; i<Integer.parseInt(numberOfPerson);i++) {
			System.out.println(i+1+"번째 사람의 이름 입력");
			person[i].name = sc.nextLine();
			System.out.println(i+1+"번째 사람의 나이 입력");
			person[i].age = Integer.parseInt(sc.nextLine());
			System.out.println(i+1+"번째 사람의 주소 입력");
			person[i].address = sc.nextLine();
		}
		//2-4. 저장한 결과를 출력하여라
		for(int i=0; i<Integer.parseInt(numberOfPerson);i++) {
			System.out.println(i+1+"번째 사람의 정보");
			System.out.println("=========================");
			person[i].printPerson();
			System.out.println("=========================");
		}

	}////main

}/////class

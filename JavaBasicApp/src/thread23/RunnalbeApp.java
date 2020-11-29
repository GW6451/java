package thread23;

class Command{
	void longedMethod() {
		for(int i=0; i<=10; i++) {
			System.out.println(String.format("[실행 중인 스레드명 : %s, i = %s",Thread.currentThread().getName(),i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
//1]Runnable인터페이스 상속
class Soldier extends Command implements Runnable{
	//2]run() 오버라이딩
	@Override
	public void run() {
		longedMethod();
	}
	
}
public class RunnalbeApp {

	public static void main(String[] args) {
		//1]Runnable타입을 Thread클래스의 인자 생성자를 이용해서 Thread타입으로 변환
		Soldier soldier = new Soldier();
		//soldier.start();//[x]:Thread 타입이 아니라서 start가 안뜸
		System.out.println(soldier instanceof Soldier);
		System.out.println(soldier instanceof Command);
		System.out.println(soldier instanceof Runnable);
		//System.out.println(soldier instanceof Thread);//[x]
		Thread th1 = new Thread(soldier);
		th1.setName("1st Thread");
		th1.start();
		Thread th2 = new Thread(soldier,"2nd Thread");
		th2.start();
	
	}/////////main

}///////////class

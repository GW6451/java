package thread23;
//동기화 블락을 이용한 데이터 동기화
//동기화 블락:
/*
 synchronized(동기화할 객체){
 
 	동기화할 로직
 }
 */
/*여러 스레드가 공유하는 데이터(메모리)를 갖고 있는 클래스*/
class DataSyncClass{
	//멤버 변수]
	//여러 스레드가 공유하는 메모리]
	int shareData;
	//인자 생성자]
	public DataSyncClass(int sharData) {
		this.shareData = sharData;
	}
	
}
/*공유 데이터를 사용하는 스레드*/
class DataSyncThread extends Thread{
	//[멤버벼수]
	//공유할 데이터를 갖고 있는 DataSyncThread타입의 멤버 
	DataSyncClass dsc;
	//일정하게 증가 시킬 숫자를 저장할 멤버
	int inc;
	//[인자생성자]
	public DataSyncThread(DataSyncClass dsc, int inc, String threadName) {
		super(threadName);
		this.dsc = dsc;
		this.inc = inc;
	}
	//오래걸리는 메소드
	//DataSyncClass
	void increase(){
		for(int i=0; i<=10; i++) {
			dsc.shareData += inc;
			System.out.println(
					String.format("[스레드명 : %s, 공유 데이터 : %s]",getName(),dsc.shareData));
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void run() {
		//데이터 동기화 전
		increase();
		//데이터 동기화 후
		
		/*synchronized (dsc) {
			increase();
		}*/
	}
	
}

public class DataSynchronized {

	public static void main(String[] args) throws InterruptedException {
		//공유 메모리를 갖고 있는 클래스, 하나만 인스턴스화]
		DataSyncClass dsc = new DataSyncClass(10);
		//두 개의 스레드 생성]
		DataSyncThread dst1 = new DataSyncThread(dsc,2,"1st Thread");
		dst1.start();
		
		dst1.join();
		
		DataSyncThread dst2 = new DataSyncThread(dsc,5,"2nd Thread");
		dst2.start();
		
		
		
	}////////main

}///////////class

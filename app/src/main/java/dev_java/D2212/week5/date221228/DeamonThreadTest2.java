package dev_java.D2212.week5.date221228;

/*
 * 상황에 따라 분리된 스레드로 백그라운드 작업을 해야 하는 경우도 있다.
 * JVM안의 가비지 컬렉션과 같은 작업이 대표적이다.
 * 이런 백그라운드 작업이 일반 스레드로 설정되어 있다면 전원이 종료되거나 사용자가 강제 종료하지 않는 한
 * 애플리케이션은 영원히 정지 하지 않을 것이다.
 * 
 */
public class DeamonThreadTest2 {

	public static void main(String[] args) {
		Thread th = new Thread() {
			public void run() {//Overrid
				try {
					Thread.sleep(5000);//5초동안 정지 - 멈춤 - 죽지는 않았다.
					System.out.println("MyThread 종료");
				} catch (InterruptedException e) {

				}
			}
		};
		// 데몬 스레드로 설정함.
		// 아래와 같이 데몬스레드를 설정하면 내부의 모든 스레드가 종료되지 않아도 어플리케이션이 종료된다.
		//setDaemon을 사용하여 옵션을 true로 주면 스레드와 상관없이 앱을 강제 종료 시킨다.
		//프로그램에서 처리하는 것과 상관없이 별개로 동작해야 하는 것들이 있다면
		//이 메소드를 호출하지 말거나 추가했다면 false로 설정할 것.
		th.setDaemon(false);//false로 하면 MyThread 종료가 출력된다. 이문장이 업으면 false와 결과 같음
		th.start();
		System.out.println("main() 종료");
	}/////////////// end of main

}
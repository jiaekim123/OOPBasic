package chapter15.thread;

class MyThread extends Thread{
	@Override
	public void run() {
		int i;
		
		for(i = 0; i<= 200; i++) {
			System.out.println(i+ " ");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
public class ThreadTest{

	public static void main(String[] args) {
		System.out.println("Start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println("End");
	}

}

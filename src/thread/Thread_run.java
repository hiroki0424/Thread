package thread;

public class Thread_run extends Thread {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("スレッドから出力　：　"+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

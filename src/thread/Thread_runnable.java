package thread;

public class Thread_runnable implements Runnable {
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("スレッド２から出力　：　"+i);
		}
	}

}

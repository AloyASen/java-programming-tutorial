/**
 * 
 */
package demo1;

class runner implements Runnable{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class App {

	/**
	 * 
	 */
	public App() {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Thread t1=new Thread(new runner());
		t1.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println("thread restarted");
		t1.stop();
		System.out.println("thread stopped");
	}
		

}

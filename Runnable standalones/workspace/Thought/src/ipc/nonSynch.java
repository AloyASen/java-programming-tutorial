package ipc;

public class nonSynch {
	 void call(String msg) {
		// TODO Auto-generated method stub
		 System.out.println("["+msg);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("thread interrupted");
		}
		 System.out.println("]");

	}
}

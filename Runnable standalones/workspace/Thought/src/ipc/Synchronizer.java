package ipc;

public class Synchronizer {
	public static void main(String ... args) {
		nonSynch ipc=new nonSynch();
		caller ob1=new caller(ipc, "give");
		caller ob2=new caller(ipc, " me ");
		caller ob3=new caller(ipc, "red");
		//wait for the program to end 
		try {
			ob1.th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ob2.th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ob3.th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("program ended");
	}
}

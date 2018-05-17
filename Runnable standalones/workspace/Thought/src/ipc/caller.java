package ipc;

public class caller implements Runnable{
	String msg;
	Thread th;
	nonSynch obr;
	public caller(nonSynch no , String ms) {
		// TODO Auto-generated constructor stub
		msg=ms;
		obr=no;
		th=new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (obr) {
			obr.call(msg);
		}
	}

}

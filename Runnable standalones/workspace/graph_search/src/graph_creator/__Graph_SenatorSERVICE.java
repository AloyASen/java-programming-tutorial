package graph_creator;

import DataStore_fileSYS.DataSerializer;

public class __Graph_SenatorSERVICE implements Runnable{
	_GraphImplementor GI;
	String u ;
	
	String p ;
	String  nm;
	public __Graph_SenatorSERVICE(String u ,String p ,String  nm) {
		this.u=u;
		this.p=p;
		this.nm=nm;
		 new Thread(this, u+p+nm).start();
		
	}
	
	@Override
	public void run() {
		
			synchronized (GI) {
				try {
					wait();
				} catch (InterruptedException e) {
					System.out.println("exec:interrupt::WaitError");
				}
				CREATE();
				notify();
			}
	}

	private void CREATE() {
		GI.setparam(nm, u+p+nm);
		GI.setDB__ENTRY();
		new DataSerializer(u,p,nm);
		
	} 
		
}


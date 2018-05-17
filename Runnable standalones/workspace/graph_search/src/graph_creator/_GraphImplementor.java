package graph_creator;

import Graph_structural_descriptor.graph_face;

public class _GraphImplementor implements graph_face{
	String NodeName;
	String NodeHash;
	public _GraphImplementor() {
		
	}
	
	@Override
	public void setparam(String name,String nhash) {
		NodeName=name;
	}
	private void setUID() {
		// TODO Auto-generated method stub
		
	}
	private void setUSER_PASS() {
		// TODO Auto-generated method stub
		
	}
	boolean setDB__ENTRY(){
		return false;
		
	}
}

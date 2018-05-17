package program3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class double_linked_list {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		System.out.println("creating a doube linked list");
		//the start address
		do{
		Create_d_link_list();
		//input complete;
		}while(true);
	}

	private static void Create_d_link_list() {
		char sub = 0;
		// TODO Auto-generated method stub
		LeftLink_Double_li_list llink= new LeftLink_Double_li_list();
		RightLink_Double_li_list rlink= new RightLink_Double_li_list();
		System.out.println("input the left link data");
		llink.Left_linkmetadata(llink,rlink);
		System.out.println("Do you want to sub-link this node[y/n]:");
		try {
			sub=(char) br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (sub=='y'|| sub=='Y'){
			Create_d_link_list();
		}
		System.out.println("input the right link data");
		rlink.Right_linkmetadata();
		System.out.println("Do you want to sub-link this node[y/n]:");
		try {
			sub=(char) br.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (sub=='y'|| sub=='Y'){
			Create_d_link_list();
		}
	}
	
}

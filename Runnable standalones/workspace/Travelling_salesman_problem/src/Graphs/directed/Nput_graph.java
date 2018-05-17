package Graphs.directed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nput_graph {

	public Nput_graph() throws NumberFormatException, IOException {
		// TODO Auto-generated constructor stub
		create();
	}
	private void create() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,j;
		System.out.println("Input the total no of cities the salesman has to travel through");
		int tpairs=Integer.parseInt(br.readLine());
		int ar[][]=new int[tpairs][tpairs];
		for(i=0;i<tpairs;i++){
			for ( j = 0; j < ar.length; j++) {
				 ar[i][j]=Integer.parseInt(br.readLine());
				
			}
		}
		System.out.println("input sucess --follow execution for file storage");
		
	}
}

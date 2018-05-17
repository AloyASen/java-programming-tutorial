/**
 * 
 */
package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import Implementation.ProgramPattern;;

/**
 * @author Aloy
 *
 */
public class Main_controller {

	/**
	 * 
	 */
	public Main_controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//here provide the no of profit -weight pairs to be handled
		int tot;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("provide the no of profit -weight pairs to be handled");
		tot=Integer.parseInt(br.readLine());
		ProgramPattern pout[]=new ProgramPattern[tot];
		for (int i = 0; i < tot; i++) {
			pout[i]=new ProgramPattern();
			
			System.out.println("Input the profit-weight pairs of the "+(i+1)+" element");
			System.out.print("profit of the item =");
			pout[i].p=Integer.parseInt(br.readLine());
			System.out.print("weight of the item =");
			pout[i].w=Integer.parseInt(br.readLine());
			pout[i].index=pout[i].p/pout[i].w;
			
			
		}
		System.out.println("provide the total capacity of the Knapsack");
		int capacity=Integer.parseInt(br.readLine());
		Double fracselect []= new Double[tot];	//this array stores the selection complete or fractional 
		
		//All inputs to knapsack is complete
		sort(pout,tot);   // Linear sorting ....sort parameter pout[i].index
		//now fill the knapsack;
		int i=0;
		do {
			if(pout[i].w<=capacity){
				fracselect[i]=1.0;
				capacity-=pout[i].w;
				i++;
			}
			else {
				if (capacity<pout[i].w) {
					fracselect[i]=(double) (capacity /pout[i].w);
					
				}
			}
		} while (capacity !=0);
		System.out.println("the final selected items are");
		for (int j = 0; j < fracselect.length; j++) {
			if (fracselect[j]!=0) {
				System.out.println("new item selected /t item profit="+pout[j].p+"item weight= "+pout[j].w);
				
			}
		}
	}
	private static void sort(ProgramPattern pp[],int tot) {
		// TODO Auto-generated method stub
		ProgramPattern large = null,temp;
		for (int i = 0; i < tot; i++) {
			int m = 0;
			for (int j = i; j < tot; j++) {
				if (i==j) {
					large=pp[j];
					
				} else {
					if(pp[j].index>large.index){
						temp=large;
						large =pp[j];
						pp[j]=temp;
						m=j;
					}
				}
				
			}
			temp=pp[i];
			pp[i]=large;
			pp[m]=temp;
		}
	}

}
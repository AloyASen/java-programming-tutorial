package codejam1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kyc_tablet {
	public static <E> void main(String[] args) {
		Scanner sc = null;
		Scanner ic=null;
		try {
			
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Thought/src/input/inStream"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=sc.nextInt();
		String nan=sc.nextLine();
		String in=sc.nextLine();
		int nan_l=in.length();
		System.out.println(""+in);
		for (int j = 0; j < nan_l; j++) {
			
			ic=new Scanner(in); // new string
			int temp_add = 0;//the addendum
			int p1[];  //the ptr array
			int a[]=new int[nan_l];//the local string representation
			p1=new int[nan_l];
			
			for (int k = 0; k < nan_l; k++) {
				a[k]=Integer.parseInt(ic.next());
			}//local string done
			
			for (int k = 0; k < nan_l; k++) {
				int m = 0;
				if(a[k]<i){
					int t2=a[k]+temp_add;
					if(t2<i && t2>temp_add ){
						p1[m]=k;
					temp_add+=a[k];
						m++;
					}
				}
			}
			
			for (int k = 0; k < nan_l; k++) {
				System.out.println("case #"+ p1[k]);
			}
		}
		
	}
}

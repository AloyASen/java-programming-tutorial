package thought_render;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class seclarge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp=0;int flow =0;int emp2=0;
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/test_20/src/thought_render/though"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (sc.hasNextInt()){
			
			int s=sc.nextInt();
			if (flow!=1 && s>temp) {
				flow=1;
				temp=s;
			}
			if (flow==1 && s>temp) {
				emp2=temp;
				temp=s;
			}
			
			
		} 
		System.out.println("the second larest in the series os"+emp2);
	}
	
}

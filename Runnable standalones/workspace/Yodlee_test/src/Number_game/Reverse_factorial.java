/**
 * 
 */
package Number_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Aloy Aditya Sen
 *
 */
public class Reverse_factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;int i=0,a=0;
		try {
			 sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a=a+10;
		
		if (sc.hasNext()) {
			int n= sc.nextInt();//get thenumber from the file 
			for(i=1; i<10 ; ++i){
				if(n%i==0){
					
				}
			}
					
		} else {

		}

	}

}

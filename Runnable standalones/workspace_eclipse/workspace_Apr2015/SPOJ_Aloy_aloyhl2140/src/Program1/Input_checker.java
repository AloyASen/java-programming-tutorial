/**
 * 
 */
package Program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aloy A Sen
 *
 */
public class Input_checker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i=0 ;
		for (i = 0; i!=42 ;) {
			try {
				i=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("the format of the mumber has been inputed wrongly");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("there has occured an error durnig input please retry");
			}
		}

	}

}

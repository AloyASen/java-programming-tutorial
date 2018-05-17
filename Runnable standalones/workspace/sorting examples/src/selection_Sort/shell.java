/**
 * 
 */
package src.selection_Sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Aloy
 *
 */
public class shell {

	/**
	 * 
	 */
	public shell() {
		// TODO Auto-generated constructor stub
		FileInputStream fin = null;

		try {
			fin=new FileInputStream("Bufferedtext.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("the file Buffered text cannot be opened");
		}
		//read from the file
		
	}

}

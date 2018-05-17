/**
 * 
 */
package controller.input;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import Graphs.*;
/**
 * @author Aloy
 *
 */
public class File_input {

	/**
	 * 
	 */
	public File_input(String n) {
		// TODO Auto-generated constructor stub
		String name = n; // this is the name of the file which will contain all the directed edge values
		Write_to_file(n);
	}
	private void Write_to_file(String file) {
		try {
			FileOutputStream out= new FileOutputStream();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

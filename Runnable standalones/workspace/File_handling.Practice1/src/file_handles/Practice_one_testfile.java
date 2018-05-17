/**
 * 
 */
package file_handles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aloy Aditya Sen
 *
 */
public class Practice_one_testfile {

	/**
	 * @param args  none
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		String name = null;
		
		int i=0;
		// First input the name of the file to be opened along with the extension
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input the filename which is being operated");
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("filename input error Please check and rerun the program");
		}
		try {
			in =new FileInputStream(name);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			do{
				
			try {
				i=in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("cannot read from file review the problem and retry");
			}
			System.out.println((char)i);
			}while(i != -1); // end of file EOF is indicated with this binary
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("cannot close file recheck the problem and try fixing it.");
			}
			
		}	

	}

}

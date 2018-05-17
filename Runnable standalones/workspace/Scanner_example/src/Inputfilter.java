import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Aloy Aditya Sen
 *
 */
public class Inputfilter implements  Runnable{
	int id;

	/**
	 * 
	 */
	public Inputfilter( int id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	synchronized public void run() {
		
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Scanner_example/src/scannerfile.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("provide the inputs");
		for(int i=0; sc.hasNext();i++){
			System.out.println(sc.nextInt());
		}
		sc.close();
	}

}

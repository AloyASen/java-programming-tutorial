package input;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanne {
	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Thought/src/input/inStream"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			in.next();
		
		if (in.hasNext()) {
			System.out.println("the next integer is "+ in.nextInt());
		} else {
			System.out.println("no other elements toprint");
		}
		} while (in.hasNext());
	}

}

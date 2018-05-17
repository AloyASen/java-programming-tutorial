package codejam1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class creep {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Thought/src/input/inStream"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=sc.nextInt();
		String nan=sc.nextLine();
		String in=sc.nextLine();
		for (int j = 0; j < in.length(); j++) {
			System.out.println(Integer.parseInt(in.));
		}
	}
}

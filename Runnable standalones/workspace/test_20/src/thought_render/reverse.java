package thought_render;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		rev();
	}

	private static void rev() {
		// TODO Auto-generated method stub
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/test_20/src/thought_render/though1"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (!sc.hasNext()) {
			return;
		} else {
			String n=sc.next();
			System.out.println("hitch");
			rev();
			System.out.print(n);
		}
		
	}
}

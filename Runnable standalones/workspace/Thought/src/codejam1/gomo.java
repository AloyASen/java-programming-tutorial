package codejam1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class gomo{
	public static void main(String[] args) {
		System.out.println("give input to file instream for file ");
		Scanner sc = null;
		try {
			sc = new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Thought/src/input/inStream"));
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		File fi=new File("E:/newfile.txt");
		System.out.println("hitchka");
		try {
			
			if (!fi.exists()) {
				fi.createNewFile();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			try (FileOutputStream o =new FileOutputStream(fi)){
				System.out.println("hitchka");
				do {
					String a =sc.next();
					a+=" ";
					byte[] content =a.getBytes();
					o.write(content);
					
					fi.setReadOnly();
				
				} while (sc.hasNext());
				o.close();
				System.out.println("file cerated");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		
	}
	
}
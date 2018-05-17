package codejam1;

import java.io.File;

public class mkdirectory {
	public static void main(String[] args) {
		File f=new File("E://newfolder1//newfolder2");
		if (!f.exists()) {
			f.mkdirs();
			System.out.println("directory tree synthesized");
		}
	}
}

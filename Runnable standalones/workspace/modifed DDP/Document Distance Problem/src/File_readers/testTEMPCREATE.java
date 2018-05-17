package File_readers;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Paths;

public class testTEMPCREATE {
	public static void main(String[] args)  {
		File temp;
		try {
			temp = File.createTempFile("aloy", ".al", Paths.get(System.getProperty("user.home")).toFile());
		
			String path =temp.getAbsolutePath();
			System.err.println("temp file created"+ path);
			RandomAccessFile fh =new RandomAccessFile(temp, "rw");
			System.out.println("temp file opened for random access");
			boolean deleted=false;
			try {
				deleted=temp.delete();
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (deleted) {
				System.out.println("temp file deleted");
			} else {
				temp.deleteOnExit();
				System.out.println("temp file scheduled for deletion");
			}
			try {
				String str=" a quick brown fox jumps over the lazy dog ";
				fh.writeUTF(str);
				System.out.println("write"+ str);
				fh.seek(0);
				String out= fh.readUTF();
				System.out.println("read"+out);
				
			} finally {
				// TODO: handle finally clause
				fh.close();
				System.out.println("temp file closed");
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

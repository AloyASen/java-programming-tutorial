package File_readers;


public class filepath {

	public static void main(String[] args) {


		/*		The_reader tr1=new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","ntfs_file_test.txt");
*/
		String file1="H:/Aloy/Document Distance Problem/src/File_readers/ntfs_file_test_2.txt";
		String file2="H:/Aloy/Document Distance Problem/src/File_readers/this _is a_check.txt";
		Thread th = new Thread(new The_reader(file1,file2));
		//Thread th2 =new Thread(new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","this _is a_check.txt"));
		//th2.start();
		th.start();

	}




}

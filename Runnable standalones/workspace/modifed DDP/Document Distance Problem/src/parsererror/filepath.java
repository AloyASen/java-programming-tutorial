package parsererror;


public class filepath {

	public static void main(String[] args) {


		/*		The_reader tr1=new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","ntfs_file_test.txt");
*/
		String file1="F:/jack of crawl/JavaApplication1/src/javaapplication1/javaAccessing Files.txt";
		String file2="F:/jack of crawl/JavaApplication1/src/javaapplication1/javaAccessing Files.txt";
		Thread th = new Thread(new The_reader(file1,file2));
                th.setName("myname");
		//Thread th2 =new Thread(new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","this _is a_check.txt"));
		//th2.start();
		th.start();

	}




}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 
 */

/**
 * @author Aloy Aditya Sen
 *
 */
public class Scan_input {
	
	private static final int ThreadPoolSize=10;
	public static void main(String[] args) throws FileNotFoundException {
		int cases = 0;
		Scanner sc=new Scanner(new File("C:/Users/Aloy Aditya Sen/workspace/Scanner_example/src/scannerfile.txt"));
		if(sc.hasNextInt()){
			cases = sc.nextInt();
		}	
		ExecutorService exec =Executors.newFixedThreadPool(ThreadPoolSize);
		for (int i = 0; i < cases/ThreadPoolSize; i++) {
			exec.submit(new Inputfilter(i));
		}
		exec.shutdown();
		System.out.println("all tasks submitted");
		try {
			exec.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Program execution interrupted");
		}finally{
			System.gc();
		}
		
		System.out.println("all tasks complete");
	}
}

package File_readers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class filepath {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		String file1="C:/Users/AloyA/Google Drive/Runnable standalones";
		 List<String> results;
		//list of all the files in a given folder
		FolderProcessor folderProcessor =new FolderProcessor(file1);
		ForkJoinPool forkJoinPool =new ForkJoinPool(2);
		forkJoinPool.execute(folderProcessor);
		do
	      {
	         System.out.printf("******************************************\n");
	         System.out.printf("Main: Parallelism: %d\n", forkJoinPool.getParallelism());
	         System.out.printf("Main: Active Threads: %d\n", forkJoinPool.getActiveThreadCount());
	         System.out.printf("Main: Task Count: %d\n", forkJoinPool.getQueuedTaskCount());
	         System.out.printf("Main: Steal Count: %d\n", forkJoinPool.getStealCount());
	         System.out.printf("******************************************\n");
	         try
	         {
	            TimeUnit.SECONDS.sleep(1);
	         } catch (InterruptedException e)
	         {
	            e.printStackTrace();
	         }
	      } while ((!folderProcessor.isDone()) );//|| (!documents.isDone()));
	      //Shut down ForkJoinfork using the shutdown() method.
	      forkJoinPool.shutdown();
	      //await quiscence to flag off progress hanging
	      if (forkJoinPool.awaitQuiescence(5, TimeUnit.MINUTES) || forkJoinPool.awaitTermination(5, TimeUnit.MINUTES)) {
			//the process runs for a time less than 5 minutes then this is done
	    	//Write the number of results generated by each task to the console.
		    	  if (forkJoinPool.isTerminated()) {
		    		 
				      results = folderProcessor.join();
				      System.out.printf("System: %d files found.\n", results.size());
				} else if (forkJoinPool.isQuiescent()) {
					
				} 
		      
		} else {
			//if the folder is too big to process within5 min then the following is executed 
			PrintWriter printWriter=new PrintWriter(System.err);
			printWriter.println("either the folder has permission denial problems or the folder os too large to process ");
			printWriter.println("try a subset of the folder provided initially");
		}
	      

		/*		The_reader tr1=new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","ntfs_file_test.txt");
*/
		
		Thread th = new Thread(new The_reader(file1));
		//Thread th2 =new Thread(new The_reader("C:/Users/Aloy Aditya Sen/workspace/Document Distance Problem/src/File_readers/","this _is a_check.txt"));
		//th2.start();
		th.start();

	}




}

package web_browser2;
import java.io.IOException;

public class ProcessBuilderDemo {

   public static void main(String[] args) {

   // create a new list of arguments for our process
   String[] list = {"notepad.exe", "test.txt"};

   // create the process builder
   ProcessBuilder pb = new ProcessBuilder(list);
   try {
   // start the subprocess
   System.out.println("Starting the process..");
   pb.start();
   } catch (IOException ex) {
   ex.printStackTrace();
   }
   }
}
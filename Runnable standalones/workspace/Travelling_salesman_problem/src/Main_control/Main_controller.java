/**
 * 
 */
package Main_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import controller.input.*;
/**
 * @author Aloysen
 *
 */
public class Main_controller {

	/**
	 * 
	 */
	public Main_controller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input the file name where you want to store your data");
		String filenm = null;
		try {
			 filenm=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in filename input ");
		}
		// this name is passed 
		File_input  ob =new File_input(filenm);
		// now the directed graph -- an 2D matrix 
		
		// tranferring control to the directed graphs
		
	}

}

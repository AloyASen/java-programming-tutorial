package array_no_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input2 {

	public input2() {
		// TODO Auto-generated constructor stub
	}
	public static int a2[];
	public static void input(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of the second array");
		int size = 0;
		try {
			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("some problem with format of the number");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("some problem with input handling ");
		}
		 a2=new int[size];
		 System.out.println("input values into th array");
		 for (int i = 0; i < size; i++) {
			 System.out.println("Input the "+(i+1)+"th data ti the array\t [integers only]");
			 try {
				input2.a2[i]=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("some error in calculation");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("some error in calculation");
			}
			
		}
		 // all data input to the initial array is complete
	}

}


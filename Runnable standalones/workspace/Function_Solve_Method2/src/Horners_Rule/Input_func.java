package Horners_Rule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_func {

	// this class will be engaged with console input of the arrays of
	// coefficients and exponents
	int coefficient[];
	int exponent[];
	int x;

	public void Horner_Input(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		System.out.println("please enter the no. of datas to be handled:");
		try {
			count = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please consider your typing error and rerun:");

		}
		// the size of the coefficient[] & exponent[] array is made
		coefficient = new int[count];
		exponent = new int[count];
		// input the values of the arrays
		System.out.println();
		System.out.println("input the value of x:\t(integer)\t:");
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("there is error in something");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("there is error in something");
		}
		System.out.println("input the values of the polynomial");
		for (int i = 0; i < count; i++) {
			System.out.println("Input the coefficient:");
			try {
				coefficient[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("there is error in something");
			}

			System.out.println();
			System.out.println("Input the exponent:");
			try {
				exponent[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("there is error in something");

			}
			System.out.println();

		}

	}

}

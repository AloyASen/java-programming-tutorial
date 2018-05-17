import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Array_sort_asa_ana_desc {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//this code is only a perspective of thought
		//sorting an array in user defined manner
		System.out.println("staringoff with the sort game");
		System.out.println("start giving the index upto"
				+ " which it is to be sorted ascending");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(br.readLine());
		System.out.println("how to sort the array upto "+k+" th  element");
		System.out.println("ascending....\t press 1");
		System.out.println("descending....\t press 2");
		//the input array is given
		int ain[]={4,15,2,9,10,7,1,5,12,22,21,11};
		
	}
	private void sort_ascORdesc() {
		// TODO Auto-generated method stub

	}

}

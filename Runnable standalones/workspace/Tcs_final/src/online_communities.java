import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class online_communities {

	
	int connect;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accepting the no of strings to work with
		int number = 0,i;
		String s = null;
		//no of test cases
		System.out.println("input the number of people in the social community");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		try {
			number=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("there is some problem with input");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("there is some problem with input");
		}
		List<online_communities> users= new ArrayList<online_communities>();	
		for ( i = 0; i <number; i++) {
			online_communities newuser= new online_communities();
			users.add(newuser);
		}
			try {
				 s=(String)br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("there is some problem with input please retry");
			}
			//process string
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j)=='c'||s.charAt(j)=='C'){
					j++;
			
				}
			}
		
		
	}
}	
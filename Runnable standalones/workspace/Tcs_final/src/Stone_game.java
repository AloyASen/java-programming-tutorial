import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Aloy
 *
 */
public class Stone_game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accepting the no of strings to work with
		int number = 0,i;
		int stones = 0;
		//the competators
		int Alice=0,bob=0;
		//no of test cases
		System.out.println("input the number of test cases");
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
		//input and output both together with logic
		for (i  = 0; i<number ; i++) {
			System.out.println("input the number of stones ");
			try {
				stones=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("there is some problem with input");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("there is some problem with input");
			}
			int cpystones=stones;
			for (int k = 0; k < stones; k++) {
				if(Alice==0 && bob==0){
					Alice=1;
					if (cpystones-4==0) {
						Alice=2;
						break;
					}
					cpystones--;
					if (cpystones==0 ) {
						Alice=2;
						break;
					}
					if (bob==0) {
						bob=1;
						if (cpystones-4==0) {
							bob=2;
							break;
						}
						cpystones--;
						if (cpystones==0 ) {
							bob=2;
							break;
						}
					} 
				}else if(Alice==1 && bob==1){
					Alice=0;
					if (cpystones-4==0) {
						Alice=2;
						break;
					}
					cpystones--;
					if (cpystones==0 ) {
						Alice=2;
						break;
					}
					if (bob==1) {
						bob=0;
						if (cpystones-4==0) {
							bob=2;
							break;
						}
						cpystones--;
						if (cpystones==0 ) {
							bob=2;
							break;
						}
					}
					
				}
			}
			if (Alice==2) {
				System.out.print("\t"+ "yes");
			} else if(bob==2) {
				System.out.print("\t"+"no");
			}
			System.out.println();
			//the value reset
			Alice=0;
			bob=0;
		}
	}
}
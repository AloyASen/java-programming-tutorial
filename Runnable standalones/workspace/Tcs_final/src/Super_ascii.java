import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Super_ascii {

	
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		//Accepting the no of strings to work with
		int number = 0,i;
		int j;
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
		if(number>0 && number>100){
			return -1;
		}
		//no of test cases accepted
		String array[]=new String[number];
		//now proceeding to accept T lines of text
		for ( i = 0; i < number; i++) {
			try {
				array[i]=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("there is some problem with input please retry");
			}
		}
			//now logic
			if (array[i].length() > 400 || array[i].length()<0) {
				return -1;
			}
			int ascii, flag = 0;
			for (i  = 0;  i< number; i++) {
					for ( j = 0; j < array[i].length(); j++) {
						//ascii generation
						char c=array[i].charAt(j);
						ascii=array[i].charAt(j);
						ascii-=96;
						int count = 0,k;  //for checking purpose
						for ( k = 0; k < array[i].length(); k++) {
							if(c==array[i].charAt(k)){
								count++;
							}
						}
							//the final checking
							if (count==ascii) {
								flag=1;
								continue;
							} else {
								flag=0;
								break;
							}
						
					}
					//the final output
				if (flag==1) {
					System.out.println(array[i]+"\t"+ "yes");
				} else {
					System.out.println(array[i]+"\t"+ "no");
				}
			}
			return -1;
		
	}

}

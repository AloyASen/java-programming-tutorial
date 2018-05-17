/**
 * 
 */
package tcsPracticeRound1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aloy
 *
 */
public class tcsprctice1 {

	/**
	 * 
	 */
	public tcsprctice1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//first accepting the string of input
		String a = null;
		int len,min,max = 0,s=0;
		try {
			 a=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("there is error in string handling");
		}
		a.trim();
		len=a.length();
		String[] sub= new String[len];
		for(int i=0;i<len;i++){
			if(i==0){
				min=0;max=0;
			}else {
				min=max;
			}
			
			if(String.valueOf(i)==""){
				max=i;				
			}else {
				max=min;
			}
			if(min!=max && max>min ){
				 sub[s]=a.substring(min, max);
				s++;
			}
		}
		//substrings formed
		for(int i=0;i<len;i++){
			String m= sub[i];
			System.out.print(sub[i]);
			for (int j = 0; j < len; j++) {
				if(m.compareTo(sub[j])==0)
					System.out.print(""+sub[j]);
			}
			System.out.println("");
		}
		
			

	}

}

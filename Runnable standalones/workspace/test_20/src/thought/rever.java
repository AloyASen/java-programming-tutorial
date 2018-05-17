package thought;

import java.util.Scanner;

public class rever {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int a[][]= new int[i][j];
		//start location
		int m=sc.nextInt();
		int n=sc.nextInt();
		String s=sc.next();
		System.out.println("hitch");
		int c = 0;
		if (s.charAt(0)=='N') {
			c=1;
		}
		if (s.charAt(0)=='E') {
			c=2;
		}
		if (s.charAt(0)=='S') {
			c=3;
		}
		if (s.charAt(0)=='W') {
			c=4;
		}
		do{
			String si=sc.next();
			int l=si.length();
			char pi;
			
		for (int k = 0; k <l; k++) {
			pi=si.charAt(k);
			if (pi=='L') {
				c=((c-1)%4);
				c=Math.abs(c);
			}
			if (pi=='R') {
				c=((c+1)%4);
			}
			if (pi=='M') {
				switch (c) {
				case  '1':	
					n+=1;
					
					break;
				case  '3':	
					n-=1;
					
					break;
				case  '2':	
					m+=1;
					
					break;
				case '4':	
					m-=1;
					
					break;
			}
			
			
				
				
				}
			}
	}while(sc.hasNext());

	System.out.println("last loc"+m+n);	
	}
}
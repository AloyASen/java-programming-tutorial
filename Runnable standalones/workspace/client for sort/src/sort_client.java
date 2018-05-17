
public class sort_client {

	public sort_client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * this client sends request to SELECTION in the SORTING EXAMPLES package to get his data sorted in ascending order
		 * 
		 */
		int l=args.length;
		int i;
		Integer sort[] = new Integer[l];
		for ( i = 0; i < l; i++) {
			sort[i]=Integer.valueOf(args[i]);
		}
		i=0;
		System.out.println(String.valueOf(sort[i]));
	}

}

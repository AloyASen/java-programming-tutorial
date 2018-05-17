/**
 * 
 */
package selection_Sort;

/**
 * @author Aloy
 *
 */
public class selection {

	/**
	 * @param args
	 * @return args
	 * 
	 */
	
	 private static Integer excel_sort(Integer args) {
		// TODO Auto-generated method stub
		int i,j,small,tmp,pos;
		for (i = 0;  i< args.length; i++) {
			small=args[i];
			pos=i;
			for ( j = i+1; j < args.length-1; j++) {
				if (args[j]<small) {
					small=args[j];
					pos=j;
				}
			}
			tmp=args[i];
			args[i]=args[pos];
			args[pos]=tmp;
		}
		
		//now the array has been sorted in ascending order
		/*
		 * now we require to return the value to the integer array shell
		 */
		 
		 return args;
				 
	}

}

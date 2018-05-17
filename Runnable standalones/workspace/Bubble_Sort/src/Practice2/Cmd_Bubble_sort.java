/**
 * 
 */
package Practice2;

/**
 * @author Aloy
 *
 */
public class Cmd_Bubble_sort {

	/**
	 * 
	 */
	public Cmd_Bubble_sort() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param a
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to sort commandline parameters
		;
		int l=args.length;
		int a[]=new int[l];
		for(int i=0;i<l;i++){
			a[i]=Integer.parseInt(args[i]);
		}
			
		int n = a.length;
        int temp = 0;
       
        for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                       
                       if(a[j-1] > a[j]){
                                //swap the elements!
                                temp = a[j-1];
                                a[j-1] = a[j];
                                a[j] = temp;
                        }
                }    
                       
        }

        System.out.println("");
       
        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < n; i++){
                System.out.print(a[i] + " ");

        }
        }

}



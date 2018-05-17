/**
 * 
 */
package Practice3;

/**
 * @author Aloy
 *
 */
public class Controller_Bubble_call {

	/**
	 * 
	 */
	public Controller_Bubble_call() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[]{5,90,35,45,150,3};
        
        //print array before sorting using bubble sort algorithm
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
                System.out.print(intArray[i] + " ");
        }
       
        //sort an array using bubble sort algorithm
        Inter_class_bubble_sort ob=new Inter_class_bubble_sort();
        ob.bubbleSort(intArray);
       
        System.out.println("");
       
        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
                System.out.print(intArray[i] + " ");

        }
	}    


}

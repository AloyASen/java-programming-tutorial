import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int arr[]){
        //initialize the max diff
        elements = arr;
        maximumDifference = 0;
    }
    public void computeDifference(){
        maximumDifference = 0;
        int n= elements.length;
        //temporary weight matrix
        int temp[][]= new int[n][n];
        for(int i=0;i<n;i++){
            int ref= elements[i];
            for(int j=0; j<n; j++){
                int abs= Math.abs(ref-elements[j]);
                if(j == 0 ){
                    temp[i][j]=abs;
                }else{
                    if(abs >temp[i][j-1] ){
                     temp[i][j] = abs;
                }else{
                    temp[i][j]=  temp[i][j-1];
                    //carry forward
                }   
                }
                
                
            }
            for(int j= 0 ; j<n ; j++){
                    if(maximumDifference < temp[n-1][j] ){
                        maximumDifference = temp[n-1][j];
                    }
                }
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

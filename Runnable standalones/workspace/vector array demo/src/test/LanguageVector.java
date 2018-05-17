/**
 * 
 */
package test;

import java.util.Vector;

/**
 * @author Aloy
 *
 */
public class LanguageVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list =new Vector();
		int  l=args.length;
		for (int i = 0; i < l; i++) {
			list.addElement(args[i]);
			
		}
		list.insertElementAt("cobol", 3);
		int len= list.size();
		String anArray[]= new String[len];
		list.copyInto(anArray);
		for (String str : anArray) {
			System.out.println(str);
		}
	}

}

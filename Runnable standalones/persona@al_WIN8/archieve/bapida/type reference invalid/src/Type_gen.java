/**
 * 
 */

/**
 * @author Aloy Sen
 *this is an invalid piece of code RUNTIME ERROR.....may occur 
 */

public class Type_gen {

	/**
	 * 
	 */
	public Type_gen() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen_class<String> obj1=new gen_class<String>("My name is Aloy","Adityay sen");
		
		System.out.println("object one is of type "+obj1.getClass().getTypeName());
		System.out.println("the output of  the class is "+obj1.ob);
	}

}

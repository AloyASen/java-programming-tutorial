/**
 * 
 */
package enumerate;
import enumerate.Days;

/**
 * @author Aloy
 *
 */
public class Working_days {

	/**
	 * 
	 */
	public Working_days() {
		// TODO Auto-generated constructor stub
	}

	private static void weekend(Days d) {
		// TODO Auto-generated method stub
		if(d.equals(Days.sunday)){
			System.out.println("value= "+ d +"is a holiday");
		}
		
		else if(d.equals(Days.unidentified)){
			System.out.println("value="+ d +"is a not a valid data in the list of days");
		}
		else if(!(d.equals(Days.sunday))){
			System.out.println("value= "+ d +"is not a holiday");
		}
	}
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Days d : Days.values()) {
			weekend(d);
		}
	}

}

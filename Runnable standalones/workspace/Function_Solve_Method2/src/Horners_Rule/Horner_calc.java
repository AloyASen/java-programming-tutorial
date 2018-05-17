/**
 * 
 */
package Horners_Rule;

/**
 * @author Aloy
 *
 */
public class Horner_calc {
	static int temp = 0;

	public static int check_horner(Input_func c, int coe, int exp) {
		int p = 1;
		if (c.exponent[coe] == (exp += 1)) {
			p *= c.x;
			return p;
		} else {
			p = p * (c.x) * check_horner(c, coe, exp);
			if (c.exponent[coe] == (exp)) {
				// this check is to ensure whether the 'exp' value exists in the
				// EXPONENT array
				p *= c.coefficient[coe];
				coe++;
				temp += p;
			} else {
				exp--;
			}
			return p;
			// now lets handover the output to the shell

		}

	}

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input_func c = new Input_func();
		c.Horner_Input(null);
		// here all the inputs have been controlled
		// here all the input to the EXPONENT array should be made in descending
		// order
		int result = check_horner(c, 0, 0);
		// here all the calculations are done
		// and then the output is forwarded to OUTPUT()
		Output_Horner o = new Output_Horner(Horner_calc.temp);
		System.out.println("the result of the calculation is" + o.res);

	}

}

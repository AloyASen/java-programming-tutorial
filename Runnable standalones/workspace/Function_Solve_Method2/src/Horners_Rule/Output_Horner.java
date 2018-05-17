/**
 * 
 */
package Horners_Rule;

/**
 * @author Aloy
 *
 */

import java.awt.*;
import java.applet.*;

public class Output_Horner extends Applet {
	/**
		 * 
		 */
	double res;
	private static final long serialVersionUID = 1L;

	public Output_Horner(int res) {
		// TODO Auto-generated constructor stub
		this.res = res;
	}

	public void paint(Graphics g) {
		g.drawString(" the horner calculation result is " + res, 20, 20);
	}
}

/**
 * 
 */
package Applet_demo;

/**
 * @author Aloy
 *
 */

import java.awt.*;
import java.applet.*;

public class Applet_lifecycle extends Applet {
	/**
		 * 
		 */
	String str=" Applet ";
	int flag=0; //this will count the no of Start stops in the browser
	int counter=0;  //this will be the count of the no of calls to paint function
	private static final long serialVersionUID = 1L;
	
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("Inside init");
		str+=" iniitialize ";
	}
	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Inside start");
		str+=" start ";
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		flag++;
		System.out.println("Inside stop");
		str+="stop ";
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy \t flag="+flag+"\t:: \t counter="+counter);
	}

	public void paint(Graphics g) {
		counter++;
		g.drawString(str, 20, 20);
	}
}

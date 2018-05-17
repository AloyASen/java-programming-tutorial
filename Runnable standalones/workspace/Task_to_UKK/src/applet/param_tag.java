package applet;
import java.applet.*;
import java.awt.*;
public class param_tag extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a ,b;
	public void init() {
		a=0;b=0;		
	}
	public void start() {
		// TODO Auto-generated method stub
		String m,n;
		
		m=getParameter("input1");
		n=getParameter("input2");
		a=Integer.parseInt(m);
		b=Integer.parseInt(n);
	}
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("the total is"+(a+b),20, 40);
	}
	
}

package layouts_JAVA;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MyflowLayout extends Applet implements ActionListener {

    Button b1,b2,b3;
    String msg="demonstrating the layouts";
    public void init()
    {
        setBackground(Color.blue);
        setForeground(Color.white);
        b1=new Button("left alignment");
        b2=new Button("right alignment");
        b3=new Button("center alignment");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);add(b2);add(b3);
    }
    
    public void actionPerformed(ActionEvent e) {
        
        int val;
        if(e.getSource()==b1)
        {
            val=FlowLayout.LEFT;
            msg="layout-left.aligned";
        }
        else if(e.getSource()==b2)
        {
            val=FlowLayout.RIGHT;
            msg="layout-right.aligned";
        }
        else
        {
            val=FlowLayout.CENTER;
            msg="layout-center.aligned";
        }
        setLayout(new FlowLayout(val));
        validate();
        repaint();
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    public void paint(Graphics g)
    {
        g.drawString(msg, 70, 140);
    }
    
    
    

}

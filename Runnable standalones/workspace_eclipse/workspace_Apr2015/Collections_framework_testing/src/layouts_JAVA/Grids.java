package layouts_JAVA;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Grids extends Applet implements ActionListener{

    Button b[];
    String str[]={"1","2","3","4","5","6","7","8","9"};
    public void init()
    {
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.red);
        setLayout(new GridLayout(3,3));
        b=new Button[str.length];
        for(int i=0;i<str.length;i++)
        {
            b[i]=new Button(str[i]);
            b[i].addActionListener(this);
            add(b[i]);
        }
        
    }
    
    public void actionPerformed(ActionEvent e) {
 
         for(int i=0;i<str.length;i++)
        {
            if(e.getSource()==b[i])
             b[i].setVisible(false);
            else
                b[i].setVisible(true);
       }
         validate();
        // throw new UnsupportedOperationException("Not supported yet.");
    }

}

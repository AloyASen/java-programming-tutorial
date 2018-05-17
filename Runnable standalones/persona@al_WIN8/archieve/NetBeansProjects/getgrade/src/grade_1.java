/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class grade extends Applet implements ActionListener{
    String grade="null";
    int val;
    TextField tf;
    public void init(){
        tf=new TextField (10);
        add(tf);
        tf.addActionListener(this);
    }
     public void actionPerformed(ActionEvent e)
     {
         val=Integer.parseInt(e.getActionCommand());
         if (val>=90&&val<=100)
             grade="A";
          else if(val>=60&&val<=89)
                  grade="B";
         else
             grade="failed";
         repaint();

     }
       public void paint(Graphics g)
       {
           g.drawString(grade,100,200);
        setBackground(Color.cyan);
}
}    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
   
        // TODO start asynchronous download of heavy resources
    

    // TODO overwrite start(), stop() and destroy() methods


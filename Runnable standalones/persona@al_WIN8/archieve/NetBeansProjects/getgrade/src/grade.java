/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Aloy Sen
 */
public class grade extends Applet implements  ActionListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String grade="null;
    int val;
    TextField tf;
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        tf=new TextField(10);
        add(tf);
        tf.addActionListener(this);
    }
    

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        val=Integer.parseInt(e.getActionCommand());
        if (val>=90&& val<=100){
            grade="a";
        }else{
            if(val>=60&& val<=89){
                grade="b";
                
                        
            }else{
                repaint();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(grade,200,300);
        setBackground(Color.cyan);
    }
    
}

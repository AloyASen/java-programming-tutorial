/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package getgrade;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aloy Sen
 */
public class Myflowlayout extends Applet implements  ActionListener {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Button b1,b2,b3;
    
    String msg="demonstratingthe layouts";
    
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.cyan);
        setForeground(Color.blue);
        b1=new Button("left alignment");
        b2=new Button("right alignment");
        b3=new Button("center alignment");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        
    }
    

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int val;
        if(e.getSource()==b1) {
            val=FlowLayout.LEFT;
            msg="layout -right alignment";
        }else{
            if (e.getSource()==b2) {
                val=FlowLayout.RIGHT;
                msg="layout -right alignment";
            }
                else{
                        val=FlowLayout.CENTER;
                        msg="layout -center alignment";
                        }
            } 
 
        
        setLayout(new FlowLayout(val));
        validate();
        repaint();
        throw new UnsupportedOperationException("not supported exceptoin");
            
    }

    @Override
    public void paint(Graphics g) {
    g.drawString(msg, 70, 140);
    }
    
    
}

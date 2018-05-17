/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.event.ItemListener;

/**
 *
 * @author Aloy Sen
 */
public class Mycheckbox extends Applet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg="check box options";
    Checkbox cb1,cb2;
    Button b1,b2;
    public void init() {
        // TODO start asynchronous download of heavy resources
    	setFont(new Font("cosmic sans", Font, arg2));
    }

    // TODO overwrite start(), stop() and destroy() methods
}

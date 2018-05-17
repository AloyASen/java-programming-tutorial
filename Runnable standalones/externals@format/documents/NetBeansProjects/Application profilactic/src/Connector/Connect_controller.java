/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connector;

import java.sql.Connection;

/**
 *
 * @author Aloy Sen
 */
public class Connect_controller {
    Connection c;
	
	{
		this.c=new Dbconfig().getConnected();
		/*Dbconfig d=new Dbconfig();
		this.c=d.getConnected();*/
	}
    
}

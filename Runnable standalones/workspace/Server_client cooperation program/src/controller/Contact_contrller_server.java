/**
 * 
 */
package controller;

import client.client_to_sever_contact;
import server.Server_Connect;

/**
 * @author Aloy Sen
 *
 */
public class Contact_contrller_server {

	/**
	 * 
	 */
	//create object of the aerver clien model ...only for testing
	server.Server_Connect ob= new Server_Connect();
	
	public Contact_contrller_server() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		try(client.client_to_sever_contact bind =new client_to_sever_contact()) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

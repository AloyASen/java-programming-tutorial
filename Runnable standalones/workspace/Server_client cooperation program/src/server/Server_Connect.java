package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server_Connect {
	
	
	public static void main(String[] args) throws BindException {
	Socket client =null;
	PrintWriter pout=null;
	ServerSocket sock=null;
	try {
		sock =new ServerSocket(5156);
		//now listens through the port for connections 
		while (true) {
			client=sock.accept();
			//we have a connection now 
			pout =new PrintWriter(client.getOutputStream(),true);
			//write he date to the socket
			pout.println(new Date().toString());
			pout.close();
			client.close();
		}
	} catch (IOException e) {
		// TODO: handle exception
		System.err.println(e);
	}
	finally{
		if (client!=null) {
			try {
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if (sock!=null) {
			try {
				sock.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	}
	public Server_Connect() {
		// TODO Auto-generated constructor stub
	}

}
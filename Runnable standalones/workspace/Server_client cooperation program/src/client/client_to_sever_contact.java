package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client_to_sever_contact {
	
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("unused")
		InputStream in=null;
		BufferedReader bin=null;
		Socket sock=null;
		try {
			//make connection to socket
			sock=new Socket("127.0.0.1", 5155);
			in=sock.getInputStream();
			bin=new BufferedReader(new InputStreamReader(System.in));
			String line;
			while ((line=bin.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e);
		}
		finally{
			if (sock!=null) {
				sock.close();
				
			}
		}
	}

	public client_to_sever_contact() {
		// TODO Auto-generated constructor stub
	}

}

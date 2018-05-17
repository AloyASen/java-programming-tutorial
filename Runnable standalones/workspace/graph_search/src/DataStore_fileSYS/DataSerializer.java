package DataStore_fileSYS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataSerializer implements Serializable{


/**
	 * 
	 */
	private static final long serialVersionUID = -7257227592581261544L;

public DataSerializer(String u, String p, String nm) {
	
	Path p5 = Paths.get(System.getProperty("user.home"),"_mars_Local_REPO", u+nm); //user created 
	File fi=new File(p5.toUri()+u+p+".ser"); //the user object data is  stored here
	try(FileOutputStream fout=new FileOutputStream(fi)) {
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeBytes(nm);
		out.writeBytes(p);
		out.writeBytes(u);
		out.close();
		fi.setLastModified(serialVersionUID);
		fi.setReadOnly();
		System.out.println("new user sucessfully serialized");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

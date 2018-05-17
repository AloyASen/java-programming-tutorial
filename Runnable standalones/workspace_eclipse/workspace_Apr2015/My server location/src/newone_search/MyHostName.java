package newone_search;
 
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class MyHostName {
 
    public static void main(String a[]){
     
        try {
            InetAddress host = InetAddress.getByName("173.194.36.67");
            System.out.println(host.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}

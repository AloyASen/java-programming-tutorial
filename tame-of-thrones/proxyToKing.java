import java.io.IOException;
import java.util.HashSet;
import java.io.*;

interface king{
    void display();
}

class realKing implements king{
    //class data members
    //the no of states participating in the game
    public static final int states = 5;
    // who is the present king
    private String present_king;
    //store the emblem hashes in the array
    int[] emblem_hash= new int[states];
    //the set of appearances after which 
    // king shan becomes the emperor
    HashSet<Integer> set; 
@Override
public void display() {
    System.out.println("the present king of the kingdom of southeros is " + get_present_king());

}

//the getter setter methods for the present king
    private void set_present_king(String name) {
        present_king =name;
    
    }

    public String get_present_king() {
        if (present_king.isEmpty()) {
            return "none";  // there is minimum chances of this being executed
        } else {
            return present_king;
        }
    }
    private void set_emblem_hash() {
        String[] emblems =new String[states];
        emblems[0]= "panda";
        emblems[1]= "octopus";
        emblems[2]= "mammoth";
        emblems[3]= "owl";
        emblems[4]= "dragon";
        //process the hash for all the states of the symbolic patterns 
        //we will use rabin karp algorithm for the programmatic match checking 
        //to decrease time complexity ... with a compromise to space complexity
        //=================

        // this function will process the hash of the state and 
        // store them in the loctions reached
        int i=0;
        for (String emblem : emblems) {
            emblem_hash[i]= process_hash(emblem);
            i++;
        }


    }

    private static int  process_hash(String name) {
        // generate the ascii code all the letters in the string
        //to create the create the hash add all the ascii values together 
        
        // step a convert the string into a char array

        char[] emblem =  name.toCharArray();
        int totalhash =0;
        for (char alphabet  : emblem) {
            totalhash +=(int)alphabet;
        }
        System.out.println("the hash value of " + name + " is :: " + totalhash);        
        return totalhash;

    }

    // the constructor
    public realKing(){
        set_present_king("none");
        //for all the participating states calculate the hashes to be matched
        set_emblem_hash();
    }
    public void takeover_king() {
        if (set.size() >=3) {
            set_present_king("king shan");
        } else {
            //there will beno change 
        }
    }
    public void check_takeover_king(int kingdom) {
        set.add(kingdom);
        System.out.println("taking over kingdom");
        takeover_king();
    }
    

    public void intercept_message(String message) {

        //compute message hash
        int hash= compute_message_hash(message);
        //check hash
        int checksum= 1; 
        for (int testcase: emblem_hash) {
            if(hash == testcase){
                //the hash has matched
                check_takeover_king(checksum);
            }else{
                //the hash did not match 
                checksum++;
            }
        }

    }
    public int compute_message_hash(String message) {
        int input_hash=0;
        char[] input;
        input= message.toCharArray();

        for (char inputchar : input) {
            // check if the input is an alphabet
            // if alphabet then turn it into lowercase and 
            //calculate the total hash of input 
            System.out.println(inputchar);
            if(Character.isLetter(inputchar)){
                Character.toLowerCase(inputchar);
                input_hash +=(int)inputchar;
            }
        }
        System.out.println("the input hash  is"+ input_hash);
        return input_hash;
    }
}


class proxyKing implements king{
@Override
public void display() {
    System.out.println("this is under the kingsmanship of shan");
}
public String send_message()throws IOException {
    String input;        
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    System.out.println("king shan please input the message to be sent ");
    input= br.readLine();
    return input;
}
}
//the king shan is a proxy to the throne of southeros
public class proxyToKing{
    public static void main(String[] args) {
        realKing rKing= new realKing();
        rKing.display();
        proxyKing pKing= new proxyKing();
        try {
            //keep sending 4 messages in the row
            rKing.intercept_message( pKing.send_message() );
            rKing.intercept_message( pKing.send_message() );
            rKing.intercept_message( pKing.send_message() );
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
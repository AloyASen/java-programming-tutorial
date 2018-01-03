import java.io.*;

/**
 * this class is for geek for geeks coding
 */
public class init {

    //total no of participating states in the game 


    public static final int states = 5;

    public static void main(String[] args) 
    throws IOException{
        //this string is responsible for letting the secret to pass on 
        char[] input;        
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        input= (br.readLine()).toCharArray();
        //enter all the name of the animal emblems
        String[] emblems =new String[states];
        int[] emblem_hash= new int[states];
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
        int king_indicator= 0; // this indicator has to be has to be 3 to win over
        for (String emblem : emblems) {
            emblem_hash[i]= process_hash(emblem);
            i++;
        }

        //store the input hash to check if it matches with the state of the art program
        
        int input_hash =0;
        for (char inputchar : input) {
            // check if the input is an alphabet
            // if alphabet then turn it into lowercase and 
            //calculate the total hash of input 
            if(Character.isLetter(inputchar)){
                Character.toLowerCase(inputchar);
                input_hash +=(int)inputchar;
            }
        }

        //print the input hash 

        System.out.println("the input hash is "+ input_hash);

        //check if the hash equals with any one of the state emblems

        for (i =0; i<states; i++){
            if(emblem_hash[i] == input_hash )
                king_indicator ++;
        }
        if (king_indicator >= 3){
            System.out.println("the king has won over the universe");
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
}
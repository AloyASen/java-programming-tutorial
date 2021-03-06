
import java.util.HashSet;

public class SPACE_ec implements ElectionCouncil {
    static int voteCount;
    static boolean Competency;

     HashSet<ElectionCouncil> alligiences;

    public SPACE_ec() {
        alligiences =new HashSet<ElectionCouncil>();
    }

    @Override
    public HashSet<ElectionCouncil> getAlligiences() {
        return alligiences;
    }
    @Override
    public void addAlligiences(ElectionCouncil alligience) {
        alligiences.add(alligience);
    }

    @Override
    public String getRuler() {
        return SPACE.getKing();
    }
    static {
        voteCount = 0;
        Competency = false;
    }

    @Override
    public void getMessages(Message message) {
        if(! isCompetent()){

            boolean checkMessage = checkMessage(message.getMsg().toLowerCase());
            if(checkMessage){
                if( message.getSender().isCompetent()){

                    // this vote count is for a non competent kingdom
                    setVoteCount(getVoteCount() +1 );
                    // this is for the competent kingdom that is sending the messages
                    message.getSender().addAlligiences(message.getReceiver());
                }
            }
        }
    }

    private boolean checkMessage(String msg) {
        char[] EmblemArray = SPACE.emblem.toCharArray();
        /**
         * this is a brute force technique and will be improved if required
         */

        for (char emlm : EmblemArray){
            if(containsChar(msg, emlm) && (occurances(msg, emlm, 0) >= occurances(SPACE.emblem, emlm, 0))){
                // this computation is resource extensive and there fore must be thought of if it goes to production
            }else{
                return false;
            }
        }
        return true;
    }
    /**
     * this class is responsible for collection and manipulation of all the
     * messages sent to it by the High Priest for the election purpose
     */

    public boolean containsChar(String s, char search) {
        if (s.length() == 0)
            return false;
        else
            return s.charAt(0) == search || containsChar(s.substring(1), search);
    }
    public int occurances(String s, char search, int initSize){
        if(s.length() == 0)
            return initSize;
        //go to the end of the string
        initSize = occurances(s.substring(1), search, initSize);

        if (s.charAt(0) == search)
            initSize +=1;

        return initSize;
    }

    public static int getVoteCount() {
        return voteCount;
    }

    public static void setVoteCount(int voteCount) {
        SPACE_ec.voteCount = voteCount;
    }

    @Override
    public boolean isCompetent() {
        return Competency;
    }
    public void setCompetency(boolean competency) {
        Competency = competency;
    }
}

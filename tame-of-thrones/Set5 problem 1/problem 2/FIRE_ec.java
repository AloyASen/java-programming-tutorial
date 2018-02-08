package tame;

import java.util.HashSet;

public class FIRE_ec implements ElectionCouncil {
    static int voteCount;
    static boolean Competency;

     HashSet<ElectionCouncil> alligiences;

    public FIRE_ec() {
        alligiences =new HashSet<ElectionCouncil>();
    }

    @Override
    public  HashSet<ElectionCouncil> getAlligiences() {
        return alligiences;
    }
    @Override
    public void addAlligiences(ElectionCouncil alligience) {
        alligiences.add(alligience);
    }

    @Override
    public String getRuler() {
        return FIRE.getKing();
    }
    static {
        voteCount = 0;
        Competency = false;
    }

    /**
     * this method receives from the high priest and the changes are to be proxied to the states
     * @param message
     */
    @Override
    public void getMessages(Message message) {
        if(! isCompetent()){

            boolean checkMessage = checkMessage(message.getMsg().toLowerCase());
            if(checkMessage){
                // if the sender is competent and the receiver is not
                if( message.getSender().isCompetent()){
                    // this vote count is for a non competent kingdom
                    setVoteCount(getVoteCount() +1 );
                    // this is for the competent kingdom that is sending the messages
                    message.getSender().addAlligiences(message.getReceiver());
                }
            }
        }
    }

    private boolean checkMessage(String msgFromSender) {
        char[] EmblemArray = FIRE.emblem.toCharArray();
        /**
         * this is a brute force technique and will be improved if required
         */

        for (char emlm : EmblemArray){
            if(containsChar(msgFromSender, emlm) && (occurances(msgFromSender, emlm, 0) >= occurances(FIRE.emblem, emlm, 0))){
                // this computation is resource extensive and there fore must be thought of if it goes to production
            }else{
                return false;
            }
        }
        return true;
    }
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
        FIRE_ec.voteCount = voteCount;
    }

    @Override
    public boolean isCompetent() {
        return Competency;
    }
    public void setCompetency(boolean competency) {
        Competency = competency;
    }
}



public class SPACE implements Kingdom {
    private static final String King="Shan"; // this name is fictitious and can be changed according to the needs of the developer
    private static final String emblem;

    private static Kingdom ally;

    static {
        ally = null;
        emblem = "space";
    }

    public static String getKing() {
        return King;
    }


    @Override
    public String ruler() {
        //there has to be one ruler for every state
        return King;
    }

    @Override
    public void getMessage(Kingdom sender, String message) {
        if (checkMessage(message)){
            setAlly(sender);
        }
    }

    private boolean checkMessage(String message) {
        char[] EmblemArray = emblem.toCharArray();
        /**
         * this is a brute force technique and will be improved if required
         */

        for (char emlm : EmblemArray){
            if(containsChar(message, emlm) && (occurances(message, emlm, 0) >= occurances(emblem, emlm, 0))){
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

    @Override
    public void setAlly(Kingdom alliegience) {
        if(ally == null){
            ally = alliegience;
        }else {
            /**
             * this is the primary prevalent constraint given to the code
             * to make codes less redundant to external influendes ... once its set it should not
             * change
             *
             * later other antilocking systems will be introduced
             */
        }
    }
    @Override
    public Kingdom getAlly() {
        if (ally==null){
            return null;

        }
        return ally;
    }


}

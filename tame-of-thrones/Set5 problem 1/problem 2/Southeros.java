
import java.util.HashSet;

public class Southeros implements Kingdom {
    private static String King;
    private static HashSet<ElectionCouncil> alligiences;

    static {
        King = null;
    }


    public String getRuler() {
        if(King == null)
            return "no one";
        else
            return  King;
    }
    public Boolean declareRuler(String name){
        King =name;
        return true;
    }

    public boolean SetAlly(HashSet<ElectionCouncil> alligieceList) {
        if(alligiences == null){
            //the ruler of southeros is only declared once in the process of the election
            //and this result should be locked from any furthur piracy
            alligiences =alligieceList;
            return true;
        }
        return false;
    }

    public  HashSet<ElectionCouncil> getAlly() {
        return alligiences;
    }

    public void setRuler(String name) {
        King = name;
    }
}

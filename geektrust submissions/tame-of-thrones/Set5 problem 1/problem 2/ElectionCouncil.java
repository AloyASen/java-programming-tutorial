
import java.util.HashSet;

public interface ElectionCouncil {
    public void getMessages(Message message);
    public boolean isCompetent();
    public  void addAlligiences(ElectionCouncil alligience);
    public HashSet<ElectionCouncil> getAlligiences();
    public String getRuler();
}

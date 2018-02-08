

public class Southeros implements Kingdom {
    private static String King;

    static {
        King = null;
    }

    @Override
    public String ruler() {
        if(King == null)
            return "no one";
        else
            return  King;
    }
    public Boolean declareRuler(String name){
        King =name;
        return true;
    }

    public static String getKing() {
        return King;
    }

    @Override
    public void getMessage(Kingdom sender, String message) {
        System.out.println("this message is going to be temporarily dropped & will be logged for further betterment of the code ");

    }

    @Override
    public void setAlly(Kingdom alliegience) {

    }

    @Override
    public Kingdom getAlly() {
        return null;
    }

    public void setRuler(String name) {
        King = name;
    }
}

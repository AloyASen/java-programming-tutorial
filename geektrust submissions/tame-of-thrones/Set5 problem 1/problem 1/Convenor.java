
public class Convenor {
    Kingdom kingdom;
    public void sendMessage(Kingdom sender, Kingdom receiver , String message){
        receiver.getMessage(sender, message.toLowerCase());
    }
    public boolean checkAlligience(Kingdom from, Kingdom to){
        if(to.getAlly() != null){
            return from.getClass().getName().equals(to.getAlly().getClass().getName());
        }
        return false;
    }

    public void declareKingOfSoutheros(String king) {
        new Southeros().declareRuler(king);
    }
    public String presentKingOfKingdom(Kingdom kingdom){
        return kingdom.ruler();
    }
}

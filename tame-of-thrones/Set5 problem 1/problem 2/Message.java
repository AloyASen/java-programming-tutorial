

public class Message {
    private final ElectionCouncil sender;
    private final ElectionCouncil receiver;
    private final String msg;

    public Message(ElectionCouncil sender, ElectionCouncil receiver, String msg){

        this.sender = sender;
        this.receiver = receiver;
        this.msg = msg;
    }

    public ElectionCouncil getReceiver() {
        return receiver;
    }

    public ElectionCouncil getSender() {
        return sender;
    }

    public String getMsg() {
        return msg;
    }
}

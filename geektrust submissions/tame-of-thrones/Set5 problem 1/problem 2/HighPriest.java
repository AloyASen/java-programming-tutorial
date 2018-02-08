

import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class HighPriest {

    ElectionCouncil electionCouncil;
    private List<Message> messageList;

    public  void SetReceiverCouncil(ElectionCouncil receiverCouncil, Message message){
        receiverCouncil.getMessages(message);
    }


    public void declareRulerOfSoutheros(String ruler , HashSet<ElectionCouncil> alliegience){

        System.out.println("the ruler of southeros is " + ruler);
        System.out.println("the alligience list of the Ruler :: ");

        for(ElectionCouncil tempCoumcil: alliegience){
            System.out.println(tempCoumcil.getClass().getName());
        }
        System.out.println("total size of the alligience list of the council :: " + alliegience.size());

    }
    public void  display_Alligience(ElectionCouncil electionCouncil ) {

        if(electionCouncil.getAlligiences() != null){

            System.out.println("the name of the election council : "+ electionCouncil.getClass().getName());
            System.out.println("the alligience list of the council :: ");
            for(ElectionCouncil tempCoumcil: electionCouncil.getAlligiences()){
                System.out.println(tempCoumcil.getClass().getName());
            }
            System.out.println("total size of the alligience list of the council :: " + electionCouncil.getAlligiences().size());
        }
    }
    
    public void receiveBallot(List<Message> messages) {
        // tbis is the round one of ballot counting
        this.messageList = messages;



    }

    public void ballotCount(){
        Message[] messagesSelected = randomSelect6();
        for (Message message : messagesSelected){
            SetReceiverCouncil(message.getReceiver(), message);
        }
    }
    private Message[] randomSelect6() {
        /**
         * the high priest can select only 6 messages out of all the messages in the list
         */
        Message[] messageDistill = new Message[6];
        int maxSize = messageList.size();
        Random random =new Random();
        for(int i =0 ; i< 6 ; i++){
            messageDistill[i] = messageList.get(random.nextInt(maxSize)+(int)Math.random());
        }
        return messageDistill;
    }
}

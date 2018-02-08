

import java.util.*;

public class Commencer {
    public static void main(String[] args) {
        // make the messages in the commencer for the high priest
        //send the messages to the high priest
        List<Message> messages =new ArrayList<>();
        String messageArray[]={"Summer is coming",
                "a1d22n333a4444p",
                "oaaawaala",
                "zmzmzmzaztzozh",
                "Go, risk it all",
                "Let's swing the sword together",
                "Die or play the tame of thrones",
                "Ahoy! Fight for me with men and money",
                "Drag on Martin!",
                "When you play the tame of thrones, you win or you die.",
                "What could we say to the Lord of Death? Game on?",
                "Turn us away, and we will burn you first",
                "Death is so terribly final, while life is full of possibilities.",
                "You Win or You Die",
                "His watch is Ended",
                "Sphinx of black quartz, judge my dozen vows",
                "Fear cuts deeper than swords, My Lord.",
                "Different roads sometimes lead to the same castle.",
                "A DRAGON IS NOT A SLAVE.",
                "Do not waste paper",
                "Go ring all the bells",
                "Crazy Fredrick bought many very exquisite pearl, emerald and diamond jewels.",
                "The quick brown fox jumps over a lazy dog multiple times.",
                "We promptly judged antique ivory buckles for the next prize.",
                "Walar Morghulis: All men must die."
        };

        //all the election council instances are to be created before hand
        AIR_ec air_ec = new AIR_ec();
        FIRE_ec fire_ec = new FIRE_ec();
        ICE_ec ice_ec = new ICE_ec();
        LAND_ec land_ec = new LAND_ec();
        SPACE_ec space_ec = new SPACE_ec();
        WATER_ec water_ec = new WATER_ec();
        //get the states participating in the election
        Scanner scanner =new Scanner(System.in);
        System.out.println("give the state as it takes take part in the election");
        while (scanner.hasNextLine()){
            System.out.println("give the state as it takes take part in the election");
            String next = scanner.next();
            switch (next){
                case "Ice" :
                    ice_ec.setCompetency(true);
                    for (String message: messageArray) {
                        messages.add(new Message(ice_ec, fire_ec, message.toLowerCase()));
                        messages.add(new Message(ice_ec, air_ec, message.toLowerCase()));
                        messages.add(new Message(ice_ec, land_ec, message.toLowerCase()));
                        messages.add(new Message(ice_ec, space_ec, message.toLowerCase()));
                        messages.add(new Message(ice_ec, water_ec, message.toLowerCase()));
                    }
                break;
                case "Air":
                    air_ec.setCompetency(true);
                    for (String message: messageArray){
                        messages.add(new Message(air_ec, fire_ec, message.toLowerCase()));
                        messages.add(new Message(air_ec, ice_ec, message.toLowerCase()));
                        messages.add(new Message(air_ec, land_ec, message.toLowerCase()));
                        messages.add(new Message(air_ec, space_ec, message.toLowerCase()));
                        messages.add(new Message(air_ec, water_ec, message.toLowerCase()));
                    }
                    break;
                case "Fire":
                    fire_ec.setCompetency(true);
                    for (String message: messageArray){
                        messages.add(new Message(fire_ec, air_ec, message.toLowerCase()));
                        messages.add(new Message(fire_ec, ice_ec, message.toLowerCase()));
                        messages.add(new Message(fire_ec, land_ec, message.toLowerCase()));
                        messages.add(new Message(fire_ec, space_ec, message.toLowerCase()));
                        messages.add(new Message(fire_ec, water_ec, message.toLowerCase()));
                    }
                    break;
                case "Land":
                    land_ec.setCompetency(true);
                    for (String message: messageArray){
                        messages.add(new Message(land_ec, fire_ec, message.toLowerCase()));
                        messages.add(new Message(land_ec, air_ec, message.toLowerCase()));
                        messages.add(new Message(land_ec, ice_ec, message.toLowerCase()));
                        messages.add(new Message(land_ec, space_ec, message.toLowerCase()));
                        messages.add(new Message(land_ec, water_ec, message.toLowerCase()));
                    }
                    break;
                case "Space":
                    space_ec.setCompetency(true);
                    for (String message: messageArray){
                        messages.add(new Message(space_ec, fire_ec, message.toLowerCase()));
                        messages.add(new Message(space_ec, air_ec, message.toLowerCase()));
                        messages.add(new Message(space_ec, land_ec, message.toLowerCase()));
                        messages.add(new Message(space_ec, ice_ec, message.toLowerCase()));
                        messages.add(new Message(space_ec, water_ec, message.toLowerCase()));
                    }
                    break;
                case "Water":
                    water_ec.setCompetency(true);
                    for (String message: messageArray){
                        messages.add(new Message(water_ec, fire_ec, message.toLowerCase()));
                        messages.add(new Message(water_ec, air_ec, message.toLowerCase()));
                        messages.add(new Message(water_ec, land_ec, message.toLowerCase()));
                        messages.add(new Message(water_ec, space_ec, message.toLowerCase()));
                        messages.add(new Message(water_ec, ice_ec, message.toLowerCase()));
                    }
                    break;


            }
            System.out.println("Continue to next line  y/n ");
            String reenterancy = scanner.next();
            if(reenterancy.equalsIgnoreCase("n"))  break;
        }


        //send the total ballot to the
        HighPriest priest =new HighPriest();
        priest.receiveBallot(messages);

        System.out.println("Going into first round of counting ->>");
        priest.ballotCount();
        //now its time to declare the ruler of southeros
        HashMap<ElectionCouncil, HashSet<ElectionCouncil>> councilHashSetHashMap = new HashMap<ElectionCouncil, HashSet<ElectionCouncil>>();
        if(air_ec.isCompetent()){
            councilHashSetHashMap.put(air_ec,air_ec.getAlligiences());
            priest.display_Alligience(air_ec);

        }
        if(fire_ec.isCompetent()){
            councilHashSetHashMap.put(fire_ec,fire_ec.getAlligiences());
            priest.display_Alligience(fire_ec);
        }
        if(land_ec.isCompetent()){
            councilHashSetHashMap.put(land_ec,land_ec.getAlligiences());

            priest.display_Alligience(land_ec);
        }
        if(space_ec.isCompetent()){
            councilHashSetHashMap.put(space_ec,space_ec.getAlligiences());

            priest.display_Alligience(space_ec);
        }
        if(water_ec.isCompetent()){
            councilHashSetHashMap.put(water_ec,water_ec.getAlligiences());

            priest.display_Alligience(water_ec);
        }
        if(ice_ec.isCompetent()){
            councilHashSetHashMap.put(ice_ec,ice_ec.getAlligiences());

            priest.display_Alligience(ice_ec);
        }

        System.out.println("Going into the second round of counting :: ->>");
        priest.ballotCount();


        if(air_ec.isCompetent()){
            councilHashSetHashMap.put(air_ec,air_ec.getAlligiences());
            priest.display_Alligience(air_ec);

        }
        if(fire_ec.isCompetent()){
            councilHashSetHashMap.put(fire_ec,fire_ec.getAlligiences());
            priest.display_Alligience(fire_ec);
        }
        if(land_ec.isCompetent()){
            councilHashSetHashMap.put(land_ec,land_ec.getAlligiences());

            priest.display_Alligience(land_ec);
        }
        if(space_ec.isCompetent()){
            councilHashSetHashMap.put(space_ec,space_ec.getAlligiences());

            priest.display_Alligience(space_ec);
        }
        if(water_ec.isCompetent()){
            councilHashSetHashMap.put(water_ec,water_ec.getAlligiences());

            priest.display_Alligience(water_ec);
        }
        if(ice_ec.isCompetent()){
            councilHashSetHashMap.put(ice_ec,ice_ec.getAlligiences());

            priest.display_Alligience(ice_ec);
        }



        ElectionCouncil winner =null;
        int maxvotes = 0;
        boolean reVoting =false; //this will only be enabled ifa tie has occured
        for(ElectionCouncil electionCouncil: councilHashSetHashMap.keySet()){
            if(maxvotes == councilHashSetHashMap.get(electionCouncil).size() ){
                System.out.println("there is  a tie in the no of votes that is cast therefore reballoting has to be done ");
                reVoting =true;
            }
            if(maxvotes < councilHashSetHashMap.get(electionCouncil).size()){
                maxvotes= councilHashSetHashMap.get(electionCouncil).size();
                winner = electionCouncil;
                reVoting =false;
            }
            //now cheeck if a tie is there


        }

        while (reVoting){
            priest.ballotCount();


            if(air_ec.isCompetent()){
                councilHashSetHashMap.put(air_ec,air_ec.getAlligiences());
                priest.display_Alligience(air_ec);

            }
            if(fire_ec.isCompetent()){
                councilHashSetHashMap.put(fire_ec,fire_ec.getAlligiences());
                priest.display_Alligience(fire_ec);
            }
            if(land_ec.isCompetent()){
                councilHashSetHashMap.put(land_ec,land_ec.getAlligiences());

                priest.display_Alligience(land_ec);
            }
            if(space_ec.isCompetent()){
                councilHashSetHashMap.put(space_ec,space_ec.getAlligiences());

                priest.display_Alligience(space_ec);
            }
            if(water_ec.isCompetent()){
                councilHashSetHashMap.put(water_ec,water_ec.getAlligiences());

                priest.display_Alligience(water_ec);
            }
            if(ice_ec.isCompetent()){
                councilHashSetHashMap.put(ice_ec,ice_ec.getAlligiences());

                priest.display_Alligience(ice_ec);
            }

            for(ElectionCouncil electionCouncil: councilHashSetHashMap.keySet()){
                if(maxvotes < councilHashSetHashMap.get(electionCouncil).size()){
                    maxvotes= councilHashSetHashMap.get(electionCouncil).size();
                    winner = electionCouncil;
                    reVoting =false;
                }
                //now cheeck if a tie is there
                if(maxvotes == councilHashSetHashMap.get(electionCouncil).size() ){
                    System.out.println("there is  a tie in the no of votes that is cast therefore reballoting has to be done ");
                    reVoting =true;
                }

            }

        }
        //announce the winner of southeros
        Southeros southeros = new Southeros();
        southeros.declareRuler(winner.getRuler());
        southeros.SetAlly(winner.getAlligiences());
        priest.declareRulerOfSoutheros(southeros.getRuler(), southeros.getAlly());
    }


}

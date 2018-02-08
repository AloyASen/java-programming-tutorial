

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Commencer {
    public static void main(String[] args) {

        /**
         * all the stock states taking part in the game of thrones
         * this has been done to remove cases of litter objects all around
         */
        SPACE space =new SPACE();
        /**
         * space kingdom is the present contender to the throne but this
         * code has been adapted and tested to be easily replaced by any
         * other kingdom who wants to send secret messages to others
         *
         * this code does not support multiple kingdoms sending messages to each other
         * later support for this functionality might be added
         */
        AIR air = new AIR();
        ICE ice =new ICE();
        FIRE fire =new FIRE();
        LAND land =new LAND();
        WATER water =new WATER();

        /**
         * we have a director node that acts as the commutator service
         */
        Convenor convenor =new Convenor();
        Scanner scanner = new Scanner(System.in);
        /**
         * find who is the present king of southeros
         */

        findPresentKingOfSoutheros();
        boolean reentrancy = true; //this states how the input loop will be blocked
        Set<Kingdom> alligiances = new HashSet<Kingdom>();
        while (reentrancy){
            System.out.println("give the message ->> [ STATE- in caps] [message]");
            String state= scanner.next();
            String message = scanner.nextLine();
            /**
             * space council will send the messages all other kingdoms to get tbeir allegiance
             */

            switch (state){
                case "ICE":
                    convenor.sendMessage(space, ice,message);
                    if(convenor.checkAlligience(space, ice)){
                        alligiances.add(ice);
                    }
                    break;
                case "AIR":
                    convenor.sendMessage(space, air,message);
                    if(convenor.checkAlligience(space, air)){
                        alligiances.add(air);
                    }
                    break;
                case "FIRE":
                    convenor.sendMessage(space, fire,message);
                    if(convenor.checkAlligience(space, fire)){
                        alligiances.add(fire);
                    }
                    break;
                case "LAND":
                    convenor.sendMessage(space, land,message);
                    if(convenor.checkAlligience(space, land)){
                        alligiances.add(land);
                    }
                    break;
                case "WATER":
                    convenor.sendMessage(space, water,message);
                    if(convenor.checkAlligience(space, water)){
                        alligiances.add(water);
                    }
                    break;


            }

            /**
             * declare the king of southeros
             */
            if(alligiances.size() >=3){
                convenor.declareKingOfSoutheros(space.ruler());
                //give the outputs
                findPresentKingOfSoutheros();
                System.out.println("Allies of ruler ::" );
                displayAlliances(alligiances);
            }else {
                System.out.println("Minimum alligience level of allies not met yet ");
                System.out.println("you need to send more messages to confirm your seat ");
            }
            /**
             * check to set reentrancy
             */
            System.out.println();
            System.out.println("Continue sending [y/n]");
            String flag = scanner.next();
            boolean flagNextCase = true;
            while (flagNextCase){
                flag = scanner.next();
                if(flag.equalsIgnoreCase("n")){
                    flagNextCase = false;
                    reentrancy =false;

                }else if(flag.equalsIgnoreCase("y")){
                    System.out.println("Ok lets try another input :: ");
                    reentrancy = true;
                    flagNextCase =false;
                }else {
                    System.out.println("try again >> ");
                }
            }


        }
        /**
         * display all the data all over again
         */
        System.out.println("the final results of the several proxy messages >> ");
        findPresentKingOfSoutheros();
        System.out.println("Allies of ruler ::" );
        displayAlliances(alligiances);
    }


    private static void displayAlliances(Set<Kingdom> alligiances) {
        for(Kingdom kingdom: alligiances){
            System.out.println(kingdom.getClass().getName());
        }
    }

    private static void findPresentKingOfSoutheros() {
        System.out.println("present king of Southeros " + presentKingOfSoutheros());
    }

    private static String presentKingOfSoutheros() {
        return new Southeros().ruler();
    }
}

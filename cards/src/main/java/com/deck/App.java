package com.deck;

import java.util.Collections;

/**
 * Main class app which creates objects of both Players and Cards and
 * calls the member functions through the object created
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        //welcome message
        System.out.println("welcome to cards game");

        Cards cd=new Cards();

        cd.initilizeSuitOfCards();

        Players players=new Players();

        players.setPlayerSuite();

        players.setSequenceOfPlayers();

        distributeCards(cd, players);

        players.sortSuiteByPlayerName();

        players.sortSuiteByPlayerCardSuiteAndRank();

        players.display();
    }

    /**
     * method distributeCards distributs 9 cards randomnly to players in sequence
     * it checks if the card is already assigned to player if assigned then it 
     * will shuffle again and re  assign the card to payer so that each player gets 
     * different card
     * @param cd
     * @param players
     */
    public static void distributeCards(Cards cd,Players players){
        for(int i=0;i<9;i++){
            for(NodeForPlayer Player:players.playersSuite){
                while (cd.suitOfCards.get(0).taken==true) {
                    cd.shuffle();
                }
                Player.playerCardSuite.add(cd.suitOfCards.get(0));
                cd.suitOfCards.get(0).taken=true;
                Player.map.put(cd.suitOfCards.get(0).suite, Player.map.get(cd.suitOfCards.get(0).suite)+1);
            }
        }
    }
}

package com.deck;

/**
 * class NodeForCard that is the blue print of cards has three member data 
 * suite that stores the suit to which card belongs
 * rank is the  one whih stores the value of card
 * boolean taken switches from false to true if the card is assigned to player
 */
public class NodeForCard {
    String suite,rank;
    boolean taken;
    /**
     * constructor to initilize suite and rank and suite which 
     * we get as parameters and taken to false
     * @param suite
     * @param rank
     */
    NodeForCard(String suite,String rank){
        this.rank=rank;
        this.suite=suite;
        this.taken=false;
    }
}

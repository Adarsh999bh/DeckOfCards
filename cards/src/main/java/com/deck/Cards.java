package com.deck;

import java.util.ArrayList;
import java.util.List;

// class cards 
public class Cards {
    List<NodeForCard> suitOfCards;
    //string array representing ranks in card
    static String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[] suite={"Clubs","Diamonds","Hearts","Spades"};

    //constructor to set the member of card collection  
    public Cards(){
        suitOfCards=new ArrayList<>();
    }
    public void initilizeSuitOfCards(){
        for(int i=0;i<suite.length;i++){
            for(int j=0;j<ranks.length;j++){
                this.suitOfCards.add(new NodeForCard(suite[i], ranks[j]));
            }
        }
    }
}

package com.deck;

// class cards 
public class Cards {
    
    //string array representing ranks in card
    String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String member;

    //constructor to set the member of card collection  
    public Cards(String mamber){
        this.member=mamber;
    }
}

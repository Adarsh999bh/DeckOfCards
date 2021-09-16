package com.deck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * class NodeForPlayer which is blue print of all player members
 * playerName stores name of the player
 * playerCardSuite stores NodeOfCards Objects basically storing all the card that are assigned
 * map is the hashmap to track how many diffrent cards are assigned to each player
 */
public class NodeForPlayer {
    String playerName;
    List<NodeForCard> playerCardSuite;
    Map<String,Integer> map;
    /**
     * constructor which takes player name and initilizes and allocates memory for
     *  all the member data
     * @param playerName
     */
    public NodeForPlayer(String playerName){
        playerCardSuite=new ArrayList<>();
        this.playerName=playerName;
        map=new HashMap<>();
        map.put("Clubs", 0);
        map.put("Diamonds", 0);
        map.put("Hearts", 0);
        map.put("Spades", 0);
    }
}

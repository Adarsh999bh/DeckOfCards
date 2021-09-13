package com.deck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeForPlayer {
    String playerName;
    List<NodeForCard> playerCardSuite;
    Map<String,Integer> map;
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

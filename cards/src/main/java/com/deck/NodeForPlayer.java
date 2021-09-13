package com.deck;

import java.util.ArrayList;
import java.util.List;

public class NodeForPlayer {
    String playerName;
    List<NodeForCard> playerCardSuite;
    public NodeForPlayer(String playerName){
        playerCardSuite=new ArrayList<>();
        this.playerName=playerName;
    }
}

package com.deck;

public class NodeForCard {
    String suite,rank;
    boolean taken;
    NodeForCard(String suite,String rank){
        this.rank=rank;
        this.suite=suite;
        this.taken=false;
    }
}

package com.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

class sortSuiteByPlayerCardSuite implements Comparator<NodeForCard>{
    @Override
    public int compare(NodeForCard nd1,NodeForCard nd2){
        return nd1.suite.compareTo(nd2.suite);
    }

}
class sortSuiteByPlayerCardRank implements Comparator<NodeForCard>{
    @Override
    public int compare(NodeForCard nd1,NodeForCard nd2){
        return nd1.rank.compareTo(nd2.rank);
    }

}

class SortByPlayerName implements Comparator<NodeForPlayer>{

        @Override
        public int compare(NodeForPlayer player1,NodeForPlayer player2){
            return player1.playerName.compareTo(player2.playerName);
        }
} 

public class Players {
    static Scanner sc=new Scanner(System.in);
    List<NodeForPlayer> playersSuite;
    int noOfPlayers;
    public Players(){
        this.playersSuite=new ArrayList<>();
    }
    public void setPlayerSuite(){
        System.out.println("Please enter the number of players (minimum 3 maximum 4)");
        noOfPlayers=Integer.parseInt(sc.nextLine());
        if(noOfPlayers<=2 || noOfPlayers>4){
            this.setPlayerSuite();
        }
        else{
            for(int i=0;i<noOfPlayers;i++){
                System.out.println("Enter the name of Player "+(i+1));
                this.playersSuite.add(new NodeForPlayer(sc.nextLine()));
            }
        }
    }
    public void setSequenceOfPlayers(){
        System.out.println("Before Sequencing");
        //System.out.println(this.playersSuite);
        for(int i=0;i<this.playersSuite.size();i++){
            System.out.println(this.playersSuite.get(i).playerName);
        }
        for(NodeForPlayer player: this.playersSuite){
            int randomIndex=(int) (Math.floor(Math.random()*10) % this.noOfPlayers);
            Collections.swap(this.playersSuite, 0, randomIndex);
        }
        System.out.println("After Sequencing");
        //System.out.println(this.playersSuite);
        for(int i=0;i<this.playersSuite.size();i++){
            System.out.println(this.playersSuite.get(i).playerName);
        }
    }
    public void sortSuiteByPlayerName(){
        this.playersSuite.sort(new SortByPlayerName());
    }
    public void sortSuiteByPlayerCardSuiteAndRank(){
        for(NodeForPlayer player: this.playersSuite){
            player.playerCardSuite.sort(new sortSuiteByPlayerCardRank());
            player.playerCardSuite.sort(new sortSuiteByPlayerCardSuite());
        }
    }
    public void display(){
        for(NodeForPlayer player: this.playersSuite){
            System.out.println("\n\n");
            System.out.println("Player Name : "+player.playerName);
            System.out.println("Player Allocated cards");
            //System.out.println(player.playerCardSuite);
            for(int i=0;i<player.playerCardSuite.size();i++){
                System.out.println(player.playerCardSuite.get(i).rank+" of "+player.playerCardSuite.get(i).suite);
            }
            System.out.println("Distribution of cards");
            for(Entry<String, Integer> m:player.map.entrySet()){
                System.out.println(m.getKey()+" : "+m.getValue());
            }
        }
    }
}

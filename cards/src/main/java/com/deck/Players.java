package com.deck;

/**
 * imports
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;


/**
 * class  sortSuiteByPlayerCardSuite that implements Comparator interface
 * and overrides compare method
 */
class sortSuiteByPlayerCardSuite implements Comparator<NodeForCard>{

    /**
     * compares two strings and returns int
     * @return int
     */
    @Override
    public int compare(NodeForCard nd1,NodeForCard nd2){
        return nd1.suite.compareTo(nd2.suite);
    }

}

/**
 * class  sortSuiteByPlayerCardRank that implements Comparator interface
 * and overrides compare method
 */
class sortSuiteByPlayerCardRank implements Comparator<NodeForCard>{

     /**
     * compares two strings and returns int
     * @return int
     */
    @Override
    public int compare(NodeForCard nd1,NodeForCard nd2){
        return nd1.rank.compareTo(nd2.rank);
    }

}

/**
 * class  SortByPlayerName that implements Comparator interface
 * and overrides compare method
 */
class SortByPlayerName implements Comparator<NodeForPlayer>{

        /**
        * compares two strings and returns int
        * @return int
        */
        @Override
        public int compare(NodeForPlayer player1,NodeForPlayer player2){
            return player1.playerName.compareTo(player2.playerName);
        }
} 


/**
 * class Players that containts  essential members to implement the deck of cards
 * playersSuite is the collection of NodeForPlayer calss
 * noOfPlayers keeps track of number of players playing
 */
public class Players {

    static Scanner sc=new Scanner(System.in);
    List<NodeForPlayer> playersSuite;
    int noOfPlayers;
    public Players(){
        this.playersSuite=new ArrayList<>();
    }

    /**
     * method setlayerSuite initiliezes the list with NodeForPlayer NodeForPlayerbject
     * it checks if the enterd number f layers is les than 2 r greater than 4 then 
     * the functin calls itself recursively
     */
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

    /**
     * method setSequenceOfPlayers sets thesequence in which cardss will be assigned t each alers
     * here we select a randm index and swa the randmindex element with 0th element
     * so that sequencing is randm 
     */
    public void setSequenceOfPlayers(){
        System.out.println("Before Sequencing");
        for(int i=0;i<this.playersSuite.size();i++){
            System.out.println(this.playersSuite.get(i).playerName);
        }
        for(NodeForPlayer player: this.playersSuite){
            int randomIndex=(int) (Math.floor(Math.random()*10) % this.noOfPlayers);
            Collections.swap(this.playersSuite, 0, randomIndex);
        }
        System.out.println("After Sequencing");
        for(int i=0;i<this.playersSuite.size();i++){
            System.out.println(this.playersSuite.get(i).playerName);
        }
    }

    /**
     * methd sortSuiteByPlayerName srts suite by layer name using Cmaratr
     */
    public void sortSuiteByPlayerName(){
        this.playersSuite.sort(new SortByPlayerName());
    }

    /**
     * methd sortSuiteByPlayerCardSuiteAndRank srts suite by card rank and card suite 
     * using cmaratr interface
     */
    public void sortSuiteByPlayerCardSuiteAndRank(){
        for(NodeForPlayer player: this.playersSuite){
            player.playerCardSuite.sort(new sortSuiteByPlayerCardRank());
            player.playerCardSuite.sort(new sortSuiteByPlayerCardSuite());
        }
    }
    /**
     * this is the display method to print all the player suit
     * and their card distribution
     */
    public void display(){
        for(NodeForPlayer player: this.playersSuite){
            System.out.println("\n\n");
            System.out.println("Player Name : "+player.playerName);
            System.out.println("Player Allocated cards");
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

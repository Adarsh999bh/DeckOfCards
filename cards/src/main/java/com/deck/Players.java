package com.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(this.playersSuite);
        for(NodeForPlayer player: playersSuite){
            int randomIndex=(int) (Math.floor(Math.random()*10) % this.noOfPlayers);
            Collections.swap(this.playersSuite, 0, randomIndex);
        }
        System.out.println("After Sequencing");
        System.out.println(this.playersSuite);
    }
}

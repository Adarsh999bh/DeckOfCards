package com.deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Players {
    static Scanner sc=new Scanner(System.in);
    List<NodeForPlayer> playersSuite;
    public Players(){
        this.playersSuite=new ArrayList<>();
    }
    public void setPlayerSuite(){
        System.out.println("Please enter the number of players (minimum 3 maximum 4)");
        int noOfPlayers=Integer.parseInt(sc.nextLine());
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
}

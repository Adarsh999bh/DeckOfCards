package com.deck;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static List<NodeForCard> suite;
    public static void main( String[] args )
    {
        //welcome message
        System.out.println("welcome to cards game");
        Cards cd=new Cards();
        cd.initilizeSuitOfCards();

    }
}

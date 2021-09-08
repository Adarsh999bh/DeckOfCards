package com.deck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //welcome message
        System.out.println( "welcome to cards game" );

        //creating array of Cards class so that picking randomnly becomes easy
        Cards[] cards={new Cards("Clubs"),new Cards("Diamonds"),new Cards("Hearts"),new Cards("Spades")};

    }
}

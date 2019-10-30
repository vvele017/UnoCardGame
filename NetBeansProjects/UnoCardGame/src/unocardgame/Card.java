/*
 *  Vanessa Velez-Santos
 * October 29,2019  

Class to keep track of the type of cards available and their affects
Card properties:  
four color "suits", which are red, yellow, blue and green.
Each color contains 19 cards, one number 0 card and two sets of cards numbered 1-9.
 */
package unocardgame;

public class Card 
{
    //properties of a uno card
    private int number;
    private int color;
    
    public void description()
    {
        System.out.println("\n \tNumber: " + number 
                         + "\n \tColor: " + color );
    }
}

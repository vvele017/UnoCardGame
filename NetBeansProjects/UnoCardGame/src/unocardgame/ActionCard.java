/*
 *  Vanessa Velez-Santos
 * October 29,2019 

    These cards do not have numbers. Only symbols
    and colors
    There are two of each action card in each color, 
 */
package unocardgame;

public class ActionCard extends Card
{
    private String symbol,
                   color;
    
    public void description()
    {
        System.err.println("\n \tSymbol: " + symbol
                 + "\n \tColor: " + color );
    }
}

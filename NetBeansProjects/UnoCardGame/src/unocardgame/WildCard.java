/*
 *  Vanessa Velez-Santos
 * October 29,2019  * 
 */
package unocardgame;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WildCard extends Card
{
    private static final String RED      = "\u001B[31m",
                               GREEN    = "\u001B[32m",
                               YELLOW   = "\u001B[33m",
                               BLUE     = "\u001B[34m",
                               WILD     = "\u001B[37m";
    private static final Object[] colors = {"Red",
                                            "Yellow",
                                            "Green",
                                            "Blue"};
    final ImageIcon icon = new ImageIcon("wild.jpg");
    
    private String color;
    
    public WildCard()
    {
        showCard();
    }
    
    public void showCard()
    {
        boolean error;
        
        do
        {
            error = false; //user hasn't made an input error yet
            
            //for wild cards, you ask the player which color they
            // want for the next turn
            int newColor = JOptionPane.showOptionDialog(null,
                "Which color will you change to?",
                "Wild Card",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                icon,
                colors,
                colors[2]);

            switch(newColor)
            {
                case 0: 
                    color = RED;
                    break;
                case 1:
                    color = YELLOW;
                    break;
                case 2:
                    color = GREEN;
                    break;
                case 3:
                    color = BLUE;
                    break;
                default:
                    System.err.println("You must choose a color for the next player");
                    error = true;
                    break;
            }
        }while(error);
        
        System.out.print(" " + color + " [WILD] ");
    }
}

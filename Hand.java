
package GroupProject;

import java.util.ArrayList;

/**
 *
 * @author zeel
 */
public class Hand {

    //Atributes
    
    ArrayList<Cards> hand;

    //Contructor
    
    public Hand()
    {
        hand = new ArrayList<Cards>();
    }
    
    //Draw from deck
    
    public void drawDeck(Deck deck)
    {
        hand.add(deck.draw());
    }
    
    // Return the sum  
    
    public int getValueHand()
    {
        int number = 0, ace =0;
         
        // To sum card values
        
        for (Cards card: hand)
        {
            switch (card.getNumbers())
            {
                case ONE: number +=1; 
                break;
                case TWO: number += 2;
                break;
                case THREE: number += 3;
                break;
                case FOUR: number += 4; 
                break;
                case FIVE: number += 5; 
                break;
                case SIX: number += 6; 
                break;
                case SEVEN: number += 7;
                break;
                case EIGHT: number += 8;
                break;
                case NINE: number += 9;
                break;
                case TEN: number += 10; 
                break;
                case DRAW2: number += 10; 
                break;
                case DRAW4: number += 10;
                break;
                case WILD: number += 10; 
                break;
            }
            for (int i = 0; i < ace; i++)
            {
                if(number <= 10)
                {
                    number += 11;
                }
                else
                {
                     number += 1;
                }
                }
            }
            return number;
        }
    
    //Get a card
    
    public Cards getCard(int i){
        return hand.get(i);
    }
    
    //Clear hand
    
    public void clearHand(){
        hand.clear();
    }
    
    //String output
    
    @Override
    public String toString()
    {
        String output = "";
        for(Cards card: hand)
        {
        output += card + "\n";
    }
    return output;
}
}


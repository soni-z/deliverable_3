
package GroupProject;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author zeel
 */
public class Deck {
  
    //Attributes of class
    
    private ArrayList<Cards> deck;

    //Constructor of Class
    
    public Deck()
    {
        deck = new ArrayList<>();
    }
    
    //Method to create the deck
    
    public void createDeck()
    {
        
        
        for (Cards.Suits cardSuit:Cards.Suits.values())
        {
            for (Cards.Numbers cardNumber:Cards.Numbers.values())
            { 
               
               //New card
                
               deck.add(new Cards(cardNumber,cardSuit));
            }
        }
    }
    
    //Shuffle of deck  
    
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    //Method to draw a card
    
    public Cards draw(){

        //Taking the first card from the deck
        
        Cards card = new Cards(deck.get(0));
        
        //Remove card from the deck
        
        deck.remove(0);
        
        return card;
    }
    
    //Method to add cards in the array
    
    public void addCards(ArrayList<Cards> cards){
        deck.addAll(cards);
    }
    
    //Method to clear the deck
    
    public void clearDeck(){
        deck.clear();
    }
}



package GroupProject;

/**
 *
 * @author zeel
 */
public class Cards {
    
    //Attributes of class
    
    private Numbers numbers;
    private Suits suits;
    
    //Enumeration for number values
    
    public enum Numbers{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, WILD,DRAW2 ,DRAW4,;}
          
    //Enumeration for suits
    
    public enum Suits{YELLOW,RED,GREEN,BLUE;}
    
    //Constructor
    
    public Cards (Numbers numbers, Suits suits){
        this.numbers = numbers;
        this.suits = suits;
    }
    
    //Constructor overflow 
    
    public Cards(Cards card){
        this.suits = card.getSuits();
        this.numbers = card.getNumbers();
    }   
    
    //Getters methods
    public Numbers getNumbers(){return this.numbers;}
    public Suits getSuits(){return this.suits;}
        
    //ToString method to return the complete card
    
    @Override
    public String toString(){
        return getNumbers() + "of" + getSuits();
    }
    
}

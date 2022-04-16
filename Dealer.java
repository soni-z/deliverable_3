
package GroupProject;
/**
 *
 * @author zeel 
 */
public class Dealer extends Players{
    
    //Set the Dealer name
    
    public Dealer()
    {
        super.setName("Dealer");
    }
        
    //Display the dealer without the second card
    
    public void dealer()
    {
        System.out.println("Dealer  is:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("The second card is secret.");
    }    
}

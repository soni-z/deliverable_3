
package GroupProject;

/**
 *
 * @author zeel
 */
public abstract class Players {
    
    //Attributes of class
    
    private Hand hand;
    private String name;
    
    //New Player of class
    
    public Players(){
        this.hand = new Hand();
        this.name = "";
    }
    
    //check black jack
    
    public boolean blackJackGG(){
    
        if(this.getHand().getValueHand() == 21){
            return true;
        }else{
            return false;
        }
    }

    //Getters and Setters
    
    public Hand getHand() {return hand;}
    public void setHand(Hand hand) {this.hand = hand;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    //display the hand
    
    public void displayHand()
    {
        System.out.println(getName() + " hand is :");
        System.out.println(getHand() + " The hand Value is =  " + getHand().getValueHand());
    }
    
}

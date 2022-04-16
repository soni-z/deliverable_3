
package GroupProject;

import java.util.Scanner;

/**
 *
 * @author zeel
 */
public class Human extends Players {
    
    //Scanner object
    
    Scanner input = new Scanner(System.in);
    
    //Create a new Player
    
    public Human() {
        super.setName("Player");
    }
    
//Ask the player if draw os stand the hand   
    
public boolean choice(){
    
    //Variables
    
    String choice = null;
    boolean answer = true, check = true;

    //While statement to check the player answer
    
    while(check){
        try{
            //Asking the user
            
            System.out.println("What would you like to do? Draw or Stand");
            choice = input.nextLine();
            
            //Checking the answer
            
            if(choice.equalsIgnoreCase("draw")){
                answer = true;
                check = false;
            }else if(choice.equalsIgnoreCase("stand")){
                answer = false;
                check = false;
            }else{
                System.out.println("Wrong choice, try again.");
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Wrong choice, try again.");
            input.next();
        }   
    }
    return answer;
}
   
    

}

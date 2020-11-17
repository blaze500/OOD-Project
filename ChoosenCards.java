import java.util.Random;
import java.util.LinkedList;

public class ChoosenCards
{
    //Stores the ints of the cards that will be gotten from the CardFactory
    int[] cardsNum;
    //Used to generate random numbers
    Random rand;
    public ChoosenCards(int num)
    {
        cardsNum=new int[num];
        rand= new Random();
    }
    
    public int[] pickCards(){
        //This stores numbers that random has already gotten
        LinkedList numbers= new LinkedList();
        //Used to store how many cards have been placed
        int placed=0;
        
        //Does everything while the specified number of cards hasnt been placed
        while(cardsNum.length!=placed){
            //gets a random number
            int random=getRandom();
            //Checks to see if the number that was choosen hasnt been picked
            if(!numbers.contains(random)){
            //Puts the random number in the array of ints
            cardsNum[placed]=random;
            //adds the random number to the linked list to make sure its not picked again
            numbers.add(random);
            //Adds 1 to placed, as it has picked 1 card
            placed+=1;
        }    
      }
       return cardsNum; 
    }
    
    public int getRandom(){
        //Gets random number
     return rand.nextInt(new CardFactory().NumOfCards());
    }
    
}

import java.util.Random;
public class CardBoard
{
    //The board of cards its returning
    Card[] board;
    int[] SetOfCards;
    Random rand;
    CardFactory cardMaker;
    public CardBoard(int[] cards)
    {
        //The card numbers that have been choosen to be on the board
        SetOfCards=cards;
        //The board of cards, where the cards that are created from the factory are placed
        board=new Card[SetOfCards.length*2];
        //Makes a random number
        rand= new Random();
        //Creates a CardFactory, a factory that makes cards
        cardMaker= new CardFactory(); 
    }
    
    public Card[] MakeBoard(){
        //For the number of cards that have been choosen
        for(int i=0; i<SetOfCards.length; i++){
            //This is for the number of cards it has to place. Because we will be matching 2, 2 will be the number of time it does this.
            for(int k=0; k<2;k++){
                //Picks a random spot to place a card, makes a card, then places it in said spot.
                while(true){
                    //Gets a random number on the board
                    int place=getRandom();
                    //Checks to see if the card has been placed on the place that it has choosen to place
                    if(board[place]==null){
                        board[place]=cardMaker.getCard(SetOfCards[i]);
                        break;
                    }
                }
                
            }
            
        }
        return board;
    }
    public int getRandom(){
        //picks a random place on the board
     return rand.nextInt(SetOfCards.length*2);
    }
    
}

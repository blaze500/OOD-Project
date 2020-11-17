import java.util.Random;
public class CardBoard
{
    Card[] board;
    int[] SetOfCards;
    Random rand;
    CardFactory cardMaker;
    public CardBoard(int[] cards)
    {
        SetOfCards=cards;
        board=new Card[SetOfCards.length*2];
        rand= new Random();
        cardMaker= new CardFactory(); 
    }
    
    public Card[] MakeBoard(){
        
        for(int i=0; i<SetOfCards.length; i++){
            
            for(int k=0; k<2;k++){
                
                while(true){
                    int place=getRandom();
                    
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
     return rand.nextInt(SetOfCards.length*2);
    }
    
}

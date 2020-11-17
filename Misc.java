
//This contains methods that will appear later in some other class or place. I havent decided as I am tired. Basically a proof of concept/solution.

public class Misc
{

    public boolean WinCondition(Card[] board) //Checks to see if there are no more cards on board/you win
    {
        int nulls=0;
        for(int i=0; i<board.length; i++){
        if(board[i].getType()=="NULL"){nulls+=1;}
        }
        if(nulls==board.length){return true;}
        return false;
    }

    public Card[] CheckTargets(int card1place, int card2place, Card[] board)
    {
        if(board[card1place].getType().equals(board[card2place].getType())){ //if the 2 cards are the same
          board[card1place]=new CardFactory().getCard(-9999);
          board[card2place]=new CardFactory().getCard(-9999);
        }
        return board;
    }
    
        public boolean TargetCard(int card1place, Card[] board) //will flip up card in X place
    {
        if(board[card1place].getType().equals("NULL") || board[card1place].isFlipped()==false){
            System.out.println("Invalid choice, please try again.");
            return false;
        }
        board[card1place].flipCard();
        return true;
    }
}

import java.lang.Math;

public class DisplayCards
{
    // An algorithm that displays the cards
    public DisplayCards(Card[] board)
    {
        //Rounds the square root of the boards length. This is used to make sure the board is basically a rectangle of X+1 * X-1 length or a square (X*X length).
        int rowSize=(int)Math.round(Math.sqrt(board.length));
        //These two ints, RangeStart and RangeEnd, print out the cards from Start to End.
        int RangeStart=0;
        int RangeEnd=rowSize;
        //Basically an overdone for loop, that can can adapt to any board size aside from 0.
        while(true){
               //Loop for the number of rows that make up a card
            for(int w=0; w<board[0].getCard().length; w++){   
                  //Prints the whole row of each line of card X
                for(int i=RangeStart; i<RangeEnd; i++){ 
                    System.out.print(board[i].getCard()[w]);
                    System.out.print("   ");
                }
                System.out.println("");
            }
            //ends the while loop once the board has been printed
            if(RangeEnd==board.length){break;}
            RangeStart+=rowSize;
            //This is used to make sure that RangeEnd never equals more than the length of the board, so the while loop can end
            RangeEnd=Math.min(RangeEnd+rowSize,board.length);
            System.out.println("");
        }
        
    }

}

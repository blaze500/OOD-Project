import java.lang.Math;

public class DisplayCards
{

    public DisplayCards(Card[] board)
    {
        int rowSize=(int)Math.round(Math.sqrt(board.length));
        int RangeStart=0;
        int RangeEnd=rowSize;
        while(true){
           // System.out.println(board[0].getCard()[0].length);
            for(int w=0; w<board[0].getCard().length; w++){   // this for loop looks for the length of each row
                for(int i=RangeStart; i<RangeEnd; i++){ //loop for row X
                    System.out.print(board[i].getCard()[w]);
                    System.out.print("   ");
                }
                System.out.println("");
            }
            
            if(RangeEnd==board.length){break;}
            RangeStart+=rowSize;
            RangeEnd=Math.min(RangeEnd+rowSize,board.length);
            System.out.println("");
        }
        
    }

}

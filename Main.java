
//This is more or less a demo right now, just showing that the cards can function properly

public class Main
{
     public static void main(String[] args) 
    {
        //Current maximum amount of cards is 10
        ChoosenCards chose= new ChoosenCards(6);
        int[] cards =chose.pickCards();
        CardBoard bordmake= new CardBoard(cards);
        Card[] board =bordmake.MakeBoard();
        System.out.println("Board face up"+ "\n");
        new DisplayCards(board);
        for(int i=0; i<board.length; i++){board[i].flipCard();}
                System.out.println("\n \n \n");
        System.out.println("Board flipped face down"+ "\n");
        new DisplayCards(board);
        
    }

}

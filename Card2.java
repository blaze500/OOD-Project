
public class Card2 extends Card
{
    //A card with a T pattern.
    public Card2(){
    
        type="T";
        front=new char[][]{ {'■','■','■','■','■','■','■'},
                            {'■',' ','T','T','T',' ','■'},
                            {'■',' ',' ','T',' ',' ','■'},
                            {'■',' ',' ','T',' ',' ','■'},
                            {'■','■','■','■','■','■','■'}};
        back=new char[][]{ {'■','■','■','■','■','■','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■',' ',' ',' ',' ',' ','■'},
                            {'■','■','■','■','■','■','■'}};                    
    }
 }
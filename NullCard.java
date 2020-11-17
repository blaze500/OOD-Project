
public class NullCard extends Card
{
// This card is used to replace any cards that have been matched. Essentailly it represents a removed card.
    public NullCard(){
    
        type="NULL";
        front=new char[][]{ {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '}};
        back=new char[][]{  {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '},
                            {' ',' ',' ',' ',' ',' ',' '}};                    
    }

}

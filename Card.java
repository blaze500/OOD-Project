
public abstract class Card
{
    //States its type. This is just used to see if two cards are the same
    String type;
    //This dual array of chars is the front of the card
    char[][] front;
    //This dual array of chars is the back of the card
    char[][] back;
    //This is used to determine whether or not to show the front or back of the card
    boolean isFlipped;
    
    //Card will show the front of the card
    public Card(){
        isFlipped=false;
    }
    
    //Used to compare if two cards are the same. This returns their symbol
    public String getType(){
        return type;
    }
    
    //Will flip the card over to its front if it was on its back and vice versa
    public void flipCard(){
        if(isFlipped==false){isFlipped=true;}
        else{isFlipped=false;}
    }
    
    //Checks the cards flipped status
    public boolean isFlipped(){
        return isFlipped;
    }
    
    //Will either return the front of the card or back of the card
    public char[][] getCard(){
        if(isFlipped==false){return front;}
        return back;
    }
}

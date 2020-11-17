
public class CardFactory
{
    //Will return card X, unless the number is -9999, in which case, it will return a null card
    public Card getCard(int cardNumber)
    {
        if(cardNumber==0){return new Card1();}
        else if(cardNumber==1){return new Card2();}
        else if(cardNumber==2){return new Card3();}
        else if(cardNumber==3){return new Card4();}
        else if(cardNumber==4){return new Card5();}
        else if(cardNumber==5){return new Card6();}
        else if(cardNumber==6){return new Card7();}
        else if(cardNumber==7){return new Card8();}
        else if(cardNumber==8){return new Card9();}
        else if(cardNumber==9){return new Card10();}
        else if(cardNumber==-9999){return new NullCard();}
        return null;
    }
    // This is just to show get the number of possible non null cards a person can get.
    public int NumOfCards(){
     return 10;
    }
    
}

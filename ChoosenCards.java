import java.util.Random;
import java.util.LinkedList;

public class ChoosenCards
{
    int[] cardsNum;
    Random rand;
    public ChoosenCards(int num)
    {
        cardsNum=new int[num];
        rand= new Random();
    }
    
    public int[] pickCards(){
        LinkedList numbers= new LinkedList();
       // System.out.println(cards.length);
        int placed=0;
        while(cardsNum.length!=placed){
            //System.out.println(cards.length);
            int random=getRandom();
            if(!numbers.contains(random)){
            cardsNum[placed]=random;
            numbers.add(random);
            placed+=1;
        }    
      }
       return cardsNum; 
    }
    
    public int getRandom(){
     return rand.nextInt(new CardFactory().NumOfCards());
    }
    
}

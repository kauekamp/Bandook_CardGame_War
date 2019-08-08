/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package deliverable1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards extends Card
{
   
    //The group of cards, stored in an ArrayList
    public ArrayList<String> cards;
    //private int size;//the size of the grouping
    private Pattern pattern = new Pattern();
    private int position=0;
    private String SUITS;
    private String VALUES;
    public String SARR[]= {"SPADE","CLUB","HEART","DIAMOND"};
    public String VARR[]={"TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"};
                    
    public GroupOfCards()
    {

    }
    
    public GroupOfCards(String SARR,String VARR)
    {
        this.SUITS=SARR;
     this.VALUES= VARR;
     
    }
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<String> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }
    
    public void prompt1(){
        cards = new ArrayList<>();
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
            cards.add(VARR[j]+ " of " + SARR[i]);   
            }
        }
            
    }
    
    @Override
    public String toString(){
    return "It is valid!";
    }
    
    public void prompt2(){
    for(int i=0; i<52; i++){
        System.out.println(cards.get(i));
    }
    }
    
    public void separate(){
    ArrayList<String> deckF = new ArrayList<>();
    ArrayList<String> deckS = new ArrayList<>();
    int a =0;
    int b =1;
    for(int c=0; c<52; c++){
        if(c%2==0){
        deckF.add(cards.get(a));
        a+=2;
        }
        else{
            deckS.add(cards.get(b));
            b+=2;
        }
    }
    
    Gamer gamer = pattern.generateGamer(); 
    gamer.play(deckF,deckS);
    }
    
    public String editC(ArrayList<String> cards){
        String ec = cards.get(cards.size()-1);
        cards.remove(cards.size()-1);
        return ec;
    }
}//end of the GroupOfCards class

   
            
            
            
            
            
            
            
            
   
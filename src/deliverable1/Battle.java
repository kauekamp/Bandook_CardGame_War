/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

/**
 *
 * @author ekamp
 */
public class Battle extends Game {
    private int gamer=0;
    private int dev=0;
    private Pattern pattern = new Pattern();
    private int cardC=0;
    private int cardU=0;
    
    public Battle(String name){
       super(name); 
    }
    
    public int play(String result1, String result2){
     Position position = pattern.generatePosition();
     if(position.position(result2)>position.position(result1)){
         System.out.println("Gamer Second won! Take your Cards\n");
         System.out.println("___________________________________________\n");
         gamer++;
         cardU = cardU+2;
         cardC--;
         return 0;
           // setGamer(getGamer() + 1);
     }
     
     else if(position.position(result2)<position.position(result1)){
         System.out.println("Gamer First Won! Take your Cards\n");
         System.out.println("___________________________________________\n");
         cardC = cardC+2;
         cardU--;
       dev++;    
       return 1;
       // setDev(getDev() + 1);
     }
     
     else if(position.position(result2) == position.position(result1)){
         System.out.println("Battle declared\n");
         System.out.println("___________________________________________\n");
    }
     return 2;
    }
     
    @Override
     public void winner(){
        if( gamer>dev){
        System.out.println("Gamer Second Won!");
        }
        else{
            System.out.println("Gamer First Won!");
        }
        System.out.println("Player 1 has: " + cardC + " cards");
        System.out.println("Player 2 has: " + cardU + " cards");
    }
    
}
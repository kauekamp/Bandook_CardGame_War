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
    
    public Battle(String name){
       super(name); 
    }
    
    public void play(String result1, String result2){
     Position position = pattern.generatePosition();
     if(position.position(result2)>position.position(result1)){
         System.out.println("Gamer won!\n");
         System.out.println("___________________________________________\n");
         gamer++;
           // setGamer(getGamer() + 1);
     }
     
     else if(position.position(result2)<position.position(result1)){
         System.out.println("You lost it!\n");
         System.out.println("___________________________________________\n");
       dev++;    
       // setDev(getDev() + 1);
     }
     
     else if(position.position(result2) == position.position(result1)){
         System.out.println("Its a tie\n");
         System.out.println("___________________________________________\n");
    }
    }
     
    @Override
     public void winner(){
        if( gamer>dev){
        System.out.println("You Won!");
        }
        else{
            System.out.println("You Lost!");
        }
    }
    
}
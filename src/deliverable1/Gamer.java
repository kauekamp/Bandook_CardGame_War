/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gamer extends Player{
    
  public Gamer()
  { 
    }
  
   public Gamer(String name){
        super(name);
    }
    
    @Override
    public void play(){
        
    }
    
    public void play(ArrayList<String>deckF,ArrayList<String>deckS){
        Scanner inp = new Scanner(System.in);
        System.out.println("First Player Name:");
        Pattern pattern = new Pattern();
        String userinp = inp.next();
        Battle clash = pattern.generateBattle(userinp);
        System.out.println("Hey " +clash.getGameName());
        System.out.println("Start Game:Y/N");
        String gamer = inp.next();
        int enumerate=0;
        if(gamer.equals("Y")){
        while(enumerate<25){
            GroupOfCards pick1 = pattern.generateGroup();
            GroupOfCards pick2 = pattern.generateGroup();
            
            System.out.println("Device's card");
            String devC = pick1.editC(deckF);
            System.out.println(devC);
            System.out.println("Move to next gamer");
            inp.nextLine();
            System.out.println("Gamer's cards");
            String gameC = pick2.editC(deckS);
            System.out.println(gameC);
            clash.play(devC, gameC);
            enumerate++;
        }
        
        clash.winner();
    }
        else
        {
        System.out.println("Game Over!");
        }
        }
    
}

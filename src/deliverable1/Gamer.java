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
        System.out.println("Enter your Names:");
        
        Pattern pattern = new Pattern();
        String userinp1 = inp.next();
        String userinp2 = inp.next();
        Battle clash = pattern.generateBattle(userinp1);
        System.out.println("Hey " +clash.getGameName());
        System.out.println("Are you ready to start the Game? :Y/N");
        String gamer = inp.next();
        int enumerate=0;
        if(gamer.equals("Y")){
        while(true){
            GroupOfCards pick1 = pattern.generateGroup();
            GroupOfCards pick2 = pattern.generateGroup();
            
            System.out.println("Gamer First card");
            String devC = pick1.editC(deckF);
            System.out.println(devC);
            System.out.println("Move to next gamer");
            inp.nextLine();
            System.out.println("Gamer Second card");
            String gameC = pick2.editC(deckS);
            System.out.println(gameC);
            int val = clash.play(devC, gameC);
            enumerate++;
            if(val == 1){
                deckF.add(devC);
                deckF.add(gameC);
            }
            if(val == 0){
                deckS.add(devC);
                deckS.add(gameC);
            }
            if(deckF.isEmpty() || deckS.isEmpty()){
                break;
            }
        }
        
        clash.winner();
    }
        else
        {
        System.out.println("Game Over!");
        }
        }
    
}

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
public class Pattern {
    
    public GroupOfCards generateGroup(){
        GroupOfCards Group = new GroupOfCards();
        return Group;
    }
    
    public Gamer generateGamer(){ 
       Gamer gamer = new Gamer();
                return gamer;
    }
    
    public Battle generateBattle(String VALUES){
        Battle clash = new Battle(VALUES);
        return clash;
    }
    
    public Position generatePosition(){
     Position position = new Position();
     return position;
    }
    
    }
  

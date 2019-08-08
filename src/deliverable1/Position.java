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
public class Position {
    
    private int position = 0;
    
    public int position(String pos){
        
     switch(pos){   
         case "TWO of SPADE":
         case "TWO of HEART":
         case "TWO of DIAMOND":
         case "TWO of CLUB":
             position = 2;
             break;
             
             case "THREE of SPADE":
         case "THREE of HEART":
         case "THREE of DIAMOND":
         case "THREE of CLUB":
             position = 3;
             break;
             
             case "FOUR of SPADE":
         case "FOUR of HEART":
         case "FOUR of DIAMOND":
         case "FOUR of CLUB":
             position = 4;
             break;
             
             case "FIVE of SPADE":
         case "FIVE of HEART":
         case "FIVE of DIAMOND":
         case "FIVE of CLUB":
             position = 5;
             break;
             
             case "SIX of SPADE":
         case "SIX of HEART":
         case "SIX of DIAMOND":
         case "SIX of CLUB":
             position = 6;
             break;
             
             case "SEVEN of SPADE":
         case "SEVEN of HEART":
         case "SEVEN of DIAMOND":
         case "SEVEN of CLUB":
             position = 7;
             break;
             
             case "EIGHT of SPADE":
         case "EIGHT of HEART":
         case "EIGHT of DIAMOND":
         case "EIGHT of CLUB":
             position = 8;
             break;
             
             case "NINE of SPADE":
         case "NINE of HEART":
         case "NINE of DIAMOND":
         case "NINE of CLUB":
             position = 9;
             break;
             
             case "TEN of SPADE":
         case "TEN of HEART":
         case "TEN of DIAMOND":
         case "TEN of CLUB":
             position = 10;
             break;
             
             case "JACK of SPADE":
         case "JACK of HEART":
         case "JACK of DIAMOND":
         case "JACK of CLUB":
             position = 11;
             break;
             
             case "QUEEN of SPADE":
         case "QUEEN of HEART":
         case "QUEEN of DIAMOND":
         case "QUEEN of CLUB":
             position = 12;
             break;
             
             case "KING of SPADE":
         case "KING of HEART":
         case "KING of DIAMOND":
         case "KING of CLUB":
             position = 13;
             break;
             
             case "ACE of SPADE":
         case "ACE of HEART":
         case "ACE of DIAMOND":
         case "ACE of CLUB":
             position = 14;
             break;
             
         default:
             break;
     }
     return position;
    }
}

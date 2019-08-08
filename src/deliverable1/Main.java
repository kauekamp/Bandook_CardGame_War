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

import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args){
    GroupOfCards obj = new GroupOfCards();
    Gamer gamer = new Gamer();
    Scanner inp = new Scanner(System.in);
    obj.prompt1();
    obj.shuffle();
    obj.prompt2();
    obj.separate();
    }
}

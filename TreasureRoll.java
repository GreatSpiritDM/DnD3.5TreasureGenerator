/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import java.util.Scanner;


/**
 *
 * @author 1996n
 */
public class TreasureRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //System.out.println(tables.cr1());
        // System.out.println(tables.first());
        // System.out.println(Tables.half());
        for (int i = 0; i < 10; i++) {
            System.out.println(tables.cr1());
            System.out.println(" ");
            
        }
        System.out.println(tables.fifth());
        System.out.println(tables.fourth());
        
    }
    
}
// This class is SUPER important since it gives us a shorthand for
// rolling dice. (It's 3.5; we'll do a lot of that)
class dice {
    private static int rollNum;
    /* This rolls some number of dice with the given number of sides
    So, for two six-sided dice, you would write roll.dice(2, 6)
    */
    public static int roll (int number, int sides){
        rollNum = number*((int)(Math.random()*sides)+1);
        return rollNum;
    }
    /*
    While the d20 is D&D's posterchild, the d100 is more commonly
    used in these long and ponderous tables because it adds 
    more variety to games.
    */
    public static int rolld100(){
        rollNum = dice.roll(1, 100);
        return rollNum;
    } 
    // This is to determine whether a scroll is arcane or divine
    public static String AorD(){
        rollNum = dice.roll(1, 2);
        if (rollNum == 1){
            return "(A)";
        } else {return "(D)";}
        
    }
    // This is to determine one of the alignment axes randomly
    public static String axes(){
        rollNum = dice.roll(1, 4);
        if (rollNum == 1){
            return "chaos";
        } else if (rollNum == 2){
            return "evil";
        } else if (rollNum == 3){
            return "good";
        } else {
            return "law";
        }
    }
    public static String ele(){
        rollNum = dice.roll(1, 5);
        switch (rollNum) {
            case 1:
                return "acid";
            case 2:
                return "cold";
            case 3: return"electricity";
            case 4: return "fire";
            case 5: return "sonic";
            default:
                return "Something went wrong";
        }
    }
}
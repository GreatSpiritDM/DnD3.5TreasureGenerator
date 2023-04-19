/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author 1996n
 */
public class tables {
    private static int gold;
    private static int itemRoll;
    private static int roll;
    private static String itemType;
    // This table will be same for everything CR 1-19. CR 20 is slightly different at the end.
    // Return to this once we have the magic item tables finished. No use making a bunch of 
    // placeholders when we can just write the methods. (This wouldn't be the case if I
    // were currently running a game.
    // -> For goods' values, see MIC 268
    public static String cr1(){
        roll = dice.rolld100();
        System.out.println("You rolled a "+roll+" on the CR1 treasure table.");
        if (roll < 8){
            return "You get no treasure";
        }
        else if (roll >= 8 && roll < 11){
            gold = dice.roll(1, 3)*1000;
            return "Your treasure:\n"+gold+" copper pieces";
        }// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~REPLACE WITH THE BELOW!
        else if (roll >= 11 && roll < 22){ //USE THIS FORMAT INSTEAD!!!!!!!!!!!!
            gold = dice.roll(1, 3)*100;
            return "Your treasure: \n"+gold+" silver pieces\n"+tables.half();
        } /* ^ These long and tiresome Strings serve as placeholders. 
        Later on, we'll call methods for determining what specifically these
        goods and items may be.
        */
        else if (roll >= 22 && roll < 45){
            gold = dice.roll(3, 6)*100;
            return "Your treasure:\n"+gold+" silver pieces\n"+tables.gA()+"\n"+tables.first();
        }
        else if (roll >= 45 && roll < 61){
            gold = dice.roll(4, 4)*100;
            return "Your treasure:\n"+gold+" silver pieces\n"+tables.gB()+"\n"+tables.first();
            
        }
        else if (roll >= 61 && roll < 79){
            gold = dice.roll(2, 8)*10;
            return "Your treasure:\n"+gold+" gold pieces\n"+tables.gA()+"\n"+tables.first()+"\n"+tables.half();
            
        }
        else if (roll >= 79 && roll < 84){
            gold = dice.roll(2, 8)*100;
            return "Your treasure:\n"+gold+" gold pieces\n"+tables.gA();
        }
        else if (roll>=84 && roll < 92){
            gold = dice.roll(1, 6)*100;
            return "Your treasure:\n"+gold+" gold pieces\n"+tables.gB()+"\n"+tables.first();
        }
        else if (roll>=92 && roll < 100){
            gold = dice.roll(2, 4)*100;
            return "Your treasure:\n"+gold+" gold pieces\n"+tables.gA()+"\n"+tables.first()+"\n"+tables.half();
        }
        else if ( roll == 100){
            gold = dice.roll(1, 12)*10;
            return "Your treasure:\n"+gold+" platinum pieces\n"+tables.gB()+"\n"+tables.first()+"\n"+tables.half();
        } 
        return "Something went wrong. Your roll was "+roll+".";
    } 
    public static String cr2(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(2, 12)*1000+" copper pieces";
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(3, 6)*100+" silver pieces\n"+tables.gA()+"\n"+tables.gA();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 4)*100+" silver pieces\n"+tables.first();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" silver pieces"+"\n"+tables.first()+"\n"+tables.half();
            
             case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 4)*1000+" silver pieces\n"+tables.gA()+"\n"+tables.gB()+"\n"+tables.first()+"\n"+tables.first();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 4)*100+" gold pieces\n"+tables.gB()+"\n"+tables.first()+"\n"+tables.first()+"\n"+tables.half();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 10)*100+" gold pieces\n"+tables.gB()+"\n"+tables.first()+"\n"+tables.half();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 10)*100+" gold pieces\n"+tables.gA()+"\n"+tables.gA()+"\n"+tables.first()+"\n"+tables.first();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gB()+"\n"+tables.second();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 8)*10+" platinum pieces\n"+tables.gB()+"\n"+tables.second();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr3(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 4)*1000+" silver pieces\n"+tables.first();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 4)*1000+" silver pieces\n"+tables.gB()+"\n"+tables.first();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 4)*1000+" silver pieces\n"+tables.second();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" silver pieces"+"\n"+tables.gC()+"\n"+tables.second();
            
             case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" silver pieces\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.second();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 8)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gB()+"\n"+tables.second()+"\n"+tables.first();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.second()+"\n"+tables.half();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.second()+"\n"+tables.first();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gB()+"\n"+tables.gB()+"\n"+tables.third();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 12)*10+" platinum pieces\n"+tables.gD()+"\n"+tables.gB()+"\n"+tables.third();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr4(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 8)*1000+" silver pieces\n"+tables.first()+"\n"+tables.half();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 6)*1000+" silver pieces\n"+tables.gC()+"\n"+tables.first()+"\n"+tables.first();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" silver pieces\n"+tables.second()+"\n"+tables.first();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 10)*1000+" silver pieces"+"\n"+tables.gB()+"\n"+tables.gC()+"\n"+tables.second()+"\n"+tables.first();
            
             case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" silver pieces\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.second()+"\n"+tables.first();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 8)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gC()+"\n"+tables.third();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.second()+"\n"+tables.first();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gD()+"\n"+tables.third();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.third()+"\n"+tables.first();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 12)*10+" platinum pieces\n"+tables.gC()+"\n"+tables.gD()+"\n"+tables.fourth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr5(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 12)*1000+" silver pieces\n"+tables.second();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 8)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.second();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 10)*1000+" silver pieces\n"+tables.third();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" silver pieces"+"\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.third();
            
             case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" silver pieces\n"+tables.gC()+"\n"+tables.gE()+"\n"+tables.third();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 6)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.fourth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gE()+"\n"+tables.third();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gC()+"\n"+tables.gD()+"\n"+tables.fourth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 6)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gB()+"\n"+tables.gE()+"\n"+tables.fifth();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 12)*10+" platinum pieces\n"+tables.gC()+"\n"+tables.gE()+"\n"+tables.fifth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr6(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 10)*1000+" silver pieces\n"+tables.third();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 8)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.gB()+"\n"+tables.third();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" silver pieces\n"+tables.gC()+"\n"+tables.gC()+"\n"+tables.third()+"\n"+tables.first();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces"+"\n"+tables.gC()+"\n"+tables.gD()+"\n"+tables.third()+"\n"+tables.first();
            
             case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 8)*100+" gold pieces\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.gE()+"\n"+tables.third()+"\n"+tables.first();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 6)*100+" gold pieces\n"+tables.gC()+"\n"+tables.gD()+"\n"+tables.fourth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(2, 6)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gF()+"\n"+tables.third()+"\n"+tables.first();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces\n"+tables.gD()+"\n"+tables.gE()+"\n"+tables.fourth()+"\n"+tables.second();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gF()+"\n"+tables.fifth();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 12)*10+" platinum pieces\n"+tables.gB()+"\n"+tables.gD()+"\n"+tables.gE()+"\n"+tables.sixth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr7(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(2, 8)*1000+" silver pieces\n"+tables.third();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 6)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.gC()+"\n"+tables.third();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.third()+"\n"+tables.first();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces"+"\n"+tables.gE()+"\n"+tables.fourth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(3, 4)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.gC()+"\n"+tables.fourth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces\n"+tables.gE()+"\n"+tables.fourth()+"\n"+tables.second();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.fourth()+"\n"+tables.second();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces\n"+tables.gE()+"\n"+tables.fifth()+"\n"+tables.fifth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(3, 4)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.sixth();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 8)*10+" platinum pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.seventh();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr8(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(2, 10)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.fourth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 8)*1000+" silver pieces\n"+tables.gE()+"\n"+tables.fourth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 8)*100+" gold pieces\n"+tables.gD()+"\n"+tables.gC()+"\n"+tables.fourth()+"\n"+tables.first();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(2, 10)*100+" gold pieces"+"\n"+tables.gE()+"\n"+tables.gC()+"\n"+tables.fifth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(4, 4)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.gD()+"\n"+tables.fifth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(4, 4)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gC()+"\n"+tables.sixth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(4, 4)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gC()+"\n"+tables.sixth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 10)*100+" gold pieces\n"+tables.gF()+"\n"+tables.sixth()+"\n"+tables.third();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(2, 10)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gC()+"\n"+tables.seventh();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 10)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gC()+"\n"+tables.eighth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr9(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(2, 12)*1000+" silver pieces\n"+tables.gD()+"\n"+tables.gC()+"\n"+tables.fourth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 10)*1000+" silver pieces\n"+tables.gE()+"\n"+tables.gC()+"\n"+tables.fourth()+"\n"+tables.first();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 10)*100+" gold pieces\n"+tables.gE()+"\n"+tables.fifth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(4, 6)*100+" gold pieces"+"\n"+tables.gF()+"\n"+tables.fifth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(2, 12)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.sixth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 12)*100+" gold pieces\n"+tables.gF()+"\n"+tables.sixth()+"\n"+tables.third();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(3, 10)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.sixth()+"\n"+tables.second();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(3, 10)*100+" gold pieces\n"+tables.gF()+"\n"+tables.seventh();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(4, 6)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.eighth();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 12)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.ninth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    public static String cr10(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(3, 8)*1000+" silver pieces\n"+tables.gE()+"\n"+tables.fifth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 12)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.fifth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(3, 8)*100+" gold pieces\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.sixth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(6, 4)*100+" gold pieces"+"\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.fifth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(4, 6)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.sixth()+"\n"+tables.second();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(4, 6)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.gD()+"\n"+tables.seventh();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(3, 10)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.sixth()+"\n"+tables.second();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(3, 10)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.eighth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(6, 4)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.ninth();
            case 100: 
                return "Your treasure: \n"+dice.roll(3, 10)*10+" platinum pieces\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.tenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr11(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(6, 4)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.sixth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(4, 6)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.sixth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(4, 6)*100+" gold pieces\n"+tables.gF()+"\n"+tables.seventh();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(4, 8)*100+" gold pieces"+"\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.seventh();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(6, 4)*100+" gold pieces\n"+tables.gG()+"\n"+tables.seventh()+"\n"+tables.second();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(6, 4)*100+" gold pieces\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.eighth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(4, 10)*100+" gold pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.eighth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(4, 10)*10+" platinum pieces\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.ninth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(3, 10)*10+" platinum pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.tenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(4, 10)*10+" platinum pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.eleventh();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr12(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(3, 12)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.seventh();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(4, 8)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.gC()+"\n"+tables.seventh();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(3, 12)*1000+" silver pieces\n"+tables.gF()+"\n"+tables.eighth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(3, 12)*100+" gold pieces"+"\n"+tables.gG()+"\n"+tables.eighth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 4)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.eighth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 4)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.ninth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.ninth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 6)*100+" platinum pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.tenth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 4)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.eleventh();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 6)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.twelveth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr13(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(4, 12)*100+" gold pieces\n"+tables.gF()+"\n"+tables.eighth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 4)*1000+" gold pieces\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.gC()+"\n"+tables.eighth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 4)*1000+" gold pieces\n"+tables.gF()+"\n"+tables.gC()+"\n"+tables.ninth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" gold pieces"+"\n"+tables.gG()+"\n"+tables.gD()+"\n"+tables.ninth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.tenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.tenth()+"\n"+tables.fifth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gE()+"\n"+tables.eleventh();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(1, 8)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.eleventh()+"\n"+tables.fifth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 6)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.twelveth();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 8)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.thirteenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr14(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.ninth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.ninth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gF()+"\n"+tables.gD()+"\n"+tables.tenth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(2, 4)*1000+" gold pieces"+"\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.tenth()+"\n"+tables.fifth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.eleventh();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.eleventh()+"\n"+tables.sixth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(2, 4)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.twelveth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 4)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.twelveth()+"\n"+tables.fifth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 8)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.thirteenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 4)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.fourteenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr15(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(2, 4)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.tenth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 6)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.tenth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 8)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.eleventh();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" gold pieces"+"\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.eleventh();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 10)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.twelveth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 10)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.twelveth()+"\n"+tables.eighth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(2, 6)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.thirteenth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 6)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.thirteenth()+"\n"+tables.sixth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.fourteenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(1, 12)*100+" platinum pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.fifteenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr16(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
                
            case 7: return "Your treasure:\n"+dice.roll(1, 12)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gE()+"\n"+tables.eleventh();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 10)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.eleventh();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 10)*1000+" gold pieces\n"+tables.gG()+"\n"+tables.gF()+"\n"+tables.twelveth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(3, 4)*1000+" gold pieces"+"\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.twelveth()+"\n"+tables.sixth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.thirteenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.thirteenth()+"\n"+tables.eighth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(3, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.fourteenth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(3, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gE()+"\n"+tables.fourteenth()+"\n"+tables.eighth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(2, 6)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.fifteenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(3, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.gE()+"\n"+tables.sixteenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr17(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
            case 7: return "Your treasure:\n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.twelveth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(1, 12)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.twelveth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(1, 12)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gF()+"\n"+tables.thirteenth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces"+"\n"+tables.gI()+"\n"+tables.thirteenth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.fourteenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.fourteenth()+"\n"+tables.seventh();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.fifteenth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.sixteenth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.seventeenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.eighteenth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr18(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
            case 7: return "Your treasure:\n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.thirteenth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.fourteenth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(3, 4)*1000+" gold pieces\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.fourteenth()+"\n"+tables.ninth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(4, 4)*1000+" gold pieces"+"\n"+tables.gI()+"\n"+tables.fifteenth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.fifteenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.sixteenth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(4, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.seventeenth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(4, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.eighteenth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(2, 8)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.ninteenth();
            case 100: 
                return "Your treasure: \n"+dice.roll(4, 4)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gG()+"\n"+tables.twentieth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    public static String cr19(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
            case 7: return "Your treasure:\n"+dice.roll(3, 6)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.fourteenth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.fifteenth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 8)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.fifteenth()+"\n"+tables.seventh();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(3, 8)*1000+" gold pieces"+"\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.sixteenth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(2, 10)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.sixteenth()+"\n"+tables.tenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 10)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.seventeenth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(3, 8)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.eighteenth();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(3, 8)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.ninteenth();
            
            case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: 
                return "Your treasure: \n"+dice.roll(3, 6)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.twentieth();
            case 100: 
                return "Your treasure: \n"+dice.roll(3, 8)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.twentyfirst();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    // Haven't touched this at all
    public static String cr20(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: 
            case 7: return "Your treasure:\n"+dice.roll(2, 12)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.fifteenth();
            
            case 8: case 9: case 10: 
                return "Your treasure:\n"+dice.roll(2, 10)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.sixteenth();
            
            case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: 
                return "Your treasure: \n"+dice.roll(2, 10)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gF()+"\n"+tables.gF()+"\n"+tables.seventeenth();
            
            case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
            case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44:
                return "Your treasure: \n"+dice.roll(4, 6)*1000+" gold pieces"+"\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.eighteenth();
            
            case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:  
                return "Your treasure: \n"+dice.roll(2, 12)*1000+" gold pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.ninteenth();
            
            case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76:
            case 77: case 78: 
                return "Your treasure: \n"+dice.roll(2, 12)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.twentieth();
            
            case 79: case 80: case 81: case 82: case 83:  
                return "Your treasure: \n"+dice.roll(4, 6)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.twentyfirst();
            
            case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91:  
                return "Your treasure: \n"+dice.roll(4, 6)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.twentysecond();
            
            case 92: case 93: case 94: case 95:  
                return "Your treasure: \n"+dice.roll(2, 12)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.twentythird();
            case 96: case 97: case 98: case 99:
                return "Your treasure: \n"+dice.roll(2, 12)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gH()+"\n"+tables.gG()+"\n"+tables.twentyfourth();
            case 100: 
                return "Your treasure: \n"+dice.roll(2, 12)*100+" platinum pieces\n"+tables.gI()+"\n"+tables.gI()+"\n"+tables.twentyfifth();
            default: return "Something went wrong in the Switch statement.";
        }
    }
    
    
    
    
    // PHB is Player Handbook, DMG is Dungeon Master's Guide, MIC is Magic Item Compendium, and SC is Spell Compendium
    // (A) indicates that the scroll is arcane, (D) indicates that the scroll is divine
    public static String half(){
        itemRoll = dice.rolld100();
        if (itemRoll == 1){
            return "Acid [PHB 128]";
        } else if (itemRoll ==2 || itemRoll == 3){
            return "Lantern, Bullseye [PHB 126]";
        } else if (itemRoll == 4){
            return "Scroll of caltrops (A)[SC 42]";
        } else if (itemRoll == 5){
            return "Scroll of create water (D) [PHB 215]";
        } else if (itemRoll == 6) {
            return "Scroll of dancing lights (A) [PHB 216]";
        } else if (itemRoll == 7) {
            return "Scroll of dawn (D) [SC 59]";
        } else if (itemRoll == 8){
            return "Scroll of detect magic "+dice.AorD()+" [PHB 219]";
        } else if (itemRoll == 9){
            return "Scroll of light "+dice.AorD()+" [PHB 248]";
        } else if (itemRoll == 10){
            return "Scroll of message (A) [PHB 253]";
        } else if (itemRoll ==11){
            return "Scroll of purify food and drink [PHB 267]";
        } else if (itemRoll ==12 || itemRoll == 13){
            return "Alchemist's fire [PHB 128]";
        } else if (itemRoll >=14 && itemRoll < 17){
            return "Rope, silk (100ft) [PHB 127]";
        } else if (itemRoll == 17 || itemRoll == 18){
            return "Smokesticks [PHB 128]";
        } else if (itemRoll ==19 || itemRoll == 20){
            return "Holy symbol, silver [PHB 130]";
        } else if (itemRoll ==21 || itemRoll == 22){
            return "Holy Water [PHB 128]";
        } else if (itemRoll == 23){
            return "Scroll of aspect of the wolf (D) [SC 16]";
        } else if (itemRoll == 24){
            return "Scroll of benign transposition (A) [SC 27]";
        } else if (itemRoll == 25){
            return "Scroll of blessed aim (D) [SC 31]";
        } else if (itemRoll == 26){
            return "Scroll of comprehend languages "+dice.AorD()+" [PHB 212]";
        } else if (itemRoll ==27||itemRoll==28){
            return "Scroll of cure light wounds (D) [PHB 215]";
        } else if (itemRoll == 29){
            return "Scroll of disguise self (A) [PHB 222]";
        } else if (itemRoll == 30) {
            return "Scroll of endure elements "+dice.AorD()+" PHB 226";
        } else if (itemRoll == 31){
            return "Scroll of hail of stone (A) [SC 108]";
        } else if (itemRoll == 32){
            return "Scroll of mount (A) [PHB 256]";
        } else if (itemRoll == 33){
            return "Scroll of protection from chaos "+dice.AorD()+" [PHB 266]";
        } else if (itemRoll == 34){
            return "Scroll of protection from evil "+dice.AorD()+" [PHB 266]";
        } else if (itemRoll == 35){
            return "Scroll of protection from good "+dice.AorD()+" [PHB 266]";
        } else if (itemRoll == 36){
            return "Scroll of protection from law "+dice.AorD()+" [PHB 266]";
        } else if (itemRoll == 37){
            return "Scroll of remove fear "+dice.AorD()+" [PHB 271]";
        } else if (itemRoll == 38){
            return "Scroll of resurgence (D) [SC 174]";
        } else if (itemRoll == 39){
            return "Scroll of sanctuary (D) [PHB 274]";
        } else if (itemRoll == 40){
            return "Scroll of sign (D) [SC 189]";
        } else if (itemRoll == 41){
            return "Scroll of snake's swiftness (D) [SC 193]";
        } else if (itemRoll == 42){
            return "Scroll of snake's swiftness (D) [SC 193]";
        } else if (itemRoll == 43){
            return "Scroll of speak with animals (D) [PHB 281]";
        } else if (itemRoll == 44 || itemRoll == 45){
            return "Thunderstone [PHB 129]";
        } else if (itemRoll == 46 || itemRoll == 47){
            return "Antitoxin [PHB 128]";
        } else if (itemRoll ==48||itemRoll==49){
            return "Blessed bandage (5) [MIC 152]";
        } else if (itemRoll == 50 || itemRoll ==51){
            return "Disguise kit [PHB 130]";
        } else if (itemRoll == 52 || itemRoll ==53){
            return "Healer's kit [PHB 130]";
        } else if (itemRoll >= 54 && itemRoll < 57){
            return "Oil of magic weapon [PHB 251]";
        } else if (itemRoll >= 57 && itemRoll < 66){
            return "Potion of cure light wounds [PHB 215]";
        } else if (itemRoll >= 66 && itemRoll <69){
            return "Potion of endure elements [PHB 226]";
        } else if (itemRoll >= 69 && itemRoll < 72){
            return "Potion of enlarge person [PHB 226]";
        } else if (itemRoll >= 72 && itemRoll < 76){
            return "Potion of mage armor [PHB 249]";
        } else if (itemRoll >= 76 && itemRoll < 79){
            return "Potion of magic fang [PHB 250]";
        } else if (itemRoll >= 79 && itemRoll < 82){
            return "Potion of protection from "+dice.axes()+" [PHB 266]";
        } else if (itemRoll == 82 || itemRoll == 83){
            return "Potion of remove fear [PHB 271]";
        } else if (itemRoll == 84 || itemRoll == 85){
            return "Potion of shield of faith +2 [PHB 278]";
        } else if (itemRoll >= 86 && itemRoll < 89){
            return "Potion of lesser vigor [SC 229]";
        } else if (itemRoll == 89 || itemRoll == 90){
            return "Quaal's feather token, anchor [DMG 264]";
        } else if (itemRoll == 91 || itemRoll == 92){
            return "Skill shard [MIC 185]";
        } else if (itemRoll == 93 || itemRoll == 94) {
            return "Tanglefoot bag [PHB 128]";
        } else if (itemRoll >= 95 && itemRoll < 99){
            return "Thieves' tools, masterwork [PHB 130]";
        } else if (itemRoll == 99 || itemRoll == 100){
            return "Universal solvent [DMG 268]";
        }
        return "Something went wrong. Your roll was "+itemRoll;
    }
    public static String first(){
        itemRoll = dice.rolld100();
        if (itemRoll >= 1 && itemRoll < 5){
            return "Wand of detect magic (10 charges) [PHB 219]";
        } else if (itemRoll >=5 && itemRoll < 8){
            return "Wand of light (10 charges) [PHB 248]";
        } else if (itemRoll >= 8 && itemRoll < 11){
            return "Wand of read magic (10 charges) [PHB 269]";
        } else if (itemRoll == 11){
            return "Climber's kit [PHB 130]";
        } else if (itemRoll >= 12 && itemRoll < 15){
            return "Chain shirt [PHB 124]";
        } else if (itemRoll ==15){
            return "Crystal of illumination, least [MIC 64]";
        } else if (itemRoll ==16){
            return "Sleep arrow [DMG 228]";
        } else if (itemRoll == 17||itemRoll==18){
            return "Oil of bless weapon [PHB 205]";
        } else if (itemRoll == 19){
            return "Scroll of bless weapon (D) [PHB 205]";
        } else if (itemRoll == 20 || itemRoll ==21){
            return "Everburning torch [PHB 128]";
        } else if (itemRoll >= 22 && itemRoll < 26){
            return "Scroll of identify (A) [PHB]";
        } else if (itemRoll == 26){
            return "Daylight pellet [MIC 156]";
        } else if (itemRoll == 27){
            return "Elixir of love [DMG 255]";
        } else if (itemRoll == 28){
            return "Scroll of baleful transposition (A) [SC 23]";
        } else if (itemRoll == 29 || itemRoll == 30){
            return "Scroll of bear's endurance "+dice.AorD()+" [PHB 203]";
        } else if (itemRoll == 31 || itemRoll == 32){
            return "Scroll of bull's strength "+dice.AorD()+" [PHB 207]";
        } else if (itemRoll == 33 || itemRoll == 34){
            return "Scroll of cat's grace "+dice.AorD()+" [PHB 208]";
        } else if (itemRoll >=35 && itemRoll < 38){
            return "Scroll of moderate wounds (D) [PHB 216]";
        } else if (itemRoll == 38){
            return "Scroll of darkvision (A) [PHB 216]";
        } else if (itemRoll ==39){
            return "Scroll of delay poison (D) [PHB 217]";
        } else if (itemRoll == 40){
            return "Scroll of earthbind "+dice.AorD()+" [SC 76]";
        } else if (itemRoll == 41){
            return "Scroll of find traps (D) [PHB 230]";
        } else if (itemRoll == 42){
            return "Scroll of ghost touch armor "+dice.AorD()+" [SC 102]";
        } else if (itemRoll == 43){
            return "Scroll of glitterdust (A) [PHB 236]";
        } else if (itemRoll == 44 || itemRoll == 45){
            return "Scroll of invisibility (A) [PHB 275]";
        } else if (itemRoll >= 46 && itemRoll < 50){
            return "Scroll of knock (A) [PHB 246]";
        } else if (itemRoll >= 50 && itemRoll <53){
            return "Scroll of remove paralysis (D) [PHB 271]";
        } else if (itemRoll >= 53 && itemRoll <56){
            return "Scroll of resist energy "+dice.AorD()+" [PHB 272]";
        } else if (itemRoll == 56 || itemRoll == 57){
            return "Scroll of lesser restoration (D) [PHB 272]";
        } else if (itemRoll == 58){
            return "Scroll of see invisibility (A) [PHB 275]";
        } else if (itemRoll == 59){
            return "Scroll of silence (D) [DMG 279]";
        } else if (itemRoll == 60){
            return "Ungent of timelessness [DMG 268]";
        } else if (itemRoll == 61){
            return "Wand of benign transposition (10 charges) [SC 27]";
        } else if (itemRoll == 62 || itemRoll == 63){
            return "Wand of bless (10 charges) [PHB 205]";
        } else if (itemRoll >= 64 && itemRoll <72){
            return "Wand of cure light wounds (10 charges) [PHB 215]";
        } else if (itemRoll >= 72 && itemRoll <74){
            return "Wand of cure light wounds (10 charges) [PHB 215]";
        } else if (itemRoll == 74){
            return "Wand of lesser vigor (10 charges) [SC 229]";
        } else if (itemRoll >= 75 && itemRoll <79){
            return "Wand of mage armor (10 charges) [PHB 249]";
        } else if (itemRoll >= 79 && itemRoll < 85){
            return "Wand of magic missile (CL 1st, 10 charges) [PHB 251]";
        } else if (itemRoll == 85){
            return "Wand of ray of enfeeblement (10 charges) [PHB 269]";
        } else if (itemRoll == 86){
            return "Wand of repair light damage (10 charges) [SC 173]";
        } else if (itemRoll ==87){
            return "Wand of resurgence (10 charges) [SC 174]";
        } else if (itemRoll == 88 || itemRoll == 89){
            return "Wand of shield (10 charges) [PHB 278]";
        } else if (itemRoll == 90){
            return "Wand of snake's swiftness (10 charges) [SC 193]";
        } else if (itemRoll == 91){
            return "Light wooden shield, masterwork [PHB 125]";
        } else if (itemRoll == 92){
            return "Heavy wooden shield, masterwork [PHB 125]";
        } else if (itemRoll == 93){
            return "Light steel shield, masterwork [PHB 125]";
        } else if (itemRoll == 94){
            return "Buckler, masterwork [PHB 125]";
        } else if (itemRoll == 95){
            return "Leather armor, masterwork [PHB 125]";
        } else if (itemRoll == 96){
            return "Hide armor, masterwork [PHB 125]";
        } else if (itemRoll == 97){
            return "Heavy steel shield, masterwork [PHB 125]";
        } else if (itemRoll == 98){
            return "Studded leather, masterwork [PHB 126]";
        } else if (itemRoll == 99){
            return "Chainmail [PHB 124]";
        } else if (itemRoll == 100){
            return "Tower shield, masterwork [PHB 125]";
        }
        return "Something went wrong. Your roll was "+itemRoll;
    }
    
    public static String second(){
        itemRoll = dice.rolld100();
        //itemRoll = 35;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Scroll of arcane lock (A) [PHB 200]"; break;
            case 2: itemType = "Crystal of lifekeeping, least [MIC 25]"; break;
            case 3: itemType = "Everfull mug [MIC 160]"; break;
            case 4: itemType = "Quaal's feather token, fan [DMG 264]"; break;
            case 5: itemType = "Skill shard, greater [MIC 185]"; break;
            case 6: itemType = "Tanglepatch [MIC 188]"; break;
            case 7: itemType = "Chain shirt, masterwork [PHB 124]"; break;
            case 8: itemType = "Darkwood shield [DMG 221]"; break;
            case 9: itemType = "Darkwood buckler [DMG 221]"; break;
            case 10: itemType = "Crystal of aquatic action, least [MIC 25]"; break;
            case 11: itemType = "Dust of tracelessness [DMG 255]"; break;
            case 12: itemType = "Elixir of hiding [DMG 255]"; break;
            case 13: itemType = "Elixir of sneaking [DMG 255]"; break;
            case 14: itemType = "Elixir of swimming [DMG 255]"; break;
            case 15: itemType = "Elixir of vision [DMG 256]"; break;
            case 16: itemType = "Incense of concentration [MIC 162]"; break;
            case 17: itemType = "Jumping caltrops [MIC 162]"; break;
            case 18: itemType = "Safewing emblem [MIC 131]"; break;
            case 19: itemType = "Silversheen [DMG 166]"; break;
            case 20: itemType = "Crystal of adamant armor, least [MIC 24]"; break;
            case 21: itemType = "Crystal of adamant weaponry, least [MIC 24]"; break;
            case 22: itemType = "Blight stone [MIC 153]"; break;
            case 23: itemType = "Crystal of return, least [MIC 65]"; break;
            case 24: itemType = "Crystal of security, least [MIC 65]"; break;
            case 25: itemType = "Crystal of stamina, least [MIC 26]"; break;
            case 26: itemType = "Elixir of flaming fists [MIC 159]"; break;
            case 27: itemType = "Fountainhead arrow [MIC 52]"; break;
            case 28: itemType = "Oil of darkness [PHB 216]"; break;
            case 29: itemType = "Potion of barkskin +2 [PHB 203]"; break;
            case 30: itemType = "Potion of bear's endurance [PHB 203]"; break;
            case 31: itemType = "Potion of blur [PHB 206]"; break;
            case 32: itemType = "Potion of bull's strength [PHB 207]"; break;
            case 33: itemType = "Potion of cat's grace [PHB 208]"; break;
            case 34: 
            case 35:
            case 36:
            case 37: itemType = "Potion of cure moderate wounds [PHB 216]"; break;
            case 38: itemType = "Potion of darkvision [PHB 216]";break;
            case 39: itemType = "Potion of delay poison [PHB 217]"; break;
            case 40: itemType = "Potion of eagle's splendor [PHB 255]";break;
            case 41: itemType = "Potion of fox's cunning [PHB 233]";break;
            case 42: itemType = "Potion of invisibility [PHB 245]";break;
            case 43: 
            case 44: itemType = "Potion of lesser restoration [PHB 272]";break;
            case 45: itemType = "Potion of levitate [PHB 248]";break;
            case 46: itemType = "Potion of owl's wisdom [PHB 259]";break; 
            case 47: 
            case 48: itemType = "Potion of remove paralysis [PHB 271]";break;
            case 49: 
            case 50: itemType = "Potion of resist energy 10 ("+dice.ele()+") [PHB 272]";break;
            case 51: itemType = "Potion of shield of faith +3 [PHB 278]";break;
            case 52: itemType = "Potion of spider climb [PHB 283]"; break;
            case 53: itemType = "Quaal's feather token, bird [DMG 264]"; break;
            case 54: itemType = "Stench stone [MIC 186]";break;
            case 55: itemType = "Screaming bolt [DMG 227]"; break;
            case 56: 
            case 57:
            case 58: itemType = "Masterwork weapon [M282]";break;
            case 59: itemType = "Silver dagger, masterwork [DMG 228]";break;
            case 60: itemType = "Cold iron longsword, masterwork [DMG 227]";break;
            case 61: 
            case 62: 
            case 63: itemType = "Everlasting rations [MIC 160]";break;
            case 64: itemType = "Scroll of create food and water (D) [PHB 214]";break;
            case 65: 
            case 66: itemType = "Scroll of cure serious wounds (D) [PHB 216]";break;
            case 67: itemType = "Scroll of daylight "+dice.AorD()+" [PHB 216]";break;
            case 68: itemType = "Scroll of dispel magic "+dice.AorD()+" [PHB 223]";break;
            case 69: itemType = "Scroll of fireball (A) [PHB 231]"; break;
            case 70: itemType = "Scroll of fly (A) [PHB 232]";break;
            case 71: itemType = "Scroll of haste (A) [PHB 239]";break;
            case 72: itemType = "Scroll of invisibility purge (D) [PHB 245]";break;
            case 73: itemType = "Scroll of lightning bolt (A) [PHB 248]";break;
            case 74: 
            case 75:
            case 76:
            case 77:itemType = "Scroll of magic circle against "+dice.axes()+" "+dice.AorD()+" [PHB 249-250]";break;
            case 78:itemType = "Scroll of neutralize poison (D)";break;
            case 79:itemType = "Scroll of protection against energy "+dice.AorD()+" [PHB 266]";break;
            case 80:itemType = "Scroll of remove blindness/deafness (D) [PHB 270]";break;
            case 81:itemType = "Scroll of remove curse (D) [PHB 270]";break;
            case 82:itemType = "Scroll of remove disease (D) [PHB 271]";break;
            case 83:itemType = "Scroll of mass snake's swiftness (D) [SC 193]";break;
            case 84:itemType = "Scroll of speak with dead (D) [PHB 281]";break;
            case 85:itemType = "Scroll of tongues (A) [PHB 294]";break;
            case 86:itemType = "Scroll of vigor (D) [SC 229]";break;
            case 87:itemType = "Scroll of mass lesser vigor (D) [SC 229]";break;
            case 88:itemType = "Scroll of water breathing "+dice.AorD()+" [PHB 300]";break;
            case 89:itemType = "Amulet of toxin delay [MIC 70]";break;
            case 90:itemType = "Charm of countersong [MIC 85]";break;
            case 91:itemType = "Crystal of illumination, lesser [MIC 64]";break;
            case 92:itemType = "Crystal of life drinking, least [MIC 64]";break;
            case 93:itemType = "Crystal of screening, least [MIC 26]";break;
            case 94:
            case 95:itemType = "Electric eel elixir [MIC 158]";break;
            case 96:itemType = "Essentia jewel [MIC 159]";break;
            case 97:itemType = "Life ring [MIC 163]";break;
            case 98:
            case 99:itemType = "Quaal's feather token, tree [DMG 264]";break;
            case 100:itemType = "Revelation crystal, least [MIC 66]";break;
        }
        return itemType;
    }
    public static String third(){
        itemRoll = dice.rolld100();
        //itemRoll = 35;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Glitter stone [MIC 161]"; break;
            case 2: itemType = "Quaal's feather token, swan boar [DMG 264]"; break;
            case 3: itemType = "Amber amulet of vermin, giant bee [MIC 68]"; break;
            case 4: itemType = "Amulet of aquatic salvation [MIC 68]"; break;
            case 5: itemType = "Arcanist's gloves [MIC 72]"; break;
            case 6: if (dice.roll(1, 2)==1){
                itemType = "Arrow of biting [MIC 46]"; break;} else {
                itemType = "Bolt of biting [MIC 46]";break;
            }
            case 7: itemType = "Boots of landing [MIC 77]"; break;
            case 8: itemType = "Brute gauntlets [MIC 83]"; break;
            case 9: itemType = "Chronocharm of the celestial wanderer [MIC 85]"; break;
            case 10: itemType = "Chronocharm of the fateweaver [MIC 85]"; break;
            case 11: itemType = "Chronocharm of the grand master [MIC 86]"; break;
            case 12: itemType = "Chronocharm of the horizon walker [MIC 86]"; break;
            case 13: itemType = "Chronocharm of the laughing rogue [MIC 86]"; break;
            case 14: itemType = "Chronocharm of the uncaring archmage [MIC 86]"; break;
            case 15: itemType = "Crystal of energy assault, least [MIC 64]"; break;
            case 16: itemType = "Clasp of energy protection, least [MIC 24]"; break;
            case 17: itemType = "Crystal of adaption, least [MIC 24]"; break;
            case 18: itemType = "Crystal of arcane steel, least [MIC 64]"; break;
            case 19: itemType = "Crystal of arrow deflection, least [MIC 25]"; break;
            case 20: itemType = "Crystal of bent sight [MIC 25]"; break;
            case 21: itemType = "Crystal of glancing blows, least [MIC 25]"; break;
            case 22: itemType = "Crystal of mind cloaking, least [MIC 25]"; break;
            case 23: itemType = "Dust of dispersion [MIC 158]"; break;
            case 24: itemType = "Elixir of adamantine blood [MIC 158]"; break;
            case 25: itemType = "Elixir of truth [DMG 256]"; break;
            case 26: itemType = "Iron ward diamond, least [MIC 26]"; break; 
            case 27: itemType = "Magic bedroll [MIC 163]"; break;
            case 28: itemType = "Phoenix ash theat, least [MIC 65]"; break;
            case 29: itemType = "Quaal's feather token, whip [DMG 264]"; break;
            case 30: itemType = "Reach gauntlets [MIC 120]"; break;
            case 31: itemType = "Restful crystal [MIC 26]"; break;
            case 32: itemType = "Rubicund frenzy, least [MIC 26]"; break;
            case 33: itemType = "Shiftweave [MIC 133]"; break;
            case 34: itemType = "Symbol of transfiguration [MIC 139]";break;
            case 35: itemType = "Talisman of the disk [MIC 188]";break;
            case 36: itemType = "Troll gut rope [MIC 190]";break;
            case 37: itemType = "Watch lamp [MIC 147]"; break;
            case 38: itemType = "Necklace of copper dragon scales [MIC 118]";break;
            case 39: itemType = "Boots of agile leaping [MIC 76]"; break;
            case 40: itemType = "Boots of stomping [MIC 78]";break;
            case 41: itemType = "Lenses of bright vision [MIC 113]";break;
            case 42: itemType = "Pearl of speech [MIC 118]";break;
            case 43: itemType = "Potion of barkskin +3 [PHB 203]";break;
            case 44: itemType = "Potion of shield of faith +4 [PHB 278]";break;
            case 45: itemType = "Wink brooch [MIC 148]";break;
            case 46: itemType = "Amber amulet of vermin, giant praying mantis [MIC 68]";break; 
            case 47: itemType = "Amber amulet of vermin, giant queen ant [MIC 68]";break;
            case 48: itemType = "Amber amulet of vermin, huge monstrous centipede [MIC 68]";break;
            case 49: itemType = "Amber amulet of vermin, huge monstrous scorpion [MIC 68]";break;
            case 50: itemType = "Amber amulet of vermin, large monstrous spider [MIC 68]";break;
            case 51: itemType = "Potion of resist energy "+dice.ele()+" 20 "+dice.AorD()+" [PHB 272]";break;
            case 52: itemType = "Scroll of air walk (D) [PHB 196]"; break;
            case 53: itemType = "Scroll of cure critical wounds (D) [PHB 215]"; break;
            case 54: itemType = "Scroll of darkvision, mass (A) [SC 59]";break;
            case 55: itemType = "Scroll of death ward (D) [PHB 217]"; break;
            case 56: itemType = "Scroll of dimensional anchor "+dice.AorD()+" [PHB 221]";break;
            case 57: itemType = "Scroll of dismissal (D) [PHB 222]";break;
            case 58: itemType = "Scroll of freedom of movement (D) [PHB 233]";break;
            case 59: itemType = "Scroll of ice storm (A) [PHB 243]";break;
            case 60: itemType = "Scroll of greater invisibility [PHB 245]";break;
            case 61: itemType = "Scroll of know vulnerabilities (A) [SC 129]";break;
            case 62: itemType = "Scroll of Leomund's secure shelter (A) [PHB 247]";break;
            case 63: itemType = "Scroll of panacea (D) [MIC 160]";break;
            case 64: itemType = "Scroll of remove curse "+dice.AorD()+" [PHB 270]";break;
            case 65: itemType = "Scroll of revenance (D) [SC 175]";break;
            case 66: itemType = "Scroll of sending (D) [PHB 275]";break;
            case 67: itemType = "Scroll of tongues (D) [PHB 294]";break;
            case 68: itemType = "Soulvoid orb [MIC 186]";break;
            case 69: itemType = "Crest of bravery [PHB 90]"; break;
            case 70: itemType = "Healing belt [MIC 110]";break;
            case 71: itemType = "Oil of greater magic weapon +1 [PHB 251]";break;
            case 72: itemType = "Oil of keen edge [PHB 246]";break;
            case 73: itemType = "Oil of magic vestment +1 [PHB 251]";break;
            case 74: 
            case 75: itemType = "Potion of cure serious wounds [PHB 216]";break; 
            case 76: itemType = "Potion of displacement [PHB 223]";break;
            case 77:itemType = "Potion of fly [PHB 232]";break;
            case 78:itemType = "Potion of gaseous form [PHB 234]";break;
            case 79:itemType = "Potion of greater magic fang +1 [PHB 250]";break;
            case 80:itemType = "Potion of haste [PHB 239]";break;
            case 81:itemType = "Potion of heroism [PHB 240]";break;
            case 82:itemType = "Potion of magic circle against "+dice.axes()+" [PHB 249]";break;
            case 83:itemType = "Potion of neutralize poison [PHB 257]";break;
            case 84:itemType = "Potion of protection against energy [PHB 266]";break;
            case 85:itemType = "Potion of remove blindness/deafness [PHB 270]";break;
            case 86:itemType = "Potion of remove curse [SC 270]";break;
            case 87:itemType = "Potion of remove disease [SC 271]";break;
            case 88:itemType = "Potion of vigor [SC 229]";break;
            case 89:itemType = "Potion of water breathing [PHB 300]";break;
            case 90:itemType = "Powder of the black veil [MIC 169]";break;
            case 91:itemType = "Scrying beacon [MIC 184]";break;
            case 92:itemType = "Wand of magic missile (CL 5th, 10 charges) [PHB 251]";break;
            case 93:itemType = "Amber amulet of vermin, giant wasp [MIC 68]";break;
            case 94: itemType = "Bag of endless caltrops [MIC 151]";break;
            case 95:itemType = "Everlasting feedbag [MIC 160]";break;
            case 96:itemType = "Armband of elusive action [MIC 72]";break;
            case 97:itemType = "Ephod of authority [MIC 215]";break;
            case 98:itemType = "Porcupine elixir [MIC 169]";break;
            case 99:itemType = "Rope of stone [MIC 176]";break;
            case 100:itemType = "Scroll of restoration (D) [PHB 272]";break;
        }
        return itemType;
    }
    
    public static String fourth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Eternal wand of cure light wounds [PHB 215]"; break;
            case 2: itemType = "Eternal wand of enlarge person [PHB 226]"; break;
            case 3: itemType = "Eternal wand of mage armor [PHB 249]"; break;
            case 4: itemType = "Eternal wand of magic missile [PHB 251]"; break;
            case 5: itemType = "Eternal wand of protection from "+dice.ele()+" [MIC 72]"; break;
            case 6: itemType = "Eternal wand of ray of enfeeblement [PHB 269]"; break;
            case 7: itemType = "Eternal wand of repair light damage [SC 173]"; break;
            case 8: itemType = "Eternal wand of shield [PHB 278]"; break;
            case 9: itemType = "Dust of dryness [DMG 255]"; break;
            case 10: itemType = "Acrobat boots [MIC 67]"; break;
            case 11: itemType = "Bag of tricks, gray [DMG 248]"; break;
            case 12: itemType = "Blast disk [MIC 152]"; break;
            case 13: itemType = "Crystal of stamina, lesser [MIC 26]"; break; 
            case 14: itemType = "Hand of the mage [DMG 258]"; break;
            case 15: itemType = "Pearl of brain lock [MIC 167]"; break;
            case 16: itemType = "Piercer cloak [MIC 118]"; break;
            case 17: itemType = "Potion of barkskin +4 [PHB 203]"; break;
            case 18: itemType = "Wand of bear's endurance (10 charges) [PHB 203]"; break;
            case 19: itemType = "Wand of blur (10 charges) [PHB 206]"; break;
            case 20: itemType = "Wand of bull's strength (10 charges) [PHB 207]"; break;
            case 21: itemType = "Wand of cat's grace (10 charges) [PHB 208]"; break;
            case 22: itemType = "Wand of cure moderate wounds (10 charges) [PHB 216]"; break;
            case 23: itemType = "Wand of delay poison (10 charges) [PHB 217]"; break;
            case 24: itemType = "Wand of invisibility (10 charges) [PHB 245]"; break;
            case 25: itemType = "Wand of knock (10 charges) [PHB 246]"; break;
            case 26: itemType = "Wand of mirror image (10 charges) [PHB 254]"; break; 
            case 27: itemType = "Wand of repair moderate damage (10 charges) [SC 173]"; break;
            case 28: itemType = "Wand of scorching ray (10 charges) [PHB 274]"; break;
            case 29: itemType = "Wand of see invisibility (10 charges) [PHB 274]"; break;
            case 30: itemType = "Scroll of stoneskin (A) [PHB 204]"; break;
            case 31: itemType = "Bracers of armor +1 [DMG 250]"; break;
            case 32: itemType = "Brawler’s gauntlets [MIC 82]"; break;
            case 33: itemType = "Brooch of stability [MIC 83]"; break;
            case 34: itemType = "Burning veil [MIC 211]";break;
            case 35: itemType = "Cloak of elemental protection [MIC 87]";break;
            case 36: itemType = "Cloak of resistance +1 [DMG 253]";break;
            case 37: itemType = "Cognizance crystal, 1 point [MIC 154]"; break;
            case 38: itemType = "Crystal of aquatic action, lesser [MIC 25]";break;
            // Pick up here:
            case 39: itemType = "Crystal of illumination, greater [MIC 64]"; break;
            case 40: itemType = "Crystal of lifekeeping, lesser [MIC 40]";break;
            case 41: itemType = "Crystal of return, lesser [MIC 65]";break;
            case 42: itemType = "Crystal of screening, lesser [MIC 26]";break;
            case 43: itemType = "Crystal of security, lesser [MIC 65]";break;
            case 44: itemType = "Demolition crystal, least [MIC 65]";break;
            case 45: itemType = "Dispelling cord [MIC 94]";break;
            case 46: itemType = "Drums of marching [MIC 158]";break; 
            case 47: itemType = "Eagle claw talisman [MIC 96]";break;
            case 48: itemType = "Fiendslayer crystal, least [MIC 65]";break;
            case 49: itemType = "Gauntlets of energy transformation [MIC 102]";break;
            case 50: itemType = "Gloves of spell disruption [MIC 107]";break;
            case 51: itemType = "Gloves of the starry sky [PHB 204]";break;
            case 52: itemType = "Glyph seal [MIC 161]"; break;
            case 53: itemType = "Lightning gauntlets [MIC 113]"; break;
            case 54: itemType = "Pearl of power, 1st-level spell [DMG 263]";break;
            case 55: itemType = "Phylactery of faithfulness [DMG 264]"; break;
            case 56: itemType = "Reliquary holy symbol [MIC 120]";break;
            case 57: itemType = "Replenishing skin [MIC 173]";break;
            case 58: itemType = "Revelation crystal, lesser [MIC 66]";break;
            case 59: itemType = "Ring of brief blessing [MIC 122]";break;
            case 60: itemType = "Salve of slipperiness [DMG 266]";break;
            case 61: itemType = "Third eye improvisation [MIC 141]";break;
            case 62: itemType = "Truedeath crystal, least [MIC 66]";break;
            case 63: itemType = "Vest of resistance +1 [MIC 147]";break;
            case 64: 
            case 65: 
            case 66: 
            case 67: 
            case 68: 
            case 69: 
            case 70: 
            case 71: 
            case 72: 
            case 73: itemType = "+1 armor/shield [MIC 282]";break;
            case 74: itemType = "Mithral heavy shield [DMG 221]";break; 
            case 75: itemType = "Potion of good hope [PHB 237]";break; 
            case 76: itemType = "Mithral shirt [DMG 220]";break;
            case 77:itemType = "Elixir of fire breath [DMG 255]";break;
            case 78:itemType = "Potion of resist energy ("+dice.ele()+") [PHB 272]";break;
            case 79:itemType = "Scroll of break enchantment (A) [PHB 207]";break;
            case 80:itemType = "Scroll of contact other plane (A) [PHB 212]";break;
            case 81:itemType = "Scroll of greater dimension door (A) [SC 64]";break;
            case 82:itemType = "Scroll of dismissal (A) [PHB 222]";break;
            case 83:itemType = "Scroll of disrupting weapon (D) [PHB 223]";break;
            case 84:itemType = "Scroll of fire shield, mass (A) [SC 92]";break;
            case 85:itemType = "Scroll of mass fly (A) [SC 96]";break;
            case 86:itemType = "Scroll of Mordenkain's private sanctum (A) [PHB 256]";break;
            case 87:itemType = "Scroll of plane shift (D) [PHB 262]";break;
            case 88:itemType = "Scroll of sending (A) [PHB 275]";break;
            case 89:itemType = "Scroll of teleport (A) [PHB 292]";break;
            case 90:itemType = "Scroll of vigorous circle (D)[SC 229]";break;
            case 91:itemType = "Pipes of the sewers [MIC 184]";break;
            case 92:itemType = "Amber amulet of vermin, giant stag beetle [MIC 68]";break;
            case 93:itemType = "Dragon’s draught, brass [MIC 157]";break;
            case 94: itemType = "Dragon’s draught, white [MIC 157]";break;
            case 95:itemType = "Dust of illusion [DMG 255]";break;
            case 96:itemType = "Oil of greater magic weapon +2 [PHB 251]";break;
            case 97:itemType = "Oil of magic vestment +2 [PHB 251]";break;
            case 98:itemType = "Potion of barkskin +5 [PHB 203]";break;
            case 99:itemType = "Potion of greater magic fang +2 [PHB 250]";break;
            case 100:itemType = "Goggles of minute seeing [DMG 257]";break;
        }
        return itemType;
    }
    public static String fifth(){ // WIP
        itemRoll = dice.rolld100();
        itemRoll = 2;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 01: itemType = "Beetle elixir [MIC 151]"; break;
case 2: itemType = "Fochlucan bandore [MIC 161]"; break;
case 3: itemType = "Medal of gallantry [MIC 116]"; break;
case 4: itemType = "Salve of minor spell resistance [MIC 183]"; break;
case 5: itemType = "Scrying shard [MIC 184]"; break;
case 6: itemType = "Snakeblood tooth [MIC 136]"; break;
case 7: itemType = "Wand of magic missile (CL 9th, 10 charges) [PHB 251]"; break;
case 8: itemType = "Wyrmfang amulet [MIC 148]"; break;
case 9: itemType = "Scroll of true seeing (D) [PHB 296]"; break;
case 10: itemType = "Crystal of adamant armor, lesser [MIC 24]"; break;
case 11: itemType = "Crystal of adamant weaponry, lesser [MIC 64]"; break;
case 12: itemType = "Anklet of translocation [MIC 71]"; break;
case 13: itemType = "Arcane thieves’ tools [MIC 150]"; break;
case 14: itemType = "Armband of confrontation [MIC 193]"; break;
case 15: itemType = "Badge of valor [MIC 208]"; break;
case 16: itemType = "Bag of boulders [MIC 150]"; break;
case 17: itemType = "Blighter’s hex-eye [MIC 75]"; break;
case 18: itemType = "Bracers of quick strike [MIC 81]"; break;
case 19: itemType = "Cloak of predatory vigor [MIC 87]"; break;
case 20: itemType = "Cobra straps [MIC 201]"; break;
case 21: itemType = "Ehlonna’s seed pouch [MIC 158]"; break;
case 22: itemType = "Lenses of revelation [MIC 215]"; break;
case 23: itemType = "Rod of frost [MIC 174]"; break;
case 24: itemType = "Rod of sliding [MIC 175]"; break;
case 25: case 26: itemType = "Sending stones (pair) [MIC 184]"; break;
case 27: itemType = "Spool of endless rope [MIC 186]"; break;
case 28: itemType = "Standard of valor [MIC 197]"; break;
case 29: itemType = "Steadfast boots [MIC 138]"; break;
case 30: itemType = "Aroma of dreams [MIC 150]"; break;
case 31: itemType = "Bracers of great collision [MIC 80]"; break;
case 32: itemType = "Brooch of shielding [DMG 250]"; break;
case 33: itemType = "Camouflage paint [MIC 153]"; break;
case 34: itemType = "Clasp of energy protection, lesser [MIC 24]"; break;
case 35: itemType = "Crystal of adaptation, lesser [MIC 24]"; break;
case 36: itemType = "Crystal of life drinking, lesser [MIC 64]"; break;
case 37: itemType = "Empowered spellshard, 1st-level spell [MIC 96]"; break;
case 38: itemType = "Enduring amulet [MIC 97]"; break;
case 39: itemType = "Exploding spike [MIC 160]"; break;
case 40: itemType = "Hammersphere [MIC 161]"; break;
case 41: itemType = "Inquisitor bracers [MIC 113]"; break;
case 42: itemType = "Javelin of lightning [DMG 226]"; break;
case 43: itemType = "Medal of steadfast honor [MIC 196]"; break;
case 44: itemType = "Memento magica, 1st-level spell [MIC 164]"; break;
case 45: itemType = "Artificer’s monocle [MIC 72]"; break;
case 46: itemType = "Bear helm [MIC 72]"; break;
case 47: itemType = "Belt of one mighty blow [MIC 74]"; break;
case 48: case 49: itemType = "Boots of dragonstriding [MIC 77]"; break;
case 50: case 51: itemType = "Boots of the mountain king [MIC 78]"; break;
case 52: case 53: itemType = "Tome of worldly memory [MIC 190]"; break;
case 54: case 55: itemType = "Headband of the lorebinder [MIC 110]"; break;
case 56: case 57: itemType = "Rhino elixir [MIC 173]"; break;
case 58: case 59: itemType = "Full plate, masterwork [PHB 124]"; break;
case 60: case 61: itemType = "Necklace of fireballs type I [DMG 263]"; break;
case 62: itemType = "Scroll of blade barrier (D) [PHB 205]"; break;
case 63: itemType = "Scroll of chain lightning (A) [PHB 208]"; break;
case 64: itemType = "Scroll of cloak of the sea SC (A) [SC 48]"; break;
case 65: case 66: case 67: itemType = "Scroll of disintegrate (A) [PHB 222]"; break;
case 68: case 69: case 70: itemType = "Scroll of greater dispel magic "+dice.AorD()+" [PHB 223]"; break;
case 71: itemType = "Scroll of energy immunity SC (D) [SC 80]"; break;
case 72: itemType = "Scroll of find the path (D) [PHB 230]"; break;
case 73: itemType = "Scroll of ghost trap SC (D) [SC 103]"; break;
case 74: case 75: case 76: itemType = "Scroll of harm (D) [PHB 239]"; break;
case 77: case 78: case 79: case 80: itemType = "Scroll of heal (D) [PHB 239]"; break;
case 81: itemType = "Scroll of shadow walk (A) [PHB 277]"; break;
case 82: case 83: itemType = "Scroll of stone to flesh (A) [PHB 285]"; break;
case 84: case 85: itemType = "Scroll of wind walk (D) [PHB 302]"; break;
case 86: case 87: itemType = "Dust of appearance [DMG 255]"; break;
case 88: itemType = "Githborn talisman [MIC 105]"; break;
case 89: itemType = "Hat of disguise [DMG 258]"; break;
case 90: case 91: case 92: itemType = "Oil of greater magic weapon +3 [PHB 251]"; break;
case 93: case 94: itemType = "Oil of magic vestment +3 [PHB 251]"; break;
case 95: itemType = "Pipes of sounding [DMG 264]"; break;
case 96: case 97: itemType = "Potion of greater magic fang +3 [PHB 250]"; break;
case 98: case 99: itemType = "Quiver of Ehlonna [DMG 265]"; break;
case 100: itemType = "Sphere of awakening [MIC 186]"; break;
        }
        return itemType;
    }
    
    public static String sixth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Adamantine mind blade gauntlets [MIC 68]"; break;
case 2: itemType = "Amulet of natural armor +1 [DMG 246]"; break;
case 3: itemType = "Amulet of retributive healing [MIC 69]"; break;
case 4: itemType = "Amulet of teamwork [MIC 70]"; break;
case 5: itemType = "Belt of theft-healing [MIC 74]"; break;
case 6: itemType = "Boots of the battle charger [MIC 76]"; break;
case 7: itemType = "Bracers of the entangling blast [MIC 80]"; break;
case 8: itemType = "Caduceus bracers [MIC 84]"; break;
case 9: itemType = "Cape of the viper [MIC 84]"; break;
case 10: itemType = "Caustic veil [MIC 212]"; break;
case 11: itemType = "Crystal of arcane steel, lesser [MIC 64]"; break;
case 12: itemType = "Devastation gauntlets [MIC 93]"; break;
case 13: itemType = "Dimension stride boots [MIC 94]"; break;
case 14: itemType = "Dragon spirit amulet [MIC 95]"; break;
case 15: itemType = "Dragon spirit cincture [MIC 95]"; break;
case 16: itemType = "Field provisions box [MIC 160]"; break;
case 17: itemType = "Gauntlets of arrow reflection [MIC 101]"; break;
case 18: itemType = "Gauntlets of extended range [MIC 103]"; break;
case 19: itemType = "Gauntlets of giantfelling [MIC 103]"; break;
case 20: itemType = "Gauntlets of throwing [MIC 104]"; break;
case 21: itemType = "Gloves of fortunate striking [MIC 105]"; break;
case 22: itemType = "Gloves of lightning [MIC 106]"; break;
case 23: itemType = "Goggles of lifesight [MIC 108]"; break;
case 24: itemType = "Goodberry bracelet [MIC 108]"; break;
case 25: itemType = "Greatreach bracers [MIC 108]"; break;
case 26: itemType = "Headband of conscious effort [MIC 109]"; break;
case 27: itemType = "Helm of battle [MIC 111]"; break;
case 28: itemType = "Helm of tactics [MIC 208]"; break;
case 29: itemType = "Heward’s handy haversack [DMG 259]"; break;
case 30: itemType = "Horn of fog [DMG 259]"; break;
case 31: itemType = "Iron ward diamond, lesser [MIC 26]"; break;
case 32: itemType = "Mask of sweet air [MIC 116]"; break;
case 33: itemType = "Orb of environmental adaptation [MIC 167]"; break;
case 34: itemType = "Pearl of breath crisis [MIC 168]"; break;
case 35: itemType = "Phoenix ash threat, lesser [MIC 65]"; break;
case 36: itemType = "Rearguard’s cape [MIC 120]"; break;
case 37: itemType = "Ring of communication [MIC 122]"; break;
case 38: itemType = "Ring of floating [MIC 123]"; break;
case 39: itemType = "Ring of four winds [MIC 124]"; break;
case 40: itemType = "Ring of piercing spells [MIC 126]"; break;
case 41: itemType = "Ring of protection +1 [DMG 232]"; break;
case 42: itemType = "Ring of the darkhidden [MIC 122]"; break;
case 43: itemType = "Ring of silent spells [MIC 127]"; break;
case 44: itemType = "Rock boots [MIC 130]"; break;
case 45: itemType = "Rod of grievous wounds [MIC 174]"; break;
case 46: itemType = "Rod of viscid globs [MIC 176]"; break;
case 47: itemType = "Rubicund frenzy, lesser [MIC 26]"; break;
case 48: itemType = "Sepulchral vest [MIC 133]"; break;
case 49: itemType = "Silkslick belt [MIC 136]"; break;
case 50: itemType = "Slashing sand [MIC 185]"; break;
case 51: itemType = "Spellsink scarab [MIC 138]"; break;
case 52: itemType = "Torc of displacement [MIC 143]"; break;
case 53: itemType = "Vest of defense [MIC 146]"; break;
case 54: case 55: case 56: case 57: case 58: case 59: case 60: itemType = "+1 weapon [MIC 282]"; break;
case 61: itemType = "Amulet of incarnum shielding [MIC 69]"; break;
case 62: itemType = "Enemy spirit pouch [MIC 97]"; break;
case 63: itemType = "Mac-Fuirmidh cithern [MIC 163]"; break;
case 64: itemType = "Third eye surge [MIC 143]"; break;
case 65: itemType = "Scroll of revivify (D) [SC 176]"; break;
case 66: itemType = "Shield of mercy [MIC 21]"; break;
case 67: itemType = "Gloves of agile striking [MIC 105]"; break;
case 68: itemType = "Ring of feather falling [DMG 232]"; break;
case 69: itemType = "Elemental gem [DMG 255]"; break;
case 70: itemType = "Healing salve [MIC 162]"; break;
case 71: itemType = "Wand of call lightning (10 charges) [PHB 207]"; break;
case 72: itemType = "Wand of cure serious wounds (10 charges) [PHB 216]"; break;
case 73: itemType = "Wand of dispel magic (10 charges) [PHB 223]"; break;
case 74: itemType = "Wand of displacement (10 charges) [PHB 223]"; break;
case 75: itemType = "Wand of fireball (10 charges) [PHB 231]"; break;  
case 76: itemType = "Wand of fly (10 charges) [PHB 232]"; break;
case 77: itemType = "Wand of haste (10 charges) [PHB 239]"; break;
case 78: itemType = "Wand of invisibility sphere (10 charges) [PHB 245]"; break;
case 79: itemType = "Wand of lightning bolt (10 charges) [PHB 248]"; break;
case 80: itemType = "Wand of mass lesser vigor (10 charges) [SC 229]"; break;
case 81: itemType = "Wand of repair serious damage (10 charges) [SC 173]"; break;
case 82: itemType = "Wand of vigor (10 charges) [SC 229]"; break;
case 83: itemType = "Scroll of banishment (A) [PHB 203]"; break;
case 84: itemType = "Scroll of energy immunity (A) [SC 80]"; break;
case 85: itemType = "Scroll of ethereal jaunt "+dice.AorD(); break;
case 86: itemType = "Scroll of invisibility, mass (A) [PHB 245]"; break;
case 87: itemType = "Scroll of Mordenkainen’s magnificent mansion (A) [PHB 256]"; break;
case 88: itemType = "Scroll of regenerate (D) [PHB 270]"; break;
case 89: itemType = "Scroll of spell turning (A) [PHB 282]"; break;
case 90: itemType = "Scroll of sunbeam (D) [PHB 289]"; break;
case 91: itemType = "Scroll of teleport, greater (A) [PHB 293]"; break;
case 92: itemType = "Slaying arrow [DMG 228]"; break;
case 93: itemType = "Amulet of tears [MIC 70]"; break;
case 94: itemType = "Bracers of arcane freedom [MIC 80]"; break;
case 95: itemType = "Bracers of opportunity [MIC 81]"; break;
case 96: itemType = "Brute ring [MIC 83]"; break;
case 97: itemType = "Cloak of weaponry [MIC 89]"; break;
case 98: itemType = "Rod of fumbling [MIC 174]"; break;
case 99: itemType = "Repelling gauntlets [MIC 121]"; break;
case 100: itemType = "Sandals of sprinting [MIC 131]"; break;
        }
            
            return itemType;
        }
    public static String seventh(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Scroll of restoration, mass (D) [SC 174]"; break;
case 2: itemType = "Dragon’s draught, black [MIC 157]"; break;
case 3: itemType = "Dragon’s draught, copper [MIC 157]"; break;
case 4: itemType = "Oil of greater magic weapon +4 [PHB 251]"; break;
case 5: itemType = "Oil of magic vestment +4 [PHB 251]"; break;
case 6: itemType = "Potion of greater magic fang +4 [PHB 250]"; break;
case 7: itemType = "Robe of bones [DMG 265]"; break;
case 8: itemType = "Scroll of revenance (A) [PHB 175]"; break;
case 9: itemType = "Sovereign glue [DMG 266]"; break;
case 10: itemType = "Bag of holding type I [DMG 248]"; break;
case 11: itemType = "Boots of elvenkind [DMG 250]"; break;
case 12: itemType = "Boots of jumping [MIC 77]"; break;
case 13: itemType = "Boots of the winterlands [DMG 250]"; break;
case 14: itemType = "Candle of truth [DMG 251]"; break;
case 15: itemType = "Censer of the last breath [MIC 153]"; break;
case 16: itemType = "Cloak of elvenkind [DMG 253]"; break;
case 17: itemType = "Cloak of quills [MIC 87]"; break;
case 18: itemType = "Counterstrike bracers [MIC 90]"; break;
case 19: itemType = "Crystal anchor of alertness [MIC 155]"; break;
case 20: itemType = "Crystal mask of knowledge [MIC 91]"; break;
case 21: itemType = "Crystal mask of languages [MIC 91]"; break;
case 22: itemType = "Crystal of arrow deflection, lesser [MIC 25]"; break;
case 23: itemType = "Eyes of the eagle [DMG 256]"; break;
case 24: itemType = "Gloves of eldritch admixture [MIC 105]"; break;
case 25: itemType = "Goggles of foefinding [MIC 108]"; break;
case 26: itemType = "Golembane scarab [DMG 266]"; break;
case 27: itemType = "Icy strand of the north [MIC 162]"; break;
case 28: itemType = "Ring of climbing [DMG 230]"; break;
case 29: itemType = "Ring of jumping [DMG 232]"; break;
case 30: itemType = "Ring of sustenance [DMG 233]"; break;
case 31: itemType = "Ring of swimming [DMG 233]"; break;
case 32: itemType = "Spellsight spectacles [MIC 138]"; break;
case 33: itemType = "Third eye dampening [MIC 141]"; break;
case 34: itemType = "Third eye expose [MIC 141]"; break;
case 35: itemType = "Tunic of steady spellcasting [MIC 144]"; break;
case 36: itemType = "Vanisher cloak [MIC 145]"; break;
case 37: itemType = "Bands of blood rage [MIC 202]"; break;
case 38: itemType = "Third eye freedom [MIC 141]"; break;
case 39: itemType = "Crystal of energy assault, lesser [MIC 64]"; break;
case 40: itemType = "Crystal of stamina, greater [MIC 26]"; break;
case 41: itemType = "Metamagic rod, Substitution, lesser [MIC 165]"; break;
case 42: itemType = "Necklace of fireballs type II [DMG 263]"; break; 
case 43: itemType = "Panther mask SP [MIC 201]"; break;
case 44: itemType = "Stone of alarm [DMG 267]"; break;
case 45: itemType = "Wand of searing light (CL 6th, 10 charges) [PHB 275]"; break;
case 46: itemType = "Aberrant sphere [MIC 149]"; break;
case 47: itemType = "Boots of desperation [MIC 77]"; break;
case 48: itemType = "Infinite scrollcase [MIC 162]"; break;
case 49: itemType = "Meteoric knife [MIC 53]"; break;
case 50: itemType = "Bag of tricks, rust [DMG 248]"; break;
case 51: itemType = "Bead of force [DMG 248]"; break;
case 52: itemType = "Belt of growth [MIC 73]"; break;
case 53: itemType = "Burnoose of 1,001 thorns [MIC 83]"; break;
case 54: itemType = "Chime of opening [DMG 252]"; break;
case 55: itemType = "Circlet of solace [MIC 87]"; break;
case 56: itemType = "Clasp of energy protection, greater [MIC 24]"; break;
case 57: itemType = "Contact medallion [MIC 90]"; break;
case 58: itemType = "Cord of favor SP [MIC 215]"; break;
case 59: itemType = "Corsair’s eye patch [MIC 90]"; break;
case 60: itemType = "Crystal of adaptation, greater [MIC 24]"; break;
case 61: itemType = "Crystal of aquatic action, greater [MIC 25]"; break;
case 62: itemType = "Crystal of glancing blows, lesser [MIC 25]"; break;
case 63: itemType = "Crystal of screening, greater [MIC 26]"; break;
case 64: itemType = "Crystal of security, greater [MIC 65]"; break;
case 65: itemType = "Demolition crystal, lesser [MIC 65]"; break;
case 66: itemType = "Empowered spellshard, 2nd-level spell [MIC 96]"; break;
case 67: itemType = "Essentia helm [MIC 97]"; break;
case 68: itemType = "Fiendslayer crystal, lesser [MIC 65]"; break;
case 69: itemType = "Gloves of manual prowess [MIC 106]"; break;
case 70: itemType = "Gloves of object reading [MIC 107]"; break;
case 71: itemType = "Heartseeking amulet [MIC 110]"; break;
case 72: itemType = "Horseshoes of speed [DMG 260]"; break;
case 73: itemType = "Metamagic rod, Enlarge, lesser [DMG 236]"; break;
case 74: itemType = "Metamagic rod, Extend, lesser [DMG 236]"; break;
case 75: itemType = "Metamagic rod, Sculpting, lesser [MIC 165]"; break;
case 76: itemType = "Metamagic rod, Silent, lesser [DMG 236]"; break;
case 77: itemType = "Oil of greater magic weapon +5 [PHB 251]"; break;
case 78: itemType = "Oil of magic vestment +5 [PHB 251]"; break;
case 79: itemType = "Potion of greater magic fang +5 [PHB 250]"; break;
case 80: itemType = "Rope of climbing [DMG 266]"; break;
case 81: itemType = "Scroll of brilliant aura SC (D) [SC 39]"; break;
case 82: itemType = "Scroll of cure critical wounds, mass (D) [PHB 215]"; break;
case 83: itemType = "Scroll of death ward, mass SC (D) [PHB 217]"; break;
case 84: itemType = "Scroll of dimensional lock "+dice.AorD(); break;
case 85: itemType = "Scroll of discern location (D) [PHB 222]"; break;
case 86: itemType = "Scroll of earthquake (D) [PHB 225]"; break;
case 87: itemType = "Scroll of fire storm (D) [PHB 231]"; break; 
case 88: itemType = "Scroll of ghostform SC (A) [SC 130]"; break;
case 89: itemType = "Scroll of horrid wilting (A) [PHB 242]"; break;
case 90: itemType = "Scroll of invisibility, superior SC (A) [SC 125]"; break;
case 91: itemType = "Scroll of iron body (A) [PHB 245]"; break;
case 92: itemType = "Scroll of mind blank (A) [PHB 253]"; break;
case 93: itemType = "Scroll of greater plane shift (A) [PHB 262]"; break;
case 94: itemType = "Scroll of polar ray (A) [PHB 262]"; break;
case 95: itemType = "Scroll of sunburst (D) [PHB 289]"; break;
case 96: itemType = "Soulsmite gauntlets [MIC 136]"; break;
case 97: itemType = "Talisman of undead mastery [MIC 188]"; break;
case 98: itemType = "Third eye clarity [MIC 141]"; break;
case 99: itemType = "Adamantine dagger [DMG 226]"; break;
case 100: itemType = "Adamantine battleaxe [DMG 226]"; break;
            }
            
            return itemType;
        }
    
    public static String eighth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Brooch of avoidance [MIC 82]"; break;
case 2: itemType = "Caster’s shield [DMG 221]"; break;
case 3: itemType = "Chime of harmonic agony [MIC 154]"; break;
case 4: itemType = "Gloves of the uldra savant [MIC 107]"; break;
case 5: itemType = "Hexbands [MIC 112]"; break;
case 6: itemType = "Orb of mental renewal [MIC 167]"; break;
case 7: itemType = "Pipes of frenzied revelry [MIC 168]"; break;
case 8: itemType = "Rapidstrike bracers [MIC 119]"; break;
case 9: itemType = "Rod of bodily restoration [MIC 173]"; break;
case 10: itemType = "Summoner’s totem [MIC 187]"; break;
case 11: itemType = "Vanguard treads [MIC 145]"; break;
case 12: itemType = "Bracers of the blast barrier [MIC 80]"; break;
case 13: itemType = "Eyes of expanded vision [MIC 98]"; break;
case 14: itemType = "Formless vest [MIC 100]"; break;
case 15: itemType = "Hellcat gauntlets [MIC 111]"; break;
case 16: itemType = "Rags of restraint [MIC 119]"; break;
case 17: itemType = "Skirmisher boots [MIC 136]"; break;
case 18: itemType = "Domain draught [MIC 156]"; break;
case 19: itemType = "Mask of blood [MIC 115]"; break;
case 20: itemType = "Reins of ascension [MIC 120]"; break;
case 21: itemType = "Spellmight bracers [MIC 137]"; break;
case 22: itemType = "Survival pouch [MIC 187]"; break;
case 23: itemType = "Torc of the titans [MIC 143]"; break;
case 24: itemType = "Dragonhide plate [DMG 220]"; break;
case 25: itemType = "Crystal of adamant armor, greater [MIC 24]"; break;
case 26: itemType = "Crystal of adamant weaponry, greater [MIC 64]"; break;
case 27: itemType = "Badge of glory [MIC 214]"; break;
case 28: itemType = "Bow of the wintermoon [MIC 48]"; break;
case 29: itemType = "Hair shirt of suffering [MIC 109]"; break;
case 30: itemType = "Scout’s headband [MIC 132]"; break;
case 31: itemType = "Mithralmist shirt [MIC 20]"; break;
case 32: itemType = "Bag of flames [MIC 151]"; break;
case 33: itemType = "Crystal of alacrity [MIC 195]"; break;
case 34: itemType = "Dragon’s draught, bronze [MIC 157]"; break;
case 35: itemType = "Dragon’s draught, green [MIC 157]"; break;
case 36: itemType = "Dust of disappearance [DMG 255]"; break;
case 37: itemType = "Finned gauntlets [MIC 100]"; break;
case 38: itemType = "Lens of detection [DMG 261]"; break;
case 39: itemType = "Lockpicking ring [MIC 114]"; break;
case 40: itemType = "Mask of mastery [MIC 193]"; break;
case 41: itemType = "Quicksilver boots [MIC 119]"; break;
case 42: itemType = "Radiant sphere [MIC 172]"; break;
case 43: itemType = "Raptor’s mask [MIC 210]"; break;
case 44: itemType = "Ring of mystic healing [MIC 126]"; break;
case 45: itemType = "Rod of escape [MIC 173]"; break;
case 46: itemType = "Shard of the sun [MIC 185]"; break;
case 47: itemType = "Sleeping spike [MIC 185]"; break;
case 48: itemType = "True strike gauntlets [MIC 144]"; break;
case 49: itemType = "Belt of ultimate athleticism [MIC 75]"; break;
case 50: itemType = "Enveloping pit [MIC 159]"; break;
case 51: itemType = "Mirror of suggestion [MIC 165]"; break;
case 52: itemType = "Mithral bells [MIC 117]"; break;
case 53: itemType = "Rending gauntlets [MIC 121]"; break;
case 54: itemType = "Shadow maniple [MIC 133]"; break;
case 55: itemType = "Figurine of wondrous power, silver raven [DMG 256]"; break;
case 56: itemType = "Scroll of freedom (A) [PHB 233]"; break;
case 57: itemType = "Scroll of heal, mass (D) [PHB 239]"; break;
case 58: itemType = "Amulet of health +2 [DMG 246]"; break;
case 59: itemType = "Boots of the unending journey [MIC 79]"; break;
case 60: itemType = "Bracers of accuracy [MIC 79]"; break;
case 61: itemType = "Bracers of armor +2 [DMG 250]"; break;
case 62: itemType = "Bracers of repulsion [MIC 81]"; break;
case 63: itemType = "Cloak of Charisma +2 [DMG 253]"; break;
case 64: itemType = "Cloak of resistance +2 [DMG 253]"; break;
case 65: itemType = "Cognizance crystal, 3 points [MIC 154]"; break;
case 66: itemType = "Crystal of mind cloaking, lesser [MIC 25]"; break;
case 67: itemType = "Crystal of return, greater [MIC 65]"; break;
case 68: itemType = "Dragon mask [MIC 94]"; break;
case 69: itemType = "Gauntlets of ghost fighting [MIC 216]"; break;
case 70: itemType = "Gauntlets of ogre power [DMG 257]"; break;
case 71: itemType = "Gauntlets of the talon [MIC 103]"; break;
case 72: itemType = "Gloves of arrow snaring [DMG 257]"; break;
case 73: itemType = "Gloves of Dexterity +2 [DMG 257]"; break;
case 74: itemType = "Glyph seal, greater [MIC 161]"; break;
case 75: itemType = "Goggles of the golden sun MIC 205]"; break;
case 76: itemType = "Headband of intellect +2 [DMG 258]"; break;
case 77: itemType = "Ioun stone, clear spindle [DMG 260]"; break;
case 78: itemType = "Keoghtom’s ointment [DMG 261]"; break;
case 79: itemType = "Mask of mental armor [MIC 115]"; break;
case 80: itemType = "Mask of the tiger [MIC 200]"; break;
case 81: itemType = "Necklace of warning [MIC 118]"; break;
case 82: itemType = "Nolzur’s marvelous pigments [DMG 263]"; break;
case 83: itemType = "Pearl of power, 2nd-level spell [DMG 263]"; break;
case 84: itemType = "Pendant of joy [MIC 118]"; break;
case 85: itemType = "Periapt of Wisdom +2 [DMG 263]"; break;
case 86: itemType = "Ring of counterspells [DMG 230]"; break;
case 87: itemType = "Rod of silence [MIC 175]"; break;
case 88: itemType = "Rod of sure striking [MIC 175]"; break;
case 89: itemType = "Scry shroud [MIC 133]"; break;
case 90: itemType = "Stone salve [DMG 267]"; break;
case 91: itemType = "Stormfire ring [MIC 206]"; break;
case 92: itemType = "Surcoat of valor [MIC 139]"; break;
case 93: itemType = "Torc of power preservation [MIC 143]"; break;
case 94: itemType = "Veil of storms [MIC 213]"; break;
case 95: itemType = "Vest of resistance +2 [MIC 147]"; break;
case 96: itemType = "Wilding clasp [MIC 190]"; break;
case 97: case 98: case 99: case 100: itemType = "+2 armor/shield [MIC 282]"; break;
            }
            
            return itemType;
        }
    
    public static String ninth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Slaying arrow, greater [DMG 228]"; break;
case 2: itemType = "Armbands of might [MIC 72]"; break;
case 3: itemType = "Doss lute [MIC 156]"; break;
case 4: itemType = "Crystal echoblade [MIC 49]"; break;
case 5: itemType = "Elven chain [DMG 220]"; break;
case 6: itemType = "Barricade buckler [MIC 16]"; break;
case 7: itemType = "Circlet of wild surging [MIC 87]"; break;
case 8: case 9: itemType = "Wand of cure critical wounds (10 charges) [PHB 215]"; break;
case 10: itemType = "Wand of death ward (10 charges) [PHB 217]"; break;
case 11: itemType = "Wand of freedom of movement (10 charges) [PHB 233]"; break;
case 12: itemType = "Wand of greater invisibility (10 charges) [PHB 245]"; break;
case 13: itemType = "Wand of ice storm (10 charges) [PHB 243]"; break;
case 14: itemType = "Wand of repair critical damage (10 charges) [SC 173]"; break;
case 15: itemType = "White cloak of the spider [MIC 148]"; break;
case 16: itemType = "Shatterspike [DMG 228]"; break;
case 17: itemType = "Living chain [MIC 53]"; break;
case 18: itemType = "Necklace of fireballs type III [DMG 2263]"; break;
case 19: itemType = "Strand of lightning [MIC 187]"; break;
case 20: itemType = "Sacred scabbard [MIC 183]"; break;
case 21: itemType = "Thorn pouch [MIC 188]"; break;
case 22: itemType = "Eternal wand of blur [PHB 206]"; break;
case 23: itemType = "Eternal wand of cure moderate wounds [PHB 216]"; break;
case 24: itemType = "Eternal wand of invisibility [PHB 245]"; break;
case 25: itemType = "Eternal wand of mirror image [PHB 254]"; break;
case 26: itemType = "Eternal wand of repair moderate damage SC [SC 173]"; break;
case 27: itemType = "Eternal wand of see invisibility [PHB 275]"; break;
case 28: itemType = "Eternal wand of snake’s swiftness [SC 193]"; break;
case 29: itemType = "Eternal wand of web [PHB 301]"; break;
case 30: itemType = "Scroll of greater restoration (D) [PHB 272]"; break;
case 31: itemType = "Aroma of curdled death [MIC 150]"; break;
case 32: itemType = "Barbs of retribution [MIC 203]"; break;
case 33: itemType = "Belt of the champion [MIC 73]"; break;
case 34: itemType = "Circlet of persuasion [DMG 252]"; break;
case 35: itemType = "Dragon’s draught, blue [MIC 157]"; break;
case 36: itemType = "Dragon’s draught, silver [MIC 157]"; break;
case 37: itemType = "Gem of the glitterdepth [MIC 104]"; break;
case 38: itemType = "Goggles of day [MIC 107]"; break;
case 39: itemType = "Helm of the purple plume [MIC 111]"; break;
case 40: itemType = "Mask of lies [MIC 115]"; break;
case 41: itemType = "Ring of vengeance [MIC 128]"; break;
case 42: case 43: itemType = "Wand of dispel magic (CL 10th, 10 charges) [PHB 223]"; break;
case 44: case 45: itemType = "Wand of fireball (CL 10th, 10 charges) [PHB 231]"; break;
case 46: case 47: itemType = "Wand of lightning bolt (CL 10th, 10 charges) [PHB 248]"; break;
case 48: itemType = "Wand of searing light (CL 10th, 10 charges) [PHB 275]"; break;
case 49: itemType = "Shield of the severed hand [MIC 22]"; break;
case 50: itemType = "Bowstaff [MIC 48]"; break;
case 51: itemType = "Personal oasis [MIC 168]"; break;
case 52: itemType = "Bladed crossbow [MIC 47]"; break;
case 53: itemType = "Slippers of spider climbing [DMG 266]"; break;
case 54: itemType = "Scroll of teleportation circle (A) [PHB 293]"; break;
case 55: itemType = "Incense of meditation [DMG 260]"; break;
case 56: itemType = "Amulet of fortune prevailing [MIC 69]"; break;
case 57: itemType = "Bag of holding type II [DMG 248]"; break;
case 58: itemType = "Belt of hidden pouches [MIC 74]"; break;
case 59: itemType = "Bolt shirt [MIC 75]"; break;
case 60: itemType = "Boots of swift passage [MIC 78]"; break;
case 61: itemType = "Boots of tremorsense [MIC 79]"; break;
case 62: itemType = "Bracers of aerial combat SP [MIC 194]"; break;
case 63: itemType = "Bracers of archery, lesser [DMG 250]"; break;
case 64: itemType = "Bracers of blinding strike SP [MIC 198]"; break;
case 65: itemType = "Bracers of retaliation [MIC 82]"; break;
case 66: itemType = "Circlet of mages [MIC 86]"; break;
case 67: itemType = "Cloak of soulbound resistance [MIC 88]"; break;
case 68: itemType = "Collar of healing [MIC 89]"; break;
case 69: itemType = "Crimson dragonhide bracers [MIC 90]"; break;
case 70: itemType = "Crystal of arrow deflection, greater [MIC 25]"; break;
case 71: itemType = "Crystal of glancing blows, greater [MIC 25]"; break;
case 72: itemType = "Crystal of lifekeeping, greater [MIC 25]"; break;
case 73: itemType = "Truedeath crystal, lesser [MIC 66]"; break;
case 74: itemType = "Deathstrike bracers [MIC 93]"; break;
case 75: itemType = "Diamondskin decanter [MIC 156]"; break;
case 76: itemType = "Dragonscale cloak [MIC 95]"; break;
case 77: itemType = "Fiendslayer crystal, greater [MIC 65]"; break;
case 78: itemType = "Fiery tunic [MIC 99]"; break;
case 79: itemType = "Gauntlets of eldritch energy [MIC 102]"; break;
case 80: itemType = "Gauntlets of lassitude [MIC 103]"; break;
case 81: itemType = "Ghost shroud [MIC 104]"; break;
case 82: itemType = "Hand of the oak father [MIC 109]"; break;
case 83: itemType = "Helm of gazes [MIC 111]"; break;
case 84: itemType = "Horn of resilience SP [MIC 208]"; break;
case 85: itemType = "Immovable rod [DMG 235]"; break;
case 86: itemType = "Ioun stone, dusty rose prism [DMG 260]"; break;
case 87: itemType = "Ki straps [MIC 113]"; break;
case 88: itemType = "Mask of silent trickery [MIC 116]"; break;
case 89: itemType = "Noble pennon [MIC 166]"; break;
case 90: itemType = "Orb of blinding [MIC 167]"; break;
case 91: itemType = "Platinum helm [MIC 119]"; break;
case 92: itemType = "Portable foxhole [MIC 169]"; break;
case 93: itemType = "Reciprocal bracers [MIC 120]"; break;
case 94: itemType = "Revelation crystal, greater [MIC 66]"; break;
case 95: itemType = "Ring of arming [MIC 122]"; break;
case 96: itemType = "Ring of master artifice, lesser [MIC 125]"; break;
case 97: itemType = "Spider fang [MIC 60]"; break;
case 98: itemType = "Vampire torc [MIC 144]"; break;
case 99: itemType = "Vestments of ebonsilk [MIC 147]"; break;
case 100: itemType = "Witchlight reservoir [MIC 66]"; break;
            }
            
            return itemType;
        }
    public static String tenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
                case 1: itemType = "Raptor arrow [MIC 56]"; break;
case 2: itemType = "Ring of the forcewall [MIC 123]"; break;
case 3: itemType = "Gauntlets of the blood-lord [MIC 101]"; break;
case 4: itemType = "Hooked hammer of the hearthfire [MIC 52]"; break;
case 5: itemType = "Rhino hide [DMG 220]"; break;
case 6: itemType = "Helm of comprehend languages and read magic [DMG 259]"; break;
case 7: itemType = "Map of unseen lands [MIC 164]"; break;
case 8: itemType = "Vest of escape [DMG 268]"; break;
case 9: itemType = "Galeb duhr hammer [MIC 52]"; break;
case 10: itemType = "Assassin whip [MIC 46]"; break;
case 11: itemType = "Trident of serenity [MIC 62]"; break;
case 12: itemType = "Manticore greatsword [MIC 53]"; break;
case 13: itemType = "Eversmoking bottle [DMG 256]"; break;
case 14: itemType = "Murlynd’s spoon [DMG 262]"; break;
case 15: itemType = "Necklace of fireballs type IV [DMG 263]"; break;
case 16: itemType = "Boots of striding and springing [DMG 250]"; break;
case 17: itemType = "Dragon’s draught, gold [MIC 157]"; break;
case 18: itemType = "Dragon’s draught, red [MIC 157]"; break;
case 19: itemType = "Eyes of truth [MIC 99]"; break;
case 20: itemType = "Rope of climbing, superior [MIC 176]"; break;
case 21: itemType = "Tabard of the great crusade R [MIC 140]"; break;
case 22: itemType = "Tome of ancient lore R [MIC 189]"; break;
case 23: itemType = "Wind fan [DMG 268]"; break;
case 24: itemType = "Shield of the resolute R [MIC 21]"; break;
case 25: itemType = "Spined shield [DMG 221]"; break;
case 26: itemType = "Helm of glorious recovery [MIC 111]"; break;
case 27: itemType = "Helm of heroes [MIC 111]"; break;
case 28: itemType = "Staff of the unyielding oak R [MIC 60]"; break;
case 29: itemType = "Claw gloves SP [MIC 199]"; break;
case 30: itemType = "Necklace of fireballs type V [DMG 263]"; break;
case 31: itemType = "Amulet of emergency healing [MIC 68]"; break;
case 32: itemType = "Amulet of mighty fists +1 [DMG 246]"; break;
case 33: itemType = "Amulet of wordtwisting [MIC 71]"; break;
case 34: itemType = "Belt of priestly might [MIC 74]"; break;
case 35: itemType = "Boots of big stepping [MIC 76]"; break;
case 36: itemType = "Boots of sidestepping [MIC 78]"; break;
case 37: itemType = "Cloak of the salamander [MIC 88]"; break;
case 38: itemType = "Conduit rod [MIC 155]"; break;
case 39: itemType = "Cornucopia of the needful R [MIC 155]"; break;
case 40: itemType = "Crystal of arcane steel, greater [MIC 64]"; break;
case 41: itemType = "Crystal of life drinking, greater [MIC 64]"; break;
case 42: itemType = "Deathguardian bracers [MIC 93]"; break;
case 43: itemType = "Empowered spellshard, 3rd-level spell [MIC 96]"; break;
case 44: itemType = "Executioner’s hood R [MIC 97]"; break;
case 45: itemType = "Farspeaking amulet [MIC 99]"; break;
case 46: itemType = "Gauntlets of weaponry arcane [MIC 104]"; break;
case 47: itemType = "Globe of sunlight [MIC 161]"; break;
case 48: itemType = "Gwaeron’s boots [MIC 109]"; break;
case 49: itemType = "Horseshoes of a zephyr [DMG 260]"; break;
case 50: itemType = "Memento magica, 2nd-level spell [MIC 164]"; break;
case 51: itemType = "Periapt of the sullen sea SP [MIC 205]"; break;
case 52: itemType = "Crystal of energy assault, greater [MIC 64]"; break;
case 53: itemType = "Demolition crystal, greater [MIC 65]"; break;
case 54: itemType = "Phoenix ash threat, greater [MIC 65]"; break;
case 55: itemType = "Pipes of haunting [DMG 264]"; break;
case 56: itemType = "Psychoactive skin of the celestial [MIC 169]"; break;
case 57: itemType = "Psychoactive skin of ectoplasmic armor [MIC 170]"; break;
case 58: itemType = "Psychoactive skin of the fiend [MIC 170]"; break;
case 59: itemType = "Ring of adamantine touch [MIC 121]"; break;
case 60: itemType = "Ring of essentia [MIC 123]"; break;
case 61: itemType = "Ring of thunderclaps [MIC 127]"; break;
case 62: itemType = "Ring of water breathing [MIC 128]"; break;
case 63: itemType = "Rod of surprises [MIC 58]"; break;
case 64: itemType = "Rod of transposition [MIC 175]"; break;
case 65: itemType = "Rubicund frenzy, greater [MIC 26]"; break;
case 66: itemType = "Shackles of silence [MIC 184]"; break;
case 67: itemType = "Shirt of wraith stalking SP [MIC 216]"; break;
case 68: itemType = "Spectral dagger [MIC 59]"; break;
case 69: itemType = "Strongarm bracers [MIC 139]"; break;
case 70: itemType = "Tabard of the disembodied R [MIC 140]"; break;
case 71: itemType = "Torc of heroic sacrifice [MIC 143]"; break;
case 72: itemType = "Toxic gloves [MIC 144]"; break;
case 73: itemType = "Transposer cloak [MIC 144]"; break;
case 74: itemType = "Unicorn pendant [MIC 144]"; break;
case 75: case 76: case 77: itemType = "Scroll of raise dead (D) [PHB 268]"; break;
case 78: itemType = "Shield of vigor SP [MIC 196]"; break;
case 79: itemType = "Wrapped tower [MIC 24]"; break;
case 80: itemType = "Skull plaque [MIC 136]"; break;
case 81: itemType = "Gloves of swimming and climbing [DMG 257]"; break;
case 82: itemType = "Bag of tricks, tan [DMG 248]"; break;
case 83: itemType = "Gauntlets of the blazing arc [MIC 101]"; break;
case 84: itemType = "Whip of webs [MIC 63]"; break;
case 85: itemType = "Dagger of defiance [MIC 50]"; break;
case 86: itemType = "Scorpion kama SP [MIC 201]"; break;
case 87: itemType = "Viperblade [MIC 63]"; break;
case 88: itemType = "Death spike [MIC 50]"; break;
case 89: itemType = "Stonereaver [MIC 60]"; break;
case 90: itemType = "Swordbow, light [MIC 61]"; break;
case 91: itemType = "Swordbow [MIC 61]"; break;
case 92: itemType = "Circlet of blasting, minor [DMG 252]"; break;
case 93: itemType = "Gauntlet of infinite blades [MIC 101]"; break;
case 94: itemType = "Greater piwafwi [MIC 108]"; break;
case 95: itemType = "Helm of wounding sight SP [MIC 193]"; break;
case 96: itemType = "Horn of goodness/evil [DMG 259]"; break;
case 97: itemType = "Monocle of perusal [MIC 117]"; break;
case 98: itemType = "Phoenix helm [MIC 118]"; break;
case 99: itemType = "Phylactery of virtue SP [MIC 215]"; break;
case 100: itemType = "Robe of retaliation [MIC 130]"; break;
            }
            
            return itemType;
        }
    
    public static String eleventh(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Gauntlets of destruction SP [MIC 192]"; break;
case 2: case 3: itemType = "Wand of stoneskin (10 charges) [PHB 284]"; break;
case 4: itemType = "Swordbow, great [MIC 61]"; break;
case 5: itemType = "Boots of skating [MIC 78]"; break;
case 6: itemType = "Gloves of endless javelins SP [MIC 194]"; break;
case 7: itemType = "Gloves of flame [MIC 105]"; break;
case 8: itemType = "Robe of useful items [DMG 266]"; break;
case 9: itemType = "Tomebound eye of Boccob [MIC 190]"; break;
case 10: itemType = "Veil of whispers SP [MIC 213]"; break;
case 11: itemType = "The fist [MIC 51]"; break;
case 12: itemType = "Armband of maximized healing [MIC 72]"; break;
case 13: itemType = "Folding boat [DMG 249]"; break;
case 14: itemType = "Cloak of the manta ray [DMG 253]"; break;
case 15: itemType = "Bottle of air [DMG 250]"; break;
case 16: itemType = "Morningstar of the many R [MIC 54]"; break;
case 17: itemType = "Rod of defiance [MIC 56]"; break;
case 18: itemType = "Stunshot sling [MIC 60]"; break;
case 19: itemType = "Bag of holding type III [DMG 248]"; break;
case 20: itemType = "Periapt of health [DMG 263]"; break;
case 21: itemType = "Boots of levitation [DMG 250]"; break;
case 22: itemType = "Dreaming blindfold [MIC 96]"; break;
case 23: itemType = "Harp of charming [DMG 258]"; break;
case 24: itemType = "Lore gem [MIC 114]"; break;
case 25: itemType = "Ring of mystic defiance [MIC 125]"; break;
case 26: itemType = "Ring of mystic fire [MIC 125]"; break;
case 27: itemType = "Ring of mystic lightning [MIC 126]"; break;
case 28: itemType = "Tome of the stilled tongue R [MIC 189]"; break;
case 29: case 30: case 31: itemType = "Amulet of natural armor +2 [DMG 246]"; break;
case 32: itemType = "Belt of the wide earth SP [MIC 204]"; break;
case 33: itemType = "Blast globes [MIC 152]"; break;
case 34: itemType = "Chasuble of fell power [MIC 85]"; break;
case 35: itemType = "Cloak of stone [MIC 88]"; break;
case 36: itemType = "Crystal of energy assault, greater [MIC 64]"; break;
case 37: itemType = "Flesh ring of scorn [MIC 100]"; break;
case 38: itemType = "Gauntlet of Gruumsh [MIC 101]"; break;
case 39: itemType = "Ghost net [MIC 52]"; break;
case 40: itemType = "Gloves of the balanced hand [MIC 105]"; break;
case 41: itemType = "Gloves of incarnum theft [MIC 106]"; break;
case 42: itemType = "Golem manual, flesh [DMG 258]"; break;
case 43: itemType = "Hand of glory [DMG 258]"; break;
case 44: itemType = "Horned helm [MIC 112]"; break;
case 45: case 46: case 47: itemType = "Ioun stone, deep red sphere [DMG 260]"; break;
case 48: case 49: case 50: itemType = "Ioun stone, incandescent blue sphere [DMG 260]"; break;
case 51: case 52: case 53: itemType = "Ioun stone, pale blue rhomboid [DMG 260]"; break;
case 54: case 55: case 56: itemType = "Ioun stone, pink and green sphere [DMG 260]"; break;
case 57: case 58: case 59: itemType = "Ioun stone, pink rhomboid [DMG 260]"; break;
case 60: case 61: case 62: itemType = "Ioun stone, scarlet and blue sphere [DMG 260]"; break;
case 63: itemType = "Iron ward diamond, greater [MIC 26]"; break;
case 64: itemType = "Lightning tunic [MIC 114]"; break;
case 65: itemType = "Mantle of the predator SP [MIC 200]"; break;
case 66: itemType = "Medallion of aerial defense SP [MIC 195]"; break;
case 67: itemType = "Mesmerist’s gloves [MIC 116]"; break;
case 68: itemType = "Mindvault [MIC 117]"; break;
case 69: itemType = "Psionatrix [MIC 119]"; break;
case 70: itemType = "Ring of antivenom [MIC 121]"; break;
case 71: itemType = "Ring of entropic deflection [MIC 123]"; break;
case 72: itemType = "Ring of mind shielding [DMG 232]"; break;
case 73: case 74: case 75: case 76: itemType = "Ring of protection +2 [DMG 232]"; break;
case 77: itemType = "Runestaff of charming [MIC 177]"; break;
case 78: itemType = "Scentblinder [MIC 132]"; break;
case 79: itemType = "Scrolls of uncertain provenance R [MIC 183]"; break;
case 80: itemType = "Shirt of the leech [MIC 135]"; break;
case 81: itemType = "Talisman of undying fortitude [MIC 188]"; break;
case 82: itemType = "Third eye penetrate [MIC 142]"; break;
case 83: itemType = "Vambraces of warding [MIC 144]"; break;
case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94: case 95:
case 96: case 97: case 98: case 99: case 100: itemType = "+2 weapon [MIC 282]"; break;
            }
            
            return itemType;
        }
    public static String twelveth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Canaith mandolin [MIC 153]"; break;
case 2: itemType = "Deck of illusions [DMG 254]"; break;
case 3: itemType = "Necklace of fireballs type VI [DMG 263]"; break;
case 4: itemType = "Mace of the dark children [MIC 53]"; break;
case 5: itemType = "Millennial chainmail R [MIC 20]"; break;
case 6: itemType = "Dragonfang gauntlets [MIC 95]"; break;
case 7: itemType = "Owlfeather armor [MIC 20]"; break;
case 8: itemType = "Fanged mask [MIC 99]"; break;
case 9: itemType = "Dagger of venom [DMG 226]"; break;
case 10: itemType = "Warlock’s scepter [MIC 63]"; break;
case 11: itemType = "Blazing skylance [MIC 48]"; break;
case 12: itemType = "Forceful skylance [MIC 52]"; break;
case 13: itemType = "Axe of ancestral virtue R [MIC 46]"; break;
case 14: itemType = "Candle of invocation [DMG 251]"; break;
case 15: itemType = "Runestaff of fire [MIC 180]"; break;
case 16: itemType = "Crown of flames SP [MIC 209]"; break;
case 17: itemType = "Ring of force shield [DMG 232]"; break;
case 18: itemType = "Ring of the ram [DMG 232]"; break;
case 19: itemType = "Necklace of fireballs type VII [DMG 263]"; break;
case 20: itemType = "Ankh of ascension [MIC 71]"; break;
case 21: itemType = "Battle bridle [MIC 151]"; break;
case 22: itemType = "Blindfold of true darkness [MIC 75]"; break;
case 23: itemType = "Bracers of armor +3 [DMG 250]"; break;
case 24: itemType = "Cat’s-eye brooch [MIC 84]"; break;
case 25: itemType = "Cloak of resistance +3 [DMG 253]"; break;
case 26: itemType = "Cognizance crystal, 5 points [MIC 154]"; break;
case 27: itemType = "Daern’s instant tent [MIC 155]"; break;
case 28: itemType = "Decanter of endless water [DMG 254]"; break;
case 29: itemType = "Helm of the hunter SP [MIC 194]"; break;
case 30: itemType = "Metamagic rod, Empower, lesser [DMG 236]"; break;
case 31: itemType = "Metamagic rod, Reach, lesser [MIC 165]"; break;
case 32: itemType = "Mirror of time hop [MIC 165]"; break;
case 33: itemType = "Necklace of adaptation [DMG 263]"; break;
case 34: itemType = "Pearl of power, 3rd-level spell [DMG 263]"; break;
case 35: itemType = "Retributive amulet [MIC 121]"; break;
case 36: itemType = "Rod of the recluse R [MIC 57]"; break;
case 37: itemType = "Sandals of the light step SP [MIC 198]"; break;
case 38: itemType = "Scepter of the netherworld [MIC 183]"; break;
case 39: itemType = "Shirt of bone [MIC 134]"; break;
case 40: itemType = "Shirt of chains [MIC 134]"; break;
case 41: itemType = "Shirt of the treant [MIC 136]"; break;
case 42: itemType = "Stunning spike [MIC 187]"; break;
case 43: itemType = "Vest of resistance +3 [MIC 147]"; break;
case 44: case 45: case 46: itemType = "+3 armor/shield [MIC 282]"; break;
case 47: itemType = "Dwarf crusher [MIC 51]"; break;
case 48: itemType = "Figurine of wondrous power, serpentine owl [DMG 256]"; break;
case 49: itemType = "Wight hide shield [MIC 23]"; break;
case 50: itemType = "Lion’s shield [DMG 221]"; break;
case 51: itemType = "Skewer-of-gnomes R [MIC 59]"; break;
case 52: itemType = "Spear of retribution R [MIC 59]"; break;
case 53: itemType = "Dawnstar R [MIC 50]"; break;
case 54: itemType = "Pick of piercing [MIC 54]"; break;
case 55: itemType = "Sword of virtue beyond reproach R [MIC 61]"; break;
case 56: itemType = "Rapier of desperate measures R [MIC 55]"; break;
case 57: itemType = "Rapier of unerring direction R [MIC 55]"; break;
case 58: itemType = "Sword of mighty thews R [MIC 60]"; break;
case 59: itemType = "Strand of prayer beads, lesser [DMG 267]"; break;
case 60: itemType = "Angelhelm [MIC 71]"; break;
case 61: itemType = "Runestaff of the assassin [MIC 177]"; break;
case 62: itemType = "Bag of holding type IV [DMG 248]"; break;
case 63: itemType = "Bracers of wind [MIC 82]"; break;
case 64: itemType = "Crystal mask of detection [MIC 90]"; break;
case 65: itemType = "Crystal mask of discernment [MIC 90]"; break;
case 66: itemType = "Crystal mask of dread [MIC 91]"; break;
case 67: itemType = "Crystal mask of mindarmor [MIC 92]"; break;
case 68: itemType = "Crystal mask of psionic craft [MIC 92]"; break;
case 69: itemType = "Crystal mask of visual insight [MIC 92]"; break;
case 70: itemType = "Crystal of mind cloaking, greater [MIC 25]"; break;
case 71: itemType = "Druid’s vestment [DMG 268]"; break;
case 72: itemType = "Eyes of power leech [MIC 98]"; break;
case 73: itemType = "Fiendhelm [MIC 99]"; break;
case 74: itemType = "Figurine of wondrous power, bronze griffon [DMG 256]"; break;
case 75: itemType = "Figurine of wondrous power, ebony fly [DMG 256]"; break;
case 76: itemType = "Ghoul gauntlets [MIC 104]"; break;
case 77: itemType = "Glove of storing [DMG 257]"; break;
case 78: itemType = "Ioun stone, dark blue rhomboid [DMG 260]"; break;
case 79: itemType = "Lenses of true form [MIC 113]"; break;
case 80: itemType = "Mind blade gauntlet, lesser [MIC 117]"; break;
case 81: itemType = "Psychoactive skin of power damping [MIC 171]"; break;
case 82: itemType = "Ring of avoidance [MIC 122]"; break;
case 83: itemType = "Ring of improved climbing [DMG 230]"; break;
case 84: itemType = "Ring of improved jumping [DMG 232]"; break;
case 85: itemType = "Ring of improved swimming [DMG 233]"; break;
case 86: itemType = "Ring of self-sufficiency [MIC 126]"; break;
case 87: itemType = "Ring of soulbound protection [MIC 127]"; break;
case 88: itemType = "Robe of mysterious conjuration [MIC 130]"; break;
case 89: itemType = "Rod of reversal R [MIC 174]"; break;
case 90: itemType = "Rod of undead mastery [MIC 175]"; break;
case 91: itemType = "Sandals of springing [MIC 131]"; break;
case 92: itemType = "Soul anchor [MIC 185]"; break;
case 93: itemType = "Soulstone [MIC 137]"; break;
case 94: itemType = "Stone horse, courser [DMG 267]"; break;
case 95: itemType = "Third eye aware [MIC 140]"; break;
case 96: itemType = "Third eye concentrate [MIC 141]"; break;
case 97: itemType = "Third eye gather [MIC 141]"; break;
case 98: itemType = "Third eye powerthieve [MIC 142]"; break;
case 99: itemType = "Truedeath crystal, greater [MIC 66]"; break;
case 100: itemType = "Vest of the master evoker [MIC 146]"; break;
            }
            
            return itemType;
        }
    public static String thirteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Cape of the mountebank [DMG 252]"; break;
case 2: itemType = "Trident of warning [DMG 229]"; break;
case 3: case 4: itemType = "Foxhide armor [MIC 18]"; break;
case 5: itemType = "Ghoul shell armor [MIC 18]"; break;
case 6: case 7: itemType = "Adamantine breastplate [DMG 219]"; break;
case 8: itemType = "Talon scepter SP [MIC 210]"; break;
case 9: itemType = "Axe of the sea reavers [MIC 47]"; break;
case 10: itemType = "Metamagic rod, Substitution [MIC 165]"; break;
case 11: itemType = "Rod of metal and mineral detection [DMG 236]"; break;
case 12: itemType = "Rod of cats [MIC 56]"; break;
case 13: case 14: itemType = "Storm gauntlets [MIC 139]"; break;
case 15: itemType = "Strand of acid pearls [MIC 187]"; break;
case 16: case 17: case 18: case 19: itemType = "Eternal wand of cure serious wounds [PHB 216]"; break;
case 20: itemType = "Eternal wand of displacement [PHB 223]"; break;
case 21: case 22: itemType = "Eternal wand of invisibility sphere [PHB 245]"; break;
case 23: case 24: case 25: itemType = "Eternal wand of lightning bolt [PHB 248]"; break;
case 26: itemType = "Eternal wand of mass snake’s swiftness [SC 193]"; break;
case 27: itemType = "Eternal wand of repair serious damage [SC 173]"; break;
case 28: itemType = "Ring of animal friendship [DMG 230]"; break;
case 29: itemType = "Amulet of inviolate form [MIC 69]"; break;
case 30: case 31: itemType = "Boots of tracklessness [MIC 79]"; break;
case 32: itemType = "Bracers of lightning [MIC 206]"; break;
case 33: itemType = "Cloak of turn resistance [MIC 89]"; break;
case 34: itemType = "Gauntlets of mindfire [MIC 103]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 35: itemType = "Metamagic rod, Enlarge [DMG 236]"; break;
case 36: itemType = "Metamagic rod, Extend [DMG 236]"; break;
case 37: itemType = "Metamagic rod, Sculpting [MIC 165]"; break;
case 38: itemType = "Metamagic rod, Silent [DMG 236]"; break;
case 39: itemType = "Phylactery of undead turning [DMG 264]"; break;
case 40: itemType = "Rod of cancellation [DMG 234]"; break;
case 41: case 42: itemType = "Runestaff of eyes [MIC 178]"; break;
case 43: itemType = "Veil of doors [MIC 212]"; break;
case 44: itemType = "Gauntlet of rust [DMG 257]"; break;
case 45: case 46: itemType = "Ring of lightning flashes [MIC 125]"; break;
case 47: case 48: itemType = "Belt of battle [MIC 73]"; break;
case 49: itemType = "Blood claw choker [MIC 203]"; break;
case 50: case 51: itemType = "Boots of speed [DMG 250]"; break;
case 52: itemType = "Dove’s harp [MIC 156]"; break;
case 53: itemType = "Flesheater [MIC 160]"; break;
case 54: itemType = "Goggles of night [DMG 258]"; break;
case 55: itemType = "Golem manual, clay [DMG 258]"; break;
case 56: itemType = "Horn of plenty [MIC 162]"; break;
case 57: itemType = "Mantle of second chances [MIC 115]"; break;
case 58: itemType = "Medallion of thoughts [DMG 262]"; break;
case 59: itemType = "Pipes of pain [DMG 264]"; break;
case 60: itemType = "Psychoactive skin of the claw [MIC 170]"; break;
case 61: itemType = "Riding boots [MIC 121]"; break;
case 62: case 63: case 64: itemType = "Ring of energy resistance, minor [DMG 232]"; break;
case 65: case 66: itemType = "Ring of spell-battle [MIC 127]"; break;
case 67: case 68: itemType = "Rod of wonder [DMG 237]"; break;
case 69: itemType = "Ruby cincture of immutability [MIC 131]"; break;
case 70: itemType = "Runestaff of entrapment [MIC 178]"; break;
case 71: itemType = "Runestaff of size alteration [MIC 181]"; break;
case 72: itemType = "Shirt of resilience [MIC 135]"; break;
case 73: itemType = "Spare hand [MIC 137]"; break;
case 74: case 75: itemType = "Vest of free movement [MIC 198]"; break;
case 76: itemType = "Wand bracelet [MIC 147]"; break;
case 77: itemType = "Water cloak [MIC 148]"; break;
case 78: case 79: itemType = "Winged vest [MIC 195]"; break;
case 80: itemType = "Serpent armor [MIC 20]"; break;
case 81: itemType = "Hawkfeather armor [MIC 19]"; break;
case 82: case 83: case 84: itemType = "Scroll of resurrection (D) [PHB 272]"; break;
case 85: itemType = "Chromatic rod [MIC 49]"; break;
case 86: itemType = "Rogue blade [MIC 58]"; break;
case 87: itemType = "Bow of songs [MIC 48]"; break;
case 88: itemType = "Boccob’s blessed book [DMG 249]"; break;
case 89: itemType = "Hat of anonymity [MIC 109]"; break;
case 90: case 91: itemType = "Ring of chameleon power [DMG 230]"; break;
case 92: itemType = "Shifter’s sorrow [DMG 228]"; break;
case 93: itemType = "Cannith goggles [MIC 84]"; break;
case 94: itemType = "Cloak of soulbound resistance, greater [MIC 88]"; break;
case 95: itemType = "Fireflower pendant [MIC 100]"; break;
case 96: itemType = "Gem of brightness [DMG 257]"; break;
case 97: itemType = "Lyre of building [DMG 261]"; break;
case 98: case 99: itemType = "Monk’s belt [DMG 248]"; break;
case 100: itemType = "Python rod [DMG 236]"; break;
            }
            
            return itemType;
        }
    
    public static String fourteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Kyton armor [MIC 19]"; break;
case 2: itemType = "Breastplate of terror SP [MIC 192]"; break;
case 3: itemType = "Memento magica, 3rd-level spell [MIC 164]"; break;
case 4: itemType = "Choker of life protection [MIC 216]"; break;
case 5: itemType = "Cloak of arachnida [DMG 252]"; break;
case 6: itemType = "Gloves of the titan’s grip [MIC 107]"; break;
case 7: itemType = "Harrow rod [MIC 162]"; break;
case 8: itemType = "Metamagic rod, Chaining, lesser [MIC 165]"; break;
case 9: itemType = "Metamagic rod, Maximize, lesser [DMG 236]"; break;
case 10: itemType = "Runestaff of night [MIC 181]"; break;
case 11: itemType = "Tentacle rod [MIC 61]"; break;
case 12: itemType = "Veil of allure [MIC 145]"; break;
case 13: itemType = "Electric eel hide [MIC 17]"; break;
case 14: itemType = "Wight armor [MIC 23]"; break;
case 15: itemType = "Bearskin armor [MIC 16]"; break;
case 16: itemType = "Stone horse, destrier [DMG 267]"; break;
case 17: itemType = "Belt of dwarvenkind [DMG 248]"; break;
case 18: itemType = "Badge of the svirfneblin [MIC 72]"; break;
case 19: itemType = "Banner of the storm’s eye [MIC 151]"; break;
case 20: itemType = "Blindhelm [MIC 75]"; break;
case 21: itemType = "Circlet of rapid casting [MIC 86]"; break;
case 22: itemType = "Desperation chain [MIC 93]"; break;
case 23: itemType = "Incarnum focus (DM’s choice) [MIC 112]"; break;
case 24: itemType = "Moonstone mask [MIC 118]"; break;
case 25: itemType = "Periapt of wound closure [DMG 264]"; break;
case 26: itemType = "Psychoactive skin of nimbleness [MIC 171]"; break;
case 27: itemType = "Psychoactive skin of the chameleon [MIC 170]"; break;
case 28: itemType = "Quiver of energy [MIC 172]"; break;
case 29: itemType = "Ring of water walking [DMG 233]"; break;
case 30: itemType = "Rod of flame extinguishing [DMG 235]"; break;
case 31: itemType = "Rod of whips [MIC 58]"; break;
case 32: itemType = "Runestaff of opening [MIC 181]"; break;
case 33: itemType = "Shirt of angels [MIC 134]"; break;
case 34: itemType = "Shirt of demonskin [MIC 134]"; break;
case 35: itemType = "Shirt of the fey [MIC 134]"; break;
case 36: itemType = "Shirt of the inevitable [MIC 134]"; break;
case 37: itemType = "Shirt of ironskin [MIC 135]"; break;
case 38: itemType = "Shirt of slaadskin [MIC 135]"; break;
case 39: itemType = "Shirt of the moon [MIC 135]"; break;
case 40: itemType = "Spider rod [MIC 186]"; break;
case 41: itemType = "Third eye repudiate [MIC 142]"; break;
case 42: itemType = "Horn of the tritons [DMG 260]"; break;
case 43: itemType = "Pearl of the sirines [DMG 263]"; break;
case 44: itemType = "Figurine of wondrous power, onyx dog [DMG 256]"; break;
case 45: itemType = "Amulet of catapsi [MIC 68]"; break;
case 46: itemType = "Amulet of health +4 [DMG 246]"; break;
case 47: itemType = "Belt of giant strength +4 [DMG 248]"; break;
case 48: itemType = "Bracers of armor +4 [DMG 250]"; break;
case 49: itemType = "Cloak of Charisma +4 [DMG 253]"; break;
case 50: itemType = "Cloak of resistance +4 [DMG 253]"; break;
case 51: itemType = "Cognizance crystal, 7 points [MIC 154]"; break;
case 52: itemType = "Gloves of Dexterity +4 [DMG 257]"; break;
case 53: itemType = "Goggles of draconic vision [MIC 107]"; break;
case 54: itemType = "Headband of intellect +4 [DMG 258]"; break;
case 55: itemType = "Pearl of power, 4th-level spell [DMG 263]"; break;
case 56: itemType = "Periapt of Wisdom +4 [DMG 263]"; break;
case 57: itemType = "Ring of dragon friendship [MIC 122]"; break;
case 58: itemType = "Ring of greater counterspells [MIC 124]"; break;
case 59: itemType = "Runestaff of the undying [MIC 182]"; break;
case 60: itemType = "Runestaff of vision [MIC 182]"; break;
case 61: itemType = "Scabbard of keen edges [DMG 266]"; break;
case 62: itemType = "Serpent veil [MIC 212]"; break;
case 63: itemType = "Shadow veil [MIC 133]"; break;
case 64: itemType = "Vest of resistance +4 [MIC 147]"; break;
case 65: itemType = "War wizard cloak [MIC 147]"; break;
case 66: itemType = "Winged boots [DMG 250]"; break;
case 67: case 68: case 69: case 70: itemType = "+4 armor/shield [MIC 282]"; break;
case 71: itemType = "Zombie hide armor [MIC 24]"; break;
case 72: itemType = "Figurine of wondrous power, golden lions [DMG 256]"; break;
case 73: itemType = "Dwarven plate [DMG 220]"; break;
case 74: itemType = "Staff of charming [DMG 244]"; break;
case 75: itemType = "Chime of interruption [DMG 252]"; break;
case 76: itemType = "Armor of the fallen leaves [MIC 16]"; break;
case 77: itemType = "Broom of flying [DMG 250]"; break;
case 78: itemType = "Figurine of wondrous power, marble elephant [DMG 256]"; break;
case 79: itemType = "Tigerskin armor [MIC 22]"; break;
case 80: itemType = "Winged shield [DMG 221]"; break;
case 81: itemType = "Amulet of natural armor +3 [DMG 246]"; break;
case 82: itemType = "Chasuble of fell power, greater [MIC 85]"; break;
case 83: itemType = "Dragondoom scepter [MIC 157]"; break;
case 84: itemType = "Goggles of the ebon hunter [MIC 108]"; break;
case 85: itemType = "Ioun stone, iridescent spindle [DMG 260]"; break;
case 86: itemType = "Ring of divergence [MIC 122]"; break;
case 87: itemType = "Ring of the icy soul [MIC 124]"; break;
case 88: itemType = "Ring of protection +3 [DMG 232]"; break;
case 89: itemType = "Ring of spell storing, minor [DMG 233]"; break;
case 90: itemType = "Rogue’s vest [MIC 130]"; break;
case 91: itemType = "Runestaff of forced happiness [MIC 180]"; break;
case 92: itemType = "Surge crystal [MIC 139]"; break;
case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100: itemType = "+3 weapon [MIC 282]"; break;
            }
            
            return itemType;
        }
    public static String fifteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Assassin’s dagger [DMG 226]"; break;
case 2: itemType = "Cli lyre [MIC 154]"; break;
case 3: itemType = "Dragonrider armor [MIC 17]"; break;
case 4: itemType = "Rod of enervating strike [MIC 57]"; break;
case 5: itemType = "Rod of freedom [MIC 57]"; break;
case 6: itemType = "Trident of fish command [DMG 229]"; break;
case 7: itemType = "Banded mail of luck [DMG 220]"; break;
case 8: itemType = "Bracelet of friends [DMG 250]"; break;
case 9: itemType = "Runestaff of illusion [MIC 180]"; break;
case 10: itemType = "Runestaff of transportation [MIC 182]"; break;
case 11: itemType = "Viper rod [DMG 237]"; break;
case 12: itemType = "Beholder crown [MIC 73]"; break;
case 13: itemType = "Bone ring [MIC 75]"; break;
case 14: case 15: itemType = "Carpet of flying, 5 ft. by 5 ft. [DMG 252]"; break;
case 16: case 17: itemType = "Casting glove [MIC 84]"; break;
case 18: itemType = "Crystal mask of insight [MIC 91]"; break;
case 19: itemType = "Eyes of power leech, vampiric [MIC 98]"; break;
case 20: itemType = "Horn of blasting [DMG 259]"; break;
case 21: case 22: itemType = "Ioun stone, pale lavender ellipsoid [DMG 260]"; break;
case 23: case 24: itemType = "Ioun stone, pearly white spindle [DMG 260]"; break;
case 25: itemType = "Lens of the desert [MIC 163]"; break;
case 26: case 27: itemType = "Portable hole [DMG 264]"; break;
case 28: itemType = "Ring of arcane might [MIC 121]"; break;
case 29: itemType = "Ring of invisibility [DMG 232]"; break;
case 30: itemType = "Ring of wizardry [DMG 233]"; break;
case 31: itemType = "Runestaff of frost [MIC 180]"; break;
case 32: itemType = "Scarab of stabilization [MIC 132]"; break;
case 33: itemType = "Stone of good luck [DMG 267]"; break;
case 34: itemType = "Water whip [MIC 63]"; break;
case 35: itemType = "Dagger of denial [MIC 50]"; break;
case 36: itemType = "Ruby blade [MIC 58]"; break;
case 37: itemType = "Cudgel that never forgets [MIC 49]"; break;
case 38: itemType = "Chain of obeisance [MIC 48]"; break;
case 39: itemType = "Flame tongue [DMG 226]"; break;
case 40: itemType = "Figurine of wondrous power, ivory goats [DMG 256]"; break;
case 41: itemType = "Gwaeron’s belt [MIC 109]"; break;
case 42: itemType = "Robe of arcane might [MIC 129]"; break;
case 43: itemType = "Rope of entanglement [DMG 266]"; break;
case 44: itemType = "Runestaff of divination [MIC 177]"; break;
case 45: itemType = "Exoskeleton armor [MIC 18]"; break;
case 46: itemType = "Boots of the mountain king, greater [MIC 78]"; break;
case 47: itemType = "Cloak of battle [MIC 87]"; break;
case 48: itemType = "Golem manual, stone [DMG 258]"; break;
case 49: itemType = "Mask of the skull [DMG 262]"; break;
case 50: itemType = "Turquoise veil [MIC 212]"; break;
case 51: itemType = "Luck blade (0 wishes) [DMG 227]"; break;
case 52: itemType = "Lash of sands [MIC 53]"; break;
case 53: itemType = "Sword of subtlety [DMG 228]"; break;
case 54: itemType = "Sword of the planes [DMG 228]"; break;
case 55: itemType = "Celestial armor [DMG 220]"; break;
case 56: itemType = "Runestaff of the artisan [MIC 176]"; break;
case 57: itemType = "Nine lives stealer [DMG 227]"; break;
case 58: itemType = "Mattock of the titans [DMG 262]"; break;
case 59: itemType = "Rod of enemy detection [DMG 235]"; break;
case 60: itemType = "Circlet of blasting, major [DMG 252]"; break;
case 61: itemType = "Amulet of mighty fists +2 [DMG 246]"; break;
case 62: itemType = "Cloak of displacement, minor [DMG 253]"; break;
case 63: itemType = "Helm of underwater action [DMG 259]"; break;
case 64: itemType = "Memento magica, 4th-level spell [MIC 164]"; break;
case 65: itemType = "Mind blade gauntlet [MIC 117]"; break;
case 66: itemType = "Psychoactive skin of celestial embrace [MIC 170]"; break;
case 67: itemType = "Psychoactive skin of fiendish embrace [MIC 170]"; break;
case 68: itemType = "Runestaff of earth and stone [MIC 178]"; break;
case 69: itemType = "Shroud of scales [MIC 136]"; break;
case 70: itemType = "Third eye sense [MIC 142]"; break;
case 71: itemType = "Overhead shield [MIC 20]"; break;
case 72: itemType = "Metamagic rod, Substitution, greater [MIC 165]"; break;
case 73: itemType = "Metamagic rod, Enlarge, greater [DMG 236]"; break;
case 74: itemType = "Metamagic rod, Extend, greater [DMG 236]"; break;
case 75: itemType = "Metamagic rod, Sculpting, greater [MIC 165]"; break;
case 76: itemType = "Metamagic rod, Silent, greater [DMG 236]"; break;
case 77: itemType = "Quarterstaff of battle [MIC 54]"; break;
case 78: itemType = "Plate armor of the deep [DMG 220]"; break;
case 79: itemType = "Staff of swarming insects [DMG 245]"; break;
case 80: itemType = "Bracers of archery, greater [DMG 250]"; break;
case 81: itemType = "Bracers of armor +5 [DMG 250]"; break;
case 82: case 83: itemType = "Cloak of resistance +5 [DMG 253]"; break;
case 84: itemType = "Cognizance crystal, 9 points [MIC 154]"; break;
case 85: itemType = "Eyes of doom [DMG 256]"; break;
case 86: itemType = "Magic siphon [MIC 164]"; break;
case 87: itemType = "Pearl of power, 5th-level spell [DMG 263]"; break;
case 88: itemType = "Ring of evasion [DMG 232]"; break;
case 89: itemType = "Ring of master artifice [MIC 125]"; break;
case 90: itemType = "Ring of X-ray vision [DMG 233]"; break;
case 91: itemType = "Rod of splendor [DMG 236]"; break;
case 92: itemType = "Rod of withering [DMG 237]"; break;
case 93: itemType = "Runestaff of conjuration [MIC 177]"; break;
case 94: itemType = "Runestaff of evocation [MIC 178]"; break;
case 95: itemType = "Runestaff of transmutation [MIC 182]"; break;
case 96: itemType = "Vest of resistance +5 [MIC 147]"; break;
case 97: case 98: case 99: case 100: itemType = "+5 armor/shield [MIC 282]"; break;
            }
            
            return itemType;
        }
    public static String sixteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Maul of the titans [DMG 262]"; break;
case 2: itemType = "Breastplate of command [DMG 220]"; break;
case 3: itemType = "Oathbow [DMG 227]"; break;
case 4: itemType = "Sword of life stealing [DMG 228]"; break;
case 5: itemType = "Bracers of dawn [MIC 80]"; break;
case 6: itemType = "Cloak of the bat [DMG 252]"; break;
case 7: itemType = "Cloak of thorns [MIC 88]"; break;
case 8: itemType = "Iron bands of Bilarro [DMG 261]"; break;
case 9: itemType = "Ring of soulbound protection, greater [MIC 127]"; break;
case 10: itemType = "Runestaff of cacophony [MIC 177]"; break;
case 11: itemType = "Scourge of pain [MIC 59]"; break;
case 12: itemType = "Mithral full plate of speed [DMG 220]"; break;
case 13: itemType = "Cube of frost resistance [DMG 253]"; break;
case 14: itemType = "Helm of telepathy [DMG 259]"; break;
case 15: itemType = "Periapt of proof against poison [DMG 263]"; break;
case 16: itemType = "Ring of blinking [DMG 230]"; break;
case 17: itemType = "Robe of scintillating colors [DMG 265]"; break;
case 18: itemType = "Runestaff of destruction [MIC 177]"; break;
case 19: case 20: itemType = "Manual of bodily health +1 [DMG 261]"; break;
case 21: case 22: itemType = "Manual of gainful exercise +1 [DMG 262]"; break;
case 23: case 24: itemType = "Manual of quickness in action +1 [DMG 262]"; break;
case 25: case 26: itemType = "Tome of clear thought +1 [DMG 268]"; break;
case 27: case 28: itemType = "Tome of leadership and influence +1 [DMG 268]"; break;
case 29: case 30: itemType = "Tome of understanding +1 [DMG 268]"; break;
case 31: case 32: itemType = "Staff of healing [DMG 244]"; break;
case 33: itemType = "Dimensional shackles [DMG 255]"; break;
case 34: case 35: itemType = "Ring of energy resistance, major [DMG 232]"; break;
case 36: itemType = "Figurine of wondrous power, obsidian steed [DMG 256]"; break;
case 37: case 38: itemType = "Staff of fire [DMG 244]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 39: case 40: case 41: case 42: case 43: case 44: case 45: itemType = "Scroll of true resurrection (D) [PHB 296]"; break;
case 46: itemType = "Staff of size alteration [DMG 245]"; break;
case 47: itemType = "Drums of panic [DMG 255]"; break;
case 48: case 49: itemType = "Ioun stone, orange prism [DMG 260]"; break;
case 50: case 51: itemType = "Ioun stone, pale green prism [DMG 260]"; break;
case 52: case 53: itemType = "Lantern of revealing [DMG 261]"; break;
case 54: itemType = "Ring of vanishing [MIC 128]"; break;
case 55: case 56: itemType = "Rings of force armor (pair) [MIC 128]"; break;
case 57: itemType = "Robe of blending [DMG 265]"; break;
case 58: itemType = "Runestaff of the architect [MIC 176]"; break;
case 59: itemType = "Runestaff of ethereal action [MIC 178]"; break;
case 60: case 61: case 62: itemType = "Amulet of natural armor +4 [DMG 246]"; break;
case 63: itemType = "Psychoactive skin of the defender [MIC 170]"; break;
case 64: case 65: case 66: itemType = "Ring of protection +4 [DMG 232]"; break;
case 67: itemType = "Runestaff of abjuration [MIC 176]"; break;
case 68: itemType = "Runestaff of enchantment [MIC 178]"; break;
case 69: itemType = "Runestaff of necromancy [MIC 180]"; break;
case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: itemType = "+4 weapon [MIC 282]"; break;
case 88: itemType = "Anstruth harp [MIC 150]"; break;
case 89: itemType = "Metamagic rod, Empower [DMG 236]"; break;
case 90: itemType = "Metamagic rod, Reach [MIC 165]"; break;
case 91: itemType = "Rod of thunder and lightning [DMG 237]"; break;
case 92: itemType = "Impervious vestment [MIC 112]"; break;
case 93: itemType = "Runestaff of illumination [MIC 180]"; break;
case 94: itemType = "Amulet of proof against detection and location [DMG 247]"; break;
case 95: case 96: itemType = "Carpet of flying, 5 ft. by 10 ft. [DMG 252]"; break;
case 97: itemType = "Golem manual, iron [DMG 258]"; break;
case 98: itemType = "Metamagic rod, Quicken, lesser [DMG 236]"; break;
case 99: case 100: itemType = "Runestaff of time [MIC 182]"; break;
            }
            
            return itemType;
        }
    public static String seventeenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: itemType = "Amulet of health +6 [DMG 246]"; break;
case 4: case 5: case 6: itemType = "Belt of giant strength +6 [DMG 248]"; break;
case 7: case 8: itemType = "Bracers of armor +6 [DMG 250]"; break;
case 9: case 10: case 11: itemType = "Cloak of Charisma +6 [DMG 253]"; break;
case 12: itemType = "Cloak of the salamander, greater [MIC 88]"; break;
case 13: itemType = "Cognizance crystal, 11 points [MIC 154]"; break;
case 14: case 15: case 16: itemType = "Gloves of Dexterity +6 [DMG 257]"; break;
case 17: case 18: case 19: itemType = "Headband of intellect +6 [DMG 258]"; break;
case 20: itemType = "Ioun stone, vibrant purple prism [DMG 260]"; break;
case 21: case 22: itemType = "Pearl of power, 6th-level spell [DMG 263]"; break;
case 23: case 24: case 25: itemType = "Periapt of Wisdom +6 [DMG 263]"; break;
case 26: case 27: itemType = "Ring of negative protection [MIC 126]"; break;
case 28: case 29: itemType = "Ring of positive protection [MIC 126]"; break;
case 30: itemType = "Truelight lantern [MIC 190]"; break;
case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: itemType = "+6 armor/shield [MIC 282]"; break;
case 40: itemType = "Vampire hide armor [MIC 23]"; break;
case 41: itemType = "Robe of the inferno [MIC 129]"; break;
case 42: case 43: itemType = "Rod of negation [DMG 236]"; break;
case 44: case 45: itemType = "Runestaff of the undead slayer [MIC 182]"; break;
case 46: case 47: itemType = "Memento magica, 5th-level spell [MIC 164]"; break;
case 48: case 49: itemType = "Robe of thunder [MIC 206]"; break;
case 50: case 51: itemType = "Scarab of protection [DMG 266]"; break;
case 52: itemType = "Explosive sling [MIC 51]"; break;
case 53: case 54: itemType = "Runestaff of power [MIC 181]"; break;
case 55: itemType = "Mace of terror [DMG 227]"; break;
case 56: case 57: itemType = "Rod of celestial might [MIC 56]"; break;
case 58: case 59: itemType = "Amulet of second chances [MIC 70]"; break;
case 60: case 61: case 62: itemType = "Ioun stone, lavender and green ellipsoid [DMG 260]"; break;
case 63: itemType = "Psychoactive skin of iron [MIC 171]"; break;
case 64: itemType = "Psychoactive skin of the spider [MIC 172]"; break;
case 65: itemType = "Ring gates [DMG 265]"; break;
case 66: case 67: case 68: case 69: case 70: case 71: itemType = "Ring of freedom of movement [DMG 232]"; break;
case 72: case 73: itemType = "Ring of wizardry II [DMG 233]"; break;
case 74: case 75: itemType = "Scarab of invulnerability [MIC 132]"; break;
case 76: itemType = "Life-drinker [DMG 227]"; break;
case 77: case 78: itemType = "Earthplate armor [MIC 17]"; break;
case 79: itemType = "Crystal ball [DMG 253]"; break;
case 80: itemType = "Mind blade gauntlet, greater [MIC 117]"; break;
case 81: case 82: itemType = "Boots of temporal acceleration [MIC 79]"; break;
case 83: itemType = "Golem manual, greater stone [DMG 258]"; break;
case 84: case 85: case 86: case 87: case 88: itemType = "Ring of energy resistance, greater [DMG 232]"; break;
case 89: case 90: itemType = "Ring of nine lives [MIC 126]"; break;
case 91: case 92: itemType = "Strand of prayer beads [DMG 267]"; break;
case 93: case 94: case 95: itemType = "Runestaff of insanity [MIC 180]"; break;
case 96: case 97: itemType = "Sylvan scimitar [DMG 229]"; break;
case 98: itemType = "Orb of storms [DMG 263]"; break;
case 99: itemType = "Runestaff of fiendish darkness [MIC 178]"; break;
case 100: itemType = "Tentacle rod, greater [MIC 62]"; break;
            }
            
            return itemType;
        }
    public static String eighteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Staff of illumination [DMG 244]"; break;
case 2: itemType = "Boots of teleportation [DMG 250]"; break;
case 3: case 4: case 5: itemType = "Bracers of armor +7 [DMG 250]"; break;
case 6: itemType = "Cognizance crystal, 13 points [MIC 154]"; break;
case 7: itemType = "Pearl of power, 7th-level spell [DMG 263]"; break;
case 8: case 9: case 10: case 11: case 12: case 13: itemType = "+7 armor/shield [MIC 282]"; break;
case 14: itemType = "Amulet of natural armor +5 [DMG 246]"; break;
case 15: itemType = "Cloak of displacement, major [DMG 253]"; break;
case 16: itemType = "Cloudwalker anklets [MIC 206]"; break;
case 17: itemType = "Crystal ball with see invisibility [DMG 253]"; break;
case 18: itemType = "Horn of Valhalla [DMG 260]"; break;
case 19: itemType = "Phoenix cloak [MIC 210]"; break;
case 20: itemType = "Ring of friend shield (pair) [DMG 232]"; break;
case 21: case 22: case 23: case 24: itemType = "Ring of protection +5 [DMG 232]"; break;
case 25: itemType = "Ring of shooting stars [DMG 232]"; break;
case 26: itemType = "Ring of spell storing [DMG 233]"; break;
case 27: itemType = "Rod of absorption [DMG 234]"; break;
case 28: itemType = "Rod of flailing [DMG 235]"; break;
case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: itemType = "+5 weapon [MIC 282]"; break;
case 43: itemType = "Ollamh harp [MIC 166]"; break;
case 44: itemType = "Absorbing shield [DMG 221]"; break;
case 45: itemType = "Rapier of puncturing [DMG 227]"; break;
case 46: itemType = "Sun blade [DMG 228]"; break;
case 47: itemType = "Crystal ball with detect thoughts [DMG 253]"; break;
case 48: itemType = "Demon armor [DMG 220]"; break;
case 49: itemType = "Amulet of mighty fists +3 [DMG 246]"; break;
case 50: itemType = "Memento magica, 6th-level spell [MIC 164]"; break;
case 51: itemType = "Metamagic rod, Chaining [MIC 165]"; break;
case 52: case 53: itemType = "Metamagic rod, Maximize [DMG 236]"; break;
case 54: itemType = "Wings of flying [DMG 268]"; break;
case 55: itemType = "Frost brand [DMG 226]"; break;
case 56: itemType = "Cloak of etherealness [DMG 253]"; break;
case 57: itemType = "Daern’s instant fortress [DMG 254]"; break;
case 58: itemType = "Dragon’s eye amulet [MIC 95]"; break;
case 59: case 60: itemType = "Manual of bodily health +2 [DMG 261]"; break;
case 61: case 62: itemType = "Manual of gainful exercise +2 [DMG 262]"; break;
case 63: case 64: itemType = "Manual of quickness in action +2 [DMG 262]"; break;
case 65: case 66: itemType = "Tome of clear thought +2 [DMG 268]"; break;
case 67: case 68: itemType = "Tome of leadership and influence +2 [DMG 268]"; break;
case 69: case 70: itemType = "Tome of understanding +2 [DMG 268]"; break;
case 71: itemType = "Eyes of charming [DMG 256]"; break;
case 72: itemType = "Staff of frost [DMG 244]"; break;
case 73: itemType = "Robe of stars [DMG 265]"; break;
case 74: itemType = "Staff of defense [DMG 244]"; break;
case 75: case 76: itemType = "Carpet of flying, 10 ft. by 10 ft. [DMG 252]"; break;
case 77: itemType = "Darkskull [DMG 254]"; break;
case 78: itemType = "Psychoactive skin of fiery response [MIC 171]"; break;
case 79: case 80: case 81: itemType = "Ring of universal energy resistance, minor [MIC 128]"; break;
case 82: itemType = "Rod of force [MIC 173]"; break;
case 83: itemType = "Rod of rulership [DMG 236]"; break;
case 84: itemType = "Dwarven thrower [DMG 226]"; break;
case 85: itemType = "Psychoactive skin of the troll [MIC 172]"; break;
case 86: itemType = "Ring of master artifice, greater [MIC 125]"; break;
case 87: itemType = "Rod of security [DMG 236]"; break;
case 88: itemType = "Cube of force [DMG 253]"; break;
case 89: itemType = "Luck blade (1 wish) [DMG 227]"; break;
case 90: case 91: case 92: case 93: itemType = "Bracers of armor +8 [DMG 250]"; break;
case 94: itemType = "Cognizance crystal, 15 points [MIC 154]"; break;
case 95: itemType = "Pearl of power, 8th-level spell [DMG 263]"; break;
case 96: case 97: case 98: case 99: case 100: itemType = "+8 armor/shield [MIC 282]"; break;
            }
            
            return itemType;
        }
    public static String ninteenth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: itemType = "Staff of abjuration [DMG 243]"; break;
case 4: case 5: case 6: itemType = "Staff of conjuration [DMG 244]"; break;
case 7: case 8: case 9: itemType = "Staff of enchantment [DMG 244]"; break;
case 10: case 11: case 12: itemType = "Staff of evocation [DMG 244]"; break;
case 13: case 14: case 15: itemType = "Staff of illusion [DMG 244]"; break;
case 16: case 17: case 18: itemType = "Staff of necromancy [DMG 244]"; break;
case 19: case 20: case 21: itemType = "Staff of transmutation [DMG 245]"; break;
case 22: case 23: itemType = "Crystal ball with telepathy [DMG 253]"; break;
case 24: case 25: itemType = "Horn of blasting, greater [DMG 259]"; break;
case 26: case 27: case 28: itemType = "Pearl of power, two spells [DMG 263]"; break;
case 29: case 30: case 31: case 32: itemType = "Ring of wizardry III [DMG 233]"; break;
case 33: case 34: case 35: case 36: itemType = "Rod of lordly might [DMG 235]"; break;
case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: itemType = "+6 weapon [MIC 282]"; break;
case 53: case 54: case 55: case 56: itemType = "Metamagic rod, Empower, greater [DMG 236]"; break;
case 57: case 58: case 59: case 60: itemType = "Metamagic rod, Reach, greater [MIC 165]"; break;
case 61: case 62: itemType = "Helm of teleportation [DMG 259]"; break;
case 63: case 64: case 65: case 66: itemType = "Memento magica, 7th-level spell [MIC 164]"; break;
case 67: case 68: case 69: case 70: itemType = "Staff of divination [DMG 244]"; break;
case 71: case 72: case 73: itemType = "Gem of seeing [DMG 257]"; break;
case 74: case 75: case 76: case 77: itemType = "Ring of telekinesis [DMG 233]"; break;
case 78: case 79: case 80: case 81: itemType = "Robe of the archmagi [DMG 265]"; break;
case 82: case 83: case 84: case 85: itemType = "Runestaff of passage [MIC 181]"; break;
case 86: case 87: itemType = "Mace of smiting [DMG 227]"; break;
case 88: case 89: case 90: case 91: itemType = "Metamagic rod, Quicken [DMG 236]"; break;
case 92: case 93: case 94: itemType = "Mantle of faith [DMG 261]"; break;
case 95: case 96: itemType = "Psychoactive skin of the hero [MIC 171]"; break;
case 97: case 98: case 99: case 100: itemType = "Crystal ball with true seeing [DMG 253]"; break;
            }
            
            return itemType;
        }
    public static String twentieth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: itemType = "Staff of earth and stone [DMG 244]"; break;
case 4: case 5: itemType = "Cognizance crystal, 17 points [MIC 154]"; break;
case 6: case 7: case 8: itemType = "Pearl of power, 9th-level spell [DMG 263]"; break;
case 9: case 10: case 11: case 12: case 13: case 14: itemType = "+9 armor/shield [MIC 282]"; break;
case 15: itemType = "Well of many worlds [DMG 268]"; break;
case 16: case 17: case 18: case 19: itemType = "Manual of bodily health +3 [DMG 261]"; break;
case 20: case 21: case 22: case 23: itemType = "Manual of gainful exercise +3 [DMG 262]"; break;
case 24: case 25: case 26: case 27: itemType = "Manual of quickness in action +3 [DMG 262]"; break;
case 28: case 29: case 30: case 31: itemType = "Tome of clear thought +3 [DMG 268]"; break;
case 32: case 33: case 34: case 35: itemType = "Tome of leadership and influence +3 [DMG 268]"; break;
case 36: case 37: case 38: case 39: itemType = "Tome of understanding +3 [DMG 268]"; break;
case 40: case 41: case 42: itemType = "Rod of alertness [DMG 234]"; break;
case 43: itemType = "Apparatus of Kwalish [DMG 247]"; break;
case 44: case 45: case 46: case 47: itemType = "Mantle of spell resistance [DMG 261]"; break;
case 48: case 49: itemType = "Psychoactive skin of the psion [MIC 172]"; break;
case 50: case 51: case 52: case 53: itemType = "Ring of regeneration [DMG 232]"; break;
case 54: case 55: itemType = "Mirror of opposition [DMG 262]"; break;
case 56: case 57: itemType = "Strand of prayer beads, greater [DMG 267]"; break;
case 58: case 59: itemType = "Amulet of mighty fists +4 [DMG 246]"; break;
case 60: case 61: itemType = "Memento magica, 8th-level spell [MIC 164]"; break;
case 62: case 63: case 64: case 65: itemType = "Ring of three wishes [DMG 233]"; break;
case 66: case 67: itemType = "Eyes of petrification [DMG 256]"; break;
case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: 
case 78: case 79: case 80: case 81: case 82: itemType = "+7 weapon [MIC 282]"; break;
case 83: case 84: itemType = "Ring of spell turning [DMG 233]"; break;
case 85: case 86: itemType = "Bowl of commanding water elementals [DMG 250]"; break;
case 87: case 88: itemType = "Brazier of commanding fire elementals [DMG 250]"; break;
case 89: case 90: itemType = "Censer of controlling air elementals [DMG 252]"; break;
case 91: case 92: itemType = "Ring of wizardry IV [DMG 233]"; break;
case 93: case 94: itemType = "Stone of controlling earth elementals [DMG 267]"; break;
case 95: case 96: case 97: case 98: case 99: case 100: itemType = "+10 armor/shield [MIC 282]"; break;
            }
            
            return itemType;
        }
    public static String twentyfirst(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: itemType = "Staff of the woodlands [DMG 245]"; break;
case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: itemType = "Luck blade (2 wishes) [DMG 227]"; break;
case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: itemType = "Manual of bodily health +4 [DMG 261]"; break;
case 24: case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: itemType = "Manual of gainful exercise +4 [DMG 262]"; break;
case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: itemType = "Manual of quickness in action +4 [DMG 262]"; break;
case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: itemType = "Tome of clear thought +4 [DMG 268]"; break;
case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: itemType = "Tome of leadership and influence +4 [DMG 268]"; break;
case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: itemType = "Tome of understanding +4 [DMG 268]"; break;
case 69: case 70: case 71: case 72: case 73: case 74: itemType = "Amulet of the planes [DMG 247]"; break;
case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: itemType = "Ring of universal energy resistance, major [MIC 128]"; break;
case 84: case 85: case 86: case 87: case 88: case 89: case 90: itemType = "Robe of eyes [DMG 265]"; break;
case 91: case 92: case 93: case 94: case 95: itemType = "Third eye conceal [MIC 141]"; break;
case 96: case 97: itemType = "Third eye dominate [MIC 141]"; break;
case 100: itemType = "Third eye dominate [MIC 141]"; break;
            }
            
            return itemType;
        }
    public static String twentysecond(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: itemType = "Holy avenger [DMG 226]"; break;
case 11: case 12: case 13: case 14: case 15: itemType = "Memento magica, 9th-level spell [MIC 164]"; break;
case 16: case 17: case 18: case 19: case 20: itemType = "Metamagic rod, Chaining, greater [MIC 165]"; break;
case 21: case 22: case 23: case 24: case 25: itemType = "Metamagic rod, Maximize, greater [DMG 236]"; break;
case 26: case 27: case 28: case 29: itemType = "Helm of brilliance [DMG 258]"; break;
case 30: case 31: case 32: case 33: itemType = "Ring of djinni calling [DMG 230]"; break;
case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: itemType = "+8 weapon [MIC 282]"; break;
case 59: case 60: case 61: case 62: case 63: case 64: case 65: itemType = "Manual of bodily health +5 [DMG 261]"; break;
case 66: case 67: case 68: case 69: case 70: case 71: case 72: itemType = "Manual of gainful exercise +5 [DMG 262]"; break;
case 73: case 74: case 75: case 76: case 77: case 78: case 79: itemType = "Manual of quickness in action +5 [DMG 262]"; break;
case 80: case 81: case 82: case 83: case 84: case 85: case 86: itemType = "Tome of clear thought +5 [DMG 268]"; break;
case 87: case 88: case 89: case 90: case 91: case 92: case 93: itemType = "Tome of leadership and influence +5 [DMG 268]"; break;
case 94: case 95: case 96: case 97: case 98: case 99: itemType = "Tome of understanding +5 [DMG 268]"; break;
case 100: itemType = "Tome of understanding +5 [DMG 268]"; break;
            }
            
            return itemType;
        }
    public static String twentythird(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: itemType = "Luck blade (3 wishes) [DMG 227]"; break;
case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: itemType = "Efreeti bottle [DMG 255]"; break;
case 44: case 45: case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: itemType = "Amulet of mighty fists +5 [DMG 246]"; break;
case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: itemType = "Staff of life [DMG 244]"; break;
case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: itemType = "Chaos diamond [DMG 252]"; break;
case 100: itemType = "Chaos diamond [DMG 252]"; break;
            }
            
            return itemType;
        }
    public static String twentyfourth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30: itemType = "+9 weapon [MIC 282]"; break;
case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: itemType = "Cubic gate [DMG 254]"; break;
case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: case 51: itemType = "Iron flask [DMG 261]"; break;
case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60: case 61: itemType = "Metamagic rod, Quicken, greater [DMG 236]"; break;
case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: itemType = "Staff of passage [DMG 245]"; break;
case 74: case 75: case 76: case 77: case 78: case 79: case 80: case 81: itemType = "Mirror of mental prowess [DMG 262]"; break;
case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: itemType = "Ring of universal energy resistance, greater [MIC 128]"; break;
case 100: itemType = "Ring of universal energy resistance, greater [MIC 128]"; break;
            }
            
            return itemType;
        }
    public static String twentyfifth(){
        itemRoll = dice.rolld100();
        //itemRoll = 72;
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: itemType = "Mirror of life trapping [DMG 262]"; break;
case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: itemType = "Ring of elemental command (air) [DMG 231]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24: itemType = "Ring of elemental command (earth) [DMG 231]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: itemType = "Ring of elemental command (fire) [DMG 231]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40: itemType = "Ring of elemental command (water) [DMG 231]"; break;//   ~~ CHECK FOR METHODS TO BE ADDED ~~ 
case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50: itemType = "Ring of spell storing, major [DMG 233]"; break;
case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: itemType = "Vest of the archmagi [MIC 145]"; break;
case 59: case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: itemType = "+10 weapon [MIC 282]"; break;
case 89: case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: itemType = "Staff of power [DMG 245]"; break;
case 100: itemType = "Staff of power [DMG 245]"; break; // Though this item’s price actually puts it at 26th level, it is included in this list.
            }
            
            return itemType;
        }
    public static String gA(){
        itemRoll = dice.roll(1, 23);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Banded agate"; break;
            case 2: itemType = "Eye agate"; break;
            case 3: itemType = "Moss agate"; break;
            case 4: itemType = "Azurite"; break;
            case 5: itemType = "Blue quartz"; break;
            case 6: itemType = "Hermatite"; break;
            case 7: itemType = "Lapiz lazuli"; break;
            case 8: itemType = "Malachite"; break;
            case 9: itemType = "Obsidian"; break;
            case 10: itemType = "Rhodochrosite"; break;
            case 11: itemType = "Tiger eye turquoise"; break;
            case 12: itemType = "Freshwater pearl"; break;
            case 13: itemType = "Steel pledge pin"; break;
            case 14: itemType = "Boarskin hat"; break;
            case 15: itemType = "Embroidered linen blanket"; break;
            case 16: itemType = "Platter carved from maple"; break;
            case 17: itemType = "Sealskin boots"; break;
            case 18: itemType = "Teak bowl"; break;
            case 19: itemType = "Cotton tunic with royal crest"; break;
            case 20: itemType = "Bronze spectacles"; break;
            case 21: itemType = "Granite dice"; break;
            case 22: itemType = "Satin belt"; break;
            case 23: itemType = "Hammered brass wine cup"; break;
        }
        
        
        return itemType+" worth approximately "+dice.roll(4, 4)+" gp";
    }
    public static String gB(){
        itemRoll = dice.roll(1, 35);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Bloodstone"; break;
            case 2: itemType = "Carnelian"; break;
            case 3: itemType = "Chalcedony"; break;
            case 4: itemType = "Chrysoprase"; break;
            case 5: itemType = "Citrine"; break;
            case 6: itemType = "Iolite"; break;
            case 7: itemType = "Jasper"; break;
            case 8: itemType = "Moonstone"; break;
            case 9: itemType = "Onyx"; break;
            case 10: itemType = "Peridot"; break;
            case 11: itemType = "Clear quartz"; break;
            case 12: itemType = "Sard"; break;
            case 13: itemType = "Sardonyx"; break;
            case 14: itemType = "Rose quartz"; break;
            case 15: itemType = "Smoky quartz"; break;
            case 16: itemType = "Star rose quartz"; break;
            case 17: itemType = "Zircon"; break;
            case 18: itemType = "Silver ewer"; break;
            case 19: itemType = "Carved bone statuette"; break;
            case 20: itemType = "Ivory statuette"; break;
            case 21: itemType = "Small gold bracelet"; break;
            case 22: itemType = "Bronze statue of a knight"; break;
            case 23: itemType = "Mahogany bust of a poet"; break;
            case 24: itemType = "Silver ring with blue quartz"; break;
            case 25: itemType = "Small perfume bottle of black crystal"; break;
            case 26: itemType = "Purple velvet gloves with silver stitching"; break;
            case 27: itemType = "Ornate wooden box"; break;
            case 28: itemType = "Bronze earings with ceramic ovals"; break;
            case 29: itemType = "Copper horn ringed with seashells"; break;
            case 30: itemType = "Oak candlestick"; break;
            case 31: itemType = "Mahogany tray carved with flowers"; break;
            case 32: itemType = "Rhinocerous-hide sack"; break;
            case 33: itemType = "Peacock-feather mask"; break;
            case 34: itemType = "Broad-brimmed velvet hat"; break;
            case 35: itemType = "Zircon-studded dancing slippers"; break;
        }
        
        
        return itemType+" worth approximately "+dice.roll(2, 4)*10+" gp";
    }
    public static String gC(){
        itemRoll = dice.roll(1, 23);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Amber"; break;
            case 2: itemType = "Amethyst"; break;
            case 3: itemType = "Chrusoberyl"; break;
            case 4: itemType = "Coral"; break;
            case 5: itemType = "Red garnet"; break;
            case 6: itemType = "Brown-green garnet"; break;
            case 7: itemType = "Jade"; break;
            case 8: itemType = "Jet"; break;
            case 9: itemType = "White pearl"; break;
            case 10: itemType = "Golden pearl"; break;
            case 11: itemType = "Pink pearl"; break;
            case 12: itemType = "Silver pearl"; break;
            case 13: itemType = "Red spinel tourmaline"; break;
            case 14: itemType = "Red-brown spinel tourmaline"; break;
            case 15: itemType = "Deep green spinel tourmaline"; break;
            case 16: itemType = "Cloth of gold vestments"; break;
            case 17: itemType = "Black velvet mask adorned with citrines"; break;
            case 18: itemType = "Silver chalice with lapis inlay"; break;
            case 19: itemType = "Coral saucer"; break; // Could be fun to have a customized version of this table which allows players to get a full teaset
            case 20: itemType = "Heraldric banner edged with swan feathers"; break;
            case 21: itemType = "Marble relief of dwarf wrestlers"; break;
            case 22: itemType = "Copper anklet plate with silver"; break;
            case 23: itemType = "Prayer mat with inlaid gold thread"; break;
        }
        
        
        return itemType+" worth approximately "+dice.roll(4, 4)*10+" gp";
    }
    public static String gD(){
        itemRoll = dice.roll(1, 18);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Large wool tapestry"; break;
            case 2: itemType = "Brass mug with jade inlays"; break;
            case 3: itemType = "Harp painted with pastoral scene"; break;
            case 4: itemType = "Mountain landscape in ash frame"; break;
            case 5: itemType = "Wall hanging of a forest in black ink"; break;
            case 6: itemType = "Velvet cloak with eagle feathers"; break;
            case 7: itemType = "Small marble statue of an athlete"; break;
            case 8: itemType = "Granite cup carved with staring eyes"; break;
            case 9: itemType = "Ivory bust of a high priest"; break;
            case 10: itemType = "Mithral circlet engraved with elvish poetry"; break;
            case 11: itemType = "Dragonhide gloves"; break;
            case 12: itemType = "Onyx hourglass set with malachite"; break;
            case 13: itemType = "Coral brooch with oval jasper setting"; break;
            case 14: itemType = "Gold anklet with bloodstone cabochons"; break;
            case 15: itemType = "Adamantine armband with filigree carvings"; break;
            case 16: itemType = "Oil painting of a royal wedding"; break;
            case 17: itemType = "Jade cameo pendant"; break;
            case 18: itemType = "Life-sized darkwood cat sculpture with yellow topaz eyes"; break;
        }
        
        
        return itemType+" worth approximately "+dice.roll(1, 4)*100+" gp";
    }
    
    public static String gE(){
        itemRoll = dice.roll(1, 16);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Alexandrite"; break;
            case 2: itemType = "Aquamarine"; break;
            case 3: itemType = "Violet garnet"; break;
            case 4: itemType = "Black pearl"; break;
            case 5: itemType = "Deep blue spinel"; break;
            case 6: itemType = "Golden yellow topaz"; break;
            case 7: itemType = "Silver comb with moonstones"; break;
            case 8: itemType = "Silver-plated scabbard with jet cabochons"; break;
            case 9: itemType = "Carved darkwood harp with ivory inlay and zircon gems"; break;
            case 10: itemType = "Solid gold idol (10 lb.)"; break;
            case 11: itemType = "Linen tapestry depicting giants destroying a town"; break;
            case 12: itemType = "Obsideon statue of a hunting dog"; break;
            case 13: itemType = "Painting of a sailing ship"; break;
            case 14: itemType = "Onyx sphere with trees carved in relief"; break;
            case 15: itemType = "Silk banner embroidered with performing musician"; break;
            case 16: itemType = "Small masterpiece portrait in gold frame inlaid with opal"; break;
            
        }
        
        
        return itemType+" worth approximately "+dice.roll(2, 4)*100+" gp";
    }
    public static String gF(){
        itemRoll = dice.roll(1, 22);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Emerald"; break;
            case 2: itemType = "White opal"; break;
            case 3: itemType = "Black opal"; break;
            case 4: itemType = "Fire opal"; break;
            case 5: itemType = "Blue sapphire"; break;
            case 6: itemType = "Fiery yellow corundum"; break;
            case 7: itemType = "Rich purple corundum"; break;
            case 8: itemType = "Blue star sapphire"; break;
            case 9: itemType = "Black star sapphire"; break;
            case 10: itemType = "Star ruby"; break;
            case 11: itemType = "Gold dragon comb with red garnet eye"; break;
            case 12: itemType = "Gold and topaz bottle stopper cork"; break;
            case 13: itemType = "Ceremonial electrum dagger with star ruby in pommel"; break;
            case 14: itemType = "Eyepatch with mock eye of sapphire and moonstone"; break;
            case 15: itemType = "Fire opal pendant on gold chain"; break;
            case 16: itemType = "Masterpiece portrait of an elite general"; break;
            case 17: itemType = "Dinosaurhide tapestry depicting a mage"; break;
            case 18: itemType = "Mother-of-pearl statue of a naga"; break;
            case 19: itemType = "Mithral comb with opal runes"; break;
            case 20: itemType = "Silver crown with opal inlay"; break;
            case 21: itemType = "Vestments of celestial lion fur";break;
            case 22: itemType = "Set of gold and silver bells with jeweled handles";break;
            
        }
        
        
        return itemType+" worth approximately "+dice.roll(4, 4)*100+" gp";
    }
    public static String gG(){
        itemRoll = dice.roll(1, 12);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Embroidered silk and velvet mantle with moonstones"; break;
            case 2: itemType = "Sapphire pendant on gold chain"; break;
            case 3: itemType = "Embroidered and bejeweled glove"; break;
            case 4: itemType = "Jeweled amulet"; break;
            case 5: itemType = "Golden circlet with four aquamarines"; break;
            case 6: itemType = "Necklace of pink pearls"; break;
            case 7: itemType = "Basalt pyramid with images of dragons inlaid in gems"; break;
            case 8: itemType = "Lead crown adorned with black pearls"; break;
            case 9: itemType = "Bejeweled gold tiara shaped like dragon horns"; break;
            case 10: itemType = "Bronze music box with pearl inlay"; break;
            case 11: itemType = "Mahogany bracelet plated with gold and platinum"; break;
            case 12: itemType = "Dragonhide formal shoes with electrum buckles"; break;
            
            
        }
        
        
        return itemType+" worth approximately "+dice.roll(1, 4)*1000+" gp";
    }
    public static String gH(){
        itemRoll = dice.roll(1, 11);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Bright green emerald"; break;
            case 2: itemType = "Blue-white diamond"; break;
            case 3: itemType = "Canary diamond"; break;
            case 4: itemType = "Pink diamond"; break;
            case 5: itemType = "Brown diamond"; break;
            case 6: itemType = "Blue diamond"; break;
            case 7: itemType = "Jacinth"; break;
            case 8: itemType = "Jeweled gold crown"; break;
            case 9: itemType = "Jeweled electrum ring"; break;
            case 10: itemType = "Bone mug set with opals"; break;
            case 11: itemType = "Platinum sunburst crown"; break;
            
            
            
        }
        
        
        return itemType+" worth approximately "+dice.roll(2, 4)*1000+" gp";
    }
    public static String gI(){
        itemRoll = dice.roll(1, 7);
        // System.out.println("You rolled "+itemRoll);
        switch (itemRoll){
            case 1: itemType = "Gold and ruby ring"; break;
            case 2: itemType = "Gold cup set with emeralds"; break;
            case 3: itemType = "Regal scepter set with sapphires"; break;
            case 4: itemType = "Platinum locket ringed with garnets"; break;
            case 5: itemType = "Mithral statue of a noble horse"; break;
            case 6: itemType = "Platinum tiara"; break;
            case 7: itemType = "Gilt dragon's skull with opal eyes and adamantine teeth"; break;
            
            
            
            
        }
        
        
        return itemType+" worth approximately "+dice.roll(4, 4)*1000+" gp";
    }
}




/*
public static String second(){
        itemRoll = dice.rolld100();
        System.out.println("Your roll is "+itemRoll);
        switch(itemRoll){
            case 1: itemType = "Scroll of arcane lock (A) [PHB 200]"; break;
            case 2: itemType = "Crystal of lifekeeping, least [MIC 25]"; break;
            case 3: itemType = "Everfull mug [MIC 160]"; break;
            case 4: itemType = "Quaal's feather token, fan [DMG 264]"; break;
            case 5: itemType = "Skill shard, greater [MIC 185]"; break;
            case 6: itemType = "Tanglepatch [MIC 188]"; break;
            case 7: itemType = "Chain shirt, masterwork [PHB 124]"; break;
            case 8: itemType = "Darkwood shield [DMG 221]"; break;
            case 9: itemType = "Darkwood buckler [DMG 221]"; break;
            case 10: itemType = "Crystal of aquatic action, least [MIC 25]"; break;
            case 11: itemType = "Dust of tracelessness [DMG 255]"; break;
            case 12: itemType = "Elixir of hiding [DMG 255]"; break;
            case 13: itemType = "Elixir of sneaking [DMG 255]"; break;
            case 14: itemType = "Elixir of swimming [DMG 255]"; break;
            case 15: itemType = "Elixir of vision [DMG 256]"; break;
            case 16: itemType = "Incense of concentration [MIC 162]"; break;
            case 17: itemType = "Jumping caltrops [MIC 162]"; break;
            case 18: itemType = "Safewing emblem [MIC 131]"; break;
            case 19: itemType = "Silversheen [DMG 166]"; break;
            case 20: itemType = "Crystal of adamant armor, least [MIC 24]"; break;
            case 21: itemType = "Crystal of adamant weaponry, least [MIC 24]"; break;
            case 22: itemType = "Satin belt"; break;
            case 23: itemType = "Hammered brass wine cup"; break;
            case 24: itemType = "";
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
        }
        return itemType;
    }
*/
//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class Barbarian extends Protagonist{
    public Barbarian( String nombre ){
	super(nombre);
	defense = defense + 50;
	strength = strength + 50;
    }
    
    public static String about(){
	return "Defense and Strength are each 50 points higher.";
    }
    
}
	

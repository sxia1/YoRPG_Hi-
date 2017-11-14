//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

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
	

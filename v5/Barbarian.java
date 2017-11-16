//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class Barbarian extends Protagonist{
    public Barbarian( String nombre ){
	super(nombre);
	defense = defense + 25;
	strength = strength + 20;
    }
    
    public  String about(){
	return "Barbarian: Defense is 25 points higher, and strength is 20 points higher.";
    }

    public void specialize(){
	defense = defense - 10;
	attRating = attRating * 2;
    }

    public void normalize(){
	defense = 65;
	attRating = 0.4;
    }
    
}
	

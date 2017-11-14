//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Mage extends Protagonist{

    //attributes
    //---------------------------------------
    private int mana;

    
    //Constructor
    //---------------------------------------
    public Mage(String nombre){
	super(nombre);
	mana = 50;
	strength = 80;
	defense = 40;
	attRating = 0.5;
    }

    //methods
    //---------------------------------------

    //ABOUT
    //description of the class
    public static String about(){
	return "Mage: Uses mana to increase attack power while keeping defenses the same. However, mana does run out so use it wisely. A mage has lower strength, but a higher attack rating.";
    }//end about

    
    //SPECIALIZE
    //expends mana in return for more offensive power, defense is not changed
    public void specialize(){
	if (mana - 10 > 0){
	    mana = mana - 10;
	    attRating *= 2;
	}
	else {
	    System.out.println("Ye hath no more mana");
	}
    }//end specialize

    
    //normalize
    //returns stats back to normal
    public void normalize(){
	attRating = 0.5;
    }//end normalize
    
}

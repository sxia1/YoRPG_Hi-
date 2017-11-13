public class Mage extends Protagonist{

    //attributes
    private int mana;

    //Constructor
    public Mage(String nombre){
	super(nombre);
	mana = 50;
	strength = 80;
	defense = 40;
	attRating = 0.5;
    }

    //methods
    //---------------------------------------
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
	attRating *= 0.5;
    }//end normalize
    
}

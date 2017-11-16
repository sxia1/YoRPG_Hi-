public class Zombie extends Monster{

    public Zombie(){
	super();
	health = 300;
	strength = strength - 10;
	defense = 40;
	attRating = .75;
    }

    public static String about(){
	return "Slow but tanky";
    }
    
}
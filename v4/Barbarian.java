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
	
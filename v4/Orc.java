public class Orc extends Monster{

    public Orc(){
	super();
	strength = strength + 15;
	defense = defense + 15;
    }

    public static String about(){
	return "Orcs are stronger and have higher defense";
    }
    
}//end class Orc

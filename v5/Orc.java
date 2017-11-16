//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class Orc extends Monster{

    private String name = "Orc";
    
    public Orc(){
	super();
	strength = strength + 15;
	defense = defense + 15;
    }
    
    public static String about(){
	return "Orcs are stronger and have higher defense";
    }

    public String getName(){
	return name;
    }
    
}//end class Orc

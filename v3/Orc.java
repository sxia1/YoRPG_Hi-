//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

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

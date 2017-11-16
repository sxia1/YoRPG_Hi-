//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Realized
//2017-11-15

public class Slime extends Monster{

    private String name = "Slime";
    
    public Slime(){
	super();
	health = health + 30;
    }
    
    
    public static String about(){
	return "Health is 30 points higher";
    }

    public String getName(){
	return name;
    }
}

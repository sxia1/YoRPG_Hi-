//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public abstract class Protagonist extends Character{

    //Attributes
    //----------------------------------
    private String name;
    
    //Constructor
    //----------------------------------
    public Protagonist( String nombre ){
	name = nombre; // Lets the player choose a name
	health = 125; // Sets default stats
	strength = 100;
	defense = 40;
	attRating = 0.4;
    }

    //Methods
    //----------------------------------

    //getName
    public String getName() { //retrieves the name of the player so it may be used in the dialogue
	return name;
    }

    //getHealth
    public int getHealth(){
	return health;
    }
    
    //attack
    public int attack( Monster monster ) {
	int damage = (int)(strength * attRating - monster.getDefense());
	monster.lowerHP(damage);
	return damage;
	//calculates how much damage the player will do to the monster taking into consideration the player's overall attack power and the monster's defenses
    }

    
    //specialize
    public abstract void specialize();

    //normalize
    public abstract void normalize();

    //about
    public abstract String about();

}//end class Protagonist

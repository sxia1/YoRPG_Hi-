//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game, Improved
//2017-11-12

public class Protagonist extends Character{

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
    /*
    //attack
    public int attack( Monster monster ) {
	int damage = (int)(strength * attRating - monster.getDefense());
	monster.lowerHP(damage);
	return damage; // calculates how much damage the player will do to the monster taking into consideration the player's overall attack power and the monster's defenses
    }
    */
    
    //specialize
    public void specialize() {
	defense = defense - 20;
	attRating *= 2;
    } // Gives the player more offensive power in exchange for being more vulnerable

    //normalize
    public void normalize() {
	defense = 40;
	attRating = 0.4;
    } //returns the player's stats to normal
}

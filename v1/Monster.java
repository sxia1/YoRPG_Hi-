//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW28 -- Ye Olde Role Playing Game
//2017-11-08

public class Monster{

    //Attributes - instance variables
    //----------------------------------
    private int health;
    private int strength;
    private int defense;
    private double attRating;

    //Constructor - sets the default stats of the monster
    //----------------------------------
    public Monster(){
	health = 150;
	strength = (int)((Math.random()*45) + 20);
	defense = 20;
	attRating = 1;
    }

    //Methods
    //----------------------------------
    //isAlive
    public Boolean isAlive() { //checks to see if the monster is alive
	return (health > 0);
    }

    //getDefense
    public int getDefense() { //retrieves defenses to be used in battle calculations
	return defense;
    }

    //lowerHP
    public void lowerHP( int num ) { // Brings the beast closer to death should the hero land a solid wack or two
	health = health - num;
    }

    //attack - calculates the damage the hero takes if the monster attacks
    public int attack( Protagonist protag) {
	int damage = (int)(strength * attRating - protag.getDefense());
	protag.lowerHP(damage);
	return damage;
    }

}

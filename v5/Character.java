//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW32 -- Ye Olde Role Playing Game, Unchained
//2017-11-14

public class Character{

    //Attributes
    //----------------------------------
    protected int health;
    protected int strength;
    protected int defense;
    protected double attRating;

    //Methods
    //----------------------------------
    //isAlive
    public Boolean isAlive() {
	//Checks to see if the character is still alive
	return health > 0;
    }

    //getDefense
    protected int getDefense() {
	//retrieves the defense stat so it may be used in battle calculations
	return defense;
    }

    //lowerHP
    protected void lowerHP( int num ) {
	//Used to lower the char's health if they be damaged
	health = health - num;
    }

    //attack
    protected int attack( Character chara ) {
	int damage = (int)(strength * attRating - chara.getDefense());
	if (damage < 0){
	    damage = 0;
	}
	chara.lowerHP(damage);
	return damage;
	// calculates how much dmg the chara will do to the other chara taking into consideration the character's overall attack power 
	//and the other character's defenses
    }

}//end class Character

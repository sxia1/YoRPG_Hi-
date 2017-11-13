//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW30 -- Ye Olde Role Playing Game, Improved
//2017-11-13

public class Character{

    //Attributes
    //----------------------------------
    public int health;
    public int strength;
    public int defense;
    public double attRating;

    //Methods
    //----------------------------------
    //isAlive
    public Boolean isAlive() {
	//Checks to see if the character is still alive
	return health > 0;
    }

    //getDefense
    public int getDefense() {
	//retrieves the defense stat so it may be used in battle calculations
	return defense;
    }

    //lowerHP
    public void lowerHP( int num ) {
	//Used to lower the char's health if they be damaged
	health = health - num;
    }

    //attack
    public int attack( Character chara ) {
	int damage = (int)(strength * attRating - chara.getDefense());
	chara.lowerHP(damage);
	return damage;
	// calculates how much dmg the chara will do to the other chara taking into consideration the character's overall attack power 
	//and the other character's defenses
    }

}//end class Character

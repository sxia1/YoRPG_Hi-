//Team Hi?
//Roster: Daniel Jiang, Woosuk Lee, Sophia Xia
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded
//2017-11-13

public class Monster extends Character{

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

    //attack - calculates the damage the hero takes if the monster attacks
    public int attack( Protagonist protag) {
	int damage = (int)(strength * attRating - protag.getDefense());
	protag.lowerHP(damage);
	return damage;
    }

}//end class Monster

public class Cleric extends Protagonist {

    public Cleric(String nombre){
	super(nombre);
	health = health + 70;
	strength = strength - 15;
	defense = defense - 15;
    }

    public String about(){
	health = health + 30;
	return "Health increased by 30";
    }
}
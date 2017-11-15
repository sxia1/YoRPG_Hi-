public class Ninja extends Protagonist {

    public Ninja(String nombre){
        super(nombre);
        health = health - 35;
        strength = strength + 20;
        defense = defense - 20;
	attRating = attRating + .4;
	    }

    public Static String about(){
        return "Strong but squishy";
    }
}
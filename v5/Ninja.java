public class Ninja extends Protagonist {
    
    private double dodge;

    public Ninja(String nombre){
        super(nombre);
	dodge = .3;
        health = 90;
        strength = 125;
        defense = 15;
	attRating = 0.7;
	    }

    public String about(){
        return "Strong but squishy";
    }
    
    public void specialize(){
	if (Math.random() <= dodge) {
	    defense = defense + 100000;
	}
	System.out.println("Thou art intangible");
    }

    public void normalize(){
	defense = 15;
    }
}
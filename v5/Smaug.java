public class Smaug extends Monster {

    private String name = "Smaug";
       
    public Smaug(){
	super();
	health = 300;
	strength = 50;
	defense = 30;
	attRating = 1.5;
    }

    public static String about(){
	return "Come now, don't be shy... step into the light";
    }

    public String getName(){
	return name;
    }
}

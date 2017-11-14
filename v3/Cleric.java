public class Cleric extends Protagonist {

    private String name;

    public Protagonist(String nombre) {
	name = nombre;
	health = 200;
	strength = 40;
	defense = 20;
	attRating = .1;
    }

    public String getName() {
	return name;
    }

    public int heal (Protagonist Barbarian, Protagonist Mage) {
	Barbarian.lowerHP(-40);
	Mage.lowerHP(-40);
	return 40;
    }
}
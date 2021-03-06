//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#30 -- Ye Olde Role Playing Game, Improved
//2017-11-10

public class Monster extends Character {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private int HP;
    private int strength;
    private int defense;
    private double attkRating;

    // ~~~~~~~~~~ CONSTRUCTOR ~~~~~~~~~~~
    // assigns default values to attributes with strength being a random int
    // from the range [20,65)
    public Monster() {
	HP = 150;
	strength = (int) ((Math.random() * 45) + 20);
	defense = 20;
	attkRating = 1;
    }

    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~
    public boolean isAlive(){ //returns boolean indicating living or dead
	return HP > 0;
    }

    public int getDefense(){ //returns value of defense attribute
	return defense;
    }

    public void lowerHP(int dmg){ //takes an int parameter, decreases HP by int
	HP -= dmg;
    }

    //attacks, returns damage inflicted on Protagonist
    public int attack(Protagonist x){
	int damage = ((int)(strength * attkRating)) - x.getDefense();
	x.lowerHP(damage);
	return damage;
    }
}

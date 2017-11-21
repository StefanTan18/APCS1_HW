//Team CSGO -- Maryann Foley, Wenting Li, Stefan Tan
//APCS1 pd8
//HW#30 -- Ye Olde Role Playing Game, Improved
//2017-11-10

public class Character {
    
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    private int HP;
    private int strength;
    private int defense;
    private double attkRating;

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

    public int attack(Character x){ //attacks, returns damage inflicted
	int damage = ((int)(strength * attkRating)) - x.getDefense();
	x.lowerHP(damage);
	return damage;
    }
    
}// end class Character
	
	

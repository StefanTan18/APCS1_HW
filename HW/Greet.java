public class Greet {
 
    public static void main (String [] args) {
	String greeting;

	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Hey ya");
	BigSib tracy = new BigSib("Sup");
	BigSib dotCom = new BigSib("Salutations");

	greeting = richard.greet("freshmen");
	System.out.println(greeting);

	greeting = grizz.greet("Dr.Spaceman");
	System.out.println(greeting);

	greeting = tracy.greet("King Fooey");
	System.out.println(greeting);

	greeting = dotCom.greet("mom");
	System.out.println(greeting);

    }
}

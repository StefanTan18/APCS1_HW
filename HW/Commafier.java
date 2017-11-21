//Stefan Tan
//APCS1 pd8
//HW#21 -- Karmacomma
//2017-10-23

public class Commafier {
    /*  Takes a non-negative integer input and returns the number as a String
	with commas inserted appropriately recursively. */
    public static String commafyR(int num) {
	String stringNum = Integer.toString(num);
	int len = stringNum.length();
	String commafiedNum = "";
	if (len <= 3){
	    return stringNum;
	}
	commafiedNum = "," + stringNum.substring(len - 3);
	return commafyR(Integer.parseInt(stringNum.substring(0, len - 3))) + commafiedNum;
    }

    /* takes a non-negative integer input and returns the number as a String 
       with commas inserted appropriately. Uses a for loop. */
    public static String commafyF(int num) {
	String stringNum = Integer.toString(num);
	String commafiedNum = "";
	int len = stringNum.length();
        for (int i = len; i > 3; i -= 3) {
	    commafiedNum = "," + stringNum.substring(i - 3, i) + commafiedNum;
	    stringNum = stringNum.substring(0, i - 3);
	}
	commafiedNum = stringNum + commafiedNum;
	return commafiedNum;
    }

    public static void main(String[] args) {
	//tests the method
	/*	System.out.println(commafyR(1));
		System.out.println(commafyR(10));
		System.out.println(commafyR(101));
		System.out.println(commafyR(1000));
		System.out.println(commafyR(12345));

		System.out.println(commafyF(1));
		System.out.println(commafyF(10));
		System.out.println(commafyF(101));
		System.out.println(commafyF(1000));
		System.out.println(commafyF(12345)); */

	//FOREACH loop for the recursive method.
	System.out.println("Recursive Commafier:");
	for (String s: args) {
	    int num = Integer.parseInt(s);
	    System.out.println(commafyR(num));
	}
	//FOREACH loop for the for loop method.
	System.out.println("For Loop Commafier:");
	for (String s: args) {
	    int num = Integer.parseInt(s);
	    System.out.println(commafyF(num));
	}
    }
}

//Stefan Tan
//APCS1 pd8
//HW#20 -- For the Lulz Love of Strings
//2017-10-19

public class Foresrever {

    //fence method using a for loop
    public static String fenceF(int posts){
	String fence = "|";
	int numPosts;
	for (numPosts = posts; numPosts != 1; numPosts -= 1) {
	    fence += "--|";
	}
	return fence;
    }
    
    //reverses a string using a for loop
    public static String reverseF(String s){
	String reversed = "";
	for (int len = s.length(); len > 0; len -= 1) {
	    reversed += s.substring(len - 1,len);
	}
	return reversed;
    }

    //reverses a string using recursive
    public static String reverseR(String s){
	String reversed = "";
	int len = s.length();
	if (len == 1){
	    return s;
	}
	reversed = reverseR(s.substring(1)) + s.substring(0,1);
	return reversed;
    }

    //tests the methods
    public static void main(String[] args) {
	System.out.println("For loop fence method tests:");
	System.out.println(fenceF(1)); //expected "|"
	System.out.println(fenceF(2)); //expected "|--|"
	System.out.println(fenceF(3) + "\n"); //expected "|--|--|"

	System.out.println("Reverse method using for loop test:");
	System.out.println(reverseF("stressed") + "\n"); //expected "desserts"

	System.out.println("Reverse method using recursive test:");
	System.out.println(reverseR("stressed")); //expected "desserts"
    }
}
	    
	    

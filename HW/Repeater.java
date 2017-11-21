// Stefan Tan
// APCS1 pd8
// HW#17 -- Do I repeat myself?
// 2017-10-16

public class Repeater {

    //method using while loop
    public static String fenceW(int numPosts){
	String fence = "|";
	while (numPosts > 1){
	    fence += "--|";
	    numPosts -= 1;
	}
	return fence;
    }

    // recursive method
    public static String fenceR(int numPosts){
	String fence = "";
	if (numPosts == 1){
	    fence += "|";
	}
	else {
	    fence += "|--" + fenceR(numPosts - 1);
	}
	return fence;
    }

    // tests the methods
    public static void main(String[] args) {
	// tests the while loop method
	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(3) + "\n");
	
	// tests the recursive method
	System.out.println(fenceR(1));
	System.out.println(fenceR(2));
	System.out.println(fenceR(3));
    }
}

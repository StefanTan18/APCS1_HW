//Stefan Tan
//APCS1 pd8
//HW#38 -- Put It Together
//2017-11-21

/*            ~~~~~~~~~~~~~~SUMMARY OF CODE~~~~~~~~~~~~~~~~
I set up a final variable that is an array containing 3-4 character Strings.
The instance variable declares an array called _words.
The default constructor allocates memory and selects random Strings from the 
final variable to fill the 3x3 array.
print() is used to print out the current array of _strings.
swap() takes in the input of the user and swaps the locations of two Strings 
based on the input.
*/

import cs1.Keyboard;

public class Swapper{
    private static final String[] WORDS = { //an array of 3-4 characters String
	"word", "line", "buzz", "jazz", "hard",
	"test", "quiz", "rock", "jump", "copy",
	"cat", "dog", "map", "joke", "put",
	"java", "jeep", "hack", "try", "you",
	"that", "hat", "buy", "pig", "me",
	"what", "two", "one", "zero", "add",
	"pet", "sun", "cow", "mat", "swap"
    };

    private static String[][] _words; //instance variable

    //takes a random String from WORDS and puts it in _words
    public Swapper(){
	_words = new String[3][3]; //allocates memory for an array that is 3x3
        for (int r = 0; r < 3; r++){
	    for (int c = 0; c < 3; c++)
		_words[r][c] = WORDS[(int)(Math.random()* WORDS.length)];
	}
    }
    
    //prints out an array
    public static void print( String[][] a )
    {
	for(String [] r : a) {
	    for (String c : r)
		System.out.print(c + " ");
	    System.out.println();
	}
    }

    //swaps the location of two elements
    //a - row of the 1st element, b - column of the 1st element
    //c - row of the 2nd element, d - column of the 2nd element
    public static void swap(int a, int b, int c, int d) {
	String temp = _words[a][b];
	_words[a][b] = _words[c][d];
	_words[c][d] = temp;
    }

    //tests the methods
    public static void main(String[] args){
	Swapper test = new Swapper(); //new instance of class Swapper

	System.out.println("\nCurrent Array;\n");
	print(_words);
	
	System.out.println("\nSwap:");
	System.out.println("\nPlease choose a row:");
	int s = Keyboard.readInt();
	System.out.println("\nPlease choose a column:");
        int t = Keyboard.readInt();
	System.out.println("\nSwap it with:");
	System.out.println("\nPlease choose a row:");
	int u = Keyboard.readInt();
	System.out.println("\nPlease choose a column:");
	int v = Keyboard.readInt();
	
	swap(s,t,u,v);

	System.out.println("\nNew Array:\n");
	print(_words);
    }
}
   
	
	

    
	


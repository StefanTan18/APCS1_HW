/*
  Team Bacon Richard Wong, John Liu, Stefan Tan 
  APCS1 pd8
  HW24 -- Imetay Otay Ineshay
  2017-10-27  
*/

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!

 ~~~~~~~~~~~~~~~~~~~~TO-DO LIST~~~~~~~~~~~~~~~~~~~~
 * Capitalization
 add the capital letters 
 have a function that identifies if the word is capitalized, if it has it capitalizes the output of engToPig. 
 * Punctuation
 have a final String called punc with all the punctuation marks in the String.
 have a helper function include it in the engToPig where it identifies if it has a punctuation mark 
 and moves it to the appropriate location. 

 ~~~~~~~~~~~~~~~~~~~~EXPLANATION OF CODE~~~~~~~~~~~~~~~~~~~~
 * First it stores the index of the first "y" and the a string of the first letter.
 * Next it looks at the last character, and if it isn't puncuation, then goes on. If it is punctuation
 it performs engToPig without the punctuation and then returns it with the punctuation attached to it.
 * After that if the first letter is lowercase then go on. If not, it does engToPig on the lowercase version string 
 of the string and returns the string with the first letter capitalized.
 * The condition we used for y to be a vowel, is if it is in the beginning but not the first letter.
 * Then if w doesnt start with a vowel, and the first vowel isn't y, then goes on. If it begins with a vowel then 
 returns the string with way at the end.
 * It then stores the index of the first vowel and a string of all the consonants before it.
 * It returns a string with the consonants moved to the end of the string with ay.
 * If y is a vowel, do the previous steps but with y as the vowel
 ***/
import java.util.Scanner;

public class Pig
{
    //Q: How does this initialization make your life easier?
    private static final String VOWELS = "aeiou";
    private static final String PUNCUATION = ".!?,:;";

    /*   It prevents accidental overwriting of the variable.
	 Easy to see and identify as a constant.
    */

    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	/* YOUR IMPLEMENTATION HERE */
	return w.indexOf(letter) != -1; // determines whether index of letter exists
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	/* YOUR IMPLEMENTATION HERE */
	return hasA(VOWELS, letter); // helper method
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
	/* YOUR IMPLEMENTATION HERE */
	int vowelCount = 0;
	for (int index = 0; index < w.length(); index++) // iterate
	    {
		String letter = w.substring(index, index + 1); // parse string
		if (isAVowel(letter)) // helper method to check if is vowel
		    vowelCount += 1; // increment by 1 if is vowel
	    }
	return vowelCount;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	/* YOUR IMPLEMENTATION HERE */
	return countVowels(w) > 0; // helper method
    }

    // /*=====================================
    //   String allVowels(String) -- returns vowels in a String
    //   pre:  w != null
    //   post: allVowels("meatball") -> "eaa"
    //   =====================================*/
    public static String allVowels( String w ) 
    {
	/* YOUR IMPLEMENTATION HERE */
	String vowelStr = "";
	for (int index = 0; index < w.length(); index++) // iterate
	    {
		String letter = w.substring(index, index + 1); // parse string
		if (isAVowel(letter)) // helper method to check if is vowel
		    vowelStr += letter; // concatenate if is vowel
	    }
	return vowelStr;
    }

    // /*=====================================
    //   String firstVowel(String) -- returns first vowel in a String
    //   pre: w != null
    //   post: firstVowel("") --> ""
    //         firstVowel("zzz") --> ""
    //         firstVowel("meatball") --> "e"
    //   =====================================*/
    public static String firstVowel(String w){
	if (hasAVowel(w)){
	    return allVowels(w).substring(0,1);
	}
	return "";
    }

    // /*=====================================
    //   String beinsWithVowel(String) -- tells whether a String starts with a vowel
    //   pre: w != null and w.length() > 0
    //   post: beginsWithVowel("apple")  --> true
    //         beginsWithVowel("strong") --> false
    //   =====================================*/
    public static boolean beginsWithVowel(String w) {
	return isAVowel(w.substring(0,1));
    }

    // /*=====================================
    //   String engToPig(String) -- translates String to Pig Latin
    //   pre: w.length() > 0
    //   post: engToPig("apple")  --> "appleway"
    //         engToPig("strong") --> "ongstray"
    //         engToPig("java")   --> "avajay"
    //   =====================================*/
    /*   public static String engToPig(String w) {
	 if (!beginsWithVowel(w)) {
	 int indexOfVowel = w.indexOf(firstVowel(w));
	 String consonants = w.substring(0,indexOfVowel);
	 return w.substring(indexOfVowel) + consonants + "ay";
	 }
	 return w + "way";
	 }*/

    //code that works with y
    public static String engToPig(String w) {
	int indexOfY=w.indexOf("y"); //location of first y
	String firstLetter=w.substring(0,1); //first letter of the string
	if (!hasA(PUNCUATION,w.substring(w.length()-1))){ //looks at the last character, and if it isn't puncuation, then goes on
	    if(firstLetter.equals(firstLetter.toLowerCase())) { //if the first letter is lowercase then go on
		if (!beginsWithVowel(w)&&(indexOfY<1||indexOfY>3)&&hasAVowel(w)) { //if w doesnt start with a vowel, and the first vowel isn't y, then goes on
		    int indexOfVowel = w.indexOf(firstVowel(w)); //location of the first vowel
		    String consonants = w.substring(0,indexOfVowel); //all of the consonants before the first vowel
		    return w.substring(indexOfVowel) + consonants + "ay"; //moves the first consonants to the back and adds "ay"
		}
		if (indexOfY>=1&&indexOfY<=3){ //if y is the first vowel, then goes on
		    String consonants = w.substring(0,indexOfY); //all of the consonants before the first vowel
		    return w.substring(indexOfY) + consonants + "ay"; //moves the first consonants to the back and adds "ay"
		}
		return w + "way"; //first letter is a vowel and just adds "way" to the end of the string
	    }
	    //case if the first letter is capital
	    String lowerStr=engToPig(w.toLowerCase()); //makes all the string lowercase and does engToPig on it
	    return lowerStr.substring(0,1).toUpperCase()+lowerStr.substring(1,lowerStr.length()); //makes the first letter capital
	}
	//case if there is puncuation
	return engToPig(w.substring(0,w.length()-1))+w.substring(w.length()-1); //does engToPig on string w without puncuation, then adds the puncuation afterwards
    }

    public static void main( String[] args ) 
    {
	Scanner sc = new Scanner(System.in);
	while( sc.hasNext() ) {
	    System.out.println( engToPig(sc.next()) );
	}
	/* YOUR TEST CALLS HERE
	   System.out.println("----hasA----");
	   System.out.println(hasA("cat", "c") + "...expecting true");
	   System.out.println(hasA("cat", "a") + "...expecting true");
	   System.out.println(hasA("cat", "t") + "...expecting true");
	   System.out.println(hasA("cat", "p") + "...expecting false");

	   System.out.println("\n----isAVowel----");
	   System.out.println(isAVowel("a") + "...expecting true");
	   System.out.println(isAVowel("e") + "...expecting true");
	   System.out.println(isAVowel("i") + "...expecting true");
	   System.out.println(isAVowel("o") + "...expecting true");
	   System.out.println(isAVowel("u") + "...expecting true");
	   System.out.println(isAVowel("b") + "...expecting false");

	   System.out.println("\n----countVowels----");
	   System.out.println(countVowels("meatball") + "...expecting 3");
	   System.out.println(countVowels("zzz") + "...expecting 0");

	   System.out.println("\n----hasAVowel----");
	   System.out.println(hasAVowel("cat") + "...expecting true");
	   System.out.println(hasAVowel("zzz") + "...expecting false");

	   System.out.println("\n----allVowels----");
	   System.out.println(allVowels("meatball") + "... expecting eaa");
	   System.out.println(allVowels("qwrtyp") + "... expecting empty string");

	   System.out.println("\n----firstVowel----");
	   System.out.println(firstVowel("") + "... expecting empty string");
	   System.out.println(firstVowel("zzz") + "... expecting empty string");
	   System.out.println(firstVowel("meatball") + "... expecting e");

	   System.out.println("\n----beginsWithVowel----");
	   System.out.println(beginsWithVowel("apple") + "... expecting true");
	   System.out.println(beginsWithVowel("strong") + "... expecting false");

	   System.out.println("\n----engToPig----");
	   System.out.println(engToPig("apple") + "... expecting appleway");
	   System.out.println(engToPig("strong") + "... expecting ongstray");
	   System.out.println(engToPig("java") + "... expecting avajay");
	   System.out.println(engToPig("sky") + "... expecting yskay");
	   System.out.println(engToPig("your") + "... expecting ouryay");
	   System.out.println(engToPig("my") + "... expecting ymay");
	   System.out.println(engToPig("myself") + "... expecting yselfmay");
	   System.out.println(engToPig("spry") + "... expecting yspray");
	   System.out.println(engToPig("Apple"));
	   System.out.println(engToPig("Cat")); 
	   System.out.println(engToPig("Happy"));
	   System.out.println(engToPig("pygmy"));
	   System.out.println(engToPig("car."));
	   System.out.println(engToPig("Car."));
	*/

    }//end main()

}//end class Pig

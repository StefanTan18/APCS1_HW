//Stefan Tan
//APCS1 pd8
//CW1 -- Codingbat
//2017-10-20

public class CodingBat {
    //String-1 Category

    /* Given a string name, e.g. "Bob", return a greeting of
       the form "Hello Bob!". */
    public static String helloName(String name) {
	return "Hello " + name + "!";
    }
    /* Given two strings, a and b, return the result of putting them together in
       the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */
    public static String makeAbba(String a, String b) {
	return a + b + b + a;
    }
    
    //String-2 Category

    /* Given a string, return a string where for every char in the original,
       there are two chars. */
    public static String doubleChar(String str) {
	int len = str.length();
	String dChar = "";
	for (int i = 0; i < len; i += 1) {
	    dChar += str.substring(i, i + 1) + str.substring(i, i + 1);
	}
	return dChar;
    }

    /* Return the number of times that the string "hi" appears anywhere in the
       given string. */
    public static int countHi(String str) {
	int len = str.length();
	int hiCounter = 0;
	for (int i = 0; i < len - 1; i += 1) {
	    if (str.substring(i, i + 2).equals("hi")) {
		hiCounter += 1;
	    }
	}
	return hiCounter;
    }

    /* Return true if the string "cat" and "dog" appear the same number of 
       times in the given string. */
    public static boolean catDog(String str) {
	int len = str.length();
	int catCounter = 0;
	int dogCounter = 0;
	for (int i = 0; i < len - 2; i += 1) {
	    if (str.substring(i, i + 3).equals("cat")) {
		catCounter += 1;
	    }
	    if (str.substring(i, i + 3).equals("dog")) {
		dogCounter += 1;
	    }
	}
	return catCounter == dogCounter;
    }

    /* Return the number of times that the string "code" appears anywhere in
       the given string, except we'll accept any letter for the 'd', so "cope"
       and "cooe" count. */
    public static int countCode(String str) {
	int len = str.length();
	int codeCounter = 0;
	for (int i = 0; i < len - 3; i += 1) {
	    if ((str.substring(i, i + 2).equals("co")) && (str.substring(i + 3, i + 4).equals("e"))){
		codeCounter += 1;
	    }
	}
	return codeCounter;
    }
    
    /* Given two strings, return true if either of the strings appears at the 
       very end of the other string, ignoring upper/lower case differences 
       (in other words, the computation should not be "case sensitive"). 
       Note: str.toLowerCase() returns the lowercase version of a string. */
    public static boolean endOther(String a, String b) {
	int lenA = a.length();
	int lenB = b.length();
	a = a.toLowerCase();
	b = b.toLowerCase();
	if (lenA >= lenB){
	    return b.equals(a.substring(lenA - lenB, lenA));
	}
	else {
	    return a.equals(b.substring(lenB - lenA, lenB));
	}
    }

    /* Return true if the given string contains an appearance of "xyz" where 
       the xyz is not directly preceeded by a period (.). So "xxyz" counts 
       but "x.xyz" does not. */
    public static boolean xyzThere(String str) {
        for(int i = 0; i < str.length() - 2; i++) {
	    if(str.charAt(i) == '.') i++;
	    else if(str.substring(i, i+3).equals("xyz")) {
		return true;
	    }
	}
	return false;
    }
	      
    // Test the methods
    public static void main(String[] args) {
	System.out.println(helloName("Bob")); //  "Hello Bob!"
	System.out.println(helloName("Alice")); //  "Hello Alice!"
	System.out.println(helloName("X")); //  "Hello X!"

	System.out.println(makeAbba("Hi", "Bye")); //  "HiByeByeHi"
	System.out.println(makeAbba("Yo", "Alice")); //  "YoAliceAliceYo"
	System.out.println(makeAbba("What", "Up")); //  "WhatUpUpWhat"

	System.out.println((doubleChar("The"))); //  "TThhee"
	System.out.println((doubleChar("AAbb"))); //  "AAAAbbbb"
	System.out.println((doubleChar("Hi-There")));//  "HHii--TThheerree"

	System.out.println((countHi("abc hi ho"))); // 1
	System.out.println((countHi("ABChi hi"))); // 2
	System.out.println((countHi("hihi"))); // 2

	System.out.println((catDog("catdog"))); // true
	System.out.println((catDog("catcat"))); // false
	System.out.println((catDog("1cat1cadodog"))); // true

	System.out.println((countCode("aaacodebbb"))); // 1
	System.out.println((countCode("codexxcode"))); // 2
	System.out.println((countCode("cozexxcope"))); // 2

	System.out.println((endOther("Hiabc", "abc"))); // true
	System.out.println((endOther("AbC", "HiaBc"))); // true
	System.out.println((endOther("abc", "abXabc"))); // true

	System.out.println((xyzThere("abcxyz"))); // true
	System.out.println((xyzThere("abc.xyz"))); // false
	System.out.println((xyzThere("xyz.abc"))); // true
	
    }// ends main 
}// ends class CodingBat
						       
 

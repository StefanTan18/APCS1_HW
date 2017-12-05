//Stefan Tan
//APCS1 pd8
//HW46 -- Al<B> Sorted!
//2017-12-04

import java.util.ArrayList;

public class ALTester{
    
    public static void populate(ArrayList<Comparable> a){
	for (int i = 0; i < 23; i++){
	    a.add(i, (int) (Math.random() * 100));
	} //populates the array with random ints
    }

    public static void sortedPopulate(ArrayList<Comparable> a){
	for (int i = 0; i < 23; i++){
	    a.add(i, i); //populates the array with sorted ints
	}
    }

    public static boolean isSorted(ArrayList<Comparable> a){
	for (int i = 0; i < 22; i++){
	    if ((a.get(i).compareTo(a.get(i+1))) > 0)
		return false; //returns false if not sorted
	}
	return true; //returns true if it is sorted
    }

    public static void main(String[] args){
	 ArrayList<Comparable> foo = new ArrayList<Comparable>();
	 populate(foo);
	 System.out.println(isSorted(foo));//returns false

	  ArrayList<Comparable> woo = new ArrayList<Comparable>();
	  sortedPopulate(woo);
	  System.out.println(isSorted(woo));//returns true
    }//end main
}//end ALTester
	    

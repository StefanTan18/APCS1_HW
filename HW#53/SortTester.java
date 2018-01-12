//Team FriendsSinceBeforeBirth - Stefan Tan, Bo Hui Lu
//APCS1 pd8
//HW#53 -- Solid Comparative Analysis
//2017-12-13

import java.util.ArrayList;

public class SortTester{
    //=================== HELPER METHODS ===================
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi )
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al )
    {
	int randomIndex;
	//setup for traversal fr right to left
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    //======================================================


    public static void main(String[] args)
    {
	/*
	  ==========bubbleSort==========
	  Best Case Scenario: No swaps required, and ArrayList is already sorted. 
	  Since bubbleSort stops when no swaps occur in a pass, if no elements needed to be swapped, the 
	  ArrayList must not swap for that stop to happen.
	  This allows the sort to "finish" in one pass, thus its the best case scenario. 

	  example below: [0,1,2,3,4] - which is already sorted.
	*/

	System.out.println("\n\n\n=====================Best Case Scenario for BubbleSort=====================");
	ArrayList bestCaseBub = new ArrayList<Integer>();
	bestCaseBub.add(0);
        bestCaseBub.add(1);
	bestCaseBub.add(2);
        bestCaseBub.add(3);
        bestCaseBub.add(4);
	System.out.println( "ArrayList bestCaseBub before sorting:\n" + bestCaseBub );
	MySorts.bubbleSort( bestCaseBub );
	System.out.println( "ArrayList bestCaseBub after sorting:\n" + bestCaseBub );

	
	/*
	  ==========bubbleSort==========
	  Worst Case Scenario: Elements swap every pass, and it takes n-1 passes to sort all n elements. 
	  Thus the worst case would be when ArrayList is in the reverse order for whatever your sort is 
	  trying to accomplish.

	  example below: [4,3,2,1,0] - takes four passes to complete the sort in ascending order from the left.


	*/
	System.out.println("\n\n\n=====================Worst Case Scenario for BubbleSort=====================");
	ArrayList worstCaseBub = new ArrayList<Integer>();
	worstCaseBub.add(4);
	worstCaseBub.add(3);
	worstCaseBub.add(2);
	worstCaseBub.add(1);
	worstCaseBub.add(0);
	System.out.println( "ArrayList worstCaseBub before sorting:\n" + worstCaseBub );
	MySorts.bubbleSort( worstCaseBub );
	System.out.println( "ArrayList worstCaseBub after sorting:\n" + worstCaseBub );	




	/*
	  ==========SelectionSort==========
	  THERE IS NO BEST OR WORST CASE SCENARIO.
	  Unlike the bubbleSort, there's no stopping the method early, since SelectionSort continues 
	  to look for the max value of after each pass. As a result, although one ArrayList may be sorted, and 
	  the other is not, the sorted one still has to go through the same amount of passes and swaps as the one
	  that is not sorted. If both ArrayLists go through the same thing, then its safe to assume that the
	  every case is the same, thus there can't be a best or worst.

	  example below: [0,1,2,3,4] - which is already sorted.  	 	  
	  [4,3,2,1,0] - sorted in reverse order.

	  Both case above take four passes and four swaps, as seen by running the follow code.


	*/

	System.out.println("\n\n\n=====================ArrayList is already sorted=====================");
	ArrayList bestCaseSelect = new ArrayList<Integer>();
	bestCaseSelect.add(0);
        bestCaseSelect.add(1);
	bestCaseSelect.add(2);
        bestCaseSelect.add(3);
        bestCaseSelect.add(4);
	System.out.println( "ArrayList before sorting:\n" + bestCaseSelect );
	MySorts.selectionSort( bestCaseSelect);
	System.out.println( "ArrayList after sorting:\n" + bestCaseSelect );

	System.out.println("\n\n\n=====================ArrayList is sorted in reverse order=====================");
	ArrayList worstCaseSelect = new ArrayList<Integer>();
	worstCaseSelect.add(4);
        worstCaseSelect.add(3);
        worstCaseSelect.add(2);
        worstCaseSelect.add(1);
        worstCaseSelect.add(0);
	System.out.println( "ArrayList before sorting:\n" + worstCaseSelect );
	MySorts.selectionSort( worstCaseSelect);
	System.out.println( "ArrayList after sorting:\n" + worstCaseSelect );

	/*
	  ==========insertionSort==========
	  Best Case Scenario: No "walking" or swapping of adajenct elements 
	  required, and ArrayList is already sorted. 

	  example below: [0,1,2,3,4] - which is already sorted.
	*/
	System.out.println("\n\n\n=====================Best Case Scenario for InsertionSort=====================");
	ArrayList bestCaseIns = new ArrayList<Integer>();
	bestCaseIns.add(0);
        bestCaseIns.add(1);
	bestCaseIns.add(2);
        bestCaseIns.add(3);
        bestCaseIns.add(4);
	System.out.println( "ArrayList bestCaseIns before sorting:\n" + bestCaseIns );
	MySorts.insertionSort( bestCaseIns );
	System.out.println( "ArrayList bestCaseIns after sorting:\n" + bestCaseIns );

	/*
	  ==========insertionSort==========
	  Worst Case Scenario: Elements swap every pass, and it takes 
	  n-1 passes to sort all n elements. 
	  Thus the worst case would be when ArrayList is in the reverse order 
	  for whatever your sort is trying to accomplish.

	  example below: [4,3,2,1,0] - takes four passes to complete the sort
	  in ascending order from the left.

	*/
	System.out.println("\n\n\n=====================Worst Case Scenario for InsertionSort=====================");
        ArrayList worstCaseIns = new ArrayList<Integer>();
	worstCaseIns.add(4);
	worstCaseIns.add(3);
	worstCaseIns.add(2);
	worstCaseIns.add(1);
	worstCaseIns.add(0);
	System.out.println( "ArrayList worstCaseIns before sorting:\n" + worstCaseIns );
	MySorts.insertionSort( worstCaseIns );
	System.out.println( "ArrayList worstCaseIns after sorting:\n" + worstCaseIns );
	
    }//end main
    
}//ends class

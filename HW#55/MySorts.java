//Team FriendsSinceBeforeBirth - Stefan Tan, Bo Hui Lu
//APCS1 pd8
//HW#55 -- Never Fear, Big Oh Is Here!
//2017-12-14

import java.util.ArrayList;

public class MySorts{

    /*
      From OrderedArrayList:
      add(): O(n) Linear
      add() uses linear search to find the correct pos for an element. It goes 
      one by one through the array until it reaches the correct pos.
      
      addBin(): O(log2n) Logarithmic
      addBin() uses binary search to add an element in the correct pos. It 
      searches for it by dividing it the array into 2 until it finds the correct
      pos.
    */

    /*
      InsertionSort is a O(n) situation situation for both the worst and best 
      case. Regardless of if the given ArrayList is sorted or not, the sort 
      will go through each element(linear search), thus the same number of 
      passes occur.
     */
    
    // VOID version of InsertionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void insertionSort( ArrayList<Comparable> data )
    {
	for( int partition = 1; partition < data.size(); partition++ ) {
	    //partition marks first item in unsorted region

	    //diag:
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data ); 

	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {

		// "walk" the current item to where it belongs
		// by swapping adjacent items
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) ); 
		}
		else 
		    break; 
	    }
	}
    }//end insertionSortV

    /*
      SelectionSort is a O(n^2) for the worst case and the best case
      as it would still compare the elements whether or not it is sorted or
      not.
    */

    // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSort( ArrayList<Comparable> data ) 
    {
	//note: this version places greatest value at rightmost end,

	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;

	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    System.out.println( "after swap: " +  data );//diag
	}
    }//end selectionSortV
    
    /*======================================
      NOTE: Edited bubbleSort to include stopping when no swaps occur in a pass.

      Linear Search
      Best Case:O(1)
      After one pass, if ArrayList is already sorted, it will be finished comparing.

      Worst Case: O(n) 
      After each pass, it starts from the beginning again, and has to go through 
      the entire ArrayList. It makes n comparisons for a list of n elems.


      ======================================*/
    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSort( ArrayList<Comparable> data )
    {
		
	//make n-1 passes across collection
	for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
	    System.out.println( "commencing pass #" + passCtr + "..." );
	    int swaps = 0;
	    
	    //iterate from first to next-to-last element
	    for( int i = 0; i < data.size()-1; i++ ) {
		//if element at i > element at i+1, swap
		if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
		    data.set( i, data.set(i+1,data.get(i)) );
		    swaps++;
		}
		
		//System.out.println(data); //diag: show current state of list
	    }
	    System.out.println("After pass: " + passCtr + "\n" + data);
	    if (swaps == 0)
		break;
	}
	
    }
}//ends class MySorts

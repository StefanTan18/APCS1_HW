//Stefan Tan
//APCS1 pd8
//HW47 -- ascending
//2017-12-05

/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = new ArrayList<Comparable>();
    }


    public String toString()
    {
	return _data.toString(); //uses ArrayList method  
    }


    public Comparable remove( int index )
    {	
	return _data.remove(index); //uses ArrayList method   
    }


    public int size()
    { 
	return _data.size(); //uses ArrayList method 
    }

    
    public Comparable get( int index )
    { 
	return _data.get(index); //uses ArrayList method  
    }

    /* Stores the index of the first occurence where newVal is either equal to
       or greater than the element at the index. Uses the add from ArrayList to 
       insert the newVal at the index. 
    */
    public void add(Comparable newVal)
    { 
	int firstOccur = size();
	for( int i = 0; i < size(); i++ ) {
	    if ((_data.get(i).compareTo(newVal)) >= 0) {
		firstOccur = i;
		break;
	    }
	}
	_data.add(firstOccur, newVal);
    }



    // main method solely for testing purposes
    public static void main( String[] args )
    {	
	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.add( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class OrderedArrayList

//Stefan Tan
//APCS1 pd8
//HW41 -- Array of Steel
//2017-11-27

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor – initializes 10-item array
    public SuperArray()
    {
	_data = new int[10];
    }


    //output SuperArray in [a,b,c] format
    public String toString()
    {
	String elements = "[";//starts the return statement with a "["
	for (int i = 0; i < _data.length; i++){
	    if (i == _data.length - 1)//if it is the last index then close it
		elements += _data[i] + "]";// with a "]"
	    else{
		elements += _data[i] + ","; //else print it out with a comma
	    }
	}
	return elements;
    }


    //double capacity of SuperArray
    private void expand()
    {
	_data = new int[_data.length * 2];
    }


    //accessor -- return value at specified index
    public int get( int index )
    {
	return _data[index];
    }


    //mutator -- set value at index to newVal,
    //           return old value at index
    public int set( int index, int newVal )
    {
	int oldValue = _data[index];
	_data[index] = newVal;
	return oldValue;
    }


    //main method for testing
    public static void main( String[] args )
    {
	SuperArray curtis = new SuperArray();
	System.out.println( "Printing empty SuperArray curtis..." );
	System.out.println( curtis );

	for( int i = 0; i < curtis._data.length; i++ ) {
	    curtis.set( i, i * 2 );
	}

	System.out.println("Printing populated SuperArray curtis...");
	System.out.println(curtis);

	for( int i = 0; i < 3; i++ ) {
	    curtis.expand();
	    System.out.println("Printing expanded SuperArray curtis...");
	    System.out.println(curtis);
	}
	/*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
    }//end main()


}//end class

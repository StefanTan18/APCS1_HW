//Stefan Tan
//APCS1 pd8
//HW#16 -- Get It While You Can
//2017-10-13

public class Driver
{

    public static void main( String[] args )
    {
	//build Objects from blueprint specified by class Coin

	//test default constructor
	//===================TOP==========================
		
	Coin mine = new Coin();

	//test 1st overloaded constructor
	Coin yours = new Coin( "quarter" );

	//test 2nd overloaded constructor
	Coin wayne = new Coin( "dollar", "heads" );

	//test toString() methods of each Coin
	System.out.println("mine: " + mine);
	System.out.println("yours: " + yours);
	System.out.println("wayne: " + wayne);

	//runs coin pair flips until conditions have been met.
	while ((yours.getHeadsCtr() < 2) || (wayne.getHeadsCtr() < 2) || (yours.getFlipCtr() < 2) || ((Math.IEEEremainder(yours.getFlipCtr(), 2001))==0)) {
	    
	    //test flip() method
	    System.out.println("\nAfter flipping...");
	    yours.flip();
	    wayne.flip();
	    System.out.println("yours: " + yours);
	    System.out.println("wayne: " + wayne);

	    //test equals() method
	    if ( yours.equals(wayne) ) 
		System.out.println( "Matchee matchee!" );
	    else
		System.out.println( "No match. Firestarter you can not be." );
	}

	//  ====================BOTTOM======================

    }//end main()

}//end class

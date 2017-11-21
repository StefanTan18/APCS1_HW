/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Stefan Tan
// APCS1 pd8
// HW#34 -- Arrays of Arrays
// 2017-11-16

public class TwoDimArray
{
    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOR loop
    public static void print1( int[][] a )
    {
	for (int r = 0; r < a.length; r++){
	    for (int c = 0; c < a[r].length; c++)
		System.out.print(a[r][c]);
	    System.out.println();
	}
    }


    //postcond: prints each row of 2D int array a on its own line
    //          uses a FOREACH loop
    public static void print2( int[][] a )
    {
	String output = "";
	for(int [] r : a) {
	    for (int c : r)
		System.out.print( c );
	    System.out.println();
	}
    }

    //postcond: returns sum of all items in 2D int array a
    public static int sum1( int[][] a )
    {
	int sum = 0;
	for(int [] r : a) {
	    for (int c : r)
		sum += c;
	}
	return sum;
    }
    
    //postcond: returns sum of all items in 2D int array a
    //          * uses helper fxn sumRow
    public static int sum2( int [][] m )
    {
	int sum = 0;
	for(int i = 0; i < m.length; i++)
	    sum += sumRow2(i,m);
	return sum;
    }

    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOR loop
    public static int sumRow( int r, int[][] a )
    {
	int sum = 0;
	for (int i = 0; i < a[r].length; i++)
	    sum += a[r][i];
	return sum;
    }

    //postcond: returns sum of all items on row r of 2D int array a
    //          uses a FOREACH loop
    public static int sumRow2(int r, int[][] m)
    {
	int sum = 0;
	for(int x : m[r])
	    sum += x;
	return sum;
    }

    public static void main( String [] args )
    {
	int [][] m1 = new int[4][2];
	int [][] m2 = { {2,4,6}, {3,5,7} };
	int [][] m3 = { {2}, {4,6}, {1,3,5} };
     	System.out.print("testing print1...\n");
	System.out.print("Results of m1:\n");
	print1(m1);
	System.out.print("Results of m2:\n");
	print1(m2);
	System.out.print("Results of m3:\n");
	print1(m3);
	System.out.print("testing print2...\n");
	System.out.print("Results of m1:\n");
	print2(m1);
	System.out.print("Results of m2:\n");
	print2(m2);
	System.out.print("Results of m3:\n");
	print2(m3);
	System.out.print("testing sum1...\n");
	System.out.println("sum m1 : " + sum1(m1));
	System.out.println("sum m2 : " + sum1(m2));
	System.out.println("sum m3 : " + sum1(m3));
	System.out.print("testing sum2...\n");
	System.out.println("sum m1 : " + sum2(m1));
	System.out.println("sum m2 : " + sum2(m2));
	System.out.println("sum m3 : " + sum2(m3));
    }

}//end class TwoDimArray

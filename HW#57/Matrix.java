//Stefan Tan
//APCS1 pd8
//HW#57 -- How Deep Does the Rabbit Hole Go?
//2017-12-19

/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/


public class Matrix 
{
    //constant for default matrix size
    private final static int DEFAULT_SIZE = 2;

    private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( )
    {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }


    //constructor intializes an a*a matrix
    public Matrix( int a ) 
    {
	matrix = new Object[a][a];
    }


    //return size of this matrix, where size is 1 dimension
    private int size() 
    {
	return matrix.length;
    }


    //return the item at the specified row & column   
    private Object get( int r, int c ) 
    {
	return matrix[r - 1][c - 1];
    }


    //return true if this matrix is empty, false otherwise
    private boolean isEmpty() 
    {
	for (int r = 0; r < matrix.length; r++) {
	    for (int c = 0; c < matrix[r].length; c++) {
		if (matrix[r][c] != null)
		    return false;
	    }
	}
	return true;
    }


    //overwrite item at specified row and column with newVal
    //return old value
    private Object set( int r, int c, Object newVal ) 
    {
	Object temp = matrix[r - 1][c - 1];
	matrix[r - 1][c - 1] = newVal;
	return temp;
    }


    //return String representation of this matrix
    // (make it look like a matrix)
    public String toString() 
    {
	String retStr = "";
	for (Object[] row: matrix) {
	    retStr += "| ";
	    for (Object o: row) {
		retStr += o + " ";
	    }
	    retStr += " |\n";
	}
	return retStr;
    }


    //override inherited equals method
    //criteria for equality: matrices have identical dimensions,
    // and identical values in each slot
    public boolean equals( Object rightSide ) 
    {
	Matrix otherMatrix = (Matrix) rightSide;
	if (size() != otherMatrix.size())
	    return false;
	for (int r = 0; r < matrix.length; r++) {
	    for (int c = 0; c < matrix[r].length; c++) {
		if (matrix[r][c] != otherMatrix.matrix[r][c])
		    return false;
	    }
	}
	return true;
    }
	

    //swap two columns of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapColumns( int c1, int c2  ) 
    {
	for (int i = 0; i < matrix.length; i++)
	    {
		Object temp = matrix[i][c1 - 1];
		matrix[i][c1 - 1] = matrix[i][c2 - 1];
		matrix[i][c2 - 1] = temp;
	    }
    }

    //swap two rows of this matrix 
    //(1,1) is top left corner of matrix
    //row values increase going down
    //column value increase L-to-R
    public void swapRows( int r1, int r2  ) 
    {
	Object[] temp = matrix[r1 - 1];
	matrix[r1 - 1] = matrix[r2 - 1];
	matrix[r2 - 1] = temp;
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	Matrix m = new Matrix();
	Matrix n = new Matrix(5);
	System.out.println("m:\n" + m);
	System.out.println("n:\n" + n);
	System.out.println(m.isEmpty());
	System.out.println(n.isEmpty());

	for (int r = 0; r < m.matrix.length; r++) {
	    for (int c = 0; c < m.matrix[r].length; c++) {
		m.matrix[r][c] = (int)(Math.random()* 10);
	    }
	}
	for (int r = 0; r < n.matrix.length; r++) {
	    for (int c = 0; c < n.matrix[r].length; c++) {
		n.matrix[r][c] = (int)(Math.random()* 10);
	    }
	}
	System.out.println("m:\n" + m);
	System.out.println("n:\n" + n);

	m.swapColumns(1,2);
	System.out.println("After swapping Columns...");
	System.out.println("m:\n" + m);

	n.swapRows(1,2);
	System.out.println("After swapping Rows...");
	System.out.println("n:\n" + n);
    }

}//end class Matrix

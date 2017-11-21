public class ArrayTest {
    public static void populate(int[][] anArray){
	int v = 0;
	for (int r = 0; r < anArray.length; r++)
	    for (int c = 0; c < anArray[r].length; c++){
		anArray[r][c] = v;
		v++;
	    }
    }
	
    public static void main(String[] args){
	/*int[][] a2 = new int[2][3];
	  for(int [] k : a2) {
	  for (int j : k)
	  System.out.print( j );
	  System.out.println();
	  }*/
    }
}

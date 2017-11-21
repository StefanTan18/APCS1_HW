//Stefan Tan
//APCS1 pd8
//HW#25 -- All Hallow's Eve
//2017-10-31

public class Loopier{
    //populate method: populate an existing array with randomly generated ints
    public static int[] populate(int[] anArray){
	for (int i = 0; i < anArray.length; i++){
	    anArray[i] = (int) (Math.random() * 100);
	} //randomly generates a number between 0 and 100
	return anArray;
    }// end populate

    //arrayToString method: return a String version of an array of ints
    public static String arrayToString(int[] anArray){
	String arrayStr = "";
	for (int i = 0; i < anArray.length; i++){
	    arrayStr += anArray[i] + " ";
	}
	return arrayStr;
    }// end arrayToString

    /* linSearch method: return the index of the first occurrence of a target
       in an existing array, or -1 if not found iteratively */
    public static int linSearch(int[] a, int target){
	for (int i = 0; i < a.length; i++){
	    if (a[i] == target)
		return i;
	}
	return -1;
    }// end linSearch

    /* linSearchR method: return the index of the first occurrence of a target
       in an existing array, or -1 if not found recursively */
    public static int linSearchR(int[] a, int target){
	//base cases
	if (a.length == 0) 
	    return -1;
	else if (a[0] == target)
	    return 0;
	else {
	    //creates a new Array with the first index of the old Array removed
	    int[] b = new int[a.length -1];  
	    for (int index = 0; index < b.length; index++){
		b[index] = a[index + 1];
	    }
	    //recursive cases
	    if (linSearchR(b, target) == -1){
		return -1;
	    }
	    else {
		return linSearchR(b, target) + 1;
	    }
	}
    }// end linSearchR 

    /* freq method: return the number of occurrences of a target in an
       existing array iteratively */
    public static int freq(int[] a, int target){
	int frequency = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] == target)
		frequency += 1;
	}
	return frequency;
    }// end freq

    /* freqRec method: return the number of occurrences of a target in an
       existing array recursively */
    public static int freqRec(int[] a, int target){
	int frequency = 0;
	//base cases
	if (a.length == 0)
	    return frequency;
	else if (a[0] == target)
	    frequency += 1;
	else {
	    //creates a new Array with the first index of the old Array removed
	    int[] b = new int[a.length -1];
	    for (int index = 0; index < b.length; index++){
		b[index] = a[index + 1];
	    }
	    //recursive case
	    frequency += freqRec(b, target);
	}
	return frequency;
    }// end freqRec

    //tests the methods
    public static void main(String[] args){
	int[] anArray;
	anArray = new int[10];
	System.out.println("Populate Test:");
	System.out.println(populate(anArray) + "\n");
	System.out.println("arrayToString Test:");
	System.out.println(arrayToString(anArray) + "\n");
	System.out.println("linSearch Tests:");
	System.out.println("Iterative -- " + linSearch(anArray, 97) + "\n");
	System.out.println("Recursive -- " + linSearchR(anArray, 97) + "\n");
	System.out.println("freq Tests:");
	System.out.println("Iterative -- " + freq(anArray, 97) + "\n");
	System.out.println("Recursive -- " + freqRec(anArray, 97));
    }//end main
}// end class Loopier

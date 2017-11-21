public class StatsDriver {
    //tests the 3 gcd methods
    public static void main(String[] args){
	Stats test = new Stats();
	System.out.println(test.gcdER(2,2));
	System.out.println(test.gcdER(15,20));
	System.out.println(test.gcdER(121,1221) + "\n");

	System.out.println(test.gcdEW(2,2));
	System.out.println(test.gcdEW(15,20));
	System.out.println(test.gcdEW(121,1221));
    }
}

//Stefan Tan
//APCS1 pd8
//HW#15 -- Wayne's World
//2017-10-11

public class Coin {
    //Attributes
    private double value;
    private String upFace, name;
    private int flipCtr, headsCtr, tailsCtr;
    private double bias = .5;
    //Methods
    
    //Default Constructor
    public Coin(){
	value = 0.0;
	upFace = "heads";
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
	bias = 0.5;
    }

    //1st Overloaded Constructor
    public Coin(String denomination){
	this();
	name = denomination;
	assignValue(name);
    }

    //2nd Overloaded Constructor
    public Coin(String denomination, String face){
	this(denomination);
	upFace = face;
    }
    //simulates a coin flip. Returns either heads or tails based on bias.
    public String flip(){
	double randDbl = Math.random();

	if ( randDbl < bias ) {
	    upFace = "heads";
	    headsCtr += 1;
	}
	else {
	    upFace = "tails";
	    tailsCtr += 1;
	}

	flipCtr += 1;

	return upFace;
    }

    //Overriden toString method
    public String toString(){
	return name + " -- " + upFace;
    }
    
    //compares this Coin to another. Return true if same face is shown,
    //false otherwise.
    public boolean equals(Coin otherCoin){
	if (otherCoin.upFace == upFace) {
	    return true;
	}
	else {
	    return false;
	}
    }

    //Takes a name and assigns a Coin's monetary value according to its name.
    public void assignValue(String name) {
	if (name == "penny"){
	    value = 0.01;
	}
	else if (name == "nickel"){
	    value = 0.05;
	}
	else if (name == "dime"){
	    value = 0.1;
	}
	else if (name == "quarter"){
	    value = 0.25;
	}
	else if (name == "half dollar"){
	    value = 0.5;
	}
	else if (name == "dollar"){
	    value = 1;
	}
    }
    // Accessors
    public String getUpFace() { 
	return upFace;
    }

    public int getFlipCtr() { 
	return flipCtr;
    }

    public double getValue() { 
	return value;
    }

    public int getHeadsCtr() { 
	return headsCtr;
    }

    public int getTailsCtr() { 
	return tailsCtr;
    }
}
	    
	
	
    



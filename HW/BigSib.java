//Stefan Tan
//APCS1 pd8
//HW7 -- On the Origins of a Big Sib
//2017-09-26

public class BigSib{
    private String helloMsg;
    public BigSib(){
	helloMsg = "Hello";
    }
    public BigSib(String newMsg){
	helloMsg = newMsg;
    }
    public String greet(String person){
	String retStr;
	retStr = helloMsg;
	retStr += " ";
	retStr += person;
	return retStr;
    }
}

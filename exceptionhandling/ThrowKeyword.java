package exceptionhandling;

import conditionalstatement.IfElseStatement;

public class ThrowKeyword {
//Throw keyword creating a new Exception.
	public static void main(String[] args) throws ElectricityCutException {
		String s = "Elecricity cut";
		if(s.contains("Elecricity cut")){
			throw new ElectricityCutException ("session is intruptted due to electricity cut");
		}
		else {
			System.out.println("we are learning throw keyword in exception handling");
		}

	}

}
class ElectricityCutException extends Exception {
	ElectricityCutException(String msg){
		super(msg);//Super keyword use for parent class constructer properties
	}
}
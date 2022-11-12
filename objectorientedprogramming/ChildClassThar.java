package objectorientedprogramming;

public class ChildClassThar extends Car{

	public static void main(String[] args) {
		ChildClassThar thar = new ChildClassThar();
		thar.wheels();
        thar.colour();
        thar.engine();
	}

	
	public void colour() {
		System.out.println("car colour is black");
		
	}

	
	public void engine() {
	    System.out.println("thar engine is a 200 cc");
		
	}

}

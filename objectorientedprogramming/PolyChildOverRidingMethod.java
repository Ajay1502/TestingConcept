package objectorientedprogramming;

public class PolyChildOverRidingMethod extends PolyParentOverRidingMethod{
    
	public static void main(String[] args) {
		PolyChildOverRidingMethod cor = new PolyChildOverRidingMethod();
		cor.education();
        cor.time();
	}
    public void education() {
    	System.out.println("MBBS");
    }
    public void time() {
  	  System.out.println("time at 10:30");
  	
    }
}

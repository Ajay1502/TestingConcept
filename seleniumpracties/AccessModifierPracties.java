package seleniumpracties;

import objectorientedprogramming.AccessModifierSpecifier;

public class AccessModifierPracties extends AccessModifierSpecifier{

	public static void main(String[] args) {
		AccessModifierPracties am = new AccessModifierPracties();
        am.add();
	}

	public void add() {
		System.out.println("add method override");
	}
	protected String name ="ajay";
}

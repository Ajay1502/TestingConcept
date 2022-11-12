package objectorientedprogramming;

public class AccessModifierSpecifier {

	
/*	  Access modifier are four part
	  1. public  - variable,method,class  -Anywhere in project
	  2. protected -variable, method - within package and outside child classes 
	  3.default  - variable, method - within package      
	  4.private - variable,method,class - Within class1
	  
	  while overriding method access modifier level :
	  1.it's possible to maintain a same access modifier lavel. 
	  2.it"s possible to incrase accesss modifier level parent to child.
	  3.it"s not passible to decrase access modifier parent to child.
	*/
	protected void add() {
		System.out.println("Addition ");
	}
	public void sub () {
		System.out.println("substraction part");
	}
}
